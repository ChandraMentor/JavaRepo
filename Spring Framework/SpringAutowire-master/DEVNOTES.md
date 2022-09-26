# Development Notes

* How to run this code
  * Execute this class: ...\src\main\java\Driver.java

* https://coderanch.com/u/244875/Tim-Nachreiner says:

Your problem exists because this annotation:
```java
    @Autowired
    @Qualifier("differentColors")
    private Color color;
```
was not being recognized by this:

````xml
<bean class="org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor" />
````

you should stick with the industry standard of this:

````xml
<context:annotation-config />
````

But in order to use this, you need to include the 'context' namespace to your applicationContext.xml.  So, use this:

````xml
<beans 
    xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    
    xsi:schemaLocation="http://www.springframework.org/schema/beans 
        http://www.springframework.org/schema/beans/spring-beans-3.2.xsd
        http://www.springframework.org/schema/context 
        http://www.springframework.org/schema/context/spring-context.xsd">
````

Notice the additional 3 lines that reference 'context'. 

This resulted in fixing my problem.  
  * I have decided, for no reason, to use AutowiredAnnotationBeanPostProcessor
  * I had cleaned up applicationContext.xml removing the Context entries
  * So the original post works, if you use annotation-context solution 