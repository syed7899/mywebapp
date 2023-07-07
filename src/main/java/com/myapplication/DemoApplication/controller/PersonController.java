package com.myapplication.DemoApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Person")
public class PersonController {


   public void changedMethodReflectedInBrowser(){
      System.out.prinltn("changedMethodReflectedInBrowser");
   }


    public void m5(){
      System.out.prinltn("m5");
    }










}
