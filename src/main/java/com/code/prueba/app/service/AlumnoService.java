package com.code.prueba.app.service;

import com.code.prueba.app.model.Alumno;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface AlumnoService {

    public Mono<Alumno> save(Alumno alumno);


    public Flux<Alumno> findByEstado(String estado);
}
