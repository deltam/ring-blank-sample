# ring-blank-sample

ring web app sample for docker container

## Usage

start up ring & repl server

```
$ export LEIN_REPL_PORT 3030
$ lein ring server 8088
```

connect

```
$ lein repl :connect localhost:3030
user=> (in-ns 'ring-blank-sample.core)
ring-blank-sample.core=> word
#<Atom@4a9e836d: "">
ring-blank-sample.core=> (reset! word "world")
"world"
```
