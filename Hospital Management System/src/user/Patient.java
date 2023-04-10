package user;

public class Patient extends User {


    public Patient(String name, String emailId, String phoneNumber, String address, String NIDCard,
                   String birthday, String bloodGroup, String password,String type) {
        super(name, emailId, phoneNumber, address, NIDCard, birthday, bloodGroup, password,type);
    }
}
