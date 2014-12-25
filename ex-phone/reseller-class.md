# 經銷商（Reseller）

經銷商可以從工廠訂購（purchase）手機，放到倉庫存放。

```uml
@startuml
class Reseller {
    stock : List<Phone>
    + purchase(name: String)
}
Reseller "0..1" -- "0..*" Phone
@enduml
```

## 作業練習

一、設計經銷商的 UML 類別圖。

二、使用 BlueJ 實作經銷商的程式碼。