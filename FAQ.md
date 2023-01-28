# Common pitfalls

See also [Best Practices and Common Pitfalls of Using JPA (Hibernate) with Kotlin](https://www.jpa-buddy.com/blog/best-practices-and-common-pitfalls/)

#### Q. Why do I get
```
Jan 28, 2023 11:26:02 AM io.cucumber.core.runtime.FeaturePathFeatureSupplier get
WARNING: No features found at file:/home/marc/workspace/kucumber/src/test/resources/cucumber/basket.features
```
#### A. I used the extenstion `.features` but it should be  `.feature` (without trailing s)

#### Q. Why to I get
```
io.cucumber.core.exception.CucumberException: No backends were found. Please make sure you have a backend module on your CLASSPATH.
```
#### A. I forgot to add the `cucumber-java` dependency
```xml
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
</dependency>
```
#### Q. Where did `javax.persistence.Entity` go?
#### A. It was replaced by `jakarta.persistence.Entity`; in fact the whole `javax.persistence` package was replaced by `jakarta.persistence`
#### Q. Why do I get
```
Configuration problem: @Configuration class 'Application' may not be final. Remove the final modifier to continue.
```
#### A. This happens after I add the 'kotlin-maven-plugin'
The way to get rid of this is to

either define the Application class as 'open'

or configure the kotlin-maven-plugin to make all classes open as show on [Kotlin-allopen and Spring
](https://www.baeldung.com/kotlin/allopen-spring "Baeldung")