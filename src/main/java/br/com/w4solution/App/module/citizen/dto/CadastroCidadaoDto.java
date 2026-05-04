package br.com.w4solution.App.module.citizen.dto;

import br.com.w4solution.App.module.citizen.entity.Copetencia;
import jakarta.validation.constraints.NotBlank;

public record CadastroCidadaoDto(
         @NotBlank String nome,
         @NotBlank String cpf,
         @NotBlank String cidade,
         @NotBlank String bairroVila,
         Copetencia copetencia
) {
}
