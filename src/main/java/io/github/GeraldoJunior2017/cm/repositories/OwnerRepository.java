package io.github.GeraldoJunior2017.cm.repositories;

import io.github.GeraldoJunior2017.cm.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
