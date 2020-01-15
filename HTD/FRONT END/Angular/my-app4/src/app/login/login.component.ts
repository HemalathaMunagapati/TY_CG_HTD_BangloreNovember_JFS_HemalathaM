import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from '../authentication.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  error;
  message;


  constructor(private auth: AuthenticationService,
    // tslint:disable-next-line: align
    private router: Router) { }

  login(form: NgForm) {
    this.auth.loginUser(form.value).subscribe(res => {
      console.log(res);
      if (res.statusCode === 201) {
        localStorage.setItem('userDetails', JSON.stringify(res));
        console.log('user details stored in local storage');
        this.router.navigateByUrl('/');
        form.reset();
        setTimeout(() => {
          this.message = null;
        }, 5000);
      } else {
        this.error = res.description;
        console.log(this.error);
      }

    });
  }

  ngOnInit() {
  }

}
