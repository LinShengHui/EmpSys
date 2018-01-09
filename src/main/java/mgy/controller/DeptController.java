package mgy.controller;

import mgy.dto.ValueDto;
import mgy.entity.Dept;
import mgy.service.DeptService;
import mgy.zj.Compapent;
import mgy.zj.Inject;
import web.ActionContext;
import web.ViewReuslt;
import web.annotation.ResultMaping;
import web.view.JsonView;
import web.view.RedirctView;

import java.util.List;

/**
 * Created by Administrator on 2018/1/4.
 */

@Compapent("deptController")
@ResultMaping("dept")
public class DeptController extends ParentDto {

    @Inject("deptService")
    private DeptService deptService;

    @ResultMaping("addDept")
    public ViewReuslt addDept(Dept dept){
        ValueDto vd = new ValueDto();
        try {
            deptService.addDept(dept);
        }catch (Exception e){
            vd = success("500");
        }
        ActionContext.getContext().request.getSession().setAttribute("vd",vd);
        return new RedirctView("/pages/addDept.jsp");
    }

    @ResultMaping("findDept")
    public ViewReuslt findDeptList(){
        ValueDto vd = new ValueDto();
        try {
            List list = deptService.findDept();
            vd = success(list);
        }catch (Exception e){
            vd = error(500,e.getMessage());
        }
        return new JsonView(vd);
    }

}
