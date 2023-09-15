package io.github.GeraldoJunior2017.cm.services;

import io.github.GeraldoJunior2017.cm.dtos.OwnerDto;
import io.github.GeraldoJunior2017.cm.entities.Owner;
import io.github.GeraldoJunior2017.cm.repositories.OwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

    private final OwnerRepository repository;

    public OwnerService(OwnerRepository repository) {
        this.repository = repository;
    }

    public OwnerDto save(OwnerDto ownerDto) {
        final Owner owner = new Owner(ownerDto);
        return new OwnerDto(repository.save(owner));
    }

    public void refreshOwners(Owner owner) {
        repository.findById(owner.getId())
                .ifPresent(result -> {
                    owner.setCpf(result.getCpf());
                    owner.setName(result.getName());
                });
    }
}
