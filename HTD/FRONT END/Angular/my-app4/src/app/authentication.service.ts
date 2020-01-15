import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { tick } from '@angular/core/testing';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  url = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  registerUser(userDetails): Observable<any> {
  return this.http.post<any>(`${this.url}/admin-register`, userDetails);
  }

  loginUser(userCredentials): Observable<any> {
    return this.http.post<any>(`${this.url}/admin-login`, userCredentials);
  }
}
