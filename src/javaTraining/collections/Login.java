package javaTraining.collections;

public class Login {
    String UserName;
    String Password;

    public Login(String Username, String Password){
        this.UserName = Username;
        this.Password = Password;
    }

    Boolean IsWeak(){
        if(Password.length()<=3) {
            return true;
        }else{
            return false;
        }
    }
}
