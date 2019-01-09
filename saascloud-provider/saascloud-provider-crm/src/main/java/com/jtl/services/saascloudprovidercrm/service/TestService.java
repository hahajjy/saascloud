/**
 * @Description
 * @auth jiajianyu
 * @create 2019-01-08 11:16
 * @job-number E0100426
 * @email jiajianyu@goldmantis.com
 */
package com.jtl.services.saascloudprovidercrm.service;

import com.jtl.services.saascloudprovidercrm.dao.CWPackageMapper;
import com.jtl.services.saascloudprovidercrm.entity.CWPackage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestService {
    @Resource
    CWPackageMapper cwPackageMapper;

    public CWPackage getPackage() {
        return cwPackageMapper.selectByPrimaryKey(new Long(1));
    }
}
