package pl.sevet.zeglarskarest.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sevet.zeglarskarest.model.UserRole;

public interface UserRoleRepository extends CrudRepository<UserRole, Long> {
}