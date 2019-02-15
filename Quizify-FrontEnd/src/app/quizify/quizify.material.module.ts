import { NgModule } from '@angular/core';
import {MatCardModule} from '@angular/material/card';
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule, MatGridListModule} from '@angular/material';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatMenuModule} from '@angular/material/menu';
import {MatTooltipModule} from '@angular/material/tooltip';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material';
import {MatDialogModule} from '@angular/material/dialog';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatListModule} from '@angular/material/list';
import {MatRadioModule} from '@angular/material/radio';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';



@NgModule({
    declarations: [],
    imports: [
    MatCardModule,
      MatButtonModule,
      MatIconModule,
      MatToolbarModule,
      MatMenuModule, MatFormFieldModule,
       MatInputModule, MatTooltipModule, MatSnackBarModule, MatDialogModule, MatSidenavModule, MatListModule,
       MatGridListModule,
       MatInputModule,
       MatRadioModule
      ] ,
      schemas: [CUSTOM_ELEMENTS_SCHEMA] ,
      exports: [
        MatCardModule,
        MatButtonModule,
        MatIconModule,
        MatToolbarModule,
        MatMenuModule, MatFormFieldModule,

      MatInputModule, MatTooltipModule, MatSnackBarModule, MatDialogModule, MatSidenavModule, MatListModule,
          MatGridListModule,
          MatInputModule

         ]

   })
  export class QuizifyMaterialModule { }
