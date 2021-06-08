<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${basepackage}.${baseentity}.domain.${className};
import ${basepackage}.${basedao}.mapper.${className}Mapper;
import ${basepackage}.${subpackage}.service.${className}Service;
import com.github.pagehelper.PageInfo;

/**
 * ${table.tableAlias}服务dubbo层实现类
 * @author: ${author}  
 */
@Service
public class ${className}ServiceImpl implements ${className}Service  {

	/**${table.tableAlias} Manager */
    @Autowired
    private ${className}Mapper ${classNameLower}Mapper;
    
}
