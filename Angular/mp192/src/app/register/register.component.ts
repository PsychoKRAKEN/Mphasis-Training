import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { StudentService } from '../student.service';
import { FormsModule } from '@angular/forms';
import { Router, Routes } from '@angular/router';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  student:Student=new Student();
  
  constructor(private studentService:StudentService,private router:Router)
  {
    
  }
  
  ngOnInit(): void {
   
  }

  saveStudent()
  {
    this.studentService.createStudent(this.student).subscribe(data=>{
      console.log(data);
      this.gotoStudentList();
    },
    error=>console.log(error));
  }

  gotoStudentList()
  {
    this.router.navigate(["/Details"]);
  }

  onSubmit()
  {
    console.log(this.student);
    this.saveStudent();
  }

  
}
