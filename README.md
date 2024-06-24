# TaxCalculatorTDD
TestDrivenDevelopment

## Guidance:
* After reading Part I  of Test-Driven Development 3- 4 times, i get a lot of takeaways - from user story come up with ToDo list and then write empty test,
* then fill it with constants and replace with variables, later think about flyweight factory
* and then think about simplicity of a class rather than making the class complex.
* We measure what we have done
* Start exploring implementing interface at core class, then move this responsibility to another class and get that invoked from the core class - implicitly we start building Solid Principles from TDD & we measure our outcome.
* After this reading, i felt i require to try this out on my own but still in a correct manner to think the requirement small (Xtreme Programming), so referred an example as mentioned in the reference section

## Port number 8081 where REST API hosted
## Servlet context path: /TaxCalculator

## SonarLint code analysis warnings removed

## Executing this application
* Download and run the application
* Open Postman and provide this input: http://localhost:8081/TaxCalculator/getTax?income=10&months=5

#Reference
* https://medium.com/@dahamne/test-driven-development-with-java-spring-boot-and-junit5-e8a1188f8029
