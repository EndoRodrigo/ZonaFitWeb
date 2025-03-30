package com.endorodrigo.ZonaFitWeb.servicio;


import com.endorodrigo.Sistema.Zona.Fit.modelo.Cliente;

import java.util.List;

public interface IClienteServicio {
    public List<Cliente> listarClientes();

    public Cliente buscarClientePorId(Integer idCliente);

    public void guardarCliente(Cliente cliente);

    public void eliminarCliente(Cliente cliente);

}
