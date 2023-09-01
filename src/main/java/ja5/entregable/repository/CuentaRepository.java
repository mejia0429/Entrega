package ja5.entregable.repository;

import ja5.entregable.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepository extends JpaRepository <Cuenta, Long> {
}