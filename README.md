# purescript-aff-promise

Simple library for interop between Aff and JavaScript promises.

## Java port

The PureScript bridge uses the Java Aff and Promise runtimes: `fromAff` starts a
fiber when its Effect is forced, while `toAff` subscribes when its Aff is run.
Cancelling that wait does not cancel the producer of the Promise. Rejections may
be Java Throwables, strings or other objects; `toAff'` supplies custom coercion.
See the [bridge contract](../javapurs/docs/ffi-runtime.md#pont-aff--promise).

`./bin/test-runtime` builds an isolated PureScript fixture and runs it with typed
records and Maps. It awaits final completion and propagates failures to the JVM
exit status. Prerequisites: the sibling compiler built with `./bin/build`, local
Java ports, a TAST-capable `purs`, Spago, Node and a JDK.

# This library has moved

New versions of this library are published as [purescript-js-promise-aff](https://github.com/purescript-contrib/purescript-js-promise-aff/). Use earlier versions as published here only if you must satisfy dependencies referencing the old version/module name.
