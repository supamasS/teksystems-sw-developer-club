package com.perscholas.swdevclub2;

import java.util.Scanner;

public class ClubMemberApp {
    public static Scanner scanner;

    public static void main(String[] args) {
        SoftwareDeveloperClub softwareDeveloperClub = new SoftwareDeveloperClub(
                "/Users/supamas/Documents/Coding/PerScholas/Java/coding/Assignments/10-SWDeveloperClub/members.txt");

        scanner = new Scanner(System.in);

        int menuInput;

        do {
            displayMenu();
            menuInput = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch(menuInput) {
                case 1: softwareDeveloperClub.printClubMembersList(); break;
                case 2: softwareDeveloperClub.removeMember(); break;
                case 3: softwareDeveloperClub.addMember(); break;
                default: break;
            }
        } while (menuInput != 4);

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Select from the following menu:\n" +
                "1: Display Members\n" +
                "2: Remove Member\n" +
                "3: Add Member\n" +
                "4: Quit");
    }
}
