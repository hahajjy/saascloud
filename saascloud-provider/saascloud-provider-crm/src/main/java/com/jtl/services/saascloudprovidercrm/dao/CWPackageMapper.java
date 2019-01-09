package com.jtl.services.saascloudprovidercrm.dao;

import com.jtl.services.saascloudprovidercrm.entity.CWPackage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CWPackageMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CWPackage record);

    int insertSelective(CWPackage record);

    CWPackage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CWPackage record);

    int updateByPrimaryKey(CWPackage record);
}