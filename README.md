## 问题
dao层注入报错： 
``` java
@Autowired
private BookDao bookDao;
```
在注入BookDao的时候，出现标红提示，提示`can not autoAwired BookDao`，但是不影响使用，要消掉该提示，可以直接按照严格的spring注解方式，
在dao层添加`@Respository`注解；

## 报错"invalid bound statement (not found)解决办法"：
在pom.xml 中要配置resource，不然`mapper.xml`文件会被漏掉！
```xml
<resources>
    <resource>
        <directory>src/main/java</directory>
        <includes>
            <include>**/*.properties</include>
            <include>**/*.xml</include>
        </includes>
        <filtering>false</filtering>
    </resource>
    <resource>
        <directory>src/main/resources</directory>
        <includes>
            <include>**/*.properties</include>
            <include>**/*.xml</include>
        </includes>
        <filtering>false</filtering>
    </resource>
</resources>
```

## 注意点：
在`entity`中，最好不要设置`constructor`函数，不然会报：
```bash
MyBatisSystemException: nested exception is org.apache.ibatis.executor.ExecutorException: 
No constructor found in com.funer.entity.Book matching [......]

```