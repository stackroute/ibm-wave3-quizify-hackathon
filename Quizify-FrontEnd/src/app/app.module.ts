// import { RegisterComponent } from './quizify/components/register/register.component';
// import { CardsComponent } from './quizify/components/cards/cards.component';
import { QuizifyModule } from './quizify/quizify.module';
import { BrowserModule } from '@angular/platform-browser';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD
import { CardsComponent } from './cards/cards.component';
import { MatCardModule } from '@angular/material';
import { GameComponent } from './game/game.component';
import {MatSelectModule} from '@angular/material/select';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { GameserviceService } from './game/gameservice.service';





import { ProfileComponent } from './profile/profile.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
=======
// import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core

import { MatLabel, MatDialogRef, MAT_DIALOG_DATA, MatChipsModule } from '@angular/material';
import { MatMenuModule, MatButtonModule, MatIconModule, MatCardModule, MatDialogModule } from '@angular/material';
import { BrowserAnimationsModule, NoopAnimationsModule } from '@angular/platform-browser/animations';
// import { ProfileComponent } from './quizify/components/profile/profile.component';
// import { ProfileuserComponent } from './quizify/components/profileuser/profileuser.component';
// import { GamehistoryComponent } from './quizify/components/gamehistory/gamehistory.component';
>>>>>>> b7d9afd97868be665fcc74476ffea6bd23b9f67c


@NgModule({
  declarations: [
<<<<<<< HEAD
    AppComponent,
    ProfileComponent,
    GameComponent,
    HttpClient
=======
    AppComponent
    // CardsComponent,
    // ProfileComponent,
    // ProfileuserComponent,
    // RegisterComponent,
    // GamehistoryComponent
>>>>>>> b7d9afd97868be665fcc74476ffea6bd23b9f67c

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
<<<<<<< HEAD
    MatCardModule,
    BrowserModule,
    MatSelectModule,
    BrowserAnimationsModule,
    HttpClientModule
  ],
  schemas: [ CUSTOM_ELEMENTS_SCHEMA ],
  providers: [GameserviceService],
=======
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
>>>>>>> b7d9afd97868be665fcc74476ffea6bd23b9f67c
  bootstrap: [AppComponent]
})
export class AppModule { }
