package javaTraining.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class UserLoginInfo {
    public static void main(String[] args) {
        ArrayList<Login> userlogin = new ArrayList<>();
        userlogin.add(new Login("buka", "kazuka"));
        userlogin.add(new Login("abra", "kadabra"));
        userlogin.add(new Login("malchik", "spalchik"));
        userlogin.add(new Login("shashlyk", "mashlyk"));

        //for each
        for(Login singleLogin : userlogin){
            System.out.print("User Name: "+singleLogin.UserName);
            System.out.println(" / Password: "+singleLogin.Password);
        }

        System.out.println();
        //iterator
        Iterator<Login> i = userlogin.iterator();
        while (i.hasNext()){
            Login login = i.next();
            System.out.print("User Name: "+login.UserName);
            System.out.println(" / Password: "+login.Password);
        }

        System.out.println();
        //Lambda
        userlogin.forEach((loginInfo) -> {
            System.out.print("User Name: " + loginInfo.UserName);
            System.out.println(" / Password: " + loginInfo.Password);
        });
    }
}
