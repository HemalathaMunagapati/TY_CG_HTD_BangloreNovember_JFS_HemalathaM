import { Component, OnInit } from '@angular/core';
import { ProductServiceService } from '../product-service.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-edit-product',
  templateUrl: './edit-product.component.html',
  styleUrls: ['./edit-product.component.css']
})
export class EditProductComponent implements OnInit {

  constructor(public productService: ProductServiceService,
              private router: Router) { }

  updateProduct(form: NgForm) {
    this.productService.updateData(form.value).subscribe(res => {
      console.log(res);
      if (res.statusCode === 201 ) {
        this.router.navigateByUrl('/get-product');
      }
      form.reset();
    });
  }

  ngOnInit() {
  }

}
