package com.killerexpertise.crud.example.service.impl;

import com.killerexpertise.crud.example.model.Dealer;
import com.killerexpertise.crud.example.repository.DealerRepository;
import com.killerexpertise.crud.example.service.DealerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealerServiceImpl implements DealerServiceI {

    @Autowired
    private DealerRepository dealerRepository;

    @Override
    public Dealer createDealer(Dealer dealer) {
        return dealerRepository.save(dealer);
    }

    @Override
    public Dealer getDealerById(Long id) {
        return dealerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Dealer not found with id: " + id));
    }

    @Override
    public List<Dealer> getAllDealers() {
        return dealerRepository.findAll();
    }

}
