package com.training.eg.first;

import org.springframework.web.bind.annotation.*;

//Controller
@RestController
public class HelloWorldController {
    //GET
    //URI - /hello-world

    //Long way
    //@RequestMapping(method= RequestMethod.GET, path="/hello-world")

    //Short way
    @GetMapping(path = "/hello-world")
    //http://<ip>/hello-world
    //Output: hello-world

    public String helloWorld(){
        return "Hello World";
    }


    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world-bean/path/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }


}
