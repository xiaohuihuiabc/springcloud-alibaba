package xiaohuihui.service.impl;

import com.xiaohuihui.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiaohuihui.dao.OrderDao;
import xiaohuihui.service.Orderservice;

/**
 * @author xiaohuihui
 * @version 1.0.0
 * @package com.xiaohuihui.service.impl
 * @description
 * @date 2022/10/28 15:37
 * @Copyright
 * @link
 */
@Service
public class OrderserviceImpl implements Orderservice {
    @Autowired
    private OrderDao orderDao;

    @Override
    public Order queryByOid(Integer oid) {
        return orderDao.queryByOid(oid);
    }

    @Override
    public int save(Order order) {
        return orderDao.insert(order);
    }
}