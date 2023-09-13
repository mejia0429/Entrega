package ja5.entregable.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Builder
public class Transferencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cuenta_origen_id")
    private Cuenta cuentaOrigen;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cuenta_destino_id")
    private Cuenta cuentaDestino;

    private BigDecimal monto;

    private LocalDateTime fechaTransferencia;


}
