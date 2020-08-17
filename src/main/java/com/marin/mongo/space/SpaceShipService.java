package com.marin.mongo.space;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceShipService {

    private final MongoTemplate mongoTemplate;

    public SpaceShipService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public List<SpaceShip> allSpacesShips() {

        Query query = new Query()
                .addCriteria(Criteria.where("type").is("Ship A"))
                .with(Sort.by(Sort.Order.desc("engines")))
                .limit(2);

        return mongoTemplate.find(query, SpaceShip.class);
    }

}
