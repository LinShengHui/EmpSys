package mgy.controller;

import mgy.dto.ValueDto;
import mgy.entity.Emp;
import mgy.service.EmpService;
import mgy.zj.Compapent;
import mgy.zj.Inject;
import web.ViewReuslt;
import web.annotation.ResultMaping;
import web.view.JsonView;
import web.view.RedirctView;

import java.util.List;

/**
 * Created by Administrator on 2018/1/4.
 */
@Compapent("empController")
@ResultMaping("emp")
public class EmpController extends  ParentDto{

    @Inject("empService")
    private EmpService empService;

    @ResultMaping("addEmp")
    public ViewReuslt addEmp(Emp emp){
        ValueDto vd = new ValueDto();
        try {
            empService.addEmp(emp);
        }catch (Exception e){
            vd = error(500,e.getMessage());
        }
        return new RedirctView("/pages/findEmp.jsp");
    }

    @ResultMaping("findEmp")
    public ViewReuslt findEmp(){
        ValueDto vd = new ValueDto();
        try {
            List list = empService.findEmp();
            vd = success(list);
        }catch (Exception e){
            vd = error(500,e.getMessage());
        }
        return new JsonView(vd);
    }

    @ResultMaping("removeEmp")
    public ViewReuslt removeEmp(Emp emp){
        ValueDto vd = new ValueDto();
        try {
            empService.remover(emp.getEno());
        }catch (Exception e){
            vd = error(500,e.getMessage());
        }
        return new RedirctView("/pages/findEmp.jsp");
    }
}
