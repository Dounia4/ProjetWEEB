import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpClient } from "@angular/common/http";
import {Admin} from 'models/admin.model';

@Injectable({
  providedIn: "root",
})
export class AdminService {
  constructor(private http: HttpClient) {}

  private adminUrl = "http://localhost:4200/admin";

  findAll(): Observable<Admin[]> {
    return this.http.get<Admin[]>(this.adminUrl);
  }

  login(username: string, password: string): Observable<any> {
    // Assuming your backend expects a POST request with username and password
    return this.http.post<any>(`${this.adminUrl}/admin`, { username, password });
  }
}
