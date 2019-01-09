/**
 * @Description
 * @auth jiajianyu
 * @create 2019-01-08 11:15
 * @job-number E0100426
 * @email jiajianyu@goldmantis.com
 */
package com.jtl.services.saascloudprovidercrm.web;

import com.jtl.services.saascloudprovidercrm.entity.CWPackage;
import com.jtl.services.saascloudprovidercrm.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    TestService testService;
    @RequestMapping("/hi")
    public CWPackage home(@RequestParam(value = "name", defaultValue = "forezp") String name) {

        return testService.getPackage();
    }
}
