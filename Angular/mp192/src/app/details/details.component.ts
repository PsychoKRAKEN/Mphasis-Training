import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from '../student';
import { StudentService } from '../student.service';



@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

  students: Student[] = [];

  constructor(private studentService:StudentService)
  {
    
  }
  
  ngOnInit(): void {

    this.getStudents();
   
  }

  private getStudents(){
    return this.studentService.getStudentList().subscribe(data=>{
      this.students=data;
    }, error => {
      console.log(error);
    });
  }
}
