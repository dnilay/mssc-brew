package com.example.msscbrew.web.controller;

import com.example.msscbrew.services.BeerService;
import com.example.msscbrew.web.dto.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class BrewController {
    private BeerService beerService;

    public BrewController(BeerService beerService) {
        this.beerService = beerService;
    }
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId")UUID beerId)
    {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }
}
