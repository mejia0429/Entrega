package ja5.entregable.services;

import ja5.entregable.model.Cuenta;
import ja5.entregable.model.Transferencia;
import ja5.entregable.repository.CuentaRepository;
import ja5.entregable.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class TransferenciaService implements ITransferenciaService  {
    @Autowired
    TransferenciaRepository transferenciaRepository;

    public Transferencia save(Transferencia transferencia){

        return transferenciaRepository.save(transferencia);
    }

    public Transferencia update(Transferencia transferencia){
        return transferenciaRepository.save(transferencia);

    }
    public  List<Transferencia> findByAll(){
        return transferenciaRepository.findAll();
    }
    public Transferencia findById(Long id){
        return  transferenciaRepository.findById(id).get();
    }



}