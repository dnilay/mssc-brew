package com.example.msscbrew.services;
import com.example.msscbrew.web.dto.BeerDto;
import org.springframework.stereotype.Service;
import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Demo Beer1")
                .beerStyle("Demo Style")
                .build();
    }
}
