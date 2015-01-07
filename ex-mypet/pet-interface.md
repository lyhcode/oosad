# The Pet Interface

```uml
@startuml
interface Pet <<interface>> {
    + eat() : void
    + play() : void
    + show() : void
}
Pet <|.. Dog
Pet <|.. Cat
@enduml
```

## 作業練習

一、修改 UML 類別圖，加入 Pet 介面（interface）。

二、在 BlueJ 加入 Pet 介面。

三、修改貓與狗類別，讓它們實現 Pet 介面。