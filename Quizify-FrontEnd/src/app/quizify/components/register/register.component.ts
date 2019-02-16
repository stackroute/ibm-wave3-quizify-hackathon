import { Component, OnInit } from '@angular/core';
import { RegisterService } from '../../services/register.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  value: string;

 constructor(private registerService: RegisterService, private http: HttpClient) {
   console.log('name' , this.value);
  }
 onClick(event: any) {
   this.value = event.target.value;
   console.log(this.value);
   this.registerService.register(this.value);
 }
// constructor(private router: Router) {
// }
//   openLogin() {
//     this.router.navigate(['/', 'login']);
//   }


  ngOnInit() {
  }

}
