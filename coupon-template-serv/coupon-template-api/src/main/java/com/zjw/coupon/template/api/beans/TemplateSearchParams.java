package com.zjw.coupon.template.api.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.validation.constraints.NotNull;

/**
 * 创建优惠券模板
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TemplateSearchParams {

    private Long id;

    private String name;

    private String type;

    private Long shopId;

    private Boolean available;

    private int page;

    private int pageSize;

}
