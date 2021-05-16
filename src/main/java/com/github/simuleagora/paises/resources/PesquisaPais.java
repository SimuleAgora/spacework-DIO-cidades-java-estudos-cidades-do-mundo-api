package com.github.simuleagora.paises.resources;

import com.github.simuleagora.paises.entities.Pais;
import com.github.simuleagora.paises.repositories.PaisRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PesquisaPais {

  private final PaisRepository repository;

  public PesquisaPais(final PaisRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/paises")
  public List<Pais> cities() {

    return repository.findAll();
  }
}
