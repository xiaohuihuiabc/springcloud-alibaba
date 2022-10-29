package xiaohuihui.dao;

import com.xiaohuihui.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author xiaohuihui
 * @version 1.0.0
 * @package com.xiaohuihui.dao
 * @description
 * @date 2022/10/28 15:38
 * @Copyright
 * @link
 */
@Mapper
public interface OrderDao {

    Order queryByOid(@Param("oid") Integer oid);

    int insert(Order order);
}
