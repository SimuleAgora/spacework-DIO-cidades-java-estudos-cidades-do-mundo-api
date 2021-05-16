package com.github.simuleagora.paises.repositories;

import com.github.simuleagora.paises.entities.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository extends JpaRepository<Pais, Long> {
}
