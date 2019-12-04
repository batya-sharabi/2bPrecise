import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { EmployeeService } from './employee.service';
// import { Employee } from '..../src/main/java/organization/Employee';
import { HttpResponse } from '@angular/common/http';
import {Employee} from "./employee";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private employeeService: EmployeeService){}
  employees : Employee[];
  ngOnInit(){
    this.employeeService.getAllEmployees().subscribe(data => {
      this.employees = data;
    });
    // this.employeeService.getAllEmployees()
    //   .subscribe(
    //     (response: Response) => {
    //       let data  = response.json();
    //       this.employees = data;
    //     },
    //     (error)    => console.log(error)
    //   );
  }


  // displayedColumns: string[] = ['firstName', 'lastName', 'position', 'action'];
  dataSource = this.employees;

}


const ELEMENT_DATA = [
  {position: 1, name: 'Hydrogen', weight: 1.0079, symbol: 'H'},
  {position: 2, name: 'Helium', weight: 4.0026, symbol: 'He'},
  {position: 3, name: 'Lithium', weight: 6.941, symbol: 'Li'},
  {position: 4, name: 'Beryllium', weight: 9.0122, symbol: 'Be'},
  {position: 5, name: 'Boron', weight: 10.811, symbol: 'B'},
  {position: 6, name: 'Carbon', weight: 12.0107, symbol: 'C'},
  {position: 7, name: 'Nitrogen', weight: 14.0067, symbol: 'N'},
  {position: 8, name: 'Oxygen', weight: 15.9994, symbol: 'O'},
  {position: 9, name: 'Fluorine', weight: 18.9984, symbol: 'F'},
  {position: 10, name: 'Neon', weight: 20.1797, symbol: 'Ne'},
];
