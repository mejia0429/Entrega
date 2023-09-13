package ja5.entregable.repository;

import ja5.entregable.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CuentaRepository extends JpaRepository <Cuenta,Long> {
    Optional<Cuenta> findByNumeroCuenta(String numeroCuenta);
    void deleteByNumeroCuenta(String numeroCuenta);
    //  @Query("Select * from Cuenta where numero_cuenta=$numCuenta")
    //  Cuenta buscarPorCuenta(@Param("numCuenta") String numeroCuenta);
}