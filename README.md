drake-interface
===============

Defines Drake interfaces.

Contains a small collecton of Drake interfaces (techncially, Clojure protocols). These can be implemented for
the purpose of extending Drake, such as with plugins.

## Protocol

Drake defines a Clojure protocol named (confusingly enough) `Protocol`.
The Protocol protocol (sorry) defines the interface for a Drake step.
You may want to implement the Protocol protocol (sorry) in your plugin,
should you want to teach Drake how to handle a step like:

```
out.txt <- in.txt [myprotocol]
```


## FileSystem

Drake defines a Clojure protocol named `FileSystem`.
The FileSystem protocol defines the interface between Drake and specific filesystems
such as HDFS, S3, and whatever someone may want to add on with a plugin.
