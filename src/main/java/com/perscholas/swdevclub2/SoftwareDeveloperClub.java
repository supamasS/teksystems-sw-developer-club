package com.perscholas.swdevclub2;

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
                ClubMember clubMember = new ClubMember(splitted);
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

    public void removeMember() {
        System.out.println("REMOVE MEMBER: ");

        String[] memberInfo = getMemberInfo();

        ClubMember matchedMember = findMathcedMember(memberInfo);

        if(matchedMember != null) {
            clubMemberList.remove(matchedMember);
            System.out.println("Removed member successfully.");
        } else {
            System.out.println("Could not remove member.");
        }
    }

    private ClubMember findMathcedMember(String[] memberInfo) {
        for(ClubMember clubMember : clubMemberList) {
            if(clubMember.equals(memberInfo)) {
                return clubMember;
            }
        }
        return null;
    }

    private String[] getMemberInfo() {
        System.out.println("Please enter the member information:");
        String[] memberInfo = new String[4];

        System.out.print("Name: ");
        memberInfo[0] = ClubMemberApp.scanner.nextLine();

        System.out.print("City: ");
        memberInfo[1] = ClubMemberApp.scanner.nextLine();

        System.out.print("State: ");
        memberInfo[2] = ClubMemberApp.scanner.nextLine();

        System.out.print("Favorite Language: ");
        memberInfo[3] = ClubMemberApp.scanner.nextLine();

        return memberInfo;
    }

    public void addMember() {
        System.out.println("ADD MEMBER:");
        String[] memberInfo = getMemberInfo();

        ClubMember clubMember = new ClubMember(memberInfo);
        clubMemberList.add(clubMember);

        System.out.println("Added member successfully.");
    }
}
