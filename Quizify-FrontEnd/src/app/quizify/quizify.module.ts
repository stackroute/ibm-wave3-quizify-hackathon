<<<<<<< HEAD
import { GamehistoryComponent } from './components/gamehistory/gamehistory.component';
import { ProfileuserComponent } from './components/profileuser/profileuser.component';
=======
import { MatRadioModule } from '@angular/material/radio';
import { RegisterComponent } from './components/register/register.component';
>>>>>>> c92dfbd061ed33bac7b6b361a6e17567473f5c4f
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
<<<<<<< HEAD
    SearchComponent,
    ProfileuserComponent,
    GamehistoryComponent
  ],
=======
    SearchComponent],
>>>>>>> 0736795a80f6b9b2c0f89ed46aa6d024ac2dba50
>>>>>>> c92dfbd061ed33bac7b6b361a6e17567473f5c4f
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
<<<<<<< HEAD
    SearchComponent,
    ProfileuserComponent,
    GamehistoryComponent
  ]
=======
    SearchComponent ]
>>>>>>> 0736795a80f6b9b2c0f89ed46aa6d024ac2dba50
>>>>>>> c92dfbd061ed33bac7b6b361a6e17567473f5c4f

})
export class QuizifyModule { }
