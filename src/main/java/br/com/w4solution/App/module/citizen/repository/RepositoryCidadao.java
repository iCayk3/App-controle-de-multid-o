package br.com.w4solution.App.module.citizen.repository;

import br.com.w4solution.App.module.citizen.entity.Cidadao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCidadao extends JpaRepository<Cidadao, Long> {
}
