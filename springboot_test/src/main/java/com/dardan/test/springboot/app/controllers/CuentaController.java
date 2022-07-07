package com.dardan.test.springboot.app.controllers;

import static org.springframework.http.HttpStatus.*;

import com.dardan.test.springboot.app.models.Cuenta;
import com.dardan.test.springboot.app.services.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/cuentas")
public class CuentaController {

    @Autowired
    private CuentaService cuentaService;

    @GetMapping("/{id}")
    @ResponseStatus(OK)
    public Cuenta detalle(@PathVariable Long id) {
        return cuentaService.findById(id);
    }

}
