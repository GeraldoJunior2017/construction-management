package io.github.GeraldoJunior2017.cm.controllers;

import io.github.GeraldoJunior2017.cm.dtos.OwnerDto;
import io.github.GeraldoJunior2017.cm.entities.Owner;
import io.github.GeraldoJunior2017.cm.services.OwnerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("responsavel")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @PostMapping
    public ResponseEntity<OwnerDto> create(@RequestBody OwnerDto owner) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ownerService.save(owner));
    }
}
