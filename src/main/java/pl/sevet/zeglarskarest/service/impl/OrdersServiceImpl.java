package pl.sevet.zeglarskarest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sevet.zeglarskarest.dto.OrderDto;
import pl.sevet.zeglarskarest.repository.ClientRepository;
import pl.sevet.zeglarskarest.repository.OrderPositionRepository;
import pl.sevet.zeglarskarest.repository.OrderRepository;
import pl.sevet.zeglarskarest.repository.UserRepository;
import pl.sevet.zeglarskarest.service.OrdersService;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersServiceImpl implements OrdersService {

    private final OrderRepository orderRepository;
    private final OrderPositionRepository orderPositionRepository;
    private final ClientRepository clientRepository;
    private final UserRepository userRepository;

    @Autowired
    public OrdersServiceImpl(OrderRepository orderRepository, OrderPositionRepository orderPositionRepository, ClientRepository clientRepository, UserRepository userRepository) {
        this.orderRepository = orderRepository;
        this.orderPositionRepository = orderPositionRepository;
        this.clientRepository = clientRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Optional<OrderDto> getOrder(int orderId, boolean fetchClientDetails, boolean fetchPositions) {
        return Optional.empty();
    }

    @Override
    public Optional<List<OrderDto>> getAll(boolean fetchPositions, boolean fetchPaid, boolean fetchRealised, boolean fetchArchival) {
        return Optional.empty();
    }

    @Override
    public Optional<String> createOrder(OrderDto orderDto) {
        return Optional.empty();
    }

    @Override
    public Boolean updateStatus(int orderId, boolean setPaid, boolean setRealised, boolean setArchival) {
        return null;
    }

    @Override
    public Boolean deleteOrder(Optional<Integer> orderId, Optional<String> orderNumber) {
        return null;
    }
}
