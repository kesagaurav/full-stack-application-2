import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { ListOfEmployeeComponent } from './list-of-employee/list-of-employee.component';


const routes: Routes = [{
  path:'',component:AddEmployeeComponent},
  //{path:'deleteEmployees',component:},
  {path:'viewEmployees',component:ListOfEmployeeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
