package com.endorodrigo.ZonaFitWeb.repositorio;


import com.endorodrigo.Sistema.Zona.Fit.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente,Integer> {
}
