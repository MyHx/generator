<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.${subpackage}.manager;

import org.springframework.stereotype.Component;

import ${basepackage}.${subpackage}.exception.BusinessException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ${basepackage}.${subpackage}.dao.${className}Dao;
import ${basepackage}.${subpackage}.domain.${className};

/**
 * ${table.tableAlias} Manager
 * @author ${author}
 *
 */
@Component
public class ${className}Manager {
    /**${table.tableAlias} dao */
    @Autowired
    private ${className}Dao ${classNameLower}Dao;
    
     /**
     * 根据主键ID，查询${table.tableAlias}
     * @param id 主键ID
     * @return ${table.tableAlias}对象
     */
    public ${className} get(Integer id){
        ${className} entity = ${classNameLower}Dao.get(id);
        return entity;
    }
    

    /**
     * 保存${table.tableAlias}对象到数据库
     * @param entity ${table.tableAlias}对象
     */
    public void add(${className} entity){
        ${classNameLower}Dao.add(entity);
    }
    

    /**
     * 更新${table.tableAlias}对象到数据库
     * @param entity ${table.tableAlias}对象
     * @return 更新记录数
     */
    public void update(${className} entity){
        int cnt =  ${classNameLower}Dao.update(entity);
        if(cnt != 1){
            throw new BusinessException("更新${table.tableAlias}对象到数据库失败,entity:"+entity);
        }
    }
    
    /**
     * 设置${table.tableAlias}对象状态“无效”
     * @param id 主键ID
     */
    public void delete(Integer id){
        int cnt = ${classNameLower}Dao.delete(id);;
        if(cnt != 1){
            throw new BusinessException("设置${table.tableAlias}对象状态“无效”失败,ID:"+id);
        }
    }
    
    /**
     * 分页查询${table.tableAlias}记录
     * @param cond 查询条件
     * @param pageNum 分页索引
     * @param pageSize 分页大小
     * @return
     */
    public PageInfo<${className}> page(${className} cond, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, true);
        List<${className}> list = this.list(cond);
        return new PageInfo<${className}>(list);
    }
    
    
    /**
     * 分页查询${table.tableAlias}记录
     * @param cond 查询条件
     * @param pageNum 分页索引
     * @param pageSize 分页大小
     * @return
     */
    public List<${className}> list(${className} cond, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, false);
        List<${className}> list = this.list(cond);
        return list;
    }
    
    
    /**
     * 查询${table.tableAlias}记录
     * @param cond 查询条件
     * @return
     */
    public List<${className}> list(${className} cond) {
        List<${className}> list = ${classNameLower}Dao.list(cond);
        return list;
    }
    
    
    /**
     * 分页查询${table.tableAlias}记录数量
     * @param cond 查询条件
     * @param pageNum 分页索引
     * @param pageSize 分页大小
     * @return
     */
    public int count(${className} cond) {
        int cnt = ${classNameLower}Dao.count(cond);
        return cnt;
    }
    
    
}
