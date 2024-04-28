package com.app.willcast.model.repository;

import com.app.willcast.model.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long>{

    Optional<UserEntity> findUserByUsername(String username);

    //Script SQL manual
   /* @Query("Select u from UserEntity u where u.username = ?")
    Optional<UserEntity> findUser(String username);*/
}
