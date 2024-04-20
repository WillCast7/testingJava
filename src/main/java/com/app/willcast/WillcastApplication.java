package com.app.willcast;

import com.app.willcast.dto.administration.personaDTO;
import com.app.willcast.dto.administration.usuarioDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class WillcastApplication {

	public static void main(String[] args) {
		usuarioDTO usuario = usuarioDTO.builder()
				.usuario_correo("usuario@correo.com")
				.usuario_contrasena("contraseña123")
				.Persona_id(1)
				.creadopor(2)
				.fcreacion(new Date())
				.actualizadopor(3)
				.factualizacion(new Date())
				.usuario("usuario123")
				.rol_id(4)
				.estado(true)
				.build();
		System.out.println(usuario);
		SpringApplication.run(WillcastApplication.class, args);
	}

}
