import { Component } from '@angular/core';
import { EmployeeService } from './employee.service';

import {Employee} from "./employee";
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private employeeService: EmployeeService, private route: Router) {
  }

  employees: Employee[];

  ngOnInit() {
    this.employeeService.getAllEmployees().subscribe(data => {
      this.employees = data;
      console.log(this.employees)
    });
  }

  view = function (emp) {
    // sessionStorage.setItem('selectedEmp',JSON.stringify(emp));
    this.route.navigate(['/details']);

  }
}
