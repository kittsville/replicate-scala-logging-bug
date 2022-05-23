# scala-logging replication

A minimal replication of compilation issue introduced in v3.9.5 that prevents the wrapping of varargs logging methods.

Observe the compilation error when running `sbt run` then downgrade scala-logging to v3.9.4 and see the log message:

```
INFO example.Hello$ - Hello World
```