package cn.itcast.user.service;

import cn.itcast.user.mapper.UserMapper;
import cn.itcast.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    //获取端口
    @Value("${server.port}")
    private Integer port;

    public User queryById(Long id) {

        User user = userMapper.findById(id);
        user.setAddress(port.toString());
        return user;

    }
}