package com.perscholas.swdevclub1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoftwareDeveloperClub {
    List<ClubMember> clubMemberList;

    public SoftwareDeveloperClub(String fileName) {
        File file = new File(fileName);
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);

            this.clubMemberList = new ArrayList<>();
            scanner.nextLine();

            while(scanner.hasNext()) {
                String s = scanner.nextLine();
                String[] splitted = s.split("\\*\\*");
                ClubMember clubMember = new ClubMember(splitted[0], splitted[1], splitted[2], splitted[3]);
                this.clubMemberList.add(clubMember);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    public void printClubMembersList() {
        clubMemberList.forEach(c -> c.printClubMember());
    }
}
