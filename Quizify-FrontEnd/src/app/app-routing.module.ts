import { ProfileuserComponent } from './profileuser/profileuser.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
<<<<<<< HEAD
import { ProfileuserComponent } from './quizify/components/profileuser/profileuser.component';
import { GamehistoryComponent } from './quizify/components/gamehistory/gamehistory.component';

const routes: Routes = [
  { path: 'profileuser', component: ProfileuserComponent },

  { path: 'gamehistory', component: GamehistoryComponent }
];
=======
import { GamehistoryComponent } from './gamehistory/gamehistory.component';

const routes: Routes = [
 { path: 'profileuser', component: ProfileuserComponent },

  { path: 'gamehistory', component: GamehistoryComponent }
 
];

>>>>>>> c92dfbd061ed33bac7b6b361a6e17567473f5c4f

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
