import { QuizifyModule } from './quizify/quizify.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD
import { CardsComponent } from './cards/cards.component';
import { MatLabel, MatDialogRef, MAT_DIALOG_DATA, MatChipsModule } from '@angular/material';
import { MatMenuModule, MatButtonModule, MatIconModule, MatCardModule, MatDialogModule } from '@angular/material';
import { RegisterComponent } from './register/register.component';
import { ProfileComponent } from './profile/profile.component';
import { BrowserAnimationsModule, NoopAnimationsModule } from '@angular/platform-browser/animations';
import { GamehistoryComponent } from './gamehistory/gamehistory.component';
import { ProfileuserComponent } from './profileuser/profileuser.component';
=======



>>>>>>> 3aae52152f94383d28d29ea9306c02f80693b374


@NgModule({
  declarations: [
<<<<<<< HEAD
    AppComponent,
    CardsComponent,
    ProfileComponent,
    ProfileuserComponent,
    RegisterComponent,
    GamehistoryComponent
=======
    AppComponent

>>>>>>> 3aae52152f94383d28d29ea9306c02f80693b374

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
<<<<<<< HEAD
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
    MatChipsModule
    
    
=======
    QuizifyModule
>>>>>>> 3aae52152f94383d28d29ea9306c02f80693b374
  ],
  
  exports: [AppComponent,
    CardsComponent,
    ProfileComponent,
    ProfileuserComponent,
    RegisterComponent,
    GamehistoryComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
