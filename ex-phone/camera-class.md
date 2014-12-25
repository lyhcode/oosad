# 相機類別（Camera Class）

```uml
@startuml
class Phone {
    camera : Camera
}
class Camera {
    len : Len
}
class Len {
    pixel : int
}
Phone "1" o-- "0..1" Camera
Camera "1" o-right- "1" Len
@enduml
```

## 作業練習

一、修改類別圖，加入相機與鏡頭類別。

二、修改物件圖，加入相機與鏡頭的物件。