package pl.sevet.zeglarskarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sevet.zeglarskarest.dto.BlogPostShortDto;
import pl.sevet.zeglarskarest.dto.OrderDto;
import pl.sevet.zeglarskarest.service.OrdersService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrdersController {

    private final OrdersService ordersService;

    @Autowired
    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderDto> getOrder
            ( @RequestParam int orderId,
              @RequestParam(required = false) boolean fetchClientDetails,
              @RequestParam(required = false) boolean fetchPositions) {

        return ordersService.getOrder(orderId,fetchClientDetails,fetchPositions)
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping(path = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<OrderDto>> getAll
            ( @RequestParam(required = false) boolean fetchPositions,
              @RequestParam(required = false) boolean fetchPaid,
              @RequestParam(required = false) boolean fetchRealised,
              @RequestParam(required = false) boolean fetchArchival) {

        return ordersService.getAll(fetchPositions, fetchPaid,fetchRealised,fetchArchival)
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.status(HttpStatus.NO_CONTENT).build());
    }

    @PostMapping("/create")
    public ResponseEntity<String> createOrder(@RequestBody OrderDto orderDto){
        return ordersService.createOrder(orderDto)
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build());
    }

    @PatchMapping(path = "/updateStatus")
    public ResponseEntity<Boolean> updateStatus(@RequestParam int orderId,
                                                @RequestParam(required = false) boolean setPaid,
                                                @RequestParam(required = false) boolean setRealised,
                                                @RequestParam(required = false) boolean setArchival){
        if( ordersService.updateStatus(orderId, setPaid, setRealised, setArchival) )
            return ResponseEntity.ok(true);
        else
            return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
    }

    @DeleteMapping(path = "/deleteOrder")
    public ResponseEntity<Boolean> deleteOrder(@RequestParam Optional<Integer> orderId,
                                               @RequestParam Optional<String> orderNumber)
    {
        if( ordersService.deleteOrder(orderId, orderNumber) )
        return ResponseEntity.ok(true);
            else
        return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
    }
}
