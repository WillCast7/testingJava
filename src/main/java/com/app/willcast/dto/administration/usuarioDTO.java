package com.app.willcast.dto.administration;


import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder //Implementa el patron de diseño Builder
public class usuarioDTO implements Serializable {
    private Long usuario_id;
    private String usuario_correo;
    private String usuario_contrasena;
    private Integer Persona_id;
    private Integer creadopor;
    private Date fcreacion;
    private Integer actualizadopor;
    private Date factualizacion;
    private String usuario;
    private Integer rol_id;
    private Boolean estado;

}
