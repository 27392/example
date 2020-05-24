import cn.haohaoli.cn.entity.Employee;
import cn.haohaoli.cn.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author LiWenHao
 */
public class MybatisTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void builderSqlSessionFactory() throws IOException {
        String      resource    = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void query() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            Employee employee = session.selectOne("cn.haohaoli.cn.mapper.EmployeeMapper.selectById", 1);
            System.out.println(employee);
        }

        try (SqlSession session = sqlSessionFactory.openSession()) {
            EmployeeMapper mapper   = session.getMapper(EmployeeMapper.class);
            System.out.println(mapper);
            Employee       employee = mapper.selectById(1);
            System.out.println(employee);
        }
    }
}
