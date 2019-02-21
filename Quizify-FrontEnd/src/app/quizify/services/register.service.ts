import { Injectable, Input } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
   providedIn: 'root'
})
export class RegisterService {
   url: string;
   response: any;
   get: any;
constructor(private http: HttpClient,
   private userid: string,
   private password: string,
   private confirmpassword: string,
   private emailid: string,
   private interests: string,
   private gender: string,
) { }
}



//   register(searchText: string) {
//      console.log('hi');
//    this.http.get('https://13.232.243.68:8999/api/v1/user').subscribe(resp => {
//        console.log(resp);
//    this.response = resp;
//        });
//    return this.response;
//    }
