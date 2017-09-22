# spring-boot-web-jsp
# 在Sprin-Boot框架中使用JSP作为视图模板
# 注意：
   1.IndexController控制器中只能使用@Controller注解，不能使用@RestController
#
   2.在pom文件中必须注入tomcat-embed-jasper、javax.servlet-api、jstl
#
   3.必须在application.properties文件中配置spring.mvc.view.prefix=/,spring.mvc.view.suffix=.jsp
  
