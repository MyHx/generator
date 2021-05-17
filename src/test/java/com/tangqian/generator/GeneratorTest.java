/*
 * 文 件 名:  GeneratorMain.java
 * 创 建 人:  tangqian
 * 创建时间:  2014-4-2
 */
package com.tangqian.generator;

import org.junit.Test;

import cn.org.rapid_framework.generator.GeneratorFacade;

/**
 * <一句话功能简述>
 */
public class GeneratorTest {
	@Test
	public void test() throws Exception {
		GeneratorFacade g = new GeneratorFacade();
		g.deleteOutRootDir(); // 删除生成器的输出目录
		g.generateByTable("t_asset_bill_detail", "template"); // 通过数据库表生成文件,template为模板的根目录
	}
}
