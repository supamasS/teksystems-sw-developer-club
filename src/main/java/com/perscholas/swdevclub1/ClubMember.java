package com.perscholas.swdevclub1;

public class ClubMember {
    private String name;
    private String city;
    private String state;
    private String favoriteLanguage;

    public ClubMember(String name, String city, String state, String favoriteLanguage) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public void printClubMember() {
        System.out.println("Member Name: " + this.name);
        System.out.println("Location: " + this.city + ", " + this.state);
        System.out.println("Favorite Language: " + this.favoriteLanguage);
    }
}
