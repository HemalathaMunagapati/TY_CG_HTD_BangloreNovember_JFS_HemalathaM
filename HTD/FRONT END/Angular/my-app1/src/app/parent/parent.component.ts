import { Component, OnInit, OnDestroy, DoCheck, AfterContentInit, AfterContentChecked } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit, OnDestroy, DoCheck, AfterContentInit, AfterContentChecked {
dataFromChild;
student = {
  name: 'hema',
  age: 20,
  marks: 67
};

getChildData(data) {
  this.dataFromChild = data;
}

  constructor() {
    console.log('parent component constructor called') ;
   }

  ngOnInit() {
    console.log('On init method executed') ;
  }

  ngDoCheck() {
    console.log('data is checked');
  }
  ngAfterContentInit() {
    console.log('content is initialized');
  }
  ngAfterContentChecked() {
    console.log('content is checked');
  }
  ngOnDestroy() {
    console.log('destroyred');
  }

}
