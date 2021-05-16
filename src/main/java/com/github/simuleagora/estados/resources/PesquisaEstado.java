package com.github.simuleagora.estados.resources;

import com.github.simuleagora.estados.entities.Estado;
import com.github.simuleagora.estados.repositories.EstadoRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estados")
public class PesquisaEstado {

  private final EstadoRepository repository;

  public PesquisaEstado(final EstadoRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public List<Estado> staties() {
    return repository.findAll();
  }
}
