package com.marin.mongo.space;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface SpaceShipRepository extends MongoRepository<SpaceShip, String> {

    @Query("{'type': {$regex: '^B.*'} }")
    public List<SpaceShip> getShipsStartWithB();


    @Query("{'type': {$regex: '^S.*'} }")
    public List<SpaceShip> getShipsStartWithS();


    @Query(value = "{'type': {$regex: '^S.*'} }", delete = true)
    public List<SpaceShip> deleteShipsStartWithB();

}
