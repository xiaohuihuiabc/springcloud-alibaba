package com.xiaohuihui.entity;

import lombok.Data;

/**
 * @author xiaohuihui
 * @version 1.0.0
 * @package com.xiaohuihui.entity
 * @description
 * @date 2022/10/28 15:09
 * @Copyright
 * @link
 */
@Data
public class Order {
    private Long oid;//订单id
    private Integer number;//购买数量

    private Integer uid;//用户id
    private User user;//用户

    private Integer pid;//商品id
    private Product product;///商品信息

    private Integer port; // 端口号
}