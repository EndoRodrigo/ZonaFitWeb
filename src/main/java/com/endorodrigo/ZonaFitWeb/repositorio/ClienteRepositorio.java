package com.endorodrigo.ZonaFitWeb.repositorio;


import com.endorodrigo.ZonaFitWeb.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente,Integer> {
}
