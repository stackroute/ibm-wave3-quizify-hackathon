import { GamehistoryComponent } from './components/gamehistory/gamehistory.component';
import { ProfileuserComponent } from './components/profileuser/profileuser.component';
import { MatRadioModule } from '@angular/material/radio';
import { RegisterComponent } from './components/register/register.component';
import { QuizifyMaterialModule } from './quizify.material.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProfileComponent } from './components/profile/profile.component';
import { CardsComponent } from './components/cards/cards.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
<<<<<<< HEAD
import { MatCardModule, MatCardHeader } from '@angular/material';
import { LoginComponent } from './components/login/login.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule, HttpClient } from '@angular/common/http';
=======
import { MatCardModule } from '@angular/material';
import { SearchComponent } from './components/search/search.component';
>>>>>>> 88514a1c486cbb89cb29f1a8d0ae78b9e0a4306b
@NgModule({
  declarations: [ CardsComponent,
    ProfileComponent,
    RegisterComponent,
<<<<<<< HEAD
    LoginComponent],
=======
    SearchComponent,
    ProfileuserComponent,
    GamehistoryComponent,
     ],

>>>>>>> 88514a1c486cbb89cb29f1a8d0ae78b9e0a4306b
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
<<<<<<< HEAD
  LoginComponent ]
=======
    SearchComponent,
    ProfileuserComponent,
    GamehistoryComponent,
   ]
>>>>>>> 88514a1c486cbb89cb29f1a8d0ae78b9e0a4306b

})
export class QuizifyModule { }
