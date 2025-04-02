package com.bajaj.showroomapp;
import com.bajaj.showroomapp.manager.Manager;
import com.bajaj.showroomapp.showroom.ShowRoom;
import com.bajaj.showroomapp.staff.Staff;

    public class ShowRoomRunner {
        public static void main(String[] args) {
            String managerNames[] = {"Akash", "Hemanth" };
            String staffNames[] = {"Goutham", "Arun"};
            Manager[] managers = new Manager[2];
            Manager manager1 = new Manager();
            manager1.managerName = managerNames[0];
            manager1.managerId = 1;
            manager1.managerGender = "male";

            Manager manager2 = new Manager();
            manager2.managerName = managerNames[1];
            manager2.managerId = 2;

            managers[0] = manager1;
            managers[1] = manager2;

            Staff[] staffs = new Staff[2];
            Staff staff1 = new Staff();
            staff1.staffName = staffNames[0];
            staff1.staffId = 1;
            staff1.staffGender = "male";

            Staff staff2 = new Staff();
            staff2.staffName = staffNames[1];
            staff2.staffId = 2;
            staff2.staffGender = "female";

            staffs[0]=staff1;
            staffs[1]=staff2;

            manager1.staffs=staffs;
            manager2.staffs=staffs;

            ShowRoom showRoom = new ShowRoom();
            showRoom.showRoomName = "tata showroom";
            showRoom.showRoomContact = 935369231;
            showRoom.showRoomAddress = "Rajajingar";
            showRoom.managers = managers;


            System.out.println("manager is " + managers[0].managerName + " " + " " + "manager id is  " + manager1.managerId +  " staff name is " + staffNames[0]);


        }
    }

