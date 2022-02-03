import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-list-of-employee',
  templateUrl: './list-of-employee.component.html',
  styleUrls: ['./list-of-employee.component.css']
})
export class ListOfEmployeeComponent implements OnInit {
  public employees:Employee[];
  message:string;
  constructor(private service:EmployeeService) { }

  ngOnInit() {
    this.service.getAllEmployess().subscribe(res=>{
      this.employees=res;
    })
  }

  public deleteEmployee(id:number){
    this.service.deleteEmployee(id).subscribe(res=>{
      console.log(res);
      this.message=`the employee was deleted successfully with this id ${id}`;
      this.ngOnInit();
      
    })

  }

}
