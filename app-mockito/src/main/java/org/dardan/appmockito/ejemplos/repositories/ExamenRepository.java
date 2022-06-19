package org.dardan.appmockito.ejemplos.repositories;

import org.dardan.appmockito.ejemplos.models.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findAll();
}
