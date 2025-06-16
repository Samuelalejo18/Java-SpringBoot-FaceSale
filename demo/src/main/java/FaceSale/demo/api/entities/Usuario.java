package FaceSale.demo.api.entities;


import jakarta.persistence.*;

import lombok.*;

import java.util.List;

/**
 * Esta clase representa la entidad USUARIO en la base de datos.
 */
@Entity // Marca esta clase como una entidad JPA, lo que significa que se mapeará a una tabla.
@Table(name = "USUARIO") // Especifica el nombre de la tabla en la base de datos.
@NoArgsConstructor // Lombok: genera automáticamente un constructor sin argumentos.
@AllArgsConstructor // Lombok: genera automáticamente un constructor con todos los campos.
@Getter // Lombok: genera los métodos getter para todos los campos.
@Setter // Lombok: genera los métodos setter para todos los campos.
@ToString // Lombok: genera automáticamente un método toString() para la clase.
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // Ignora propiedades generadas por Hibernate al serializar a JSON.

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private long idUsuario;

    @Column(name = "NOMBRE_USUARIO", nullable = false)
    private String nombreUsuario;

    @Column(name = "APELLIDO_USUARIO", nullable = false)
    private String apellidoUsuario;

    @Column(name = "ALIAS_USUARIO", nullable = false, unique = true)
    private String aliasUsuario;

    @Column(name = "TIPO_DOCUMENTO_USUARIO", nullable = false)
    private String tipoDocumentoUsuario;

    @Column(name = "DOCUMENTO_IDENTIDAD_USUARIO", nullable = false, unique = true)
    private String documentoIdentidadUsuario;

    @Column(name = "EDAD_USUARIO", length = 3)
    private String edadUsuario;

    @Column(name = "EMAIL_USUARIO", nullable = false, unique = true)
    private String emailUsuario;

    @Column(name = "PASSWORD_USUARIO", nullable = false)
    private String passwordUsuario;

    @Column(name = "NUMERO_TELEFONO_USUARIO")
    private String numeroTelefonoUsuario;

    @Column(name = "PAIS_USUARIO")
    private String paisUsuario;

    @Column(name = "CIUDAD_USUARIO")
    private String ciudadUsuario;

    @Column(name = "DIRECCION_USUARIO")
    private String direccionUsuario;


    @Column(name = "DESCRIPTOR_FACIAL_USUARIO", columnDefinition = "ARREGLO_FACIAL")
    private List<Double> descriptorFacialUsuario;
    @Column(name = "IMAGEN_FACIAL_USUARIO")
    private String imagenFacialUsuario;


}