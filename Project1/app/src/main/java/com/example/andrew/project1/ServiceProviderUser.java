package com.example.andrew.project1;

import java.util.ArrayList;

public class ServiceProviderUser extends User {
    private String email;
    private String password;
    private String companyName;
    private String phoneNumber;
    private String address;
    private String description;
    private String availability;
    private boolean licensed;
    private ArrayList<String> services;

    public ServiceProviderUser (String email, String password, String companyName, String address, String phoneNumber, boolean licensed){
        this.email = email;
        this.password = password;
        this.companyName=companyName;
        this.phoneNumber=phoneNumber;
        this.address = address;
        description = "";
        this.licensed = licensed;
        services = new ArrayList<String>();
    }

    public ServiceProviderUser (String email, String password, String companyName, String description, String address, String phoneNumber, boolean licensed){
        this.email = email;
        this.password = password;
        this.description = description;
        this.companyName=companyName;
        this.phoneNumber=phoneNumber;
        this.address = address;
        this.licensed = licensed;
        services = new ArrayList<String>();
    }

    public String getServices() {
        String big = "";
        if (!services.isEmpty()){
            for (int a = 0; a<services.size(); a++){
                big = big + services.get(a)+ ",";
            }
            return big;
        }
        return "no services";
    }

    public void addServices(String service){
        services.add(service);
    }

    public int numberOfService(){
        return services.size();
    }

    public String serviceAt(int a){
        return services.get(a);
    }

    public String getDescription() {
        return description;
    }

    public boolean isLicensed(){
        return licensed;
    }


    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return companyName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}