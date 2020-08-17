package com.marin.mongo.space;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpaceShipRepositoryTest {

    @Autowired
    SpaceShipRepository spaceShipRepository;

    @Autowired
    SpaceShipService spaceShipService;

    @Test
    public void createRows() {

        // Preparing the database
        spaceShipRepository.deleteAll();

        spaceShipRepository.save(new SpaceShip(null, "Ship A", 1));
        spaceShipRepository.save(new SpaceShip(null, "Ship A", 2));
        spaceShipRepository.save(new SpaceShip(null, "Ship A", 3));
        spaceShipRepository.save(new SpaceShip(null, "Ship A", 4));
        spaceShipRepository.save(new SpaceShip(null, "Ship B", 5));
        spaceShipRepository.save(new SpaceShip(null, "Ship C", 6));
        spaceShipRepository.save(new SpaceShip(null, "Ship D", 7));

        //spaceShipRepository.findAll().forEach(System.out::println);

        spaceShipService.allSpacesShips().forEach(System.out::println);

    }

}