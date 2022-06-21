package org.dardan.appmockito.ejemplos.repositories;

import java.util.List;

public interface PreguntasRepository {

    List<String> findPreguntasPorExamenId(Long id);
    void guardarVarias(List<String> preguntas);
}
