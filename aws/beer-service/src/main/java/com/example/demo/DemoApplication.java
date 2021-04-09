package com.example.demo;

import com.example.demo.dao.BeerDao;
import com.example.demo.model.BeerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {
    private BeerDao beerDao;
    @Autowired
    public DemoApplication(BeerDao beerDao) {
        super();
        this.beerDao = beerDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        beerDao.save(new BeerModel(1, "Budweiser", 101));
        beerDao.save(new BeerModel(2, "Heineken", 102));
        beerDao.save(new BeerModel(3, "Corona", 103));
        beerDao.save(new BeerModel(4, "Kati Patang", 104));

    }
}
