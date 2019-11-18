package com.ac.springboot;

import com.ac.springboot.dao.UserMapper;
import com.ac.springboot.domain.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

/**
 * @Description: 测试类
 * @author: zhangyadong
 * @Date: 2019/11/18 0018 下午 4:54
 * @version: V1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusTest {

    @Autowired
    private UserMapper userMapper;


    /**
     * @Description 测试查询
     * @params []
     * @return void
     * @author zhangyadong
     * @date 2019/11/18 0018 下午 5:15
     */
    @Test
    public void testSelectOne() {
        User user = userMapper.selectById(1196356027696672769L);
        System.out.println(user);
    }

    /**
     * @Description 测试新增
     * @params []
     * @return void
     * @author zhangyadong
     * @date 2019/11/18 0018 下午 5:15
     */
    @Test
    public void testInsert() {
        User user = new User();
        user.setName("小马");
        user.setAge(26);
        user.setEmail("xiaoma@tooool.org");
        assertThat(userMapper.insert(user)).isGreaterThan(0);
        int b = 1/0;
        // 成功直接拿会写的 ID
        assertThat(user.getId()).isNotNull();
    }

    /**
     * @Description 删除测试
     * @params []
     * @return void
     * @author zhangyadong
     * @date 2019/11/18 0018 下午 5:31
     */
    @Test
    public void testDelete() {
        assertThat(userMapper.deleteById(1196358108046213121L)).isGreaterThan(0);
    }

    /**
     * @Description 更新测试
     * @params []
     * @return void
     * @author zhangyadong
     * @date 2019/11/18 0018 下午 5:31
     */
    @Test
    public void testUpdate() {
        User user = userMapper.selectById(1196358336644132865L);
        assertThat(user.getAge()).isEqualTo(26);
        assertThat(user.getName()).isEqualTo("小马");

        userMapper.update(
                null,
                Wrappers.<User>lambdaUpdate().set(User::getEmail, "123@123").eq(User::getId, 1196358336644132865L)
        );
        assertThat(userMapper.selectById(1196358336644132865L).getEmail()).isEqualTo("123@123");
    }

    /**
     * @Description 查询测试
     * @params []
     * @return void
     * @author zhangyadong
     * @date 2019/11/18 0018 下午 5:30
     */
    @Test
    public void testSelect() {
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    /**
     * @Description 条件查询
     * @params []
     * @return void
     * @author zhangyadong
     * @date 2019/11/18 0018 下午 5:30
     */
    @Test
    public void testSelectCondition() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.select("max(id) as id");
        List<User> userList = userMapper.selectList(wrapper);
        userList.forEach(System.out::println);
    }

    /**
     * @Description 测试分页
     * @params []
     * @return void
     * @author zhangyadong
     * @date 2019/11/18 0018 下午 5:51
     */
    @Test
    public void testPage() {
        System.out.println("----- baseMapper 自带分页 ------");
        Page<User> page = new Page<>(1, 2);
        IPage<User> userIPage = userMapper.selectPage(page, new QueryWrapper<User>()
                .gt("age", 26));
        assertThat(page).isSameAs(userIPage);
        System.out.println("总条数 ------> " + userIPage.getTotal());
        System.out.println("当前页数 ------> " + userIPage.getCurrent());
        System.out.println("当前每页显示数 ------> " + userIPage.getSize());
        print(userIPage.getRecords());
        System.out.println("----- baseMapper 自带分页 ------");
    }

    private <T> void print(List<T> list) {
        if (!CollectionUtils.isEmpty(list)) {
            list.forEach(System.out::println);
        }
    }
}
