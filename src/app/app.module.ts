import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms'; 


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { GroupsComponent } from './components/groups/groups.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { ConversationComponent } from './components/conversation/conversation.component';
import { AddGroupComponent } from './components/add-group/add-group.component';
import { ReactiveFormsModule } from '@angular/forms';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { EditGroupComponent } from './components/edit-group/edit-group.component';


@NgModule({
  declarations: [
    AppComponent,
    GroupsComponent,
    NavbarComponent,
    ConversationComponent,
    AddGroupComponent,
    SidebarComponent,
    EditGroupComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
