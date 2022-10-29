package com.xiaohuihui.service.impl;

import com.xiaohuihui.dao.ProductDao;
import com.xiaohuihui.entity.Product;
import com.xiaohuihui.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class ProductserviceImpl implements Productservice {
    @Autowired
    private ProductDao productDao;

    @Override
    public Product queryByPid(Integer pid) {
        return productDao.queryByPid(pid);
    }
}