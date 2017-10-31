## 问题
dao层注入报错： 
``` java
@Autowired
private BookDao bookDao;
```
在注入BookDao的时候，出现标红提示，提示`can not autoAwired BookDao`，但是不影响使用，要消掉该提示，可以直接按照严格的spring注解方式，
在dao层添加`@Respository`注解；

## 报错"Result Maps collection does not contain value for"：

只是通过注解方式，写了查询的语句，但是没有配置`ResultMap`， 配置`ResultMap`就好了；
```xml

```