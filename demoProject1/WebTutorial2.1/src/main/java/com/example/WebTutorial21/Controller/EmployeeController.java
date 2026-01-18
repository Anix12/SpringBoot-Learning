package com.example.WebTutorial21.Controller;

import com.example.WebTutorial21.dto.EmployeeDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

//    @GetMapping("/secreat")
//    public String getSecreatKey(){
//        return "This is secreat key ";
//    }
//
//    @GetMapping("/")
//    public String sayHello(){
//        return "Hello User";
//    }

    @GetMapping("/employee/{employee_Id}")
    public EmployeeDto getEmployee(@PathVariable long employee_Id) {
        return new EmployeeDto(employee_Id, "Aniket", 20, true);
    }

    @GetMapping("/employee")
    public String getAllEmployee(@RequestParam(required = false) int age,
                                 @RequestParam(required = false) String name
    ) {
        return "Hi age" + age + " " + name;
    }


}
