package br.com.fiap.ChallengeApisprint3.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.ChallengeApisprint3.models.Endereco;
import br.com.fiap.ChallengeApisprint3.services.EnderecoService;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoController {
    
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    @Transactional
    public ResponseEntity<Endereco> create(@RequestBody @Valid Endereco endereco) {
        enderecoService.save(endereco);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(endereco);
    }

    @GetMapping
    public List<Endereco> index() {
        return enderecoService.listAll();
    }
}
