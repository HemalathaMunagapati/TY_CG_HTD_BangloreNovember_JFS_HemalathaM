import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RoshiniComponent } from './roshini.component';

describe('RoshiniComponent', () => {
  let component: RoshiniComponent;
  let fixture: ComponentFixture<RoshiniComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RoshiniComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RoshiniComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
