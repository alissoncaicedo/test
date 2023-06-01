package com.ceiba.biblioteca.controlador;


import com.ceiba.biblioteca.entidad.Prestamo;
import com.ceiba.biblioteca.servicio.PrestamoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PrestamoControlador {
    @Autowired
    protected PrestamoServicio prestamoServicio;
    @PostMapping("/prestamo")
    public ResponseEntity<?> crearPrestamo(@RequestBody Prestamo prestamo) {
        try {
            Prestamo prestamoEncontrado = prestamoServicio.crearPrestamo(prestamo);
            return new ResponseEntity(prestamoEncontrado, HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("{\"mensaje\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prestamo>buscarPorId(@PathVariable Integer id){
        try{
            Prestamo prestamoEncontrado=prestamoServicio.buscarPorId(id);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(prestamoEncontrado);
        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(null);

        }
    }

}
