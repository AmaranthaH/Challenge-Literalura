package com.aluracursos.screenmatch.Repository;

import com.aluracursos.screenmatch.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    Author findAuthorByNombreIgnoreCase(String nombre);
    List<Author> findAuthorsByFechaNacimientoBeforeAndFechaFallecimientoAfterOrFechaFallecimientoIsNull(Integer fechaNacimiento, Integer fechaFallecimiento);
}

