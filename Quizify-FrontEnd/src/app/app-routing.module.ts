<<<<<<< HEAD
import { LoginComponent } from './quizify/components/login/login.component';
=======
import { ProfileComponent } from './quizify/components/profile/profile.component';
>>>>>>> 88514a1c486cbb89cb29f1a8d0ae78b9e0a4306b
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProfileuserComponent } from './quizify/components/profileuser/profileuser.component';
import { GamehistoryComponent } from './quizify/components/gamehistory/gamehistory.component';

const routes: Routes = [
<<<<<<< HEAD
  {path: 'login', component: LoginComponent}
=======
   {
     path: 'profile' , component: ProfileComponent
   },
 { path: 'profileuser', component: ProfileuserComponent },

  { path: 'gamehistory', component: GamehistoryComponent }
>>>>>>> 88514a1c486cbb89cb29f1a8d0ae78b9e0a4306b
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
