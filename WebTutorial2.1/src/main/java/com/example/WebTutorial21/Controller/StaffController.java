package com.example.WebTutorial21.Controller;

import com.example.WebTutorial21.dto.EmployeeDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/staff")
public class StaffController {

//    @GetMapping(path = "/{staff_Id}")
//    public String staff_details(){
//        return "Hello";
//    }


    @GetMapping()
    public String ReqParamInput(@RequestParam(required = false, name="UserName") String name){
        return "Hello Mr."+name;
    }

    @GetMapping("/{employee_Id}")
    public EmployeeDto showDetails(@PathVariable(name="employee_Id") long Id){
        return new EmployeeDto(Id, "Aniket", 12, true);
    }

    @PostMapping
    public String sayHello(){
        return "Hello from Post Staff";
    }
}
