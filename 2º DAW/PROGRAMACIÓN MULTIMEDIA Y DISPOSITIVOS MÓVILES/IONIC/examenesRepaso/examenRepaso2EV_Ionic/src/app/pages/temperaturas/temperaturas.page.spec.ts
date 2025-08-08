import { ComponentFixture, TestBed } from '@angular/core/testing';
import { TemperaturasPage } from './temperaturas.page';

describe('TemperaturasPage', () => {
  let component: TemperaturasPage;
  let fixture: ComponentFixture<TemperaturasPage>;

  beforeEach(() => {
    fixture = TestBed.createComponent(TemperaturasPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
