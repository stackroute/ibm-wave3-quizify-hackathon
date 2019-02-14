import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { MatInputModule } from '@angular/material';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatIconModule} from '@angular/material/icon';
import {MatRadioModule} from '@angular/material/radio';
import { RegisterComponent } from './register.component';

import {MatSelectModule} from '@angular/material/select';





@NgModule({
  declarations: [
   RegisterComponent
  ],
  imports: [
    BrowserModule
    ],
  exports: [
      RegisterComponent
  ]
})

export class RegisterModule {
}



