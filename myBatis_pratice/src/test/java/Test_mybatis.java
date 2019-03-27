import com.zdh.bean.Items;
import com.zdh.dao.ItemsMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class Test_mybatis {

    @Test
    public void Test01() throws IOException {
    String resource = "configuration.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory ss = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = ss.openSession();

        ItemsMapper itemsMapper = sqlSession.getMapper(ItemsMapper.class);
        itemsMapper.addItems(new Items("5","面包","5"));

        System.out.println("success");
    }

    @Test
    public void Test02() throws IOException {
        String resource = "configuration.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory ss = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = ss.openSession();

        ItemsMapper itemsMapper = sqlSession.getMapper(ItemsMapper.class);

        System.out.println(itemsMapper.findById("1"));
    }
}
