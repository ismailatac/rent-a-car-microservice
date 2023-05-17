//package com.kodlamaio.rentalservice.business.rules;
//
//
//import com.kodlamaio.commonpackage.utils.exceptions.BusinessException;
//import com.kodlamaio.inventoryservice.entities.enums.State;
//import com.kodlamaio.rentalservice.repository.RentalRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@AllArgsConstructor
//public class RentalBusinessRules {
//    private final RentalRepository repository;
//
//    public void checkIfRentalExists(int id) {
//        if (!repository.existsById(id)) {
//            throw new BusinessException(Messages.Rental.NotExists);
//        }
//    }
//
//    public void checkIfCarAvailable(State state) {
//        if (!state.equals(State.Available)) {
//            throw new BusinessException(Messages.Car.NotAvailable);
//        }
//    }
//}