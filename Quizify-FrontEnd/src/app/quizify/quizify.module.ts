import { MatRadioModule } from '@angular/material/radio';
import { RegisterComponent } from './components/register/register.component';
import { QuizifyMaterialModule } from './quizify.material.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProfileComponent } from './components/profile/profile.component';
import { CardsComponent } from './components/cards/cards.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { MatCardModule } from '@angular/material';
import { SearchComponent } from './components/search/search.component';
@NgModule({
  declarations: [ CardsComponent,
    ProfileComponent,
<<<<<<< HEAD
    RegisterComponent
  ],
=======
    RegisterComponent,
    SearchComponent],
>>>>>>> 0736795a80f6b9b2c0f89ed46aa6d024ac2dba50
  imports: [
    CommonModule,
    BrowserAnimationsModule,
    MatCardModule,
    QuizifyMaterialModule

  ],
  exports: [ CardsComponent,
    ProfileComponent,
<<<<<<< HEAD
    RegisterComponent
    ]
=======
    RegisterComponent,
    SearchComponent ]
>>>>>>> 0736795a80f6b9b2c0f89ed46aa6d024ac2dba50

})
export class QuizifyModule { }
