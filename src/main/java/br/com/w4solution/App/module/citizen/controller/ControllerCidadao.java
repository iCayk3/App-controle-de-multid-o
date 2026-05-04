package br.com.w4solution.App.module.citizen.controller;

import br.com.w4solution.App.module.citizen.dto.CadastroCidadaoDto;
import br.com.w4solution.App.module.citizen.dto.CidadaoDto;
import br.com.w4solution.App.module.citizen.service.CidadaoService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("citizen")
public class ControllerCidadao {

    @Autowired
    CidadaoService service;

    @GetMapping
    public ResponseEntity<List<CidadaoDto>> listarCidadaos() {
        var cidadaos = service.listarCidadaos().stream().map(CidadaoDto::new).toList();
        return ResponseEntity.ok().body(cidadaos);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<CidadaoDto> cadastroCidadao(@RequestBody CadastroCidadaoDto dados) {
        var cidadao = service.cadastroCidadao(dados);
        return ResponseEntity.ok().body(new CidadaoDto(cidadao));
    }
}
