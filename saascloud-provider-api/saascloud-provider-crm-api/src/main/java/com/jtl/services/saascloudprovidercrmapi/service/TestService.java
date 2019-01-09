/**
 * @Description
 * @auth jiajianyu
 * @create 2019-01-08 11:16
 * @job-number E0100426
 * @email jiajianyu@goldmantis.com
 */
package com.jtl.services.saascloudprovidercrmapi.service;

import com.jtl.services.saascloudprovidercrmapi.entity.CWPackage;
import com.jtl.services.saascloudprovidercrmapi.hystric.TestServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "saascloud-provider-crm", fallback = TestServiceHystric.class)
public interface TestService {
    @RequestMapping(value = "/test/hi", method = RequestMethod.GET)
    CWPackage getPackage();
}
