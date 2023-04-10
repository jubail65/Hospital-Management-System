package user;

import hospital.HospitalManagementSystem;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    public String name;
    public String phoneNumber;
    public String address;
    public String NIDCard;
    public String birthday;
    public String bloodGroup;
    public String emailId;
    public String password;
    public String type;

    public User(String name, String phoneNumber, String address,
                String NIDCard, String birthday, String bloodGroup,
                String emailId, String password, String type) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.NIDCard = NIDCard;
        this.birthday = birthday;
        this.bloodGroup = bloodGroup;
        this.emailId = emailId;
        this.password = password;
        this.type = type;
    }

    private final Scanner input = new Scanner(System.in);

    public void login(){
        UserSever userSever=new UserSever();
        ArrayList<User> users= userSever.allUsers();

        System.out.print("Enter Name:");
        this.name=input.nextLine().toUpperCase();

        System.out.print("Enter Password:");
        this.password=input.nextLine().toUpperCase();

        boolean isUserFound=false;
        User currentUser=new User("","","","","","",
                "","","");

        for (int i = 0; i < users.size(); i++) {
            if (!name.equals(users.get(i).name.toUpperCase())) {
                isUserFound = false;

            } else if (!password.equals(users.get(i).password.toUpperCase())) {
                isUserFound = false;

            } else {

                isUserFound=true;
                currentUser= new User(users.get(i).name,users.get(i).phoneNumber,users.get(i).address,users.get(i).NIDCard,
                        users.get(i).birthday,users.get(i).bloodGroup,users.get(i).emailId,users.get(i).password,users.get(i).type);
                break;
            }
        }
        if (!isUserFound) {
            System.out.println("Somethign wrong with username or password");
        } else {
            HospitalManagementSystem hospitalManagementSystem=new HospitalManagementSystem();
            hospitalManagementSystem.showHospitalManagementSystemFeatures(currentUser);
        }
    }
}
