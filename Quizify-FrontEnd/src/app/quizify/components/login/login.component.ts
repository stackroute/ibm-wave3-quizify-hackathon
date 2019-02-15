import { Component, OnInit } from '@angular/core';
import { AuthService } from '../.././auth.service' ;
import { Router } from '@angular/router' ;
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  // loginUserData = { };
 userId: string;
 password: string;
 Router: any;
constructor(private auth: AuthService,   private _router: Router) { }


ngOnInit() {
}
}
// login() {
//   this.auth.login(this.userId, this.password)
//   .subscribe(
//     data => {
//       this._router.navigate(['**']);
//     },
//     (error) => {
//     });
//   }
// }

// loginUser() {
  // console.log(this.loginUserData);
  // this._auth.loginUser(this.loginUserData)
  // .subscribe(
  //   res => {
  // localStorage.setItem('token', res.token);
  //  res => console.log(res);
  //   },
  // err => console.log(err)
  // );


//


