package com.kodlamaio.inventoryservice.business.rules;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MaintenanceBusinessRules {
//    private final MaintenanceRepository repository;
//
//    public void checkIfMaintenanceExists(int id) {
//        if (!repository.existsById(id)) {
//            throw new BusinessException(Messages.Maintenance.NotExists);
//        }
//    }
//
//    public void checkIfCarUnderMaintenance(int carId) {
//        if (repository.existsByCarIdAndIsCompletedIsFalse(carId)) {
//            throw new BusinessException(Messages.Maintenance.CarExists);
//        }
//    }
//
//    public void checkIfCarIsNotUnderMaintenance(int carId) {
//        if (!repository.existsByCarIdAndIsCompletedIsFalse(carId)) {
//            throw new BusinessException(Messages.Maintenance.CarNotExists);
//        }
//    }
//
//    public void checkCarAvailabilityForMaintenance(State state) {
//        if (state.equals(State.RENTED)) {
//            throw new BusinessException(Messages.Maintenance.CarIsRented);
//        }
    }
