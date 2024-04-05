import { Injectable } from "@angular/core"
import { Observable } from "rxjs"
import { Student } from "models/student.model"
import { HttpClient } from "@angular/common/http"

@Injectable({
  providedIn: "root",
})
export class StudentService {
  constructor(private http: HttpClient) {}

  private studentsUrl = "http://localhost:8080/students"

  findAll(): Observable<Student[]> {
    return this.http.get<Student[]>(this.studentsUrl)
  }

  findById(id: number): Observable<Student> {
    return this.http.get<Student>(`${this.studentsUrl}/${id}`)
  }

  update(id: number, student: Student): Observable<Student> {
    return this.http.post<Student>(`${this.studentsUrl}/${id}`, student)
  }

  create(student: Student): Observable<Student> {
    return this.http.post<Student>(this.studentsUrl, student)
  }

  delete(student: Student) {
    return this.http.delete(`${this.studentsUrl}/${student.id}`)
  }

  
}
