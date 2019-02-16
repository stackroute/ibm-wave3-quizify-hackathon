import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http' ;
// import 'rxjs/add/operator/map' ;
import { Router } from '@angular/router' ;
@Injectable({
  providedIn: 'root'
})
export class AuthService {

}
//   public token: string;
//  public message: string;
//  public userId: string;
//  public password: string;
//  post: any;
//  url: string;
// constructor(
// private http: HttpClient
//     ) {
//     this.url = 'http://localhost:8095/api/user';
//     const currentUser = JSON.parse(localStorage.getItem('currentUser'));
//     this.token = currentUser && currentUser.token;
//   }//   private headers = new Headers({ 'Content-Type': 'application/json' });
//   login(userId: string, password: string)  {
//     return this.http.post(this.url, JSON.stringify({ userId: userId, password: password  , headers: this.headers }))
//         .forEach((response: Response) => {
//             const token = response.json() && response.json().token;
//             if (token) {
//                 this.token = token;
//                 localStorage.setItem('currentUser', JSON.stringify({ token: token, message: this.message }));
//                 return true;
//             } else {
//                 return false;
//             }
//         });
// }
// isLoggedIn() {
//     return tokenNotExpired();
// }   get currentUser() {
//       const oldtoken = JSON.parse(localStorage.getItem('currentUser'));
//       return new JwtHelper().decodeToken(oldtoken.token);
//   }

//   public token: string;
//  public message: string;
//  public userId: string;
//  public password: string;
//  post: any;
//  url: string;
//   private _loginUrl = 'http://localhost:8095/api/user';
//   constructor(private http: HttpClient) {
//        const currentUser = JSON.parse(localStorage.getItem('currentUser'));
//     this.token = currentUser && currentUser.token;
//   }

//   private headers = new Headers({ 'Content-Type': 'application/json'});
//   login(userId: string, password: string) {  // this user object will contain the reponse either the details or the error mesg
//     return this.http.post(this._loginUrl, JSON.stringify({ userId: userId, password: password , headers: this.headers})
//     .map((response: Response) => {
//       const token = response.json() && response.json().token;
//       if (token) {
//           this.token = token;
//           localStorage.setItem('currentUser', JSON.stringify({ userId: userId, token: token }));
//           return true;
//       } else {
//           return false;
//       }
//   });


