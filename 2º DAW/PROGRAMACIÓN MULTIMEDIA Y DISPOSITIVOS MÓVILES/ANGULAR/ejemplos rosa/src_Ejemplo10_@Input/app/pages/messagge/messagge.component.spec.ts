import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MessaggeComponent } from './messagge.component';

describe('MessaggeComponent', () => {
  let component: MessaggeComponent;
  let fixture: ComponentFixture<MessaggeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MessaggeComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MessaggeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
