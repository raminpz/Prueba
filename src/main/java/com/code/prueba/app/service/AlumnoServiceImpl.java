package com.code.prueba.app.service;

import com.code.prueba.app.model.Alumno;
import com.code.prueba.app.repository.AlumnoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class AlumnoServiceImpl implements AlumnoService{

    private final AlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }


    @Override
    public Mono<Alumno> save(Alumno alumno) {
        return null;
    }

    @Override
    public Flux<Alumno> findByEstado(String estado) {
        return null;
    }


}
