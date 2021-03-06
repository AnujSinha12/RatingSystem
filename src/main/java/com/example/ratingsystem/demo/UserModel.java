package com.example.ratingsystem.demo;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModel
{
    @Id
    private int userId;
    private String userName;
    private String userPassword;
    private double countUserRating;
    private int countUserRides;
    private double userRating;


    public long getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public double getCountUserRating() {
        return countUserRating;
    }

    public void setCountUserRating(double countUserRating) {
        this.countUserRating = countUserRating;
    }

    public int getCountUserRides() {
        return countUserRides;
    }

    public void setCountUserRides(int countUserRides) {
        this.countUserRides = countUserRides;
    }

    public double getUserRating() {
        return userRating;
    }

    public void setUserRating(double userRating) {
        this.userRating = userRating;
    }


    @Override
    public String toString() {
        return "UserModel{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", countUserRating=" + countUserRating +
                ", countUserRides=" + countUserRides +
                ", userRating=" + userRating +
                '}';
    }
}
