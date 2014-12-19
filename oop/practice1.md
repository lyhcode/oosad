# 作業練習（一）

使用物件導向設計出一個「人」（Person）的系統。

## 需求描述

* 每個人都擁有自己的名字與出生年份。
* 在打招呼時自我介紹，說出自己的名字以及年齡。

## 使用 UML 設計

使用案例圖。

```uml
@startuml
:person: -right-> (打招呼)
@enduml
```

類別圖。 sadad

```uml
@startuml
Class Person {
    String name
    int birthYear
    + void hello()
}
@enduml
```

## 使用 BlueJ 實作

程式碼範例。

```java
class Person {
    String name;
    int birthYear;
    
    void hello() {
        System.out.println("Hi, My name is " + name + ".");
    }
}
```

請參考需求描述與 UML 設計將程式功能完成。

