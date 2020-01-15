import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { InnerSubscriber } from 'rxjs/internal/InnerSubscriber';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  ngOnInit() {
  }

  constructor(private router: Router) { }

  isAdmin() {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.account.role === 'admin') {
      return true;
    } else {
      return false;
    }
  }


  isUser() {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.account.role === 'user') {
      return true;
    } else {
      return false;
    }
  }

  isLoggedIn() {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails) {
      return true;
    } else {
      return false;
    }
  }

  logout() {
    localStorage.removeItem('userDetails');
    this.router.navigateByUrl('/login');
  }

}
