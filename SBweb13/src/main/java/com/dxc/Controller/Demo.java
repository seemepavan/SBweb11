package com.dxc.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Demo {
      @RequestMapping("home")
      public String view()
      {
    	  return "Hello";
      }
     
}
