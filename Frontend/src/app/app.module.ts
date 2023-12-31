import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


import {HttpClientModule} from '@angular/common/http';
import { HeadlinesComponent } from './headlines/headlines.component'
import { NewsApiService } from './Service/news-api.service';


import { LoadingBarHttpClientModule } from '@ngx-loading-bar/http-client';


@NgModule({
  declarations: [
    AppComponent,
    HeadlinesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    LoadingBarHttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }