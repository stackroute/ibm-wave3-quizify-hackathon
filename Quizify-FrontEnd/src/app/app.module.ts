import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
<<<<<<< HEAD
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CardsComponent } from './cards/cards.component';
import { MatCardModule } from '@angular/material';
=======
import { MatCardModule } from '@angular/material';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProfileComponent } from './profile/profile.component';
>>>>>>> 61c2e20a26a55352419c1d30905c7426c1080c83

@NgModule({
  declarations: [
    AppComponent,
<<<<<<< HEAD
    CardsComponent
=======
    ProfileComponent
>>>>>>> 61c2e20a26a55352419c1d30905c7426c1080c83
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatCardModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
