replik
======

A toy app to test debug-repl in Clojure


```clojure
➜  replik git:(master) lein run -- cmdline arguments

dr-1-1001 => (use 'alex-and-georges.debug-repl)
nil

dr-1-1001 => *locals*
{args ("cmdline" "arguments"), x 1, y 2, counter__56__auto__ 1001}

dr-1-1001 => args
("cmdline" "arguments")

dr-1-1001 => y
2

dr-1-1001 => ()
➜  replik git:(master)
```
