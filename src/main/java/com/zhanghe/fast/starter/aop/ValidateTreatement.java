package com.zhanghe.fast.starter.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import com.zhanghe.fast.starter.util.ReturnValue;
/**  
 * ValidateTreatement
 *   
 * @author Clevo  
 * @date 2017/12/11 21:28
 */  
@Aspect
@Configuration
public class ValidateTreatement {
	
	 /**
     *定义一个切入点.
     *解释下：
     *
     * ~第一个 * 代表任意修饰符及任意返回值.
     * ~第二个 * 任意包名
     * ~第三个 * 代表任意方法.
     * ~第四个 * 定义在web包或者子包
     * ~第五个 * 任意方法
     * ~ ..匹配任意数量的参数.
     */
     @Pointcut("execution(* *..controller.*.*(..))")
     public void ControllerAOP(){}
     
     @Around("ControllerAOP()")
     public Object ControllerAOPAround(ProceedingJoinPoint pjp) throws Throwable{
    	 System.out.println("---");
         Object[] args = pjp.getArgs();
         for(Object arg:args){
        	 if(arg instanceof BindingResult){
        		 BindingResult result = (BindingResult) arg;
				 //验证出错
        		 if (result.getErrorCount() > 0) {
        				ReturnValue<String> errorresult = new ReturnValue<String>(-2, "参数验证不通过！");
        				String errormsg = "";
        				for (FieldError error : result.getFieldErrors()) {
        	                errormsg+=error.getField() + ":" + error.getDefaultMessage()+",";
        	            }
        				errorresult.setObj(errormsg);
        				return errorresult.toJson();
        		}
        	 }
         }
         return pjp.proceed();
     }
     
}
