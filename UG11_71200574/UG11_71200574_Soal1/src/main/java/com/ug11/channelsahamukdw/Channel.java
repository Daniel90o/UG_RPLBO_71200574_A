package com.ug11.channelsahamukdw;

public class Channel {
    private String email;
    private String namaDepan;
    private String namaBelakang;
    private int totalTag;


    public Channel(){

    }

    public void login(String email) throws EmailException {
        this.email = email;
        if(email.matches("([.\\w+]+@students.ukdw.ac.id)")){
            System.out.println("Login Anda berhasil");
        }else{
            System.out.println("login gagal! Email Anda tidak terdaftar dalam UKDW ");
//            throw new EmailException(1);
        }
    }

    public void bagikanIde(String textarea){
        if(textarea.matches("(#)\\w")){
            this.totalTag = totalTag + 1;
            System.out.println("Total tag:" + totalTag);

            String[] text = textarea.split("(#)\\w");
            for(int i = 0 ; i < text.length; i++){
                System.out.println(i);
            }
        }
        else{
            this.totalTag = totalTag + 0;
            System.out.println("Total tag: -" );

        }
    }

    public String getEmail() {
        return email;
    }

    public void printInfo(){

        String[] splitEmails = email.split("([\\.@])");
//        for(int i = 0; i< email.length() ; i++){
//            System.out.println(splitEmails[i]);
//        }
        System.out.println("Nama depan: " + splitEmails[0].toUpperCase());
        System.out.println("Nama belakang: " + splitEmails[1].toUpperCase());
        System.out.println("Email: "+ email);
        System.out.println("Total tag: "+ totalTag);
    }
}
