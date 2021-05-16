package com.github.simuleagora.cidades.resources;

import com.github.simuleagora.cidades.entities.Cidade;
import com.github.simuleagora.cidades.repositories.CidadeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cidades")
public class PesquisaCidade {

  private final CidadeRepository repository;

  public PesquisaCidade(final CidadeRepository repository) {
    this.repository = repository;
  }

  /* 1st
  @GetMapping
  public List<Cidade> cidades() {
      return repository.findAll();
  }*/

  // 2nd - Pageable
  @GetMapping
  public Page<Cidade> cities(final Pageable page) {
    return repository.findAll(page);
  }
}
