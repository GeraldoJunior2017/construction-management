package io.github.GeraldoJunior2017.cm.services;

import io.github.GeraldoJunior2017.cm.repositories.PublicConstructionRepository;
import org.springframework.stereotype.Service;

@Service
public class PublicConstructionService {

    private PublicConstructionRepository repository;

    public PublicConstructionService(PublicConstructionRepository repository) {
        this.repository = repository;
    }
}
