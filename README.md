# 简介

## 采用技术
- mybatis
- [mybatisplus](https://gitee.com/baomidou/mybatis-plus/)
- swagger
- springboot
- hibernate-validator

# 安装
1. 通过git下载项目代码
2. 导入IDE，执行maven install

# 使用
## 引入项目
1. 新建springboot项目,添加springboot依赖
```
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>1.5.2.RELEASE</version>
</parent>
<dependencies>
  	<dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
    </dependency>
</dependencies>
```

2. 添加fast-starter的maven依赖
```
<dependency>
	<groupId>com.zhanghe.fast-stater</groupId>
	<artifactId>fast-spring-boot-starter</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```
3. 添加配置
```
fast.swagger.basepackage = com.zhanghe.demo.controller
spring.datasource.url=jdbc:mysql://172.18.3.16:3306/fast-starter-test?useUnicode=true&characterEncoding=utf-8
spring.datasource.username=root
spring.datasource.password=111111
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
```
配置项列表

配置项 | 说明 | 默认值
---|---|---
fast.swagger.basepackage | swagger扫描的基础包 |

## 编写代码
### 示例项目
[https://gitee.com/SmallBoys/fast-starter](https://gitee.com/SmallBoys/fast-starter)

### 编写controller,service,mapper
#### contoller
和普通springmvc编写一样在类抬头添加`@Controller`注解，在方法抬头添加`@RequestMapping`注解
- 返回值  
返回json数据可以使用`ReturnValue`类
```
return new ReturnValue<User>(1, "").toJson(); 
```
ReturnValue属性说明  

属性 | 类型 | 说明
---|---|---
ret | Integer | 返回值
message | String | 信息
obj | T | 返回的单个对象(在单个对象查询时使用)
result | List<T> | 返回的对象list(在多个对象查询时使用)
page | PageUtil<T> | 返回的带分页的结果(在分页查询时使用)

PageUtil属性说明  

属性 | 类型 | 说明
---|---|---
correntPage | Long | 当前页
pageSize | Long | 每页大小
total | Long | 总数据数
result | List<T> | 返回的对象list

- 使用 hibernate-validator  
在传入vo前加上`@Valid`注解,并添加`BindingResult`参数,在vo中配置验证规则
```
@RequestMapping(value="validate",method=RequestMethod.GET)
@ResponseBody
public String validate(@Valid demoVO vo,BindingResult result){
	return new ReturnValue<User>(1, "").toJson(); 
}

public class demoVO {
	@NotNull
	public String name;
	@Length(min=5,max=16)
	public String password;
	
	public String getName() {
		return name;
	}
	public void setName( String name ) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword( String password ) {
		this.password = password;
	}
}
```
