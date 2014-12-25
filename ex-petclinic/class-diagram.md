# 建立類別圖（Class Diagram）

利用前一節找到的實體，參考 Model 程式碼的內容，分別加上屬性欄位。

例如飼主（Owner）的程式碼如下（摘錄）：

```java
@Entity
@Table(name = "owners")
public class Owner extends Person {
    @Column(name = "address")
    @NotEmpty
    private String address;

    @Column(name = "city")
    @NotEmpty
    private String city;

    @Column(name = "telephone")
    @NotEmpty
    @Digits(fraction = 0, integer = 10)
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets;
}
```

設計 Owner 類別。

```uml
@startuml
class Person <<entity>>
class Owner <<entity>> {
    address: String
    city: String
    telephone: String
    pets: Set<Pet>
}
Person <|-- Owner
@enduml
```

## 作業練習

一、完成每個實體的類別設計。

二、繪製盡可能接近完整的類別圖。