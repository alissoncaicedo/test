package com.ceiba.biblioteca.repositorio;

import com.ceiba.biblioteca.entidad.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PrestamoRepositorio extends JpaRepository<Prestamo, Integer> {
     Optional<Prestamo> findByid(Integer id);

    Prestamo save(Prestamo prestamo);
    Prestamo findById(int id);
    boolean existsByIdentificacionUsuario(String identificacionUsuario);
}

