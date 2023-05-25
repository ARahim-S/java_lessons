package day15loops;

import java.util.Scanner;

public class DoWhileLoopSelfWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userCorrectName = "user12345_?";
        String userCorrectPassword = "hdz-157?.";


        int counter = 0;
        do {

            if (counter == 4) {
                System.out.println("Your account is blocked!");
                break;
            }

            System.out.println("Please enter username...");
            String userName = input.next();
            System.out.println("Please enter password...");
            String userPassword = input.next();


            if (userCorrectName.equals(userName) && userCorrectPassword.equals(userPassword)) {
                System.out.println("Logged in successfully");
                break;
            } else {
                System.out.println("Incorrect username or password. try again.");
                System.out.println("Please be careful. If you submit wrong password or name 4 times," +
                        "your account will be blocked!");
                counter++;

            }


        } while (true);

    }
}
