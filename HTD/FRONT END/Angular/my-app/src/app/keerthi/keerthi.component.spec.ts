import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { KeerthiComponent } from './keerthi.component';

describe('KeerthiComponent', () => {
  let component: KeerthiComponent;
  let fixture: ComponentFixture<KeerthiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ KeerthiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(KeerthiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
