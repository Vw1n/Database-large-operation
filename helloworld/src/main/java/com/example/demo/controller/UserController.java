package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.utils.JwtUtils;
import com.example.demo.utils.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @PostMapping("/login")
    public Result login(@RequestBody User user){

        String token = JwtUtils.generateToken(user.getUsername());
        return Result.ok().data("token",token);
    }

    @GetMapping("/info")    //"token:xxx"
    public Result info(String token){
        String username = JwtUtils.getClaimsByToken(token).getSubject();
        String url = "https://cdn.jsdelivr.net/gh/B1ANKC-MOV/HttpImg@master/20240111/JWT.4hjlgrgmo8a0.webp";
        return Result.ok().data("name",username).data("avatar",url);
    }

    @PostMapping("/logout") //"token:xxx"
    public Result logout(){ return Result.ok();}

    //  如果想要使用Mapper，则需要进行声明，定义一个属性↓，并使用@Autowired注入userMapper使其不为空
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user/findAll")
    public List<User> find(){
        return userMapper.selectAllUserAndOrders();
    }

    //  条件查询(不用SQL语句而使用Mybatis的内置类↓)
    @GetMapping("/user/find")
    public List<User> findByCond(){
        QueryWrapper<User> queryWrapper = new QueryWrapper();
        queryWrapper.eq("username","BC");
        return userMapper.selectList(queryWrapper);
    }

    //  分页查询(不用SQL语句而使用Mybatis的内置类↓)[情景： 比如说查某表的1-10条数据 select * from xx limit 0,10]
    @GetMapping("/user/findByPage")
    public IPage findByPage(){
        //  设置起始值及每页条数
        Page<User> page = new Page<>(0,2);/*←从第几条开始取，取几条*/
        IPage iPage = userMapper.selectPage(page,null);
        return iPage;
    }

    @GetMapping("/user")
    public List query(){
        List<User> list = userMapper.find();
//      使用Mybatis自带的方法，根据条件查询（此处条件为null，即全查）↓
        List<User> listPlus = userMapper.selectList(null);
        System.out.println(list);
        System.out.println(listPlus);
        return list;
    }

    @PostMapping("/user")
    public String save(User user){
        int i = userMapper.insert(user);
        System.out.println(user);
        if(i>0){
            return "插入成功";
        }else{
            return "插入失败";
        }
    }

    @ApiOperation("获取用户")
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable int id){
        /*由于RESTFUL风格的接口提倡使用/user/10类似的URL传输参数，而非/user?id=10,此种传参为动态显示的，故需要加上注解@PathVariable，否则只能拿到以?形式传输的参数*/
        System.out.println(id);
        return "根据ID获取用户信息";
    }
    @PutMapping("/user")
    public String update(User user){
        return "更新用户";
    }
    @DeleteMapping("/user/{id}")
    public String deleteById(@PathVariable int id){
        System.out.println(id);
        return "根据ID删除用户";
    }
/*    @PostMapping("/user")
    public String save(User user){
        return "添加用户";
    }*/
}