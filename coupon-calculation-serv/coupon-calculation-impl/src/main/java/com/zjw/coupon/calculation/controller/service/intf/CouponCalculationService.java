package com.zjw.coupon.calculation.controller.service.intf;

import com.zjw.coupon.calculation.api.beans.ShoppingCart;
import com.zjw.coupon.calculation.api.beans.SimulationOrder;
import com.zjw.coupon.calculation.api.beans.SimulationResponse;
import org.springframework.web.bind.annotation.RequestBody;

public interface CouponCalculationService {

    ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart cart);

    SimulationResponse simulateOrder(@RequestBody SimulationOrder cart);
}
