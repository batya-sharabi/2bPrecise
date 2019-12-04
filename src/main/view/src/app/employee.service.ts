import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {Employee} from "./employee";
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {RequestOptions} from "@angular/http";

@Injectable()
export class EmployeeService {
  // constructor(private http: HttpClient){}
  // employees: Employee[];
  // getAllEmployees(){
  //   return this.http.get("//localhost:4200/getEmployees");
  // }
  private usersUrl: string;
  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/getEmployees';
  }

  public getAllEmployees(): Observable<Employee[]> {
    // let headers = new Headers();
    // headers.append('Access-Control-Allow-Origin', '*');
    //
    // let options = new RequestOptions({ headers: headers });
    return this.http.get<Employee[]>(this.usersUrl,{ headers: new HttpHeaders({
        'Access-Control-Allow-Origin': '*'
      })});
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
