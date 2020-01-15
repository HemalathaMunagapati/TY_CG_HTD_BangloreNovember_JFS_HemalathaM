import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
selectedBike;
bikes = [
  {
    name: 'BMW',
    imgURL: 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
    details: `These consist of 2 BMW upcoming bikes and 20 new BMW bikes in India.. The list of BMW bike models in the country`
  },
  {
    name: 'Splendour',
    imgURL: 'https://cdn.pixabay.com/photo/2014/04/23/20/34/dirt-bike-330815__340.jpg',
    details: `These consist of 2 BMW upcoming bikes and 20 new BMW bikes in India.. The list of BMW bike models in the country`

  },
  {
    name: 'royal enfield',
    imgURL: 'https://cdn.pixabay.com/photo/2014/12/16/03/37/motor-cycle-569865__340.jpg',
    details: `These consist of 2 BMW upcoming bikes and 20 new BMW bikes in India.. The list of BMW bike models in the country`
  },
  {
    name: 'tvs',
    imgURL: 'https://cdn.pixabay.com/photo/2016/01/19/16/46/motorcycle-1149389__340.jpg',
    details: `These consist of 2 BMW upcoming bikes and 20 new BMW bikes in India.. The list of BMW bike models in the country`
  },
];
selectBike(bike) {
  this.selectedBike = bike;
}
  constructor() { }

  ngOnInit() {
  }

}
