import { logging } from 'protractor';
import { Component, OnInit } from '@angular/core';
// import { SharedServiceService } from "./quizify/services/shared-service.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
<<<<<<< HEAD
export class AppComponent implements OnInit {
title = 'quizify-frontend';
  constructor() {  }
 ngOnInit() {

  }
=======
export class AppComponent {
  title = 'quizify-frontend';
  interests = ['Movies', 'TvShows'];
>>>>>>> cb058c47fa20c2a0680834d8fa159b80c6fbf4ff
}
