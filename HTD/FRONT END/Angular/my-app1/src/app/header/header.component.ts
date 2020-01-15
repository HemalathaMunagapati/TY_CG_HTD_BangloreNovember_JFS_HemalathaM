import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor( public data: DataService) {
    console.log(data.x);
    console.log(data.products);
    console.log(this.data.getProducts());

  }

  deleteProduct(product) {
    this.data.products.splice(this.data.products.indexOf(product), 1);
    console.log(this.data.products);
  }

  ngOnInit() {
  }

}
