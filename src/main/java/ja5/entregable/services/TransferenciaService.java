package ja5.entregable.services;

import ja5.entregable.model.Transferencia;
import ja5.entregable.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransferenciaService {
    @Autowired
    TransferenciaRepository transferenciaRepository;


    public Transferencia save(Transferencia transferencia){
        return TransferenciaRepository.save(transferencia);
    }

    public Transferencia update(Transferencia transferencia){
        return TransferenciaRepository.save(transferencia);
    }

    public void delete(Long id){
        transferenciaRepository.deleteById(id);
    }

    public Optional<Transferencia> findById(Transferencia transferencia){
        return transferenciaRepository.findById(transferencia.getId());
    }

    public List<Transferencia> findByAll(Transferencia transferencia){
        return transferenciaRepository.findAll();
    }
}
