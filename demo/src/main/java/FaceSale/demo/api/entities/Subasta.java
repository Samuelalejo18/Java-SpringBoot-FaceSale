package FaceSale.demo.api.entities;




import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Esta clase representa la entidad USUARIO en la base de datos.
 */
@Entity // Marca esta clase como una entidad JPA, lo que significa que se mapeará a una tabla.
 // Especifica el nombre de la tabla en la base de datos.
@NoArgsConstructor // Lombok: genera automáticamente un constructor sin argumentos.
@AllArgsConstructor // Lombok: genera automáticamente un constructor con todos los campos.
@Getter // Lombok: genera los métodos getter para todos los campos.
@Setter // Lombok: genera los métodos setter para todos los campos.
@ToString // Lombok: genera automáticamente un método toString() para la clase.
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // Ignora propiedades generadas por Hibernate al serializar a JSON.

@Table(name = "SUBASTA",
        uniqueConstraints = @UniqueConstraint(name = "UK_ID_OBRA_ARTE", columnNames = "ID_OBRA_ARTE"))
public class Subasta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SUBASTA")
    private Long idSubasta;

    @Column(name = "ESTADO_SUBASTA", nullable = false, length = 50)
    private String estadoSubasta;

    @Column(name = "FECHA_INICIA_SUBASTA", nullable = false)
    private LocalDateTime fechaIniciaSubasta;

    @Column(name = "FECHA_FIN_SUBASTA")
    private LocalDate fechaFinSubasta;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_OBRA_ARTE", referencedColumnName = "ID_OBRA_ARTE", unique = true)
    private ObraArte obraArte;

}
