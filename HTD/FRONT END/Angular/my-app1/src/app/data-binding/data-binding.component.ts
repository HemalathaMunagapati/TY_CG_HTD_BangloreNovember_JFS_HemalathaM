import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {
  flag=false;
  name='hema';
  twoWayData;
  imgURL= 'https://cdn.pixabay.com/photo/2020/01/01/18/54/landscape-4734181_1280.jpg';

  constructor() { 

    setInterval(()=>{
      this.flag=!this.flag;
    },1000)

    
  }
  printData(){
 console.log(this.twoWayData)
  }

  clickMe(input){
    console.log(input.value);
    
  }

  ngOnInit() {
  }

}
