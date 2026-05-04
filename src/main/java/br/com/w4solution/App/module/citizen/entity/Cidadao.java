package br.com.w4solution.App.module.citizen.entity;

import br.com.w4solution.App.module.citizen.dto.CadastroCidadaoDto;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Table(name = "cidadaos")
@AllArgsConstructor
@NoArgsConstructor
public class Cidadao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String cpf;
    private String cidade;
    private String bairroVila;
    @Enumerated(EnumType.STRING)
    private Copetencia copetencia = Copetencia.CIDADAO;

    public Cidadao(CadastroCidadaoDto dados) {
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.cidade = dados.cidade();
        this.bairroVila = dados.bairroVila();
        if(dados.copetencia() != null){
            this.copetencia = dados.copetencia();
        }
    }
}
