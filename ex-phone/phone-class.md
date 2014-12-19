# 設計手機類別（Phone Class）

手機（Phone）是由多種零件組合而成，例如：螢幕（Screen）、處理器（Processor）、記憶體（Memory）等。

```uml
@startuml
class Phone {
    name : String
    price : int
    
    screen : Screen
    processor : Processor
    memory : Memory
}
class Screen {
    inch : double
    width : int
    height : int
}
class Processor {
    core : int
    speed : double
}
class Memory {
    size : int
}

Phone "1" o-right- "1" Screen
Phone "1" o-- "1" Processor
Phone "1" o-- "1" Memory
@enduml
```

## 作業練習

一、參考上面的模型，製作 UML 類別圖（Class Diagram）。

二、找出兩款市售智慧型手機的規格，製作成物件圖（Object Diagram）。

