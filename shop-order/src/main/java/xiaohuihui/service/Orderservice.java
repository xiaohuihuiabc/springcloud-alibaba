package xiaohuihui.service;

import com.xiaohuihui.entity.Order;

/**
 * @author xiaohuihui
 * @version 1.0.0
 * @package com.xiaohuihui.service
 * @description
 * @date 2022/10/28 15:36
 * @Copyright
 * @link
 */
public interface Orderservice {

    Order queryByOid(Integer oid);

    int save(Order order);
}
