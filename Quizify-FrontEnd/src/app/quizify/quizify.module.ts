import { GamehistoryComponent } from './components/gamehistory/gamehistory.component';
import { ProfileuserComponent } from './components/profileuser/profileuser.component';
import { QuizifyMaterialModule } from './quizify.material.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RegisterComponent } from './components/register/register.component';
import { ProfileComponent } from './components/profile/profile.component';
import { CardsComponent } from './components/cards/cards.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { MatCardModule } from '@angular/material';
import { SearchComponent } from './components/search/search.component';
@NgModule({
  declarations: [ CardsComponent,
    ProfileComponent,
    RegisterComponent,
    SearchComponent,
    ProfileuserComponent,
    GamehistoryComponent
  ],
  imports: [
    CommonModule,
    BrowserAnimationsModule,
    MatCardModule,
    QuizifyMaterialModule

  ],
  exports: [ CardsComponent,
    ProfileComponent,
    RegisterComponent,
    SearchComponent,
    ProfileuserComponent,
    GamehistoryComponent
  ]

})
export class QuizifyModule { }
