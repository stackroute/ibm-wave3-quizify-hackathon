// import { RegisterComponent } from './quizify/components/register/register.component';
// import { CardsComponent } from './quizify/components/cards/cards.component';
import { QuizifyModule } from './quizify/quizify.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
// import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core

import { MatLabel, MatDialogRef, MAT_DIALOG_DATA, MatChipsModule } from '@angular/material';
import { MatMenuModule, MatButtonModule, MatIconModule, MatCardModule, MatDialogModule } from '@angular/material';
import { BrowserAnimationsModule, NoopAnimationsModule } from '@angular/platform-browser/animations';
// import { ProfileComponent } from './quizify/components/profile/profile.component';
// import { ProfileuserComponent } from './quizify/components/profileuser/profileuser.component';
// import { GamehistoryComponent } from './quizify/components/gamehistory/gamehistory.component';


@NgModule({
  declarations: [
    AppComponent
    // CardsComponent,
    // ProfileComponent,
    // ProfileuserComponent,
    // RegisterComponent,
    // GamehistoryComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserModule,
    BrowserAnimationsModule,
    NoopAnimationsModule,
    MatDialogModule,
    BrowserModule,
    BrowserAnimationsModule,
    MatMenuModule,
    MatButtonModule,
    MatIconModule,
    MatCardModule,
    MatChipsModule,
    QuizifyModule
    ],
    // schemas: [CUSTOM_ELEMENTS_SCHEMA] ,
  providers: [],

  
  exports: [AppComponent
    // CardsComponent,
    // ProfileComponent,
    // ProfileuserComponent,
    // RegisterComponent,
    // GamehistoryComponent],
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
