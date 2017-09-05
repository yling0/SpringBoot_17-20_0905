package me.yling.springboot17.repositories;

import me.yling.springboot17.models.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepo extends CrudRepository<Role, Long> {
}
