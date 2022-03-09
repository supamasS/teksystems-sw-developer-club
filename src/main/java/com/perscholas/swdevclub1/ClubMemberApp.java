package com.perscholas.swdevclub1;

public class ClubMemberApp {
    public static void main(String[] args) {
        SoftwareDeveloperClub softwareDeveloperClub = new SoftwareDeveloperClub(
                "/Users/supamas/Documents/Coding/PerScholas/Java/coding/Assignments/10-SWDeveloperClub/members.txt");

        softwareDeveloperClub.printClubMembersList();
    }
}
