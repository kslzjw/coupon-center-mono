package com.zjw.coupon.template.api.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponInfo {
    private Long id;

    private Long templateId;

    private Long userId;

    private Long shopId;

    private Integer status;

    private CouponTemplateInfo template;
}
