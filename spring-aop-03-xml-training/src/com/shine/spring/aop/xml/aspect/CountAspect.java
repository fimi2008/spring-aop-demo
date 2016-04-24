package com.shine.spring.aop.xml.aspect;

import java.util.Map;

import org.aspectj.lang.JoinPoint;

import com.shine.spring.aop.xml.utils.JdbcUtils;

/**
 * 记录action,servcie,dao层中方法的调用次数
 * @author xiang_wang
 *
 * 2016年4月24日
 */
public class CountAspect {

	public void countAdvice(JoinPoint joinPoint){
		String className = joinPoint.getTarget().getClass().getSimpleName();
		String methodName = joinPoint.getSignature().getName();
		Map<String, Object> map = JdbcUtils.getCount(className, methodName);
		if (null == map || map.isEmpty()){
			System.out.println("新增+++++++++++");
			JdbcUtils.insertCount(className, methodName);
		}else{
			System.out.println("更新UUUUUUUUUUU");
			Long id = Long.parseLong(map.get("id")+"");
			int count = Integer.parseInt(map.get("count")+"") + 1;
			JdbcUtils.updateCount(id, count);
		}
	}
}
