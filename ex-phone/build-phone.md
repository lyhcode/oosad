# Build Your Phone

幫 Phone 類別加入一個 `show()` 方法。

```uml
@startuml
class Phone {
    name : String
    price : int
    
    screen : Screen
    processor : Processor
    memory : Memory
    camera : Camera

    + show() : void
}
@enduml
```

## 作業練習

一、參考下面的程式範例，完成 `show()` 方法的實作。


```java
void show() {
    if (screen != null) {
        System.out.println("螢幕尺寸：" + screen.inch + "吋");
        System.out.println("螢幕解析度：" + screen.width + " x " + screen.height);
    }
    else {
        System.out.println("沒有螢幕！");
    }
    
    // ...請完成剩下的程式碼...
}
```

二、在 BlueJ 產生手機物件，並執行 `show()` 方法顯示手機的相關資訊。

輸出格式範例：

```
螢幕尺寸：5.0
螢幕解析度：1024 x 768
處理器時脈：2.3GHz
...
```
