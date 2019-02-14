import { NgModule } from '@angular/core';
import {MatCardModule} from '@angular/material/card';
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatMenuModule} from '@angular/material/menu';
import {MatTooltipModule} from '@angular/material/tooltip';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material';
import {MatDialogModule} from '@angular/material/dialog';
<<<<<<< HEAD

=======
>>>>>>> 0736795a80f6b9b2c0f89ed46aa6d024ac2dba50
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatListModule} from '@angular/material/list';


<<<<<<< HEAD

=======
>>>>>>> 0736795a80f6b9b2c0f89ed46aa6d024ac2dba50
@NgModule({
   declarations: [],
   imports: [
   MatCardModule,
     MatButtonModule,
     MatIconModule,
     MatToolbarModule,
     MatMenuModule, MatFormFieldModule,
      MatInputModule, MatTooltipModule, MatSnackBarModule, MatDialogModule,  MatSidenavModule, MatListModule
     ] ,
     exports: [
       MatCardModule,
       MatButtonModule,
       MatIconModule,
       MatToolbarModule,
       MatMenuModule, MatFormFieldModule,
        MatInputModule, MatTooltipModule, MatSnackBarModule, MatDialogModule,  MatSidenavModule, MatListModule
        ]
  })
 export class QuizifyMaterialModule { }
