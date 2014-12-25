# Entity Relationship

實體關係塑模（Entity Relationship Modeling）是系統設計的第一步，在 Pet Clinic 的範例中，Model-View-Controller 架構其中的 Model 就是指實體。

什麼是實體？

從需求描述中識別出「實體」（entity），通常是那些用「名詞」表示的東西，而且有被保存的需要。

以寵物診所來說，「寵物」（Pet）和「獸醫」（Vet）都是經常出現的名詞。我們在系統中，必須建立「寵物」的類別來保存寵物的資料，在執行階段就是記憶體中的物件資料。

通常實體就是那些需要被「放進資料庫」保存的物件，所以在實務中，關聯式資料庫的資料表會對應到所屬的「實體」。

## 找出實體

從 [Pet Clinic Models](https://github.com/spring-projects/spring-petclinic/tree/master/src/main/java/org/springframework/samples/petclinic/model) 查看有哪些類別？

```uml
@startuml
class Owner
class Person
class Pet
class PetType
class Specialty
class Vet
class Visit
@enduml
```

## 作業練習

一、從程式碼的觀察、實際操作經驗中，將上述找到的實體，繪製成實體關係圖（Entity Relationship Diagram）。

提示：使用 UML 的類別圖（Class Diagram）。

二、標示這些實體之間的關係，是一對一或是一對多？

範例：飼主（Owner）與寵物（Pet）之間的關係。

```uml
@startuml
Owner "1" -- "0..*" Pet
@enduml
```

