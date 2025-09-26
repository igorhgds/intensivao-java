package classes_objetos_metodos.Oexception.exception.test;

import classes_objetos_metodos.Oexception.exception.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws LoginInvalidException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "1234";

        System.out.println("Username:");
        String typedUsername = scanner.nextLine();
        System.out.println("Password:");
        String typedPassword = scanner.nextLine();

        if (!usernameDB.equals(typedUsername) || !typedPassword.equals(passwordDB)) {
            throw new LoginInvalidException("Username or password is incorrect");
        }

        System.out.println("Login Successful");
    }
}
