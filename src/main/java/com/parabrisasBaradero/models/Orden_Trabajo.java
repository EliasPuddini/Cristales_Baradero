package com.parabrisasBaradero.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "ordenes_trabajo")
public class Orden_Trabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name = "native",strategy = "native")
    private Long id;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private List<Repuesto> repuestos;
    private String detalle_reparacion;
    private String estado;
    private LocalDateTime fecha_ingreso;
    private LocalDateTime fecha_salida;
    private String foto_ingreso;
    private String foto_documentos;
    private String foto_final;
    private String foto_logo;
    
}
