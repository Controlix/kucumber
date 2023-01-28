# Common pitfalls

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