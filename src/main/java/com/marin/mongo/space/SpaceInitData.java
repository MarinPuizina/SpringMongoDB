package com.marin.mongo.space;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@RequiredArgsConstructor
public class SpaceInitData {

    private final SpaceShipRepository spaceShipRepository;

    @PostConstruct
    public void createTestData(){

        spaceShipRepository.deleteAll();
        spaceShipRepository.saveAll(
                List.of(
                        new SpaceShip(null, "Small Ship A", 3),
                        new SpaceShip(null, "Small Ship B", 2),
                        new SpaceShip(null, "Ship A", 2),
                        new SpaceShip(null, "Ship B", 33),
                        new SpaceShip(null, "Ship C", 12),
                        new SpaceShip(null, "Ship D", 20),
                        new SpaceShip(null, "Ship E", 22),
                        new SpaceShip(null, "Big Ship A", 40)
                ));

    }

}
