package com.example.demo.Model;
import javax.persistence.*;

@Entity
@Table(name = "city")
public class CityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String cityName;
    @Column(name = "country_id")
    private Integer countryId;
}
