package com.killerexpertise.crud.example.service;

import com.killerexpertise.crud.example.model.Dealer;

import java.util.List;

public interface DealerServiceI {

    Dealer createDealer(Dealer dealer);

    Dealer getDealerById(Long id);

    List<Dealer> getAllDealers();

}
