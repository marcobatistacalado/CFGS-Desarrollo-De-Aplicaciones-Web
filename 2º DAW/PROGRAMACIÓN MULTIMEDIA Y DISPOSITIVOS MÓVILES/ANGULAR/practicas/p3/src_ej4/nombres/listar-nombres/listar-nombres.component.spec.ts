import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarNombresComponent } from './listar-nombres.component';

describe('ListarNombresComponent', () => {
  let component: ListarNombresComponent;
  let fixture: ComponentFixture<ListarNombresComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListarNombresComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListarNombresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
