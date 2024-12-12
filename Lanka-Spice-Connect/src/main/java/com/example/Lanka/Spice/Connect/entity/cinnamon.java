package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class cinnamon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String cinnamonType;
    private String quantity;

    private double sellPrice;

    private String description;

    private String image;

    @ManyToOne
    @JoinColumn(name = "farmer_id", nullable = false)
    private farmer farmer;

    @OneToMany(mappedBy = "cinnamon")
    private Set<cinnamonandsupplier> cinnamonandsupliers;

}
