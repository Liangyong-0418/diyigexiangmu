package com.test.controller;
import com.test.mapper.UserCountMapper;
import com.test.mapper.UserMapper;
import com.test.pojo.UserCount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.xml.ws.Service;
import java.util.Date;
@Controller
public class UserController {
    @Resource
    private UserCountMapper userCountMapper;
    @Resource
    private UserMapper userMapper;
    @RequestMapping("/index.html")
    public String toIndex(Model model){
        int count = userMapper.getUserCount();
        UserCount userCount = new UserCount();
        userCount.setCreateDate(new Date());
        userCount.setCounts(count);
        int i = userCountMapper.addUserCount(userCount);
        System.out.println(i);

        return "index";
    }
}
