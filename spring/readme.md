# Api Spring 🍃

## Run: 🏃‍♂️

```bash
$ mvn clean install
$ mvn spring-boot:run
```


## Test: 🧪

```bash
$ curl -X POST -H "Content-Type:application/json" -H "Accept:application/json" -d '{ "a":"a" }' http://localhost:8080/rest/users/new
# Expected: { "result": "ok" }
```
