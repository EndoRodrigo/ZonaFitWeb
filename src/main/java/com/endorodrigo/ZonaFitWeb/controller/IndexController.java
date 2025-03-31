package com.endorodrigo.ZonaFitWeb.controller;

import com.endorodrigo.ZonaFitWeb.modelo.Cliente;
import com.endorodrigo.ZonaFitWeb.servicio.IClienteServicio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import java.util.List;

@Controller
@Data
@ViewScoped
public class IndexController {

    @Autowired
    IClienteServicio clienteServicio;
    private List<Cliente> clientes;
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);


    @PostConstruct
    public void init() {
        cargarDatos();
    }

    public List<Cliente> cargarDatos() {
        clientes = clienteServicio.listarClientes();
        return clientes;
    }
}
