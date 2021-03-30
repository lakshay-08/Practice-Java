package com.example.demo.Repo;
import com.example.demo.Model.CityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<CityModel, Integer> {
    @Query
    public List<CityModel> getAllByCountryId(int countryId);
}