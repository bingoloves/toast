# toast
toast统一工具

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
   repositories {
       maven { url 'https://jitpack.io' }
   }
}
```
Step 2. Add the dependency
```gradle
dependencies {
    implementation 'com.github.bingoloves:toast:1.0.0'
}
```
**使用示例**
```java
// 初始化吐司工具类
ToastUtils.init(this, new ToastAliPayStyle(this));
//普通使用
ToastUtils.show(xxx);
```
