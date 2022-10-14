package com.zjw.coupon.calculation.template;

import com.zjw.coupon.calculation.api.beans.ShoppingCart;

public interface RuleTemplate {
    ShoppingCart calculate(ShoppingCart settlement);

}
