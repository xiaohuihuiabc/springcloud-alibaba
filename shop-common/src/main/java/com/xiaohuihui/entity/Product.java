package com.xiaohuihui.entity;

import lombok.Data;

/**
 * @author xiaohuihui
 * @version 1.0.0
 * @package com.xiaohuihui.entity
 * @description
 * @date 2022/10/28 15:07
 * @Copyright
 * @link
 */
@Data
public class Product {
    private Integer pid;// 商品id
    private String pname;//商品名称
    private Double pprice;//商品价格
    private Integer stock;// 库存

    private Integer port; //端口号
}