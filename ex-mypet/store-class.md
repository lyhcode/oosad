# The Store Class

Store 類別是「寵物店」，擁有店名（name）與商店主人（shopkeeper）屬性。寵物店提供 `show()` 方法，由商店主人向顧客介紹店內的寵物。

```uml
@startuml
class Store {
    name : String
    shopkeeper : Shopkeeper
    pets : List<Pet>
    
    + show(customer : Customer) : void
    + sell(customer : Customer, pet : Pet) : void
}
@enduml
```

## 作業練習

一、修改 UML 類別圖，加入 Store 類別。

二、在 BlueJ 實作 Store 類別。
