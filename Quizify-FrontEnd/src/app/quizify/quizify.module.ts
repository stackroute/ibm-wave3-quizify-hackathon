import { QuizifyMaterialModule } from './quizify.material.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RegisterComponent } from './components/register/register.component';
import { ProfileComponent } from './components/profile/profile.component';
import { CardsComponent } from './components/cards/cards.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { MatCardModule, MatCardHeader } from '@angular/material';
import { LoginComponent } from './components/login/login.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule, HttpClient } from '@angular/common/http';
@NgModule({
  declarations: [ CardsComponent,
    ProfileComponent,
    RegisterComponent,
    LoginComponent],
  imports: [
    CommonModule,
    BrowserAnimationsModule,
    MatCardModule,
    QuizifyMaterialModule,
    FormsModule,
    MatCardModule

  ],
  exports: [ CardsComponent,
    ProfileComponent,
    RegisterComponent,
  LoginComponent ]

})
export class QuizifyModule { }
