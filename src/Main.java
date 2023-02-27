import data.models.User;

import javax.swing.*;

import static sun.security.jgss.GSSUtil.login;

public class Main {
    public static void main(String[] args) {
        startApp();
    }

    private static void startApp() {
        String message = """
                Welcome come ID-Mail
                1-> SignUp
                2-> Login;
                
                """;

        String input = input(message);
        switch (input.charAt(0)){
            case '1'-> register();
            case '2'->login();
            default -> {
                display("Invalid input, try again");
                startApp();
            }
        }
    }

    private static void login() {

    }

    private static void register() {
        User user = new User();
        user.setName(input("Enter First Name"));
        user.setLastName(input("Enter last Name"));
        user.setAge(Integer.parseInt(input("Enter your age")));
        startApp();

    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    private static void display(String message){
        JOptionPane.showConfirmDialog(null,message);
    }
}