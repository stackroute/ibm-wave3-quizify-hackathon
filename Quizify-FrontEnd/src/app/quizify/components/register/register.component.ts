
import { Component, OnInit, Input } from '@angular/core';
import { RegisterService } from '../../services/register.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {
@Input()
  value: string;
  constructor(private registerService: RegisterService, private http: HttpClient) {
    console.log('name' , this.value);
   }
//  register(event: any) {
//    this.value = event.target.value;
//    console.log(this.value);register(event: any) {register(event: any) {
//    this.value = event.target.value;
//    console.log(this.value);
//    this.registerService.register(this.value);
//  }
//    this.value = event.target.value;
//    console.log(this.value);
//    this.registerService.register(this.value);
//  }
//    this.registerService.register(this.value);
//  }
   register(rval) {
      console.log(rval);
   }

// constructor(private router: Router) {
// }
//   openLogin() {
//     this.router.navigate(['/', 'login']);
//   }


  ngOnInit() {
  }

}
