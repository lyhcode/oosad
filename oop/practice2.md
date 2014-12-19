# 作業練習（二）

在「作業（一）」已設計一個「人」（Person）的類別程式。我們再定義一個「學生」（Student）的類別，利用物件導向的繼承特性，讓「人」的屬性及方法，能夠被學生類別繼承。

## 需求描述

學生除了擁有一般人的屬性與行為外，還可以學習指定的科目。

## 使用 UML 設計

使用案例圖：人。

```uml
@startuml
:person: -right-> (打招呼)
@enduml
```

使用案例圖：學生。

```uml
@startuml
:student: -right-> (學習)
@enduml
```

類別圖。

```uml
@startuml
Class Person {
    String name
    int birthYear
    + void hello()
}

Class Student {
    String school
    +void study()
}

Person <|-- Student
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
    
    void study() {
        //...
    }
}
```

請完成其他功能實作。

