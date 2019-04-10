
# 23种设计模式
### 面向对象设计的基本原则：
 1. ocp(开闭原则，open-closed principle)：一个软件的实体应该对扩展开发，对修改关闭
 2. dip(依赖倒转原则，dependency inversion principle)：要求对接口编程，不要针对现实编程
 3. lod(迪米特法则，law of demeter):只与你直接的朋友通信，而避免和陌生人通信
 
### 总结
 工厂模式：
 
    1. 简单工厂模式(不满足ocp原则)
    2. 工厂模式
    
 创建型模式：
 
    3. 单例模式
    4. 工厂模式
    5. 抽象工厂模式
    6. 建造者模式
    7. 原型模式
    
 结构型模型：结构上实现松耦合，可以扩大整体类的结构，用来解决更大问题。
    *适配器模式 
    *桥接模式（多层继承使用桥接模式）
    *装饰模式 （i/o操作）
    *组合模式 （持有对象引用）
    *外观模式 （统一处理）
    *享元模式  
    *代理模式
         分类：1.静态代理（持有真实角色的所有行为，但由真实角色处理的问题静态代理会交由真实角色处理）
               2.动态代理
                     实现方法：a)实现invokeHandler接口，重写invoke方法
                               b)生成代理 Proxy.newProxyInstance(loader, interfaces, handler)
                     原理分析：实则是通过类反射与加载在内存生成了一个proxy$代理类，这个代理类继承了
                               Proxy父类，继承了interface这个接口，所以这个代理类就能向上转型成接口
                               当有接口调用就会调用实现接口的proxy$中的方法，而代理类中的这个方法包
                               含了一个接口方法，这个接口实现的方法就是实现invokeHandler接口的invoke
                               方法，接着再有invoke方法中的反射操作找到真正调用的方法。                   
                               参考于：http://rejoy.iteye.com/blog/1627405        
	 应用场景：
             mybatis与spring
	     安全代理：屏蔽对真实角色的访问
	     远程代理：通过代理类处理远程方法调用
	     延迟加载：先加载轻量级的代理对象，真正需要时在加载真实对象

    
    
 行为型模式：
    *解析器模式（使用范围）：
         el表达式解析
         数学表达式解析
    *访问者模式（使用范围）：
         javac编译器
         xml解析文档
    *模板模式（提供接口）
    *命令模式
    *迭代器模式
    *中介模式    （转述）
    *备忘录模式 （复制对象）
    *状态模式 （不同状态下的不同处理方式）
    *策略模式 （同一问题的不同处理方法）
    *责任链模式   chain of  responsibility
    *观察者模式 Observe
	     应用场景：
	        聊天室，网络游戏，邮件订阅，servlet监听器，Android广播，jdk的awt事件处理模型
	        基于观察者模式的委派事件模型（Dlelgation event）
	           * 事件源---------目标对象
	           * 事件监听器-------观察者