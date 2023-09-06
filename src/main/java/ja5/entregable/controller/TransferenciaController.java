package ja5.entregable.controller;


import ja5.entregable.model.Transferencia;
import ja5.entregable.services.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transfrencias")

public class TransferenciaController {
    @Autowired
    TransferenciaService transferenciaService;

    @GetMapping

    public List<Transferencia> findByAll(){

        try {
            return cuentaTransferencia.findByAll();
        }catch (Exception e){
            return null;
        }

    }

    @GetMapping("/{id}")
    public Transferencia obtenerTransferenciaPorId(@PathVariable Long id) throws Exception {
        try {
            return transferenciaService.findById(id);
        }catch (Exception e){
            return null;
        }
    }

    @PostMapping
    public Cuenta crearCuenta(@RequestBody Cuenta cuenta) {
        try {
            return cuentaService.save(cuenta);
        }catch (Exception e){
            return null;
        }

    }

    @PutMapping
    public Cuenta actualizarCuenta(@RequestBody Cuenta cuenta) {
        try {
            return cuentaService.update(cuenta);
        }catch (Exception e){
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarCuenta(@PathVariable String numeroDeCuenta) {
        try {
            transferenciaService.delete(numeroDeTransferencia);
        }catch (Exception e){

        }
    }

}