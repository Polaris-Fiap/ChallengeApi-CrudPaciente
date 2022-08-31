package br.com.fiap.ChallengeApisprint3.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.ChallengeApisprint3.models.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
