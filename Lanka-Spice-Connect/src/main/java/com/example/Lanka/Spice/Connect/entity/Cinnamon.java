package com.example.Lanka.Spice.Connect.entity;

import com.sun.istack.NotNull;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cinnamon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private Long id;

    @NotNull
    private String title;

    @NonNull
    private String cinnamonType;

    @NonNull
    private String quantity;

    @NonNull
    private double sellPrice;

    @Nullable
    private String description;

    public Farmer getFarmer() {
        return farmer;
    }

    public Set<CinnamonandSupplier> getCinnamonandsupliers() {
        return cinnamonandsupliers;
    }

    public void setCinnamonandsupliers(Set<CinnamonandSupplier> cinnamonandsupliers) {
        this.cinnamonandsupliers = cinnamonandsupliers;
    }

    @Nullable
    private String image;

    @ManyToOne
    @JoinColumn(name = "farmer_id", nullable = false)

    private Farmer farmer;

    @OneToMany(mappedBy = "cinnamon")
    private Set<CinnamonandSupplier> cinnamonandsupliers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCinnamonType() {
        return cinnamonType;
    }

    public void setCinnamonType(String cinnamonType) {
        this.cinnamonType = cinnamonType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }


}
