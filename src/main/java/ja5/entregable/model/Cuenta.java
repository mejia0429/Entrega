package ja5.entregable.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Cuenta {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  Long id;
    private String numeroCuenta;
    private BigDecimal saldo;
    private Boolean estado;

}