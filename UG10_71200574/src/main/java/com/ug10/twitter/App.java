package com.ug10.twitter;

import java.util.Scanner;
import java.lang.ref.SoftReference;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws UsernameException, TweetException, BioException, LoginException {

        Scanner username = new Scanner(System.in);
        System.out.println("Username: ");

        String uname = username.nextLine();

        Scanner password = new Scanner(System.in);
        System.out.println("Password: ");

        String pass = password.nextLine();
        User user = new User(uname,pass);
        if(uname =="" ) {
            throw new UsernameException(1);

        }if(uname.length()<6){
            throw new UsernameException(2);
        }if (uname == "" && pass == "") {
            throw new LoginException(1);
        }if(!uname.contains("u") && !pass.contains("p")){
            throw new LoginException(2);
        }
        System.out.println("Welcome to twitter, "+ uname);
        System.out.println("Please change your username");
        Scanner newUname = new Scanner(System.in);
        System.out.println("New username:");
        String newname = newUname.nextLine();

        if(newname == "") {
            throw new UsernameException(1);
        }
        else if( newname.length()<6){
            throw new UsernameException(2);
        }else{
            System.out.println("Successfully change your username,"+newname+"!");
        }

        Scanner tweet = new Scanner(System.in);
        System.out.println("Type your tweet:");
        String tweets = tweet.nextLine();

        if(tweets == ""){
            throw new TweetException(1);
        } else if (tweets.length()<8) {
            throw new TweetException(2);
        } else if (tweets.length()>140) {
            throw new TweetException(3);
        }

        Scanner bio = new Scanner(System.in);
        System.out.println("Type your bio:");
        String newBio = bio.nextLine();

        if(newBio == ""){
            throw new BioException(1);
        } else if (newBio.length()<5) {
            throw new BioException(2);
        } else if (newBio.length()>40) {
            throw new BioException(3);
        } else{
            System.out.println("Successfully change your bio: "+ newBio);
        }

    }
}
