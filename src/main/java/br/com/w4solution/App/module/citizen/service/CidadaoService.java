package br.com.w4solution.App.module.citizen.service;

import br.com.w4solution.App.module.citizen.dto.CadastroCidadaoDto;
import br.com.w4solution.App.module.citizen.entity.Cidadao;
import br.com.w4solution.App.module.citizen.repository.RepositoryCidadao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CidadaoService {

    @Autowired
    RepositoryCidadao repositoryCidadao;

    public Cidadao cadastroCidadao(CadastroCidadaoDto dados) {

        Cidadao cadastroCidadao = new Cidadao(dados);
        return repositoryCidadao.save(cadastroCidadao);
    }

    public List<Cidadao> listarCidadaos() {
        return repositoryCidadao.findAll();
    }
}
