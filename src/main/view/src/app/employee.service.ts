import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import { HttpClient } from '@angular/common/http';

@Injectable()
export class EmployeeService {
  constructor(private http: HttpClient){}
  // employees: Employee[];
  getAllEmployees(){
    return this.http.get("//localhost:4200/getEmployees");
  }

  // getAllEmployees(): Observable<Employee[]> {
  //   return this.Http.get(`//localhost:4200/list`).pipe(
  //     map((res) => {
  //       this.cars = res['data'];
  //       return this.cars;
  //     }),
  //     catchError(this.handleError));
  // }


}
