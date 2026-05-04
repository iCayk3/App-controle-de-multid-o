package br.com.w4solution.App.module.citizen.dto;

import br.com.w4solution.App.module.citizen.entity.Cidadao;
import br.com.w4solution.App.module.citizen.entity.Copetencia;

public record CidadaoDto(
        Long id,
        String nome,
        String cpf,
        String cidade,
        String bairroVila,
        Copetencia copetencia
) {
    public CidadaoDto(Cidadao cidadao){
        this(
                cidadao.getId(),
                cidadao.getNome(),
                cidadao.getCpf(),
                cidadao.getCidade(),
                cidadao.getBairroVila(),
                cidadao.getCopetencia()
        );
    }
}
