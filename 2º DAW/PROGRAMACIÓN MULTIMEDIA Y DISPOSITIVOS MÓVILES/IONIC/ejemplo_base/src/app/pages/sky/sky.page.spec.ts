import { ComponentFixture, TestBed } from '@angular/core/testing';
import { SkyPage } from './sky.page';

describe('SkyPage', () => {
  let component: SkyPage;
  let fixture: ComponentFixture<SkyPage>;

  beforeEach(() => {
    fixture = TestBed.createComponent(SkyPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
