package pl.sevet.zeglarskarest.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sevet.zeglarskarest.model.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
