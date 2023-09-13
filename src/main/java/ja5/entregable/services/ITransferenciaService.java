package ja5.entregable.services;

import ja5.entregable.model.Cuenta;
import ja5.entregable.model.Transferencia;

import java.util.List;

public interface ITransferenciaService {
    Transferencia save(Transferencia transferencia);
    Transferencia update(Transferencia transferencia);
    Transferencia findById(Long id);
    List <Transferencia> findByAll();


}