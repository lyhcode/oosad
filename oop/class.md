# 類別（Class）

什麼是類別？

> 「對一組擁有相同屬性、動作、方法、關係與行為的物件的一段描述。」

用類別定義一個「人（Person）」，有名字和生日，這些是一個人的「屬性（attributes）」。

```uml
@startuml
Class Person {
    String name
    Date birthDay
}
@enduml
```

人可以有擁有「方法（methods）」，例如吃（eat）和睡（sleep）。
 
```uml
@startuml
Class Person {
    String name
    Date birthDay

    public void eat()
    public void sleep()
}
@enduml
```

程式 = 資料 + 處理

類別的屬性用來儲存「資料」，而方法就是用來「處理」這些資料。

## 練習時間

請利用 BlueJ 製作一個 Person 類別。
