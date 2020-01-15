import { Component, OnInit } from '@angular/core';
import { ProductServiceService } from '../product-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  message: string;
  products: Product[];

  constructor(private productService: ProductServiceService,
              private router: Router) {
    this.getProducts();
  }

  getProducts() {
    this.productService.getData().subscribe(response => {
      console.log(response);
      this.products = response.product;
    }, err => {
      console.log(err);
    });
  }

  deleteProduct(product: Product) {
    this.productService.deleteData(product).subscribe(res => {
      console.log(res);
      if (res.statusCode === 200) {
        this.products.splice(this.products.indexOf(product), 1);
        this.message = res.statusCode;
      }
    });
  }

  deleteMessage() {
    this.message = null;
  }
  selectProduct(product) {
    this.productService.selectedProductToUpdate = product;
    this.router.navigateByUrl('/edit-product');
  }

  ngOnInit() {
  }

}
