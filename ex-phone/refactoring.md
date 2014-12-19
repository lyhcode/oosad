# 重構（Refactoring）

重構是系統分析與設計經常進行的一項活動。

在螢幕（Screen）類別增加關於解析度計算的方法。

```uml
@startuml
class Screen {
    inch : double
    width : int
    height : int
    
    +dpi() : double
    +isRetina() : boolean
}
@enduml
```

說明

* `dpi()` 計算螢幕解析度
* `isRetina()` 判斷是否為 [Retina](http://zh.wikipedia.org/wiki/Retina%E6%98%BE%E7%A4%BA%E5%B1%8F) 顯示器（解析度 >= 300dpi）

解析度計算公式參考維基百科「[每英寸像素](http://zh.wikipedia.org/wiki/%E6%AF%8F%E8%8B%B1%E5%AF%B8%E5%83%8F%E7%B4%A0)」。

```java
Math.sqrt(width*width+height*height)/inch;
```

## 作業練習

一、修改螢幕（Screen）類別，加入 `dpi()` 與 `isRetina()` 兩種方法。

二、修改 BlueJ 程式，實作 `dpi()` 與 `isRetina()` 兩個方法。

