package com.example.Lanka.Spice.Connect.entity;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Farmer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private long id;

    @NotNull
    private String farmerAddress;

    @NotNull
    private String phoneNumber;
    @OneToMany(mappedBy = "farmer")
    private Set<Cinnamon> cinnamons;

    public Set<Cinnamon> getCinnamons() {
        return cinnamons;
    }

    public void setCinnamons(Set<Cinnamon> cinnamons) {
        this.cinnamons = cinnamons;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFarmerAddress() {
        return farmerAddress;
    }

    public void setFarmerAddress(String farmerAddress) {
        this.farmerAddress = farmerAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
