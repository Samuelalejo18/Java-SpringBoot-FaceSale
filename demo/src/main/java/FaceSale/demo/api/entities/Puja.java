package FaceSale.demo.api.entities;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "PUJA")
@NoArgsConstructor // Lombok: genera automáticamente un constructor sin argumentos.
@AllArgsConstructor // Lombok: genera automáticamente un constructor con todos los campos.
@Getter // Lombok: genera los métodos getter para todos los campos.
@Setter // Lombok: genera los métodos setter para todos los campos.
@ToString
public class Puja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PUJA")
    private Long idPuja;

    @ManyToOne
    @JoinColumn(name = "ID_SUBASTA", nullable = false)
    private Subasta subasta;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", nullable = false)
    private Usuario usuario;

    @Column(name = "MONTO_SUBASTA", nullable = false)
    private Double montoSubasta;

    @Column(name = "TIEMPO_PUJA", nullable = false)
    private LocalDateTime tiempoPuja;


    }