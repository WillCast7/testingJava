package com.app.willcast;

import com.app.willcast.dto.administration.personaDTO;
import com.app.willcast.dto.administration.usuarioDTO;
import com.app.willcast.model.entity.PermissionEntity;
import com.app.willcast.model.entity.RoleEntity;
import com.app.willcast.model.entity.RoleEnum;
import com.app.willcast.model.entity.UserEntity;
import com.app.willcast.model.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
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
			UserEntity userWill = UserEntity.builder()
					.username("will")
					.password("$2a$10$PGtfAd9ebxGlolpid10RXuP4Mj1sUwAiAqXjurN1AC7zVbTa4bggS")
					.isEnabled(true)
					.accountNoExpired(true)
					.accountNoLocked(true)
					.credentialNoExpired(true)
					.roles(Set.of(roleDeveloper))
					.build();

			UserEntity userAaron = UserEntity.builder()
					.username("aaron")
					.password("$2a$10$PGtfAd9ebxGlolpid10RXuP4Mj1sUwAiAqXjurN1AC7zVbTa4bggS")
					.isEnabled(true)
					.accountNoExpired(true)
					.accountNoLocked(true)
					.credentialNoExpired(true)
					.roles(Set.of(roleAdmin))
					.build();

			UserEntity userPollo = UserEntity.builder()
					.username("pollo")
					.password("$2a$10$PGtfAd9ebxGlolpid10RXuP4Mj1sUwAiAqXjurN1AC7zVbTa4bggS")
					.isEnabled(true)
					.accountNoExpired(true)
					.accountNoLocked(true)
					.credentialNoExpired(true)
					.roles(Set.of(roleUser))
					.build();

			UserEntity userGallina = UserEntity.builder()
					.username("gallina")
					.password("$2a$10$PGtfAd9ebxGlolpid10RXuP4Mj1sUwAiAqXjurN1AC7zVbTa4bggS")
					.isEnabled(true)
					.accountNoExpired(true)
					.accountNoLocked(true)
					.credentialNoExpired(true)
					.roles(Set.of(roleInvited))
					.build();

			userRepository.saveAll(List.of(userWill, userAaron, userPollo, userGallina));
		};
	}

}
