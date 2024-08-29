import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CoolbitsComponent } from './coolbits.component';

describe('CoolbitsComponent', () => {
  let component: CoolbitsComponent;
  let fixture: ComponentFixture<CoolbitsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CoolbitsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CoolbitsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
