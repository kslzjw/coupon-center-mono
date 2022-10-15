package com.zjw.coupon.calculation.api.beans;

import com.zjw.coupon.template.api.beans.CouponInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

// 封装了订单信息
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart {

    @NotNull
    private List<Product> products;
    // 封装了优惠券信息，目前计算服务只支持单张优惠券
    // 为了考虑到以后多券的扩展性，所以定义成了List
    private Long couponId;
    private List<CouponInfo> couponInfos;
    private long cost;

    @NotNull
    private Long userId;

}
