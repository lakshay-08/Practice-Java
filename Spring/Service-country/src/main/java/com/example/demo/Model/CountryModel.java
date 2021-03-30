package com.example.demo.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "country")
public class CountryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String countryName;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<CityModel> cities;

    public CountryModel() {}

    public CountryModel(Integer id, String countryName, List<CityModel> cities) {
        this.id = id;
        this.countryName = countryName;
        this.cities = cities;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<CityModel> getCities() {
        return cities;
    }

    public void setCities(List<CityModel> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "CountryModel{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                ", cities=" + cities +
                '}';
    }
}

