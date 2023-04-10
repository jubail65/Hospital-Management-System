package user;

public class Admin extends User {
    public Admin(String name, String emailId, String phoneNumber, String address, String NIDCard,
                   String birthday, String bloodGroup, String password,String type) {
        super(name, emailId, phoneNumber, address, NIDCard, birthday, bloodGroup, password,type);
    }
}
