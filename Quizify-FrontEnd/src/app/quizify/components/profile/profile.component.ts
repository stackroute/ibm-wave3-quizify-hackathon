import { Component, OnInit, Inject, Input, Output, EventEmitter } from '@angular/core';
import { MatDialog, MAT_DIALOG_DATA } from '@angular/material';
import { Route } from '@angular/compiler/src/core';
import { RouterLink, ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.scss']
})
export class ProfileComponent {


  constructor( private router: Router) { }

  openProfileMenu() {
    this.router.navigate(['profile']);
  }
  openDetails() {
    this.router.navigate(['profileuser']);
  }
  openHistory() {
    this.router.navigate(['gamehistory']);

  }

}
