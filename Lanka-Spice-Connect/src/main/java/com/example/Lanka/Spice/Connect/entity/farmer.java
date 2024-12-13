package com.example.Lanka.Spice.Connect.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
public class farmer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @OneToMany(mappedBy = "farmer")
    private Set<Cinnamon> cinnamons;
}
