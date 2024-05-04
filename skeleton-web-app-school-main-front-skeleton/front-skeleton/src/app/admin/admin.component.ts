import { Component } from '@angular/core';
import { AdminService } from 'services/admin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.scss']
})
export class AdminComponent {

  constructor(private adminService: AdminService, private router: Router) { }

  login(username: string, password: string): void {
    this.adminService.login(username, password)
      .subscribe(
        (response) => {
          // Handle successful login response
          console.log('Login successful:', response);
          this.router.navigate(['home/home.component']); // Replace '/dashboard' with the desired route
        },
        (error) => {
          // Handle login error
          console.error('Login error:', error);
          // Display error message to the user
        }
      );
  }
}
