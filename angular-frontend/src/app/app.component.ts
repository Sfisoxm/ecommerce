import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CoolbitsComponent } from "./coolbits/coolbits.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CoolbitsComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angular-frontend';
}
