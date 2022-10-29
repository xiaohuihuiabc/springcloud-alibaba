package com.xiaohuihui.dao;

import com.xiaohuihui.entity.Product;
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
public interface ProductDao {

    Product queryByPid(@Param("pid") Integer pid);
}
