package pl.sevet.zeglarskarest.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sevet.zeglarskarest.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
