package ja5.entregable.controller;


import ja5.entregable.model.Cuenta;
import ja5.entregable.services.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuentas")

public class CuentaController {
    @Autowired
    CuentaService cuentaService;

    @GetMapping

    public List<Cuenta> findByAll(){

        try {
            return cuentaService.findByAll();
        }catch (Exception e){
            return null;
        }

    }

    @GetMapping("/{id}")
    public Cuenta obtenerCuentaPorId(@PathVariable Long id) throws Exception {
        try {
            return cuentaService.findById(id);
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
            cuentaService.delete(numeroDeCuenta);
        }catch (Exception e){

        }
    }

}