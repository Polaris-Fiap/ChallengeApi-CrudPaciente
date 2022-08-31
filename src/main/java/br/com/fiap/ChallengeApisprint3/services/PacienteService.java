package br.com.fiap.ChallengeApisprint3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiap.ChallengeApisprint3.models.Paciente;
import br.com.fiap.ChallengeApisprint3.repository.PacienteRepository;

@Service
public class PacienteService {

	@Autowired
	PacienteRepository repository;
	
	public List<Paciente> listAll() {
		return repository.findAll();
	}
	
	@Transactional
	public void save(Paciente paciente) {
		repository.save(paciente);
	}
	
	public void remove(Long id) {
        repository.deleteById(id);
    }

	public Optional<Paciente> getById(Long id) {
        return repository.findById(id);
    }
}
