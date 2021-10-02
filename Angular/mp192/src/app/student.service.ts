import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private baseURL="http://localhost:8090/api/v1";

  constructor(private httpClient:HttpClient) { }

  getStudentList():Observable<Student[]>{
    return this.httpClient.get<Student[]>(`${this.baseURL}/students`);

  }

  createStudent(student: Student): Observable<any> {
    return this.httpClient.post(`${this.baseURL}/students`, student);
  }

}
