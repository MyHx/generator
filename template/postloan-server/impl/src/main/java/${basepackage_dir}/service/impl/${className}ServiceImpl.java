<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.${subpackage}.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ${basepackage}.${subpackage}.domain.${className};
import ${basepackage}.${subpackage}.manager.${className}Manager;
import ${basepackage}.${subpackage}.service.${className}Service;
import com.github.pagehelper.PageInfo;

/**
 * ${table.tableAlias}服务dubbo层实现类
 * @author: ${author}  
 */
@Component
public class ${className}ServiceImpl implements ${className}Service  {

	/**${table.tableAlias} Manager */
    @Autowired
    private ${className}Manager ${classNameLower}Manager;
    
    @Override
    public ${className} get(Integer id){
        ${className} entity = ${classNameLower}Manager.get(id);
        return entity;
    }
    

    @Override
    public void add(${className} entity){
        ${classNameLower}Manager.add(entity);
    }
    

    @Override
    public void update(${className} entity){
        ${classNameLower}Manager.update(entity);
    }
    
    @Override
    public void delete(Integer id){
        ${classNameLower}Manager.delete(id);;
    }
    
    
    @Override
    public PageInfo<${className}> page(${className} cond, int pageNum, int pageSize) {
    	return ${classNameLower}Manager.page(cond, pageNum, pageSize);
    }
    
    @Override
    public List<${className}> list(${className} cond, int pageNum, int pageSize) {
    	return ${classNameLower}Manager.list(cond, pageNum, pageSize);
    }
    
}
