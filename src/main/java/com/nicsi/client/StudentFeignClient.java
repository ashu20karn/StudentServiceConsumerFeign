package com.nicsi.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="STUDENT-PROVIDER")
public interface StudentFeignClient 
{
  @GetMapping("/show")
  public String getMsg();
}


