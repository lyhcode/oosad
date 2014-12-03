# My Book

Welcome in my book!


This is an exercise:

---

Define a variable `x` equal to 10.

```js
var x =
```

```js
var x = 10;
```

```js
assert(x == 10);
```

```js
// This is context code available everywhere
// The user will be able to call magicFunc in his code
function magicFunc() {
    return 3;
}
```

---

@startuml

Class Stage
Class Timeout {
    +constructor:function(cfg)
    +timeout:function(ctx)
    +overdue:function(ctx)
    +stage: Stage
}
Stage <|-- Timeout
@enduml