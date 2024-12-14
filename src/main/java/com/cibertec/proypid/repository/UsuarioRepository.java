package com.cibertec.proypid.repository;

import com.cibertec.proypid.model.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Integer> {
    Optional<UsuarioEntity> findByEmail(String email);

    Optional<UsuarioEntity> findByDni(String dni);

    Optional<UsuarioEntity> findByNombre(String nombre);
}
