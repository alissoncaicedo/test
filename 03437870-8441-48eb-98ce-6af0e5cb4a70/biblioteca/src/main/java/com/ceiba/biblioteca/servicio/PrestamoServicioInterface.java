package com.ceiba.biblioteca.servicio;

import com.ceiba.biblioteca.entidad.Prestamo;

import java.time.LocalDate;

public interface PrestamoServicioInterface {
    Prestamo crearPrestamo(Prestamo prestamo) throws Exception;
    LocalDate calcularFechaMaximaDevolucion(Prestamo prestamo);
    public Integer buscarPorId(Integer id) throws Exception;
}
