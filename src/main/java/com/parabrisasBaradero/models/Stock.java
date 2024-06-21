package com.parabrisasBaradero.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name = "native",strategy = "native")
    private Long id;
    private Repuesto repuesto;
    private String descripcion;
    private int cantidad_disponible;
    private LocalDateTime fecha_actualizacion;

}
