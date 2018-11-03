package com.company;

import java.util.Scanner;

public class MenuStack {

    Scanner scanner = new Scanner(System.in);
    MenuStack startMenu = new MenuStack();
    Stack callStack = new Stack(100);

    public void mainMenu() {

        String mainMenu = "1. Max Size\n2. Add element\n3. Delete element\n4. View stack\n*******PUSH 0 TO EXIT*****";
        System.out.println(mainMenu);
        int choise = scanner.nextInt();

        switch (choise) {
            case 1: {
                System.out.println("Enter max size less than " + callStack.getMaxSize() + ":");
                callStack.setMaxSize(scanner.nextInt());
                startMenu.mainMenu();
            }
            case 2: {
                callStack.addElement(scanner.nextInt());
                startMenu.mainMenu();
            }
            case 3:
                callStack.deleteElement();
                startMenu.mainMenu();

            case 4:
                callStack.viewStack();
                startMenu.mainMenu();
        }
    }
}