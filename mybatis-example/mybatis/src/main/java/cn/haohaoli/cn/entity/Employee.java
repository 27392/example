package cn.haohaoli.cn.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author LiWenHao
 */
@Getter
@Setter
@ToString
public class Employee {
    private Integer id;
    private String  name;
    private String  mail;
    private Integer sex;
}
