package ufg.api.exames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ufg.api.exames.models.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
