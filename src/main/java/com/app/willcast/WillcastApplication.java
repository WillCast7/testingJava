package com.app.willcast;

import com.app.willcast.dto.administration.personaDTO;
import com.app.willcast.dto.administration.usuarioDTO;
import com.app.willcast.model.entity.PermissionEntity;
import com.app.willcast.model.entity.RoleEntity;
import com.app.willcast.model.entity.RoleEnum;
import com.app.willcast.model.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.Set;

@SpringBootApplication
public class WillcastApplication {

	public static void main(String[] args) {
		SpringApplication.run(WillcastApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository){
		return args -> {
			/*Create Permission*/
			PermissionEntity createPermission = PermissionEntity.builder()
					.name("CREATE")
					.build();

			PermissionEntity readPermission = PermissionEntity.builder()
					.name("READ")
					.build();

			PermissionEntity updatePermission = PermissionEntity.builder()
					.name("UPDATE")
					.build();

			PermissionEntity deletePermission = PermissionEntity.builder()
					.name("DELETE")
					.build();

			PermissionEntity refactorPermission = PermissionEntity.builder()
					.name("REFACTOR")
					.build();

			/*CREATE ROLES*/
			RoleEntity roleAdmin = RoleEntity.builder()
					.roleEmum(RoleEnum.ADMIN)
					.permissionList(Set.of(createPermission, readPermission, updatePermission, deletePermission))
					.build();

			RoleEntity roleUser = RoleEntity.builder()
					.roleEmum(RoleEnum.USER)
					.permissionList(Set.of(createPermission, readPermission))
					.build();

			RoleEntity roleInvited = RoleEntity.builder()
					.roleEmum(RoleEnum.INVITED)
					.permissionList(Set.of(readPermission))
					.build();

			RoleEntity roleDeveloper = RoleEntity.builder()
					.roleEmum(RoleEnum.DEVELOPER)
					.permissionList(Set.of(createPermission, readPermission, updatePermission, deletePermission, refactorPermission))
					.build();

			/*CREATE USER*/
			usuarioDTO userWill = usuarioDTO.builder()
					.usuario_correo("usuario@correo.com")
					.usuario_contrasena("1234")
					.Persona_id(1)
					.creadopor(2)
					.fcreacion(new Date())
					.actualizadopor(3)
					.factualizacion(new Date())
					.usuario("usuario123")
					.rol_id(4)
					.estado(true)
					.build();
		};
	}

}
