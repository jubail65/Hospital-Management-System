package user;

import java.util.ArrayList;

class UserSever{
    ArrayList<User> users=new ArrayList<User>();

    public ArrayList<User> allUsers(){
        users.add(new Patient("Jubail","juabil@gmail.com","01878556482","Dhaka",
                "123456789","10-07-2001","O-","12345","patient"));

        users.add(new Admin("Sagor","sagor@gmail.com","01990060851","Ullapara",
                "987654321","05-08-2001","A+","12345","Admin"));

        users.add(new Visitor("Aysha","aysha@gmail.com","01994452971","Pabona",
                "98756428","05-05-2002","B+","12345","Visitor"));
        return users;
    }
}