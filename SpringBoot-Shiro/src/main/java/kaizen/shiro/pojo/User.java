package kaizen.shiro.pojo;

import lombok.Data;

import java.util.List;

/**
 * @Author: weizujie
 * @Date: 2020/12/2
 * @Github: https://github.com/weizujie
 */


@Data
public class User {

    private Integer id;
    private String username;
    private String password;
    private String salt;

    /**
     * 定义角色的集合
     */
    private List<Role> roles;

}
