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


    public void m1(){
       System.out.prinltn("m1");
    }
    public void m5(){
      System.out.prinltn("m5");
    }

    public void m2(){
        System.out.prinltn("m2");
    }

   public void m3(){
      System.out.prinltn("m3");
   }


   public void m4(){
      System.out.prinltn("m4");
   }

    public void issue1(){
        System.out.prinltn("issue1");
    }






}
