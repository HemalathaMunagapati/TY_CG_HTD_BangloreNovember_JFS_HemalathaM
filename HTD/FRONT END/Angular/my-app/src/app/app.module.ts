import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import {RouterModule} from '@angular/router';

import { AppComponent } from './app.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { SectionComponent } from './section/section.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { HemaComponent } from './hema/hema.component';
import { RoshiniComponent } from './roshini/roshini.component';
import { KeerthiComponent } from './keerthi/keerthi.component';



@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    SectionComponent,
    HomeComponent,
    AboutComponent,
    ContactUsComponent,
    RegisterComponent,
    LoginComponent,
    PageNotFoundComponent,
    HemaComponent,
    RoshiniComponent,
    KeerthiComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path:'',component:HomeComponent},
      {path:'About',component:AboutComponent ,
       children:[
         {path:'',component:HemaComponent},
         {path:'roshini', component:RoshiniComponent},
         {path:'keerthi',component:KeerthiComponent}
       ]
    },
      {path:'contact-us',component:ContactUsComponent},
      {path:'register',component:RegisterComponent},
      {path:'login',component:LoginComponent},
      {path:'**',component:PageNotFoundComponent}

    ]

    )
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
