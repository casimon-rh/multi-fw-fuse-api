# Api Karaf

## Dependencies:

```bash
karaf@root()> feature:install aries-blueprint
karaf@root()> feature:install camel
karaf@root()> feature:install camel-netty-http
karaf@root()> feature:install camel-swagger-java
```

## Run:

```bash
karaf@root()> bundle:install mvn:com.redhat/api-karaf
# Expected ID
karaf@root()> bundle:start ${ID}
```

## Test:

```bash
$ curl -X POST -H "Content-Type:application/json" -H "Accept:application/json" -d '{ "a":"a" }' http://localhost:8008/rest/users/new
# Expected: { "result": "ok" }
```