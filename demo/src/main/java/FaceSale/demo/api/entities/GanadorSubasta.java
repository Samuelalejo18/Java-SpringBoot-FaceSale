package FaceSale.demo.api.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "GANADOR_SUBASTA")
@NoArgsConstructor // Lombok: genera automáticamente un constructor sin argumentos.
@AllArgsConstructor // Lombok: genera automáticamente un constructor con todos los campos.
@Getter // Lombok: genera los métodos getter para todos los campos.
@Setter // Lombok: genera los métodos setter para todos los campos.
@ToString
public class GanadorSubasta {

    @Id
    @Column(name = "ID_SUBASTA")
    private Long idSubasta;

    @OneToOne
    @MapsId
    @JoinColumn(name = "ID_SUBASTA", referencedColumnName = "ID_SUBASTA")
    private Subasta subasta;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", nullable = false)
    private Usuario usuario;

    @Column(name = "FECHA_GANADOR", nullable = false)
    private LocalDateTime fechaGanador;

    @Column(name = "MONTO_FINAL")
    private Double montoFinal;
}
