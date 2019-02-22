import { Injectable, Input } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Register } from '../tsclasses/register';
@Injectable({
   providedIn: 'root'
})
export class RegisterService {
   url: string;
   response: any;
   get: any;
constructor(private http: HttpClient) { }
addUser(register: Register) {
   this.url = 'http://localhost:8899/api/v1/user';
   this.http.get(this.url).subscribe(resp => {
      console.log(resp);
      return this.http.post(this.url + '' , register, {observe: 'response'});
   });
}
}



//   register(searchText: string) {
//      console.log('hi');
//    this.http.get('https://13.232.243.68:8999/api/v1/user').subscribe(resp => {
//        console.log(resp);
//    this.response = resp;
//        });
//    return this.response;
//    }
