package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BeerModel {
    @Id
    private Integer beerId;
    private String beerName;
    private Integer  cost;
    public BeerModel() {
        super();
    }
    public BeerModel(Integer beerId, String beerName, Integer cost) {
        super();
        this.beerId = beerId;
        this.beerName = beerName;
        this.cost = cost;
    }

    public Integer getBeerId() {
        return beerId;
    }

    public void setBeerId(Integer beerId) {
        this.beerId = beerId;
    }

    public String getBeerName() {
        return beerName;
    }
    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }
    public Integer getCost() {
        return cost;
    }
    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
