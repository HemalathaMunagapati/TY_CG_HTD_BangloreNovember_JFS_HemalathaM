import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {
selectedCar;
cars = [
  {
    name: 'Ferrari',
    imgURL: 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278_1280.jpg',
    details: `Ferrari Cars in India. 4.2. Ferrari 812 Superfast. Rs. 5.20 crore onwards. 6496 cc 6.7 kmpl Petrol.
    Ferrari Portofino. Rs. 3.50 crore onwards. 3855 cc 9 kmpl Petrol. View January Offers. 4.5. Ferrari GTC4Lusso.
     Rs. 4.26 crore onwards. 3855 cc 4 kmpl Petrol. Ferrari 488. Rs. 4.40 crore onwards. 3902 cc 7.75 kmpl Petrol.`
  },
  {
    name: 'Maruthi',
    imgURL: 'https://cdn.pixabay.com/photo/2016/02/13/13/11/cuba-1197800__340.jpg',
    details: `The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer.
    The Diesel engine is 1248 cc while the Petrol engine is 1197 cc.
    Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl.
     The Swift is a 5 seater Hatchback and has a length of 3840mm`
  },
  {
    name: 'Suzuki',
    imgURL: 'https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747__340.jpg',
    details: `The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer.
    The Diesel engine is 1248 cc while the kersine engine is 466 cc.
     Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl.
    The Suzuki is a 5 seater Hatchback and has a length of 3840mm`
  },
];
selectCar(car) {
  this.selectedCar = car;
}
  constructor() { }

  ngOnInit() {
  }

}
