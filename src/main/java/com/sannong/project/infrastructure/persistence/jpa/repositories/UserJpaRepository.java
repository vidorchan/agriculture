package com.sannong.project.infrastructure.persistence.jpa.repositories;

import com.sannong.project.domain.user.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by Bright Huang on 1/26/15.
 */
@Repository
public interface UserJpaRepository extends CrudRepository<UserEntity, Long> {
    Collection<UserEntity> findByUserName(String username);
}