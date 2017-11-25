package com.bussanq.group.alpha.common.db;

/**
 * 数据源集合对象
 *
 * @author lizh
 * @date 2017-4-18
 */
public class DataSourceHolder{
	//数据源标识保存在线程变量中，避免多线程操作数据源时互相干扰
	static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
	 
	/**
	 * 设置数据库
	 * @param dbType
	 */
    public static void setDbType(String dbType) {
           contextHolder.set(dbType);  
    }  
 
    /**
     * 获取数据库
     * @return
     */
    public static String getDbType() {
           return ((String) contextHolder.get());
    }  
 
    /**
     * 清除数据库选择
     */
    public static void clearDbType() {  
           contextHolder.remove();  
    } 
}
