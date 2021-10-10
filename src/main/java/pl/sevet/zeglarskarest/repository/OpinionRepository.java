package pl.sevet.zeglarskarest.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sevet.zeglarskarest.model.Opinion;

public interface OpinionRepository extends CrudRepository<Opinion, Long> {
}
