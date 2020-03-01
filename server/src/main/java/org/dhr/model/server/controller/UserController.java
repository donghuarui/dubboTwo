package org.dhr.model.server.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.dhr.one.api.service.UserService;
import org.dhr.one.model.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Reference
    private UserService userService;

    @RequestMapping("/findUser")
    @ResponseBody
    public User findUser() {
        User user = userService.findUserByUsername("ez");
        return user;
    }
}
