package br.com.fiap.ChallengeApisprint3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiap.ChallengeApisprint3.models.Endereco;
import br.com.fiap.ChallengeApisprint3.repository.EnderecoRepository;

@Service
public class EnderecoService {
    
    @Autowired
    EnderecoRepository repository;
    
    public List<Endereco> listAll() {
        return repository.findAll();
    }

    @Transactional
    public void save(Endereco endereco) {
        repository.save(endereco);
    }

    public void remove(Long id) {
        repository.deleteById(id);
    }
}