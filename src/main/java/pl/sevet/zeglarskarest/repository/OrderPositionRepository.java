package pl.sevet.zeglarskarest.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sevet.zeglarskarest.model.OrderPosition;

public interface OrderPositionRepository extends CrudRepository<OrderPosition, Long > {
}
