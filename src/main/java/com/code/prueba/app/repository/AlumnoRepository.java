package com.code.prueba.app.repository;

import com.code.prueba.app.model.Alumno;
import org.springframework.data.repository.CrudRepository;
import reactor.core.publisher.Flux;

public interface AlumnoRepository extends CrudRepository<Alumno, String> {
    Flux<Alumno> findByEstado(String estado);
}
