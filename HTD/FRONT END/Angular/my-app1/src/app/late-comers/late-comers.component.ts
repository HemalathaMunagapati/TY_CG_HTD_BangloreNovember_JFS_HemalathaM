import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-late-comers',
  templateUrl: './late-comers.component.html',
  styleUrls: ['./late-comers.component.css']
})
export class LateComersComponent implements OnInit {

message: string;
// flag = false;

  lateComers: string[] = [
  'pavan',
  'siva',
  'anish',
  'ram'
  ];

  constructor() { }

  ngOnInit() {
  }

  deleteLateComer(name: string) {
    this.lateComers.splice(this.lateComers.indexOf(name), 1),
    this.message = `${name} is deleted`;
   // tslint:disable-next-line: align
   setTimeout(() => {
     // tslint:disable-next-line: whitespace
     this.message=null;
   }, 2000);
  }

}
