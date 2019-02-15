import { BrowserModule } from '@angular/platform-browser';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
// import { LoginComponent } from './login/login.component';
// import {TokenInterceptorService } from './token-interceptor.service' ;
import { AuthService } from './quizify/auth.service';


=======
import { MatCardModule } from '@angular/material';
import {MatSelectModule} from '@angular/material/select';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';
import { QuizifyMaterialModule } from './quizify/quizify.material.module';
import { QuizifyModule } from './quizify/quizify.module';
>>>>>>> 88514a1c486cbb89cb29f1a8d0ae78b9e0a4306b


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    QuizifyMaterialModule,
    QuizifyModule,
    AppRoutingModule,
<<<<<<< HEAD
    QuizifyModule,
    HttpClientModule
  ],
  providers: [AuthService
  ] ,
=======
    MatCardModule,
    MatSelectModule,
    BrowserAnimationsModule,
    HttpClientModule
  ],
  schemas: [ CUSTOM_ELEMENTS_SCHEMA ],
  providers: [],
>>>>>>> 88514a1c486cbb89cb29f1a8d0ae78b9e0a4306b
  bootstrap: [AppComponent]
})
export class AppModule { }
