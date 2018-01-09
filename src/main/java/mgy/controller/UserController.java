package mgy.controller;

import mgy.dto.ValueDto;
import mgy.entity.User;
import mgy.exception.LoginException;
import mgy.service.UserService;
import mgy.service.impl.LoginServiceImpl;
import mgy.zj.Compapent;
import mgy.zj.Inject;
import web.ActionContext;
import web.ViewReuslt;
import web.annotation.ResultMaping;
import web.view.JsonView;
import web.view.RedirctView;

@Compapent("userController")
@ResultMaping("user")
public class UserController extends ParentDto {

    @Inject("loginService")
    private LoginServiceImpl loginService;

    @Inject("userService")
    private UserService userService;

    @ResultMaping("login")
    public ViewReuslt login(User user){
        ValueDto vd = new ValueDto();
        try {
            user = loginService.login(user);
            System.out.println(user.getName());
            vd = success(user);
            ActionContext.getContext().request.getSession().setAttribute("user",user);
        } catch (LoginException e) {
            vd = error(500,e.getMessage());
        }
        return new JsonView(vd);
    }

    @ResultMaping("addUser")
    public ViewReuslt addUser(User user){
        System.out.println(user.getName());
        ValueDto vd = new ValueDto();
        if(userService.addUser(user)){
            vd = success("200");
        }
        ActionContext.getContext().request.getSession().setAttribute("vd",vd);
        return new RedirctView("/main.jsp");

    }
}
