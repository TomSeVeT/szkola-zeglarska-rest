package pl.sevet.zeglarskarest.service;

import pl.sevet.zeglarskarest.dto.OrderDto;

import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;

public interface OrdersService {
    Optional<OrderDto> getOrder(int orderId, boolean fetchClientDetails, boolean fetchPositions);

    Optional<List<OrderDto>> getAll(boolean fetchPositions, boolean fetchPaid, boolean fetchRealised, boolean fetchArchival);

    Optional<String> createOrder(OrderDto orderDto);

    Boolean updateStatus(int orderId, boolean setPaid, boolean setRealised, boolean setArchival);

    Boolean deleteOrder(Optional<Integer> orderId, Optional<String> orderNumber);
}
