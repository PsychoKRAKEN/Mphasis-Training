import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule,Form } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { Project1Component } from './project1/project1.component';
import { ContactusComponent } from './contactus/contactus.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { RouterModule,Routes } from '@angular/router';
import { DetailsComponent } from './details/details.component';
import { HomeComponent } from './home/home.component';
import { TwowayComponent } from './twoway/twoway.component';
import { IfDemoComponent } from './if-demo/if-demo.component';
import { SwitchdemoComponent } from './switchdemo/switchdemo.component';
import { FordemoComponent } from './fordemo/fordemo.component';
import { ShoppingcartComponent } from './shoppingcart/shoppingcart.component';
import { PipedemoComponent } from './pipedemo/pipedemo.component';
import { HttpClientModule } from '@angular/common/http';



const appRoutes:Routes=[
  {path:'Login',component:LoginComponent},
  {path:'Register',component:RegisterComponent},
  {path:'Contactus',component:ContactusComponent},
  {path:'Feedback',component:FeedbackComponent},
  {path:'Project1',component:Project1Component},
  {path:'Details',component:DetailsComponent},
  {path:'Home',component:HomeComponent},
  {path:"",redirectTo:"Home",pathMatch:"full"},
];

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    Project1Component,
    ContactusComponent,
    FeedbackComponent,
    DetailsComponent,
    HomeComponent,
    TwowayComponent,
    IfDemoComponent,
    SwitchdemoComponent,
    FordemoComponent,
    ShoppingcartComponent,
    PipedemoComponent,
  ],
  imports: [
    BrowserModule,RouterModule.forRoot(appRoutes),
    AppRoutingModule,FormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
