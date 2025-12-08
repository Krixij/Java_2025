package timus.task_2002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[][] data = new String[n][2];
        String[] arrayLogin = new String[n];
        boolean failRegister = false;
        boolean loginUser = false;
        boolean failPass = false;
        boolean failLogin = false;
        boolean failLogout = false;
        boolean logoutUser = false;
        int a = 0;
        for (int i = 0; i < n; i++){
            String stroke = in.nextLine();
            String[] arrayStroke = stroke.split(" ");
            if (arrayStroke[0].equals("register")){
                for (int z =0; z < n; z++){
                    if (arrayStroke[1].equals(data[z][0])) {
                        failRegister = true;
                        break;
                    }
                }
                if (failRegister) {
                    System.out.println("fail: user already exists");
                } else {
                    for (int j = 0; j < 2; j++) {
                        if (j == 0) {
                            data[i][0] = arrayStroke[1];
                        } else {
                            data[i][1] = arrayStroke[2];
                        }
                    }
                    System.out.println("success: new user added");
                }
                failRegister = false;
            } else if (arrayStroke[0].equals("login")) {
                outFor:
                for (int z =0; z < n; z++){
                    if (arrayStroke[1].equals(data[z][0])) {
                        if (arrayStroke[2].equals(data[z][1])){
                            for (int q = 0; q < n; q++){
                                if (arrayStroke[1].equals(arrayLogin[q])) {
                                    failLogin = true;
                                    break outFor;
                                }
                            }
                            arrayLogin[i] = arrayStroke[1];
                            loginUser = true;
                            break;
                        } else {
                            failPass = true;
                        }
                    }
                }
                if (loginUser) {
                    System.out.println("success: user logged in");
                } else if (failLogin){
                    System.out.println("fail: already logged in");
                } else if (failPass){
                    System.out.println("fail: incorrect password");
                } else {
                    System.out.println("fail: no such user");
                }
                loginUser = false;
                failPass = false;
                failLogin = false;
            } else if (arrayStroke[0].equals("logout")) {
                outFor:
                for (int z =0; z < n; z++){
                    if (arrayStroke[1].equals(data[z][0])) {
                        for (int q = 0; q < n; q++){
                            if (arrayStroke[1].equals(arrayLogin[q])) {
                                logoutUser = true;
                                arrayLogin[q] = "null";
                                break outFor;
                            }
                        }
                        failLogout = true;
                        break;
                    }
                }
                if (logoutUser) {
                    System.out.println("success: user logged out");
                } else if (failLogout){
                    System.out.println("fail: already logged out");
                } else {
                    System.out.println("fail: no such user");
                }
                logoutUser = false;
                failLogout = false;
            }

        }
    }
}
