package com.zjw.coupon.template.api.beans.rules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Discount {
    // 对于满减券 - quota是减掉的钱数，单位是分
    // 对于打折券 - quota是折扣(以100表示原价)，90就是打9折, 95就是95折
    // 对于随机立减券 - quota是最高的随机立减额
    // 对于晚间特别优惠券 - quota是日间优惠额，晚间优惠翻倍
    private Long quota;

    // 订单最低要达到多少钱才能用优惠券，单位为分, 100代表一块钱，比使用 Double 到处转换 BigDecimal
    private Long threshold;
}
