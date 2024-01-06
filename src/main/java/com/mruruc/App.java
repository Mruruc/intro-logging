package com.mruruc;


public class App {
    public static void main(String[] args) {


        DbConTest.getConnection();
        ControllerTest controllerTest =new ControllerTest();
        controllerTest.getUsers(54);
    }
}


