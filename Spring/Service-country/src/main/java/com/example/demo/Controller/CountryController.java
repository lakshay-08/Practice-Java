package com.example.demo.Controller;

import com.example.demo.Model.CountryModel;
import com.example.demo.Repo.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class CountryController {
    private CountryRepository countryRepository;
    @Autowired
    public CountryController(CountryRepository countryRepository) {
        super();
        this.countryRepository = countryRepository;
    }

    @GetMapping("/countries")
    public List<CountryModel> getAll()
    {
        return countryRepository.findAll();
    }
    @GetMapping("/country")
    public ResponseEntity<CountryModel> createCountry(@RequestParam CountryModel countryModel)
    {
        return ResponseEntity.ok(countryRepository.save(countryModel));
    }

}