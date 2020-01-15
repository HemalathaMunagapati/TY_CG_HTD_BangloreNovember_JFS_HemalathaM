import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';

import { AppComponent } from './app.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { LateComersComponent } from './late-comers/late-comers.component';
import { ProductsComponent } from './products/products.component';
import { ImagesComponent } from './images/images.component';
import { HeaderComponent } from './header/header.component';
import { ColorDirective } from './color.directive';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { BikesComponent } from './bikes/bikes.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';
import { CarsComponent } from './cars/cars.component';
import { CarDetailsComponent } from './car-details/car-details.component';
import { MoviesComponent } from './movies/movies.component';
import { LaptopsComponent } from './laptops/laptops.component';
import { MobileComponent } from './mobile/mobile.component';
import { LaptopDetailsComponent } from './laptop-details/laptop-details.component';
import { MobileDetailsComponent } from './mobile-details/mobile-details.component';
import { MovieDetailsComponent } from './movie-details/movie-details.component';




@NgModule({
  declarations: [
    AppComponent,
    DataBindingComponent,
    LateComersComponent,
    ProductsComponent,
    ImagesComponent,
    HeaderComponent,
    ColorDirective,
    ParentComponent,
    ChildComponent,
    BikesComponent,
    BikeDetailsComponent,
    CarsComponent,
    CarDetailsComponent,
    MoviesComponent,
    LaptopsComponent,
    MobileComponent,
    LaptopDetailsComponent,
    MobileDetailsComponent,
    MovieDetailsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
     {path: '', component: LateComersComponent},
     {path: 'late-comers', component: LateComersComponent},
     {path: 'products', component: ProductsComponent},
     {path: 'images', component: ImagesComponent},
     {path: 'parent', component: ParentComponent},
     {path: 'bikes', component: BikesComponent},
     {path: 'cars' , component: CarsComponent},
     {path: 'movies', component: MoviesComponent},
     {path: 'laptops', component: LaptopsComponent},
     {path: 'mobiles', component: MobileComponent}


    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
