package FaceSale.demo.api.entities;





import jakarta.persistence.*;
import lombok.*;


import java.util.Date;

/**
 * Esta clase representa la entidad USUARIO en la base de datos.
 */
@Entity // Marca esta clase como una entidad JPA, lo que significa que se mapeará a una tabla.
@Table(name = " OBRA_ARTE") // Especifica el nombre de la tabla en la base de datos.
@NoArgsConstructor // Lombok: genera automáticamente un constructor sin argumentos.
@AllArgsConstructor // Lombok: genera automáticamente un constructor con todos los campos.
@Getter // Lombok: genera los métodos getter para todos los campos.
@Setter // Lombok: genera los métodos setter para todos los campos.
@ToString // Lombok: genera automáticamente un método toString() para la clase.
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // Ignora propiedades generadas por Hibernate al serializar a JSON.



public class ObraArte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_OBRA_ARTE")
    private Long idObraArte;
    @Column(name = "TITULO_OBRA_ARTE")
    private String tituloObraArte;
    @Column(name = "CATEGORIA_OBRA_ARTE")
    private String categoriaObraArte;
    @Column(name = "ARTISTA_OBRA_ARTE")
    private String artistaObraArte;
    @Column(name = "ANIO_CREACION_OBRA_ARTE")
    private Date anioCreacionObraArte;
    @Column(name = "DESCRIPCION_OBRA_ARTE")
    private String descripcionObraArte;
    @Column(name = "TECNICA_OBRA_ARTE")
    private String tecnicaObraArte;
    @Column(name = "ALTURA_CM_OBRA_ARTE")
    private Double alturaCmObraArte;
    @Column(name = "ANCHO_CM_OBRA_ARTE")
    private Double anchoCmObraArte;
    @Column(name = "PROFUNDIDAD_CM_OBRA_ARTE")
    private Double profundidadCmObraArte;
    @Column(name = "PRECIO_INICIAL_OBRA_ARTE")
    private Double precioInicialObraArte;
    @Column(name = "ESTADO_OBRA_ARTE")
    private String estadoObraArte;
    @Column(name = "IMAGEN_OBRA_ARTE")
    private String imagenObraArte;

}
