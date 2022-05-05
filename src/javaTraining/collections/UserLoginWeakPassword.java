package javaTraining.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class UserLoginWeakPassword {
    public static void main(String[] args) {
        ArrayList<Login> userlogin = new ArrayList<>();
        userlogin.add(new Login("buka", "kazuka"));
        userlogin.add(new Login("abra", "kadabra"));
        userlogin.add(new Login("malchik", "spalchik"));
        userlogin.add(new Login("shashlyk", "mashlyk"));
        userlogin.add(new Login("weak", "m12"));
        userlogin.add(new Login("also", "tru"));

        Predicate<Login> predRules = (p)-> p.IsWeak() == true;
        //Lambda
        System.out.println("People with a weak password: ");
        userlogin.forEach((loginInfo) -> {
            if(predRules.test(loginInfo)) {
                System.out.print("User Name: " + loginInfo.UserName);
                System.out.println(" / Password: " + loginInfo.Password);
            }
        });
    }
}
