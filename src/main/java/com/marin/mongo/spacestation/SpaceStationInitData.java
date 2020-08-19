package com.marin.mongo.spacestation;

import com.marin.mongo.space.SpaceShip;
import com.marin.mongo.space.SpaceShipRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@RequiredArgsConstructor
public class SpaceStationInitData {

    private final SpaceShipRepository spaceShipRepository;
    private final SpaceStationRepository spaceStationRepository;

    @PostConstruct
    public void createStations() {

        List<SpaceShip> spaceStationsWithB = spaceShipRepository.getShipsStartWithB();
        List<SpaceShip> spaceStationsWithS = spaceShipRepository.getShipsStartWithS();

        spaceStationRepository.saveAll(
          List.of(
                  new SpaceStation(null, "Ganymide", 40000, spaceStationsWithB),
                  new SpaceStation(null, "Tycho Station", 22000, spaceStationsWithS)
          )
        );

    }

}
