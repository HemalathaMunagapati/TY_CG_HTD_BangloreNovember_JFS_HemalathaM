import { Component, OnInit } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AuthenticationService } from '../authentication.service';
import { NgForm } from '@angular/forms';
import { error } from 'util';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  message;
  error;

  constructor(private auth: AuthenticationService) { }

  ngOnInit() {
  }
  register(form: NgForm) {
    this.auth.registerUser(form.value).subscribe(res => {
      console.log(res);
      if (res.statusCode === 201) {
        this.message = res.message;
        form.reset();
        setTimeout(() => {
          this.message = null;
        }, 5000);
      } else {
        this.error = res.message;
        console.log(error);
        setTimeout(() => {
          this.message = null;
        }, 5000);
      }
    });
  }

}
