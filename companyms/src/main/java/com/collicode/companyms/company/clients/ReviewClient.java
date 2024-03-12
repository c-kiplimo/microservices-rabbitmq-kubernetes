package com.collicode.companyms.company.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "REVIEW-SERVICE"
,url = "${review-service.url}")
public interface ReviewClient {
  @GetMapping("/reviews/averageRating")
  Double getAverageRating(@RequestParam long companyId);

}
