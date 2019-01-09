/**
 * @Description
 * @auth jiajianyu
 * @create 2019-01-08 16:00
 * @job-number E0100426
 * @email jiajianyu@goldmantis.com
 */
package com.jtl.services.saascloudprovidercrmapi.hystric;

import com.jtl.services.saascloudprovidercrmapi.entity.CWPackage;
import com.jtl.services.saascloudprovidercrmapi.service.TestService;
import org.springframework.stereotype.Component;

@Component
public class TestServiceHystric implements TestService {
    @Override
    public CWPackage getPackage() {
        return null;
    }

}
