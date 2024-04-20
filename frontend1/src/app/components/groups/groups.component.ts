import { Component, OnInit } from '@angular/core';
import { GetGroupService } from 'src/app/services/get-group.service';
import { PopupAddGroupService } from 'src/app/services/popup-add-group.service';


@Component({
  selector: 'app-groups',
  templateUrl: './groups.component.html',
  styleUrls: ['./groups.component.css']
})
export class GroupsComponent implements OnInit {
  groups: any;
  selectedGroup : any;
  isPopupOpen: boolean = false; // Variable de statut pour indiquer si le popup est ouvert ou fermé

  constructor(
    public _get: GetGroupService,
    private popup : PopupAddGroupService
  ) {}

  ngOnInit(): void {
    this._get.getAllGroups().subscribe(
      res => {
        this.groups = res;
      },
      error => {
        console.log(error);
      }
    );

    // Écoutez les changements d'état du popup à partir du service et mettez à jour la variable isPopupOpen
    this.popup.popupStateChanged.subscribe(isOpen => {
      this.isPopupOpen = isOpen;
    });
  }

  

  selectGroup(group: any) {
    this.selectedGroup = group;
  }

  openPopup() {
    console.log('Popup opened');
    this.popup.togglePopup(); // Appeler la méthode pour ouvrir/fermer le popup dans le service
  }
}