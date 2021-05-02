package com.example.demo;

import java.util.ArrayList;

public class Kinobillett {

    public static ArrayList<Kinobillett> Kinobilletter = new ArrayList<Kinobillett>();

    private String inputfilm;
    private String inputantall;
    private String inputfornavn;
    private String inputetternavn;
    private String inputtelefonnummer;
    private String inputemail;


    public Kinobillett(String inputfilm, String inputantall, String inputfornavn, String inputetternavn, String inputtelefonnummer, String inputemail) {
        this.inputfilm = inputfilm;
        this.inputantall = inputantall;
        this.inputfornavn = inputfornavn;
        this.inputetternavn = inputetternavn;
        this.inputtelefonnummer = inputtelefonnummer;
        this.inputemail = inputemail;
    }

    public Kinobillett() {
    }


    public String getInputfilm() {
        return inputfilm;
    }

    public void setInputfilm(String inputfilm) {
        this.inputfilm = inputfilm;
    }

    public String getInputantall() {
        return inputantall;
    }

    public void setInputantall(String inputantall) {
        this.inputantall = inputantall;
    }

    public String getInputfornavn() {
        return inputfornavn;
    }

    public void setInputfornavn(String inputfornavn) {
        this.inputfornavn = inputfornavn;
    }

    public String getInputetternavn() {
        return inputetternavn;
    }

    public void setInputetternavn(String inputetternavn) {
        this.inputetternavn = inputetternavn;
    }

    public String getInputtelefonnummer() {
        return inputtelefonnummer;
    }

    public void setInputtelefonnummer(String inputtelefonnummer) {
        this.inputtelefonnummer = inputtelefonnummer;
    }

    public String getInputemail() {
        return inputemail;
    }

    public void setInputemail(String inputemail) {
        this.inputemail = inputemail;
    }

}


