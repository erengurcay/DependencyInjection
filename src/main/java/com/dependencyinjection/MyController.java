package com.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    //Field injection
    @Autowired
    private FirstClass firstClass;

    private SecondClass secondClass;

    private ThirdClass thirdClass;

    //Constructor injection
    public MyController(ThirdClass thirdClass) {
        this.thirdClass = thirdClass;
    }

    @GetMapping("/names")
    public String getNameOfClass(){
        return this.firstClass.getName() + " - " +
                this.secondClass.getName() + " - " +
                this.thirdClass.getName();
    }
    @Autowired //Setter injection
    public void setSecondClass(SecondClass secondClass) {
        this.secondClass = secondClass;
    }






}
