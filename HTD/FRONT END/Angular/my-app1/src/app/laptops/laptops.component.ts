import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-laptops',
  templateUrl: './laptops.component.html',
  styleUrls: ['./laptops.component.css']
})
export class LaptopsComponent implements OnInit {
  selectedLaptop;
  cars = [
    {
      name: 'Asus ROG Gaming',
      imgURL: 'https://cdn.pixabay.com/photo/2014/09/27/13/44/notebook-463485__340.jpg',
      details: `ASUS Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor,
      2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM,
       1 x SO-DIMM socket , up to 8 GB SDRAM. Display.
      14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage`
    },
    {
      name: 'HP Pavillion',
      imgURL: 'https://cdn.pixabay.com/photo/2015/07/26/17/29/mixer-861431__340.jpg',
      details: `ASUS Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor,
      2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory.
      DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display.
      14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.`
    },
    {
      name: 'Dell Vostro',
      imgURL: 'https://cdn.pixabay.com/photo/2017/08/10/07/32/dell-2619501__340.jpg',
      details: `ASUS Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor,
      2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory.
       DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display.
       14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage`
    },
  ];
  selectLaptop(laptop) {
    this.selectedLaptop = laptop;
  }
  constructor() { }

  ngOnInit() {
  }

}
