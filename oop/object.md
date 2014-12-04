# 物件（Object）

類別就像做餅乾的模子，讓我們可以用它重複做出外觀相似的餅乾；但是依照添加的內容物不同，也會做出不同的餅乾。但基本上做出來的餅乾都有相似之處，例如同樣的外觀。

回顧上一節定義的 Person 類別。

```uml
@startuml
Class Person {
    String name
    int birthYear

    public void eat()
    public void sleep()
}
@enduml
```

利用 Person 類別產生兩個物件，分別代表兩個人「John」與「Mary」。

```uml
@startuml
object john {
    name = 'John'
    birthYear = 1984
}
object mary {
    name = 'Mary'
    birthYear = 1992
}
@enduml
```

## 練習時間

請利用 BlueJ 的 Person 類別，分別產生多個「人」的物件。
