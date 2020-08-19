package com.marin.mongo.spacestation;

import com.marin.mongo.space.SpaceShip;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpaceStation {

    @Id
    private String marinsid;
    private String name;
    private Integer crew;
    @DBRef
    private List<SpaceShip> dockedShips;

}