# 作業練習一

設計一個「人（Person）」的程式，必須擁有以下功能。

## 需求描述

```uml
@startuml
:person: -right-> (打招呼)
:person: -right-> (吃東西)
:person: -right-> (睡覺)
@enduml
```

```uml
@startuml
:student: -right-> (考試)
:student: -right-> (學習)
@enduml
```

```uml
@startuml
Class Person {
    String name
    int birthYear
    void sayHello()
}
@enduml
```

## 使用 BlueJ 實作

程式碼範例。

```java
class Person {
    String name;
    int birthYear;
    
    void sayHello() {
        System.out.println("Hi, My name is " + name + ".");
    }
}
```

請完成其他功能實作。

