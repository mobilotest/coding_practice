package javaTraining.collections.uidemo;

import javafx.beans.property.SimpleStringProperty;

public class Accounts {
    public SimpleStringProperty userName = new SimpleStringProperty("");
    public SimpleStringProperty passWord = new SimpleStringProperty("");
    public SimpleStringProperty type = new SimpleStringProperty("");

    public Accounts(String userName, String passWord, String type){
        this.userName.set(userName);
        this.passWord.set(passWord);
        this.type.set(type);
    }
    public String getUserName(){
        return userName.get();
    }
    public String getPassword(){
        return passWord.get();
    }
    public String getType(){
        return type.get();
    }
}
