# springboot-protobuffer-jersey-sample

This is sample application written in SpringBoot, which use Jersey for REST end points. 

This is demo application which demonstrate very simple end points

- Plain Text
- JSON
- XML
- Protocol Buffer


```
mvn clean install

java -jar target/springboot-protobuffer-jersey-sample-0.0.1-SNAPSHOT.jar

curl http://localhost:8080/text

curl http://localhost:8080/json | json_pp

curl http://localhost:8080/xml > 1.xml ; xmllint --format 1.xml

curl http://localhost:8080/proto
```