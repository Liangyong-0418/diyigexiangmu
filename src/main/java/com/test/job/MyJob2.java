package com.test.job;
import com.test.mapper.UserCountMapper;
import com.test.mapper.UserMapper;
import com.test.pojo.UserCount;
import javax.annotation.Resource;
import java.util.Date;

public class MyJob2 {
    @Resource
    private UserMapper userMapper;
    @Resource
    private UserCountMapper userCountMapper;

    public void test(){
        System.out.println("定时任务正在执行。。。。。。");
        int count = userMapper.getUserCount();
        UserCount userCount = new UserCount();
        userCount.setCreateDate(new Date());
        userCount.setCounts(count);
        int i = userCountMapper.addUserCount(userCount);
        System.out.println("执行完毕,添加结果为"+i);
    }
}
