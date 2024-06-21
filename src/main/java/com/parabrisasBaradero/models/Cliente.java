package com.parabrisasBaradero.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name = "native",strategy = "native")
    private Long id;
    @Column(unique = true)
    private Long dni;
    private String nombre_apellido;
    private String telefono;
    //private String descripcion_necesidad;
    private LocalDateTime fecha_alta;

}
