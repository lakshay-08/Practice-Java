package com.example.demo.Repo;
import com.example.demo.Model.CountryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<CountryModel, Integer> {
    @Query
    public CountryModel findCountryById(int countryId);
}
