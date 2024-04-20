import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { GroupsComponent } from './components/groups/groups.component'; 
import { ConversationComponent } from './components/conversation/conversation.component';

const routes: Routes = [
  {path: 'groups', component: GroupsComponent},
  {path: 'conversation/:groupId', component: ConversationComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
