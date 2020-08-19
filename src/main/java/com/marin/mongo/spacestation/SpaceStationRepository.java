package com.marin.mongo.spacestation;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpaceStationRepository extends MongoRepository<SpaceStation, String> {
}
