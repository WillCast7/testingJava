package com.app.willcast.dto.administration;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class personaDTO implements Serializable {

    private Long persona_id;
    private String persona_tipodni;
    private String persona_dni;
    private String persona_primernombre;
    private String persona_segundonombre;
    private String persona_primerapellido;
    private String persona_segundoapellido;
    private String persona_email;
    private String persona_direccion;
    private String persona_telefono;
    private String persona_telefono2;
    private Date persona_fechanacimiento;
    private Boolean persona_estado;
    private usuarioDTO creadopor;
    private Date fcreacion;
    private Integer persona_actualizadopor;
    private Date factualizacion;

}
