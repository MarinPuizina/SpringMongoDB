package com.marin.mongo.spacestation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpaceStationRepositoryTest {

    @Autowired
    SpaceStationRepository spaceStationRepository;

    @Test
    public void testSpaceStation() {
        spaceStationRepository.findAll().forEach(System.out::println);
    }

}