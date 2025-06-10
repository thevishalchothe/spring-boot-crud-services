package com.killerexpertise.crud.example.repository;

import com.killerexpertise.crud.example.model.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealerRepository extends JpaRepository<Dealer,Long> {

}
