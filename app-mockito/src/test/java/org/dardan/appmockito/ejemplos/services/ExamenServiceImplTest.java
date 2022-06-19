package org.dardan.appmockito.ejemplos.services;

import org.dardan.appmockito.ejemplos.models.Examen;
import org.dardan.appmockito.ejemplos.repositories.ExamenRepository;
import org.dardan.appmockito.ejemplos.repositories.ExamenRepositoryOtro;
import org.dardan.appmockito.ejemplos.repositories.PreguntasRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ExamenServiceImplTest {

    ExamenRepository repository;
    ExamenService service;
    PreguntasRepository preguntasRepository;

    @BeforeEach
    void setUp() {
        repository = mock(ExamenRepository.class);
        preguntasRepository = mock(PreguntasRepository.class);
        service = new ExamenServiceImpl(repository, preguntasRepository);
    }

    @Test
    void findExamenPorNombre() {


        //when(repository.findAll()).thenReturn(Datos.EXAMENES);
        Optional<Examen> examen = service.findExamenPorNombre("Matemáticas");
        assertTrue(examen.isPresent());
        assertEquals(5L, examen.orElseThrow().getId());
        assertEquals("Matemáticas", examen.get().getNombre());
    }

    @Test
    void findExamenPorNombreListaVacia() {
        List<Examen> datos = Collections.emptyList();

        when(repository.findAll()).thenReturn(datos);
        Optional<Examen> examen = service.findExamenPorNombre("Matemáticas");

        assertFalse(examen.isPresent());
    }
}