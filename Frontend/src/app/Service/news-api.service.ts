import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NewsApiService {

  constructor(private http:HttpClient) { }

  topHeadlinesApiUrl = 'https://localhost:8080/consulta-news/4bca77f7afb744ed9dfe1fdbff572939';

  topHeadlines():Observable<any>
  {
    return this.http.get(this.topHeadlinesApiUrl);
  }  
}