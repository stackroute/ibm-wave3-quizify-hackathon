import { QuizifyModule } from './quizify/quizify.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
// import { LoginComponent } from './login/login.component';
// import {TokenInterceptorService } from './token-interceptor.service' ;
import { AuthService } from './quizify/auth.service';




@NgModule({
  declarations: [
    AppComponent


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    QuizifyModule,
    HttpClientModule
  ],
  providers: [AuthService
  ] ,
  bootstrap: [AppComponent]
})
export class AppModule { }
