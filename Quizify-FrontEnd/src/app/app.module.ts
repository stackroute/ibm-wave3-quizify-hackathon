import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CardsComponent } from './cards/cards.component';
import { MatLabel, MatDialogRef, MAT_DIALOG_DATA, MatChipsModule } from '@angular/material';
import { MatMenuModule, MatButtonModule, MatIconModule, MatCardModule, MatDialogModule } from '@angular/material';
import { RegisterComponent } from './register/register.component';
import { ProfileComponent } from './profile/profile.component';
import { BrowserAnimationsModule, NoopAnimationsModule } from '@angular/platform-browser/animations';
import { GamehistoryComponent } from './gamehistory/gamehistory.component';
import { ProfileuserComponent } from './profileuser/profileuser.component';


@NgModule({
  declarations: [
    AppComponent,
    CardsComponent,
    ProfileComponent,
    ProfileuserComponent,
    RegisterComponent,
    GamehistoryComponent

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
    MatChipsModule
    
    
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
