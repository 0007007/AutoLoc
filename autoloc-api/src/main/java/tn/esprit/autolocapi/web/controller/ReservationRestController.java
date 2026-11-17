package tn.esprit.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Reservation;
import tn.esprit.autolocapi.service.ReservationServiceImp;

import java.util.List;

@RequestMapping("reservation")
@RequiredArgsConstructor
@RestController

public class ReservationRestController {
    private final ReservationServiceImp reservationServiceImp;

    @PostMapping
    public Reservation addReservation(@RequestBody Reservation reservation){
        return reservationServiceImp.ajouterReservation(reservation);
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable long id){
        return reservationServiceImp.getReservationById(id);
    }

    @GetMapping
    public List<Reservation> getAllReservation(){
        return reservationServiceImp.getAllReservation();
    }

    @PutMapping
    public Reservation updateReservation(@RequestBody Reservation reservation){
        return reservationServiceImp.modifierReservation(reservation);
    }

    @DeleteMapping("/{id}")
    public void deleteReservationById(@PathVariable long id){
        reservationServiceImp.supprimerReservationById(id);
    }

}
