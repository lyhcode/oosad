# Model-View-Controller Pattern

MVC模式（Model-View-Controller）是軟體工程中的一種軟體架構模式，把軟體系統分為三個基本部分：模型（Model）、檢視（View）和控制器（Controller）。

MVC模式最早由Trygve Reenskaug在1978年提出[1] ，是全錄帕羅奧多研究中心（Xerox PARC）在20世紀80年代為程式語言Smalltalk發明的一種軟體設計模式。MVC模式的目的是實作一種動態的程式設計，使後續對程式的修改和擴充功能簡化，並且使程式某一部分的重複利用成為可能。除此之外，此模式透過對複雜度的簡化，使程式結構更加直覺。軟體系統透過對自身基本部分分離的同時也賦予了各個基本部分應有的功能。專業人員可以透過自身的專長分組：

* （控制器 Controller）- 負責轉發請求，對請求進行處理。
* （檢視 View） - 介面設計人員進行圖形介面設計。
* （模型 Model） - 程式設計師編寫程式應有的功能（實作演算法等等）、資料庫專家進行資料管理和資料庫設計(可以實作具體的功能)。

備註：資料來源 - [維基百科](http://zh.wikipedia.org/zh-tw/MVC)

## Pet Clinic 目錄結構

Models

[src/main/java/org/springframework/samples/petclinic/model](https://github.com/spring-projects/spring-petclinic/tree/master/src/main/java/org/springframework/samples/petclinic/model)

Views

[/src/main/webapp/WEB-INF/jsp](https://github.com/spring-projects/spring-petclinic/tree/master/src/main/webapp/WEB-INF/jsp)

Controllers

[/src/main/java/org/springframework/samples/petclinic/web](https://github.com/spring-projects/spring-petclinic/tree/master/src/main/java/org/springframework/samples/petclinic/web)

