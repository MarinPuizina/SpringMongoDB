package com.marin.mongo.space;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpaceShipRepositoryQueryTest {

    @Autowired
    SpaceShipRepository spaceShipRepository;

    @Test
    public void testGetShipsStartWithB() {

        List<SpaceShip> spaceships = spaceShipRepository.getShipsStartWithB();
        spaceships.forEach(System.out::println);

    }

    @Test
    public void testGetShipsStartWithS() {

        List<SpaceShip> spaceships = spaceShipRepository.getShipsStartWithS();
        spaceships.forEach(System.out::println);

    }

}