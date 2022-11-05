package com.hayaservices.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hayaservices.model.Role;
import com.hayaservices.pojos.ERole;

@Repository
public interface RoleDao extends JpaRepository<Role, Integer> {
	Optional<Role> findByRoleName(ERole roleName);
}
