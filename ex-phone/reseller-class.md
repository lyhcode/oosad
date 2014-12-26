# 經銷商（Reseller）

經銷商可以從工廠訂製手機，請實作進貨（stock）的方法，將手機放到倉庫存放。。

```uml
@startuml
class Reseller {
    phones : List<Phone>
    + stock(name : String)
}
Reseller "0..1" -- "0..*" Phone
@enduml
```

## 作業練習

一、設計經銷商的 UML 類別圖。

二、使用 BlueJ 實作經銷商的程式碼。