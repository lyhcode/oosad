# 手機工廠（Factory）

定義一個生產手機的「工廠」類別（Factory Class）。

```uml
@startuml
class Factory {
    +{static} make(name : String) : Phone
}
@enduml
```

`make()` 是工廠類別提供的「靜態方法」，亦稱為「類別方法」；即不需要產生 Factory 的物件，就可以直接呼叫這個方法。

```java
Factory.make("iphone6");
Factory.make("nexus6");
```

## 作業練習

一、繪製手機工廠類別（Factory Class）

二、使用 BlueJ 實作手機工廠的程式。