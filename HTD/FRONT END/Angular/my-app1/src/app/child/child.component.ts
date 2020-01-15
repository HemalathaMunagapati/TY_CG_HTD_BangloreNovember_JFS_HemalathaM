import { Component, OnInit, Input, Output } from '@angular/core';
import { EventEmitter } from '@angular/core';


@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  @Input() dataFromParent;

  @Output() childEvent = new EventEmitter();
  constructor() {
    setTimeout(() => {
      console.log(this.dataFromParent);
    }, 2000);
  }

  ngOnInit() {
  }

  sendData(data) {
    this.childEvent.emit(data);
  }

}
