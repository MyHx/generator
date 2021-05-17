<#include "/macro.include"/>
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.${baseentity};

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * ${table.tableAlias}
 * @version 1.0
 * @author ${author}
 */
@Data
@Table(name = "${tableName}")
public class ${className} implements Serializable {
	
	<#list table.columns as column>
	<#if column.columnNameLower == 'id'>
	/** ${column.columnAlias} */
	@Id
	@Column(name = "${column.sqlName}")
	private ${column.simpleJavaType} ${column.columnNameLower};
	</#if>

	/** ${column.columnAlias} */
	@Column(name = "${column.sqlName}")
	private ${column.simpleJavaType} ${column.columnNameLower};

	</#list>
}