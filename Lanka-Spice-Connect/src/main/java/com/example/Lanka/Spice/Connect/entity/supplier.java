package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "suplier")
public class supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long suplierId;
    private String suplierArea;
    private String cinnamonType;
    private double buyPrice;
    private String quantity;
    private double sellPrice;

    @OneToMany(mappedBy = "suplier")
    private Set<cinnamonandsupplier> cinnamonandsupliers;
}
