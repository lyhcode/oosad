# 繼承

子類別繼承來自父類別的屬性和方法。繼承可以減少重複不必要的程式碼，也可以擴充類別的功能。

```uml
@startuml
Class Person {
    String name
    int birthYear

    public void sayHello()
}

Person <|-- Teacher
Person <|-- Student
@enduml
```

## 練習時間

使用 BlueJ 定義 Teacher 與 Student 兩個類別，讓這兩個類別繼承 Person 父類別。