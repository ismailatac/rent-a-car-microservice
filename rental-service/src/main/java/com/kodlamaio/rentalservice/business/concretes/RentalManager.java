package com.kodlamaio.rentalservice.business.concretes;


import com.kodlamaio.commonpackage.utils.mappers.ModelMapperService;
import com.kodlamaio.rentalservice.business.abstracts.RentalService;
import com.kodlamaio.rentalservice.business.dto.requests.CreateRentalRequest;
import com.kodlamaio.rentalservice.business.dto.requests.UpdateRentalRequest;
import com.kodlamaio.rentalservice.business.dto.responses.CreateRentalResponse;
import com.kodlamaio.rentalservice.business.dto.responses.GetAllRentalsResponse;
import com.kodlamaio.rentalservice.business.dto.responses.GetRentalResponse;
import com.kodlamaio.rentalservice.business.dto.responses.UpdateRentalResponse;
import com.kodlamaio.rentalservice.entities.Rental;
import com.kodlamaio.rentalservice.repository.RentalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class RentalManager implements RentalService {

    private final ModelMapperService mapper;
    private final RentalRepository repository;

    @Override
    public List<GetAllRentalsResponse> getAll() {
        List<Rental> rentals = repository.findAll();
        List<GetAllRentalsResponse> response = rentals.stream()
                .map(rental -> mapper.forResponse().map(rental, GetAllRentalsResponse.class)).toList();
        return response;
    }

    @Override
    public GetRentalResponse getById(UUID id) {
        //rules.checkIfRentalExists(id);
        Rental rental = repository.findById(id).orElseThrow();
        return mapper.forResponse().map(rental, GetRentalResponse.class);    }

    @Override
    public CreateRentalResponse add(CreateRentalRequest request) {
        //rules.checkIfRentalExistsByName(request.getName());
        Rental rentalSave = mapper.forRequest().map(request, Rental.class);
        rentalSave.setId(null);
        rentalSave.setTotalPrice(getTotalPrice(rentalSave));
        rentalSave.setRentedAt(LocalDate.now());
        repository.save(rentalSave);
        return mapper.forResponse().map(rentalSave, CreateRentalResponse.class);
    }

    @Override
    public UpdateRentalResponse update(UUID id, UpdateRentalRequest request) {
        Rental updateRental = mapper.forRequest().map(request, Rental.class);
        updateRental.setId(id);
        repository.save(updateRental);
        return mapper.forResponse().map(updateRental, UpdateRentalResponse.class);
    }

    @Override
    public void delete(UUID id) {
        //rules.checkIfRentalExists(id);
        repository.deleteById(id);
    }
    private double getTotalPrice(Rental rental) {
        return rental.getDailyPrice() * rental.getRentedForDays();
    }

}
