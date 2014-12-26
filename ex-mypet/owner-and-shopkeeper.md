# The Customer and Shopkeeper

顧客（Customer）是飼養寵物的人，可以養多隻寵物並且跟他們玩（play）。

顧客和寵物店主人（Shopkeeper）都繼承人（Person）類別。

```uml
@startuml
class Customer {
    pets : List<Pet>
    
    + play() : void
}
Person <|-- Customer
Person <|-- Shopkeeper
@enduml
```

## 作業練習

一、加入 Customer 與 Shopkeeper 到 UML 類別圖。

二、在 BlueJ 實作 Customer 與 Shopkeeper 類別。
