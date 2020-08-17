package com.marin.mongo.space;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpaceShipRepositoryTest {

    @Autowired
    SpaceShipRepository spaceShipRepository;

    @Test
    public void createRows() {

        // Preparing the database
        spaceShipRepository.deleteAll();

        spaceShipRepository.save(new SpaceShip(null, "Ship A", 1));
        spaceShipRepository.save(new SpaceShip(null, "Ship A", 2));
        spaceShipRepository.save(new SpaceShip(null, "Ship A", 3));
        spaceShipRepository.save(new SpaceShip(null, "Ship B", 4));
        spaceShipRepository.save(new SpaceShip(null, "Ship C", 5));

        spaceShipRepository.findAll().forEach(System.out::println);

    }

}