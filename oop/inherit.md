# 繼承

子類別繼承來自父類別的屬性和方法。繼承可以減少重複不必要的程式碼，也可以擴充類別的功能。

例如，貓（Cat）與狗（Dog）的類別都繼承自動物（Animal）這個父類別，因此動物的屬性與行為也會在貓與狗的物件中存在。

```uml
@startuml
Animal <|-- Dog
Animal <|-- Cat
@enduml
```

繼承表示兩個類別之間存在一種 **is-a** 的關係，以上述的例子來說，可以這樣講：

1. 貓是一種動物（Cat is an Animal.）
2. 狗是一種動物（Dog is an Animal.）

## 練習時間

使用 BlueJ 定義 Dog 與 Cat 兩個類別，讓這兩個類別繼承 Animal 父類別。