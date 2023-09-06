package ja5.entregable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ja5.entregable.model.Cuenta;
import ja5.entregable.repository.CuentaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class CuentaService implements ICuentaService{

    @Autowired
    CuentaRepository cuentaRepository;

    public Cuenta save(Cuenta cuenta) throws Exception{
        Optional<Cuenta> cuentaExistente = cuentaRepository.findByNumeroCuenta(cuenta.getNumeroCuenta());
        if (cuentaExistente.isPresent()) {
            throw new Exception("Ya existe una cuenta con el mismo número de cuenta.");
        }

        if (cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0) {
            throw new Exception("El saldo no puede ser negativo.");
        }
        return cuentaRepository.save(cuenta);
    }

    public Cuenta update(Cuenta cuenta)throws Exception{
        Optional<Cuenta> cuentaExistente = cuentaRepository.findByNumeroCuenta(cuenta.getNumeroCuenta());
        if (cuentaExistente.isPresent()) {
            Cuenta actualizarCUenta = cuentaExistente.get();
            actualizarCUenta.setSaldo(cuenta.getSaldo());
            return cuentaRepository.save(cuenta);
        }else{
            return save(cuenta);
        }
    }

    public void delete(String  numeroDeCuenta)throws Exception{
        Optional<Cuenta> cuentaExistente = cuentaRepository.findByNumeroCuenta(numeroDeCuenta);
        if (cuentaExistente.isPresent()) {
            throw new Exception("Ya existe una cuenta con el mismo número de cuenta.");
        }
        if (cuentaExistente.get().getSaldo().compareTo(BigDecimal.ZERO) < 0) {
            throw new Exception("Aun No ha normalizado sus Obligaciones. saldo:"+cuentaExistente.get().getSaldo());
        }

        //   cuentaRepository.deleteByNumeroDeCuenta(numeroDeCuenta);
    }

    public Cuenta findById(Long id) throws Exception{
        return cuentaRepository.findById(id).get();
    }



    public List<Cuenta> findByAll()throws Exception{
        return cuentaRepository.findAll();
    }

}