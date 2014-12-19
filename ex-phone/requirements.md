# 系統需求（Requirements）

依據不同的角色，會有不同的使用案例。

消費者（user）

```uml
@startuml
:user: -right-> (打電話)
:user: -right-> (照相)
:user: -right-> (玩Game)
@enduml
```

生產工廠（factory）

```uml
@startuml
:factory: -right-> (製造手機)
@enduml
```

經銷商（reseller）

```uml
@startuml
:reseller: -right-> (賣手機)
@enduml
```

手機規格範例： [Google Nexus 6](http://www.google.com/nexus/6/)

* 螢幕：5.96" 2560x1440
* 處理器：2.7GHz quad-core
* 記憶體：32GB 或 64GB
* 相機：後1300百萬畫素、前200萬畫素

## 作業練習

一、製作使用案例圖（Use Case Diagram），定義手機有些相關的角色（roles）？

二、根據你使用手機的習慣，設計 5 種使用案例（use cases）。



