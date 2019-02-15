import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProfileuserComponent } from './quizify/components/profileuser/profileuser.component';
import { GamehistoryComponent } from './quizify/components/gamehistory/gamehistory.component';

const routes: Routes = [
  { path: 'profileuser', component: ProfileuserComponent },

  { path: 'gamehistory', component: GamehistoryComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
