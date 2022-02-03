import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private url:string;
  constructor(private http:HttpClient) {
    this.url="http://localhost:9800/employee";
   }
   public addEmployee(employee:Employee):Observable<Employee>{
     return this.http.post<Employee>(this.url,employee);
   }
   public deleteEmployee(id:number):Observable<Employee>{
     return this.http.delete<Employee>(this.url + `/${id}`);
   }
   public  getAllEmployess() : Observable<Employee[]>{
    return this.http.get<Employee[]>(this.url + "s");
  }
}
