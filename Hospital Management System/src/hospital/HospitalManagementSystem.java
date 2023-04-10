package hospital;

import user.User;
import department.Department;
import department.DepartmentServer;
import java.util.ArrayList;
import java.util.Scanner;
public class HospitalManagementSystem {
    Scanner input = new Scanner(System.in);
    ArrayList<Department> departments = new ArrayList<Department>();
    public void showHospitalManagementSystemFeatures(User user) {
        System.out.println("1.Profile");
        System.out.println("2.Department");
        System.out.println("3.Appointment");
        System.out.println("4.Search Doctor");
        System.out.println("5.Logout");

        System.out.print("Enter a Option:");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("User name       :"+user.name);
                System.out.println("User phoneNumber       :"+user.address);
                System.out.println("User address       :"+user.NIDCard);
                System.out.println("User birthday       :"+user.bloodGroup);
                System.out.println("User emailId       :"+user.phoneNumber);
                System.out.println("User bloodGroup       :"+user.emailId);
                System.out.println("User NIDCard       :"+user.birthday);
                System.out.println("User password       :"+user.password);
                System.out.println("User type       :"+user.type);
                break;

            case 2:
                showDepartment();
                break;
            case 3:
                appointment();
                break;
            case 4:
                searchDoctor();
                break;
            case 5:
                break;

            default:
                System.out.println("Option Not Found");
        }
    }
private void appointment(){

        showDepartment();

        System.out.print("Enter the department  which you will create appointment:");
        String  appointmentDoctor = input.next().toLowerCase();

        System.out.print("Enter Doctor Name:");
        String  appointmentDoctorName = input.next().toLowerCase();

        boolean isDoctorAppointmentAvailable = false;

        for(int i =0; i< departments.size();i++){

            if(!appointmentDoctor.equals(departments.get(i).getDepartment().toLowerCase())) {
                isDoctorAppointmentAvailable = false;
            }
                if(!appointmentDoctorName.equals(departments.get(i).getDoctorName().toLowerCase())) {
                    isDoctorAppointmentAvailable = false;
                }else {

                    isDoctorAppointmentAvailable= true;

                    System.out.print("Patient Name :  ");
                    String appointPatientName = input.next();
                    System.out.print("Enter current Address :  ");
                    String appointmentAddress = input.next();
                    System.out.print("Enter Your Gender :  ");
                    String appointmentGender = input.next();
                    System.out.print("Enter You Age :  ");
                    String appointmentAge = input.next();

                    System.out.println("Patient blood group :  ");
                    String bloodGroup = input.next();
                    System.out.print("Enter Phone number :  ");
                    String appointmentPhone = input.next();
                    System.out.print("Enter Appointment Date 12-12-2022  to  20-12-2022 :  ");
                    String appointmentDate = input.next();
                    System.out.print("Enter Appointment Time 09.00 AM  to  11.00 PM :  ");
                    String appointmentTime = input.next();

                    System.out.println("\n");

                        System.out.println("Appointment successfully Created");
                        System.out.println("Your Appointment With Doctor Details");
                        System.out.println("Department Name :   " + departments.get(i).getDepartment());
                        System.out.println("Doctor Name :   " + departments.get(i).getDoctorName());
                        System.out.println("Doctor Degree :   " + departments.get(i).getDegree());
                        System.out.println("Doctor Experience :   " + departments.get(i).getExperience());
                        System.out.println("Doctor Specialty :   " + departments.get(i).getSpecialty());
                        System.out.println("\n");
                        System.out.println("Patient Details ");
                        System.out.println("Patient Name :  "+appointPatientName);
                        System.out.println("Patient Phone Number :  " + appointmentPhone);
                        System.out.println("Patient current Address :   " + appointmentAddress);
                        System.out.println("Patient  Gender :   " + appointmentGender);
                        System.out.println("Patient Age :   " + appointmentAge);
                        System.out.println("Patient blood group :  "+bloodGroup);
                        System.out.println("\n");
                        System.out.println("Enter Appointment Date :    " + appointmentDate);
                        System.out.println("Enter Appointment :    " + appointmentTime);
                    break;
                }
            }
        if(!isDoctorAppointmentAvailable) {
            System.out.println("Departments or Doctor is not here .");
            }
        }
private void showDepartment(){
    DepartmentServer departmentServer =new DepartmentServer();
    departmentServer.createDepartment();
    departments= departmentServer.departments;

    for (int i = 0; i < departments.size() ; i++) {

        System.out.println("Department Name :  "+departments.get(i).getDepartment());
        System.out.println("Doctor Name :  "+departments.get(i).getDoctorName());
        System.out.println("Doctor Degree :  "+departments.get(i).getDegree());
        System.out.println("Doctor Experience :  "+departments.get(i).getExperience());
        System.out.println("Doctor Specialty :  "+departments.get(i).getSpecialty());
        System.out.println("\n");
    }
}
    private void searchDoctor() {
        DepartmentServer departmentServer = new DepartmentServer();
        departmentServer.createDepartment();
        departments = departmentServer.departments;

        System.out.print("Search Department :");
        String searchItem = input.next();

        boolean isDepartmensAvailable = false;

        for (int i = 0; i < departments.size(); i++) {

            if (searchItem.toLowerCase()
                    .equals(departments.get(i).getDepartment().toLowerCase())) {

                System.out.println("Department Name :  "+departments.get(i).getDepartment());
                System.out.println("Doctor Name :  "+departments.get(i).getDoctorName());
                System.out.println("Doctor Degree :  "+departments.get(i).getDegree());
                System.out.println("Doctor Experience :  "+departments.get(i).getExperience());
                System.out.println("Doctor Specialty :  "+departments.get(i).getSpecialty());
                System.out.println("\n");
                isDepartmensAvailable = true;
                break;
            }
        }
        if (isDepartmensAvailable == false) {
            System.out.println("departments not found");
        }
    }
}