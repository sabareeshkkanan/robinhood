package com.kalki.robinhood.api;

import com.kalki.robinhood.models.Multiple;
import com.kalki.robinhood.models.OrderRequest;
import com.kalki.robinhood.models.OrderResponse;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;

@RestController
@RequestMapping("/orders")
public class Order {
    @PostMapping("/")
    public OrderResponse placeOrder(OrderRequest orderRequest) {
        return new OrderResponse();
    }

    @GetMapping("/{order_id}/")
    public OrderResponse getOrder(@PathVariable("order_id") String order_id) {
        return new OrderResponse();
    }

    @GetMapping("/")
    public Multiple<OrderResponse> getAll(@RequestParam(required = false) ZonedDateTime updated_at,
                                          @RequestParam(required = false) String instrument,
                                          @RequestParam(required = false) String cursonr) {
        return new Multiple<>();
    }

    @PostMapping("/{order_id}/cancel/")
    public OrderResponse cancel(@PathVariable("order_id") String order_id) {
        return new OrderResponse();
    }
}
