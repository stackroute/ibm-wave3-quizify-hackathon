import { QuizifyModule } from './quizify/quizify.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

// import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';


import { MatLabel, MatDialogRef, MAT_DIALOG_DATA, MatChipsModule } from '@angular/material';
import { MatMenuModule, MatButtonModule, MatIconModule, MatCardModule, MatDialogModule } from '@angular/material';

import { BrowserAnimationsModule, NoopAnimationsModule } from '@angular/platform-browser/animations';
import { GamehistoryComponent } from './gamehistory/gamehistory.component';
import { ProfileuserComponent } from './profileuser/profileuser.component';



@NgModule({
  declarations: [

    AppComponent




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

  exports: [AppComponent,
   ],

  bootstrap: [AppComponent]
})
export class AppModule { }
