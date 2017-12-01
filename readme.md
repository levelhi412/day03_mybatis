# 说明
---

0. 这是一套Mybatis教程的完整源代码，另一个是最基本的Mybatis环境
   搭建。
1. Mybatis和hibernate的区别？
2. 建立项目后，先导入Mybatis的jar包。
3. jar包整理：
	* asm
	* cglib
	* commons-logging
	* log4j
	* mybatis
	* sl4j-api
	* sl4l-log4j
	* mysql
4. 最基本的是先掌握搭建Mybatis的搭建环境，然后学会做增删改查。
5. 注解式开发，也可以先掌握，但是不知道这个实际是不是使用。
6. 然后就是动态SQL。作为深入了解。
7. 模糊查询：将所查的字段两端的%写在dao里面方法的字符串里面。
8. 最重要的就是如何实现联表查询，即一对一，一对多。
9. 一对一的有两种方式，嵌套查询，嵌套结果。
10. 添加一个对象，返回的主见如何让其返回的是真正的顺序的序号。
<insert id="" parameterType="" useGeneratedKeys="true"
keyProperty="id">
   insert into ...
</insert>

