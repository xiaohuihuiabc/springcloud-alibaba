package com.xiaohuihui.entity;

import lombok.Data;

/**
 * @author xiaohuihui
 * @version 1.0.0
 * @package com.xiaohuihui.entity
 * @description
 * @date 2022/10/28 15:05
 * @Copyright
 * @link
 */
@Data
public class User {
    private Integer uid; // 用户id
    private String username;// 用户名
    private String password;// 密码
    private String telephone;// 手机号
}