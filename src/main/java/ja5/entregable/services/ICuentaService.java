package ja5.entregable.services;

import ja5.entregable.model.Cuenta;

import java.util.List;

public interface ICuentaService {

    Cuenta save(Cuenta cuenta)throws Exception;

    Cuenta update(Cuenta cuenta)throws Exception;

    void delete(String numeroDeCuenta)throws Exception;

    Cuenta findById(Long id)throws Exception;

    List<Cuenta> findByAll()throws Exception;
}