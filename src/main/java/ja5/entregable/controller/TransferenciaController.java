package ja5.entregable.controller;

import ja5.entregable.model.Transferencia;
import ja5.entregable.services.ITransferenciaService;
import ja5.entregable.services.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/transferencia")
public class TransferenciaController {
    @Autowired
    TransferenciaService transferenciaService;

    @GetMapping
    public List <Transferencia> findByAll(){
        return  transferenciaService.findByAll();
    }
    @GetMapping("/{id}")
    public Transferencia findById(@PathVariable Long id){
        return  transferenciaService.findById(id);
    }
    @PostMapping
    public Transferencia crearTransferencia(@RequestBody Transferencia transferencia){
        return  transferenciaService.save(transferencia);
    }
    @PutMapping
    public Transferencia actualizarTransferencia(@RequestBody Transferencia transferencia){
        return transferenciaService.update(transferencia);
    }

}