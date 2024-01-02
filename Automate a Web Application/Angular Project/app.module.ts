import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignupComponent } from './signup/signup.component';
import { FormsModule } from '@angular/forms';
import { SigninComponent } from './signin/signin.component';
import { LandpageComponent } from './landpage/landpage.component';
import { RouterModule, Routes } from '@angular/router';
import { MainComponent } from './main/main.component';

const routes:Routes=[
  {path:"main",component:MainComponent},
  {path:"signin",component:SigninComponent},
  {path:"signup",component:SignupComponent},
  {path:"landpage",component:LandpageComponent}
  ]
  

@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    SigninComponent,
    LandpageComponent,
    MainComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
