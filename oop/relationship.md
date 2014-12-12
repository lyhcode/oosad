# 關係

物件之間的關係可以簡化成兩種：

1. 聚合（aggregation）
2. 關聯（association）

分辨兩者之間是哪一種關係？

```uml
@startuml
駕駛 -right- 車輛
@enduml
```

這個呢？

```uml
@startuml
汽車 -right- 引擎
@enduml
```