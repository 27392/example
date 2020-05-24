package cn.haohaoli.cn.mapper;

import cn.haohaoli.cn.entity.Employee;

/**
 * @author LiWenHao
 */
public interface EmployeeMapper {

    Employee selectById(Integer id);
}
