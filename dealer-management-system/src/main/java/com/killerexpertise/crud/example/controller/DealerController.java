package com.killerexpertise.crud.example.controller;

import com.killerexpertise.crud.example.model.Dealer;
import com.killerexpertise.crud.example.service.DealerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dealers")
public class DealerController {

    @Autowired
    private DealerServiceI dealerServiceI;

    @PostMapping
    public ResponseEntity<Dealer> createDealer(@RequestBody Dealer dealer) {
        return ResponseEntity.ok(dealerServiceI.createDealer(dealer));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dealer> getDealerById(@PathVariable Long id) {
        return ResponseEntity.ok(dealerServiceI.getDealerById(id));
    }

    @GetMapping("getAll")
    public ResponseEntity<List<Dealer>> getAllDealers() {
        return ResponseEntity.ok(dealerServiceI.getAllDealers());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dealer> updateDealer(@PathVariable Long id, @RequestBody Dealer dealer) {
        return ResponseEntity.ok(dealerServiceI.updateDealer(id, dealer));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDealer(@PathVariable Long id) {
        dealerServiceI.deleteDealer(id);
        return ResponseEntity.ok("Dealer deleted successfully");
    }

}
