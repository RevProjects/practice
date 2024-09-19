package com.practice.controller;

import com.practice.model.Cards;
import com.practice.service.SetService;
import com.practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/set")
public class SetController {
    @Autowired
    SetService setService;

    @Autowired
    SetController(SetService setService){
        this.setService = setService;
    }

    @RequestMapping
    public String hello() {
        return "Hello, World! From the backend Set controller";
    }
    @GetMapping("/card/{id}")
    public Cards getCardById(@PathVariable int id) {
        return setService.getCardById(id);
    }

    @PostMapping("/check")
    public String isASet(@RequestBody List<Cards> cards){
        if(setService.checkIfSet(cards)){
            return "It is a set";
        }else{
            return "Is not a set";
        }
    }


}
