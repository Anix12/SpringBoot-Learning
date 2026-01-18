package com.example.WebTutorial21.Controller;

import com.example.WebTutorial21.dto.EmployeeDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/employee") //It is like parent class base url which all their child class append it
public class EmployeeController {

    @GetMapping(path = "/secreat")
    public String getSecreatKey() {
        return "This is secreat key ";
    }

//    @GetMapping
//    public String sayHello(){
//        return "Hello User";
//    }

    @GetMapping(path = "/{employee_Id}")
    public EmployeeDto getEmployee(@PathVariable(name = "employee_Id") long Id) { //rename the path variable name=id instead of employee_Id
        return new EmployeeDto(Id, "Aniket", 20, true); //employee/123
    }

    @GetMapping()
    public String getAllEmployee(@RequestParam(required = false, name = "input_age") Integer age, //req Param takes the input from url itself like ?age=12
                                 @RequestParam(required = false) String name
    ) {
        return "Hi age" + age + " " + name;
    }

    @PostMapping
    public String helloPost(){
        return "Say hello Post Request";
    }
}
