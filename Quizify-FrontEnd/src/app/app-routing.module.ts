import { ProfileComponent } from './quizify/components/profile/profile.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProfileuserComponent } from './quizify/components/profileuser/profileuser.component';
import { GamehistoryComponent } from './quizify/components/gamehistory/gamehistory.component';
import { Profile } from 'selenium-webdriver/firefox';

const routes: Routes = [
   {
     path: 'profile' , component: ProfileComponent
   },
 { path: 'profileuser', component: ProfileuserComponent },

  { path: 'gamehistory', component: GamehistoryComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
