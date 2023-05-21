package com.kodlamaio.inventoryservice.business.concretes;

import com.kodlamaio.commonpackage.events.inventory.BrandDeletedEvent;
import com.kodlamaio.commonpackage.utils.mappers.ModelMapperService;
import com.kodlamaio.inventoryservice.business.abstracts.BrandService;
import com.kodlamaio.inventoryservice.business.dto.requests.create.CreateBrandRequest;
import com.kodlamaio.inventoryservice.business.dto.requests.update.UpdateBrandRequest;
import com.kodlamaio.inventoryservice.business.dto.responses.create.CreateBrandResponse;
import com.kodlamaio.inventoryservice.business.dto.responses.get.GetAllBrandsResponse;
import com.kodlamaio.inventoryservice.business.dto.responses.get.GetBrandResponse;
import com.kodlamaio.inventoryservice.business.dto.responses.update.UpdateBrandResponse;
import com.kodlamaio.inventoryservice.entities.Brand;
import com.kodlamaio.inventoryservice.repository.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {

    private final ModelMapperService mapper;
    private final BrandRepository repository;
    private final InventoryProducer inventoryProducer;

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = repository.findAll();
        List<GetAllBrandsResponse> response = brands.stream()
                .map(brand -> mapper.forResponse().map(brand, GetAllBrandsResponse.class)).toList();
        return response;
    }

    @Override
    public GetBrandResponse getById(UUID id) {
        //rules.checkIfBrandExists(id);
        Brand brand = repository.findById(id).orElseThrow();
        return mapper.forResponse().map(brand, GetBrandResponse.class);    }

    @Override
    public CreateBrandResponse add(CreateBrandRequest request) {
        //rules.checkIfBrandExistsByName(request.getName());
        Brand brandSave = mapper.forRequest().map(request, Brand.class);
        brandSave.setId(null);
        repository.save(brandSave);
        return mapper.forResponse().map(brandSave, CreateBrandResponse.class);
    }

    @Override
    public UpdateBrandResponse update(UUID id, UpdateBrandRequest request) {
        Brand updateBrand = mapper.forRequest().map(request, Brand.class);
        updateBrand.setId(id);
        repository.save(updateBrand);
        return mapper.forResponse().map(updateBrand, UpdateBrandResponse.class);
    }

    @Override
    public void delete(UUID id) {
        //rules.checkIfBrandExists(id);
        repository.deleteById(id);
        sendKafkaBrandDeletedEvent(id);
    }
    private void sendKafkaBrandDeletedEvent(UUID id) {
        inventoryProducer.sendMessage(new BrandDeletedEvent(id));
    }
}
