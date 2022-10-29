package com.xiaohuihui.service;

import com.xiaohuihui.entity.Product;

/**
 * @author xiaohuihui
 * @version 1.0.0
 * @package com.xiaohuihui.service
 * @description
 * @date 2022/10/28 15:36
 * @Copyright
 * @link
 */
public interface Productservice {

    Product queryByPid(Integer pid);
}
