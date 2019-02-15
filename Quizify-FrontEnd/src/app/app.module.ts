import { BrowserModule } from '@angular/platform-browser';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MatCardModule } from '@angular/material';
import {MatSelectModule} from '@angular/material/select';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';
import { QuizifyMaterialModule } from './quizify/quizify.material.module';
import { QuizifyModule } from './quizify/quizify.module';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    QuizifyMaterialModule,
    QuizifyModule,
    AppRoutingModule,
    MatCardModule,
    MatSelectModule,
    BrowserAnimationsModule,
    HttpClientModule,
    FormsModule,
    QuizifyModule,
    HttpClientModule
  ],
  providers: [] ,
  schemas: [ CUSTOM_ELEMENTS_SCHEMA ],
  bootstrap: [AppComponent]
})
export class AppModule { }
