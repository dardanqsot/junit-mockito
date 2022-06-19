package org.dardan.appmockito.ejemplos.services;

import org.dardan.appmockito.ejemplos.models.Examen;

import java.util.Optional;

public interface ExamenService {
    Examen findExamenPorNombre(String nombre);
}
