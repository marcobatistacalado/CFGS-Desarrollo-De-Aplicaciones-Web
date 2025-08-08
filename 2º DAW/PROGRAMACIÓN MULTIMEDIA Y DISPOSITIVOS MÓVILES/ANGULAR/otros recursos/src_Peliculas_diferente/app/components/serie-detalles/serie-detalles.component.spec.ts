import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SerieDetallesComponent } from './serie-detalles.component';

describe('SerieDetallesComponent', () => {
  let component: SerieDetallesComponent;
  let fixture: ComponentFixture<SerieDetallesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SerieDetallesComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SerieDetallesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
