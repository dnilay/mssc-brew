package com.example.msscbrew.services;

import com.example.msscbrew.web.dto.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
