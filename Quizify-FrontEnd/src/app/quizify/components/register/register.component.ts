
import { Component, OnInit, Input, ViewChild } from '@angular/core';
import { RegisterService } from '../../services/register.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { FormGroup, FormBuilder, Validators, NgForm } from '@angular/forms';
import { Level } from '../game/game.component';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {
  formGroup2: FormGroup;
  // tslint:disable-next-line:no-inferrable-types
  isOptional: boolean = false;
  formGroup1: FormGroup;
  formGroup3: FormGroup;
  userForm: any;
  private levels: Level[];

  @ViewChild('myStep') myStep;

  constructor(private _formBuilder: FormBuilder) {
    this. levels = [
      {value: 'movies', viewValue: 'Movies'},
      {value: 'tvshows', viewValue: 'TvShows'},
    ];
 }

  ngOnInit() {
    this.formGroup1 = this._formBuilder.group({
      firstCtrl: ['', Validators.required]
    });
    this.formGroup2 = this._formBuilder.group({
      secondCtrl: ['', Validators.required]
    });
    this.formGroup3 = this._formBuilder.group({
      thirdCtrl: ['', Validators.required]
    });
    // saveDetails(userForm: NgForm): void {
    //   console.log(userForm.value);
    // };
  }

}
