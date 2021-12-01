JAVA和C有什么区别

![image-20210312203117375](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312203117375.png)

![image-20210315021354868](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210315021354868.png)

C面向底层 控制管理内存和指针

冯.诺依曼体系结构	

![image-20210301225410216](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210301225410216.png)

#### 基本的DOS方式

地址栏前 加CMD+空格

```
#切换盘符D:
#查看当前目录下的所有文件 dir
#切换目录  cd /d f: 
cd /d E:\IDE
cd .. #返回上一级
cls #清除屏幕
exit #退出终端
config #查询当前ip
calc #打开计算机
notepad #打开记事本
md test #创建文件夹
del a.txt
rd test #删除文件夹
```

#### 计算机语言历史

第一代语言 机器语言

第二代语言 汇编语言

第三代语言 摩尔定律

高级语言

面向过程c语言 和 面向对象 c++、JAVA 面向对象的过程中离不开面向过程

##### c语言 指针和内存管理 缺点

没有工具 导致容易越界检查  内存管理需要自己分配空间自行释放 这些问题在编译时无法发现 在运行时才会暴露 实际上c语言要求要尽可能的去用标准的c的函数库  每个平台有不同的c的函数库

c++ 在图形领域和游戏有用

#### JAVA涉及的领域

JAVA  语法像c 没有指针 没有内存管理 真正可移植性，编写一次到处运行 每个系统之上安装JVM环境即可运行程序

图形界面程序（Applet）让网页更好 

J2SE 占领桌面

J2ME 占领手机

J2EE 占领服务器

##### 三高问题：高可用、高性能、高并发

构建工具：Ant，Maven，Jekins

应用服务器：Tomcat，Jetty，Jboss，Websphere，weblogic

web开发：Stuts，Spring，Hibernate，myBatis

开发工具：Eclipse,Netbean,intellij idea, Jbuilder



Hadoop(大数据领域)

Audroid（手机端）

#### JAVA的特性和优势

简单性 没有指针运算 没有分配内存

面向对象

可移植性

高性能 即时编译 

分布式 可以处理很多TCPIV 协议

动态性 反射机制 

多线程 

安全性 

健壮性 每次编译会对内存进行检查

JAVA为啥成功 迎合机遇

#### JAVA三大版本 JAVASE JAVAME JAVAEE

JavaSE：标准版（桌面程序控制台开发

JacaME: 嵌入式开发

JavaEE：E企业级开发（web端，服务期开发

#### JDK JRE JVM

JDK：Java Development Kit

JRE：Java Runtime Environment

JVM: JAVA Virtual Machine

<img src="C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210302002533233.png" alt="image-20210302002533233" style="zoom:200%;" />

#### 安装环境配置

卸载JDK

1. 删除Java的安装目录
2. 删除JAVA_HOME
3. 删除path下关于java的目录
4. java -version 检查

安装JDK

1. 下载安装

2. 配置环境变量-->JAVA_HOME

3. 配置path变量 %JAVA_JPME%\bin

   %JAVA_HOME%\jre\bin

4. java -version

5. nodepad++

6. JAVA文件bin (放置可执行程序)

   include（存放头文件，引用c语言的头文件

   jre（环境配置文件

   lib（库文件

   src （源代码

7. IDEA软件设置

   ![image-20210302234638459](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210302234638459.png)

   ![image-20210302234746360](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210302234746360.png)

   ![image-20210302234840535](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210302234840535.png)

#### Helloworld

```java
public class Hello{
	public static void main(String[] arg){
	System.out.print("Hello,World");
	}
}
```



遇到的问题

1. 大小写问题
2. 尽量使用英文
3. 文件名和类名保证一致
4. 符号使用了中文（应该使用英文符号

#### JAVA环境运行机制 编译型和解释型

![image-20210302004734097](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210302004734097.png)

图 程序运行机制

源程序（*.java文件）-> JAVA编译器 -> 字节码    *.cless文件) -> 类装载器 -> 字节码校验器 -> 解释器 -> 操作系统平台 

#### IDEA安装

什么是IDE 集成开发环境 用于提供程序开发环境的应用程序 Eclipse



### JAVA语法基础

#### 注释、标识符、关键字

1. 书写注释是一个非常好的习惯

2. psvm

   1. ```java
      public static void main(String[] args) {
          
      }
      ```

3. sout

   1. ```java
      System.out.println();
      ```

4. Ctrl+d 复制当前到下一行

5. 100.f 100次循环

   ```
   for (int i = 0; i < 100; i++) {
       
   }
   ```

6. alt+回车 编译器提示 超级好用！！！！

7. try+catch 选中语句 Ctal+ alt +T

8. shift+Ctrl+a 编辑字体大小

9. ![image-20210310234340834](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210310234340834.png)

10. hmtl 输入类型 再按tab 有奇效

    ```html
    <html></html>
    ```

    

####  数据类型

![image-20210302170526902](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210302170526902.png)

1. 标识符以字母 $ 下划线（_） 开头
2. 不能使用关键字作为变量名或方法名
3. 标识符大小写敏感

#### 类型类型

1. 强类型语言

   1. 要求变量的使用要严格符合规定，所有变量后要先定义再使用

2. 弱类型语言

   1. JS

3. Java的数据类型分为两大类

   1. ##### 基本类型（primitive type）

      + 数值类型

        + ###### 整数类型

          + byte占1个字节范围：-128-127  	2^7 -1
          + short占2个字节范围：-32768-32767  2^15-1
          + int占4个字节范围：-2147483648-2147483647 2^31-1
          + long占8个字节范围：-9223372036854775808-9223372036854775807 2^63 -1

        + 浮点类型

          + float占4个字节
          + double占8个字节

        + 字符类型char占2个字节

      + boolean类型：占1位其值只有ture和false两个

   2. 引用数据类型

      + 类
      + 接口
      + 数组

      ```
      //整数
      int num1 = 10;
      byte num2 = 20;
      short num3 = 30;
      long num4 = 40L;//Kong类型要在数字后面加个L
      //小数：浮点数
      float num5 = 50.
      ```

#### 什么是字节

+ 位（bit）:是计算机内部数据存储的最小单位，11001100是一个八位二进制数。
+ 字节(byte):是计算机中数据处理的基本单位，习惯上用大写B来表示
+ 1B (byte,字节) = 8bit（位）
+ 字符：是指计算机中使用的字母，数字，字，和符号
  + 1bit 表示1位 = 8bit
  + 1024B= 1Kb
  + 1024Kb= 1M
  + 1024M=1G

1. 引用类型（reference type）
   + 类
   + 接口
   + 数组

```java
public class HelloWorld {
    public static void main(String[] args) {
    //整数扩展： 进制  二进制0b  十进制  八进制0  十六进制
        int i = 10;
        int i2 = 010; //八进制0
        int i3 = 0x10;//十六进制0x
        //浮点数扩展？ 银行业务怎么表示钱？
        //BigDecimal 类 数学工具类

        //浮点数
        //float 有限 离散 舍入误差 大约数 接近但不等于
        /*
        float f = 0.1f;
        double d  = 1.o/10;
        System.out.println(f==d);
        //输出结果为Flase

        float d1 = 12121212f;
        float d2 = d1 + 1;
        System.out.println(d1 == d2);
        //输出结果为ture
        */
        //double
        //最好完全使用浮点数进行比较
        //最好完全使用浮点数进行比较
        //最好完全使用浮点数进行比较
    }
```



#### 变量、常量

1. 变量：就是可以变化的量

2. Java是一种强类型语言，每个变量都必须声明其类型

3. Java变量是程序中最基本的存储单位，其要素包括变量名，变量类型和作用域

   + 注意事项：
     + 每个变量都有类型，类型可以是基本类型，也可以是引用类型
     + 变量名必须是合法的标识符

   ```
   
   ```

4. 局部变量:只在函数中有效，必须声明和初始化值

5. 实例变量：从属于对象

6. 常量：初始化后不能再改变值！不会变动的值

   + 常量名一般使用大写字符

7. 命名规范

   + 所有变量、方法、类名：见名知意

   + 类成员变量：首字母小写和驼峰原则：monthSalary,后面的单词首字母大写

   + 局部变量：首字母小写和驼峰原则

   + 常量：大写字母和下划线：MAX_VALUE

   + 类名：首字母大写和驼峰原则，Man，GoodMan

   + 方法名：首字母小写和驼峰原则：run(),runRun();

     ```java
     public class Bianliang {
         //实例变量：从属于对象
         //布尔值：默认是false
         //除了基本类型，其余的默认值都是null；
         String name;
         int age;
         //修饰符final 不存在先后顺序
         static final double PI = 3.14;
         //main方法
         public static void main(String[] args) {
             //局部变量：必须声明和初始化值
             int i = 10;
             System.out.println(i);
             System.out.println(name);
             //类变量 static
         }
     }
     ```

final用于声明属性，方法和类，分别表示属性不可交变，方法不可覆盖，类不可继承。
finally是异常处理语句结构的一部分，表示总是执行。
finalize是Object类的一个方法，在垃圾收集器执行的时候会调用被回收对象的此方法，供垃圾收集时的其他资源回收，例如关闭文件等。

#### 运算符 （优先级()）

1. 算术运算符：+ - *  / % ++ --、

   + a++ 先赋值后+1 ++a 先自增 后赋值 

   + 幂运算Math

     很多运算用运算工具计算

     ```java
     Math.pow(2,3);//等同于2^3
     ```

2. 赋值运算符=

3. 关系运算符：> < >= <= == != instanceof

4. 逻辑运算符：&&(与两个变量为真才为真，前一条件为假直接是假，短路运算) ||(或) ！(非)

   + &是两个都判断 &&短路运算 同理 | 和||

5. 位运算符：&  |  ^  ~ >> <<  >>>

6. 条件运算符 ？ ：

   + x ? y :z

     如果x == true 结果为y 否则为z

7. 扩展赋值运算符： +=  -= *=  /=

   + 字符串连接 + ，String

   + ```java
     int a = 10;
     int b = 20;
     System.out.println(""+a+b);
     //结果为1020
     System.out.println(a+b+"");
     //结果为30
     ```

8. 运算中如果有一个值为long或者double那么结果都为long或者double

   运算顺序：**算术运算符>关系运算符>逻辑运算符>赋值运算符**

#### 包机制

为了更好地组织类，包机制用于区别类名的命名空间

+ 一般利用公司域名倒置作为包名
  + www.baidu.com 包名 com.baidu

+ import 导入包内容

####  JavaDoc生产文档

```java
@author moning //作者名
@version 1.0 //版本号
@since 1.8 //指明需要最早使用的Jdk版本
@param 参数名
@return 返回值情况
@throws 异常抛出情况
```

+ cmd 

  + javadoc -encoding UTF-8 -charset UTF-8 Doc.java

    打印整个项目的包以及类

### JAVA流程控制

#### 用户交互Scanner类

1. java.util.Scanner 是Java5的新特性 用Scanner类来获取用户的输入

   ```
   Scanner s = new 
   ```

2. next()

   + 一定要读取到有效字符后才可以结束输入
   + 对输入有效字符之前遇到的空白，next()方法会自动将其去掉
   + 只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符
   + next()不能得到带有字符的字符串

3. nextLine():

   + 以Enter为结束符 也就是说 nextLine()方法返回的是输入回车之前的所有字符
   + 可以获得空白

4. 记得关闭方法，像关水一样

   ```java
   scanner.close();
   ```

   ```java
   public static void main(String[] args) {
       //创建一个扫描器对象，用于接收键盘数据
       Scanner scanner = new Scanner(System.in);
       System.out.println("使用next方式接受： ");
       //判断用户有没有输入字符串
       if (scanner.hasNextLine()){
           //使用next方式接收
           String str = scanner.nextLine();//程序会等待用户
           System.out.println("用户输出的结构"+str);
       }
       scanner.close();
   }
   ```

![image-20210303160730583](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210303160730583.png)

```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //从键盘接受数据
    int i= 0;
    float f = 0.0f;
    System.out.println("请输入整数：");
    if (scanner.hasNextInt()){
        i = scanner.nextInt();
        System.out.println("整数数据 " + i);
    }else {
        System.out.println("输入的不是整数");
    }
    System.out.println("请输入小数：");
    if (scanner.hasNextFloat()){
        f = scanner.nextFloat();
        System.out.println("输入的小数为："+ f);
    }else {
        System.out.println("输入的不是小数：");
    }
    scanner.close();
}
```

自己写的计算输入的值：

```java
public static void main(String[] args) {
    //输入多个数字，并且求出总和和平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果
    Scanner scanner = new Scanner(System.in);
    double sum = 0;
    int m = 0;
    double x = 0;
    while (sum >= 0){
        System.out.println("请输入数字： 非数字结束运算");
        if (scanner.hasNextDouble()) {
            x = scanner.nextDouble();
            sum = sum + x;
            m++;
        } else {
            System.out.println(m + "个数字的总和为："+ sum +";"+ m+"个数的平均值为：" + sum / m);
            break;
        }
        System.out.println("输入第"+ m +"个数");
    }
    scanner.close();
}
```

老师写的

```java
public static void main(String[] args) {
    //输入多个数字，并且求出总和和平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果
    Scanner scanner = new Scanner(System.in);
    double sum = 0;
    int m = 0;
    double x = 0;
    System.out.println("请输入数字： 非数字结束运算");
    while (scanner.hasNextDouble()){
        x = scanner.nextDouble();
        sum = sum + x;
        m++;
        System.out.println("输入第"+ m +"个数");
    }
    System.out.println(m + "个数字的总和为："+ sum +";"+ m+"个数的平均值为：" + sum / m);
    scanner.close();
}
```

#### 顺序结构

1. Java的基本结构为顺序结构
2. 语句与语句之间，框与框之间是按从上到下的顺序进行的，它是由若干个依次执行的处理步骤组成的，它是任何一个算法都离不开的一种基本算法结构

#### 选择结构

1. if 单选择结构

   + if(布尔表达式)
   + equals：判断字符串是否相等

2. if 双选择结构

3. if 多选择结构

   + 如果一个else if 为ture 则后边的if语句不再执行

4. 嵌套的if结构

5. switch多选择结构

   ```
   switch(expression){
   	case value:
   }
   ```

   + case穿透，switch 匹配一个具体的值，若没有break，则将后续case的代码运行

   + jdk 7才支持 case 表达式结果为字符串

   + 反编译 java--- class（字节码文件） ---反编译(IDEA)

     ![image-20210303171614461](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210303171614461.png)![image-20210303173038425](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210303173038425.png)

   ![image-20210303172757131](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210303172757131.png)![image-20210303190835933](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210303190835933.png)

#### 循环结构

1. while是最基本的循环，他的结构为：

   ```java
   while(布尔表达式){
   	//循环内容
   }
   ```

   + 只要布尔表达式为true，循环就会一直执行下去

   + 我们大多数情况是会让循环停止下来的，我们需要一个让表达式失效的方式来结束循环

   + 少部分情况需要循环一直执行，比如服务器的请求响应监听等

   + 循环条件一直为true就会造成无限循环[死循环]，我们正常的业务编程中应该尽量避免死循环，会影响程序性能或者造成卡死崩溃

   + 伪代码 就是假代码

     ```
     while(ture){
     
     }
     ```

     这个就是死循环，尽量避免死循环

##### do...while 

+ do 至少执行一次

##### for循环

+ //初始化 //条件判断 //迭代

+ for循环是支持迭代的一种通用结构，是最有效，最灵活的循环结构

+ for循环的循环次数是在执行前就已经确定的了

  + ```java
    for(初始化: 布尔表达式; 更新){
    
    }
    ```

  + 死循环

    ```
    for(; ; ){
    
    }
    ```

##### 计算奇，偶数对应的和

自己写的

```java
public static void main(String[] args) {
    //计算奇，偶数对应的和
    int i;
    int j;
    double x = 0;
    double y = 0;
    for (i=0  ; i<=100 ; i++){
        while (i%2 == 0){
            x=x+i;
            break;
            }
        while(i%2 !=0){
            y=y+i;
            break;
            }
        }
    System.out.println("偶数总和为："+x);
    System.out.println("奇数总和为："+y);
    }
```

老师写的

```java
public static void main(String[] args) {
    //计算奇，偶数对应的和
    int oddSum = 0;
    int evenSum = 0;
    for (int i = 0; i <= 100; i++) {
        if (i%2 != 0){
            oddSum = oddSum+i;
        }else{
            evenSum= evenSum+i;
        }
    }
    System.out.println("100中奇数合为："+oddSum);
    System.out.println("100中偶数合为："+evenSum);
}
```

##### 遍历数组

```java
public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40, 50};
    for (int i = 0; i < 5; i++) {
        System.out.println(numbers[i]);
    }
    System.out.println("============");
    //遍历数组的元素
    for (int x : numbers) {
        //java5新引入的 用于数组或集合的增强型for循环
        System.out.println(x);
    }
```

#### break&continue

1. break在任何循环语句的主体部分，均可在break控制循环的流程，break用于强行推出循环，不执行循环中剩余的部分

2. continue,在循环语句中，用于终止某次循环，跳过循环体中尚未执行的语句，接着进行下一次是否循环的判定。

3. goto 标签 理解

   ```java
   public static void main(String[] args) {
       //打印101-150之间所有的质数
       //质数是指大于1的自然数中，除了1和它本身以外不再有其他因数的自然数
       int count = 0;
       //不建议使用
       outer:for (int i = 101; i < 150; i++) {
           for (int j = 0; j < i/2; j++) {
               continue outer;
           }
           System.out.println(i+" ");
       }
   }
   ```

##### 三角形练习

1. ```java
   System.out.print("*");
   //输出不换行
   System.out.println();
   //换行输出
   ```

2. ```java
   public static void main(String[] args) {
       //打印三角形
   
       for (int i = 1; i <= 5; i++) {
           for (int j = 5; j >= i; j--) {
               System.out.print("0");
           }
           for (int j = 1; j <= i; j++){
               System.out.print("!");
           }
           for (int j = 1; j < i; j++) {
               System.out.print("*");
           }
           for (int j = 5; j > i; j--) {
               System.out.print("1");
           }
           System.out.println();
       }
   }
   ```

   输出结果

   ![image-20210303233730859](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210303233730859.png)

### Java方法

#### 何为方法

1. System.out.println();System 是类 标准输出out中的println()方法

2. Java方法是语句的集合，他们在一起执行一个功能

   + 方法是解决一类问题的步骤的有序组合
   + 方法包含于类或对象中
   + 方法在程序中被创建，在其他地方被引用

3. 设计方法的原则：方法的本意是功能块，就是视线某个功能的语句块的集合。我们设计方法的时候，最好保持方法的原子性，就是一个方法只完成1个功能，这样利于我们后期的扩展。

4. 方法的命名规则：首字母小写后面字母驼峰原则

   ```java
   public static void main(String[] args) {
       //命名1个方法并且调用他
       int sum = add(3, 5);
       System.out.println(sum);
   }
   public  static int add(int a, int b){
       return a+b;
   ```

#### 方法的定义及调用

1. Java的方法类似于其他语言的函数，是用一段用来完成特定功能的代码片段

2. 方法包含一个方法头和一个方法体

   + 修饰符：修饰符可选，告诉编译器如何调用该方法。定义了该方法的访问类型
   + 返回值类型：方法可能会返回值。returnValueType是方法返回值的数据类型。有些方法执行所需的操作，但没有返回值。在这种情况下，returnValurType是关键字void
   + 方法名：是方法的实际名称。方法名和参数表共同构成方法签名。
   + 参数类型：参数像是一个占位符。当方法被调用时，传递值给参数。参数类型、顺序和参数的个数。参数是可选的，方法可以不包含任何参数
     + 形式参数：在方法被调用时用于接受外界输入的数据
     + 实参：调用方法时实际传给方法的数据
   + 方法体：方法体包含具体的语句，定义该方法的功能。

3. 实际参数：实际调用传递给函数

   ```java
   public static void main(String[] args) {
           //用户输入两个数，运用方法把两数的最大值比较出来
           System.out.println("输入两个需要比较的数字");
           int h=getmath();
           int z=getmath();
           int max = max(h,z);
           System.out.println("两数字最大值为"+max);
       }
       public static int getmath(){
           int x;
           int y=0;
           Scanner scanner = new Scanner(System.in);
           if (scanner.hasNextInt()){
               x= scanner.nextInt();
               y = x;
           }else{
               System.out.println("请输入数字！！！");
               return 0;
           }
           return y;
       }
       public static int max(int num1,int num2){
           int result = 0;
           if (num1 == num2){
               System.out.println("两数值相等");
               return 0;
           }
           else if (num1 < num2){
               result = num2;
           }
           else if (num1 >num2){
               result = num1;
           }
           return result;
       }
   ```

    值传递（Java是值传递）和引用传递

#### 方法重载

1. 重载就是在一个类中，有相同的函数名称，但形参不同的函数
2. 方法重载的规则：
   + 方法名称必须相同
   + 参数列表必须不同（个数不同、或类型不同、参数排列顺序不同等）
   + 方法的返回类型可以相同
   + 仅仅返回类型不同不足以成为方法的重载
3. 实现理论
   + 方法名称相同时，编译器会根据调用方法的参数个数、参数类型等去逐个匹配，以选择对应的方法，如果匹配失败，则编译器报错。

#### 命令行传参

​	

```java
public static void main(String[] args) {
    for (int i = 0 ; i < args .length ; i++) {
        System.out.println("args[" + i + "]: "+args[i]);
    }
}
//args.length 数组长度
        //在命令行中打出javac Demo03.java
        //在src 目录下 输入 java base.method.Demo03 This is Moning
/*args[0]: This
args[1]: is
args[2]: MoNing*/
```

#### 可变参数

1. JDK1.5后开始出现，Java支持传递同类型的可变参数给一个方法

2. 在方法声明中，在指定参数类型后加一个省略号（…）

3. 一个方法中只能指定一个可变参数，他必须是方法的最后一个参数。任何普通的参数必须在它之前声明。

   ```java
   public static void main(String[] args) {
       //调用可变参数的方法
       printMax(34,4,5,6,73,56.5);
       printMax(new double[]{1,2,3});
   }
   public static void printMax(double... numbers){
       if (numbers.length == 0 ){
           System.out.println("No argument passed");
           return;
       }
        double result = numbers[0];
   
       //排序
       for (int i = 1; i < numbers.length; i++){
           if (numbers[i] > result){
               result = numbers[i];
           }
       }
       System.out.println("The Max value is "+ result);
   }
   ```

#### 递归

1. A方法调用B方法
2. 递归就是：A方法调用A方法！就是自己调用自己
3. 利用递归可以用简单的程序来解决一些复杂的问题。它通常把一个大型复杂的问题层层转化为一个与原问题相似的规模较小的问题来求解，递归策略只需少量的程序就可描述出解题过程所需要的多次重复计算，大大地减少程序的代码量。递归的能力在于用有限的语句来定义对象的无限集合
4. 递归结构包括两个部分
   + 递归头：什么时候不调用自身方法，如果没有头，将陷入死循环
   + 递归体：什么时候需要调用自身方法。

5. 栈方法：物理上会崩溃，少用递归

### 数组

1. 数组是相同类型数据的有序集合
2. 数组描述的是相同类型的若干个数据，按照一定的先后次序排列组合而成。
3. 其中，每一个数据称作一个数组元素，每个数组元素可以通过一个下标来访问它们。

#### 数组声明创建

​	1.创建数组并且声明

```java
int[] nums ;
```

```java
int[] nums = new  int[10];
```

2. 获取数组长度array.length

   ```java
   for (int i = 0; i < nums.length; i++) {
       sum = sum +nums[i];
   }
   ```

3. ```java
   public static void main(String[] args) {
           //声明一个数组
           int[] nums;
           //创建一个数组
           nums = new int[10];
           //两者合1
   //        int[] nums = new  int[10];
           //给数组赋值
           nums[0]=1;
           nums[1]=2;
           nums[2]=3;
           nums[3]=4;
           nums[4]=5;
           nums[5]=6;
           nums[6]=7;
           nums[7]=8;
           nums[8]=9;
           nums[9]=10;
           //计算所有元素的和
           int sum = 0;
           //获取数组长度
           for (int i = 0; i < nums.length; i++) {
               sum = sum +nums[i];
           }
           System.out.println("数组总和为："+sum);
       }
   ```

#### 数组使用

##### 三种初始化以及内存分析

1. 堆

   + 存放new的对象和数组（声明数组时，栈会开辟这个数组，创建数组时会在堆中创建数组的空间）

   + ![image-20210304181608145](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210304181608145.png)

     数组异常越界，这个问题直接想我的数组是不是超出了
     
   + 可以被所有的线程共享，不会存放别的对象引用

2. 栈

   + 存放基本变量类型（会包含这个基本类型的具体数值）
   + 引用对象的变量（会存放这个引用在堆里面的具体地址）

3. 方法区

   + 可以被所有的线程共享
   + 包含了所以的class和static变量

4. 三种静态初始化

   ![image-20210304185202948](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210304185202948.png)

   + 静态初始化

     ```java
     int[] nums={1,2,3};
     Man[] mans={new Man(1,1),new Man(2,2)}
     ```

   + 动态初始化

     ```java
     int[] a = new int[2];
     a[0]=1;
     a[1]=2;
     ```

   + 数组的默认初始值

     + 数组时引用类型，它的元素相当于类的实例变量，因此数组一经分配空间，其中的每个元素也被按照实例变量同样的方法被隐式初始值

##### 数组的四个基本特点

1. 其长度都是确定的。数组一旦创建，它的大小就是不可以改变的

2. 其元素必须是相同类型，不允许出现混合类型

3. 数组中的元素可以时任何数据类型，包括基本类型和引用类型

4. 数组变量属引用类型，数组也可以看成时对象，数组中的每个元素相当于该对象的成员变量。

   数组本身就是变量，Java中对象是在堆中的，因此无论保存原始类型还是其他对象类型，数组对象本身是在堆中的。

##### 数组的使用

1. for each循环

   + ```java
     for (int array : arrays) {   
             }
             //增强型for循环，不再有下标
     ```

     

2. 数组作方法入参

3. 数组作返回值

   ```java
   public static void main(String[] args) {
       int[] arrays = {1,2,3,4,5};
       //JDK1,5 没有下标
       for (int array : arrays) {
           System.out.print(array);
       }
       System.out.println("================");
       printArray(reverse(arrays));
   }
   public static  void printArray(int[] arrays){
       for (int i = 0; i < arrays.length; i++) {
           System.out.print(arrays[i]+"");
       }
   }
   //反转数组 static void 的意思是返回一个值
   public static int[] reverse(int[] arrays){
       int[] result = new int[arrays.length];
       //反转操作
       for (int i = 0, j = arrays.length-1; i < arrays.length; i++, j--) {
           result[j] = arrays[i];
       }
       return result;
   }
   ```

#### 多维数组

1. 多维数组可以看成数组的数组，其中每个元素都是1维数组

2. ```java
   int a[][] = new int[2][3];
   ```

   

​	![image-20210305005923732](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210305005923732.png)

```java
public static void main(String[] args) {
    int[][] arrays = {{1,2},{3,4},{5,6},{7,8}};
    printArray(arrays[0]);
    System.out.println(arrays[0][0]);
    System.out.println(arrays.length);
    System.out.println(arrays[0].length);
}
//数组可以量化
public static  void printArray(int[] arrays){
    for (int i = 0; i < arrays.length; i++) {
        System.out.print(arrays[i]+" ");
    }
}
//结果1 2 1
//4
//2
//想写一个遍历多维数组的方法，失败了 重载也写不出来
//可以借助Arrary工具类的toString方法
```

#### Arrays类

1. 数组的工具类java.util.array
2. 由于数组对象本身并没有什么方法可以供我们调用，但API中提供了一个工具类Arrays供我们使用，从而可以对数据对象进行一些基本的操作
3. 查看JDK帮助文档
4. Arrays类中的方法都是static修饰的静态方法，在使用的时候可以直接使用类名进行调用，而“不用”使用对象来调用（不用但不代表不能）
5. Arrays类具有以下常用功能
   + 给数组赋值：通过fill方法
   + 对数组排序：通过sort方法，按升序
   + 比较数组：通过equals方法比较数组中元素值是否相等
     equals和== 的区别
     +  ==是判断两个变量或实例是不是指向同一个内存空间，equals是判断两个变量或实例所指向的内存空间的值是不是相同 
     + ==是指对内存地址进行比较 ， equals()是对字符串的内容进行比较
     + ==指引用是否相同， equals()指的是值是否相同
     + String类型之所以equals会比较值内容是因为它重写了，博主应该对底层原理挖得更深一点才对
   + 查找数组元素：通过binarySearch方法能对排序好的数组进行二分查找法操作

##### 如何查看新的类对应的知识

![image-20210305010723166](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210305010723166.png)

![image-20210305010926772](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210305010926772.png)

#### 冒泡排序

1. 总共有八大排序

2. 冒泡排序两层循环，外层冒泡轮数，里层依次比较

3. 我们看到嵌套循环，应该立马就可以得出这个算法的时间复杂度位O(n2)

4. ```java
   public static void main(String[] args) {
       //冒泡排序
       //1.比较数组中，两个相邻的元素，如果第一个数比第二个数大，我们就交换他们的位置
       //2。每一次比较，都会产生一个最大，或者最小的数字
       //3。下一轮则可以少一次排序
       //4.依次循环，知道结束
       int[] a= {1,2,3,4,66,73,23,45,34324,5324,5123};
       sort(a);
       System.out.println(Arrays.toString(a));
   }
   public static int[] sort(int[] arrays){
       for (int i = 0; i < arrays.length; i++) {
           //外层循环，判断我们要走多少次
           //优化问题：在排序的时候要是已经排好了，那我们就不用在进行比较判断了
           boolean flag = false;//通过flag标识位减少没有意义的比较
           for (int j = 0; j < arrays.length-1; j++) {
               //内层循环，比较两个数，如果第一个数比第二个数大，则两个交换位置
               int max = 0;
               if (arrays[j]<arrays[j+1]){
                   max = arrays[j];
                   arrays[j]=arrays[j+1];
                   arrays[j+1]=max;
                   flag = true;
               }
           }
           if (flag == false){
               break;
           }
       }
       return arrays;
   }
   ```

#### 稀疏数组

+ 需求：编写五子棋游戏中，有存盘推出和需上盘的功能。

+ 分析问题：因为该二维数组的很多值是默认值为0，因此记录了很多没有意义的数字

1. 当一个数组中大部分元素为0，或者为同一值得数组时，可以使用稀疏数组来保存该数组

2. 稀疏数组的处理方式是

   + 记录数组一共有几行几列，有多少个不同值
   + 把具有不同值得元素和行列及值记录在小规模得数组中，从而缩小程序的规模。
     + 压缩非常值钱，可以节省空间

   ![image-20210305015953477](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210305015953477.png)

```java
public static void main(String[] args) {
    //1.创建一个二维数组 11*11 0 ：没有旗子 1：黑棋 2： 白棋
    int[][] array1 = new int[11][11];
    array1[1][2]=1;
    array1[2][3]=2;
    //输出原始数组
    System.out.println("输出原始数组");
    //遍历循环
    for (int[] ints : array1) {
        for (int anInt : ints) {
            System.out.print(anInt +"\t");
        }
        System.out.println();
    }
    //转换为稀疏数组保存
    //获取有效值的个数
    int sum = 0;
    for (int i = 0; i < 11; i++) {
        for (int j = 0; j < 11; j++) {
            if (array1[i][j]!=0){
                sum++;
            }
        }
    }
    System.out.println("有效值的个数：" +sum);
    System.out.println("============");
    //2.创建一个稀疏数组的数组

    int[][] array2 = new int[sum+1][3];
    array2[0][0] = 11;
    array2[0][1] = 11;
    array2[0][2] = sum;
    //遍历二维数组，将非零的值，存放稀疏数组中
    int count =0;
    for (int i = 1; i < array1.length; i++) {
        for (int j = 1; j < array1[i].length; j++) {
            if (array1[i][j]!=0){
                count++;
                array2[count][0] =i;
                array2[count][1] =j;
                array2[count][2] =array1[i][j];
            }
        }
    }
    System.out.println("稀疏函数");
    for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i][0]+"\t"
                    +array2[i][1]+"\t"
                    +array2[i][2]+"\t"
            );
        System.out.println();
    }
    System.out.println("============");
    System.out.println("还原");
    //1.读取稀疏数据
    int[][] array3 = new int[array2[0][0]][array2[0][1]];
    //2.给其中的元素还原它的值
    for (int i = 1; i < array2.length; i++) {
        array3[array2[i][0]][array2[i][1]] = array2[i][2];
    }
    System.out.println("输出还原数组");
    //遍历循环
    for (int[] ints : array3) {
        for (int anInt : ints) {
            System.out.print(anInt +"\t");
        }
        System.out.println();
    }
}
```

### 面向对象

#### 对象的创建和分析

1. 属性+方法就是类了
2. 面向对象思想
   + 步骤清晰简单，线性步骤，一步一步来
   + 面对过程适合处理一些较为简单的问题

3. 面向对象思想
   + 物以类聚，分类的思维模式
   + 面对对象适合处理复杂的问题

4. 对于描述复杂的事物，为了从宏观上把握、从整体上合理分析，我们需要使用面向对象的思路来分析整个系统，但是，具体到微观操作，依然需要面向过程的思路去处理
5. 使用new关键字创建对象
6. 使用new创建对象后，除了分配内存空间之外，还会给创建好的对象 进行默认的初始化以及 对类中构建器的调用。
7. 类中的构建也称为构建方法，是在进行创建对象的时候必须调用的。并且构造器有一下两个特点：
   + 必须和类的名字相同
   + 必须没有返回类型，也不能写void
8. 构造器必须要掌握

#### 什么是面向对象

1. 面向对象编程（Object-Oriented Programming,OOP)
2. 面向对象编程的本质就是：以类的方式组织代码，以对象的组织（封装）数据
3. 抽象
4. 三大特性
   + 封装
   + 继承
   + 多态

+ 从认识的角度先有对象后有类，对象，是具体的事物。类，是抽象的，是对对象的抽象
+ 从代码运行角度考虑是先有类后有对象，类是对象的模板。

#### 方法回顾

1. 方法的定义

   + 修饰符
   + 返回类型
   + break:跳出switch ，跳出循环，和return 结束方法
   + 方法名：注意规范命名
   + 参数列表：（参数类型，参数名）
   + 异常抛出

2. 方法的调用：递归

   + 静态方法 static

     + 

   + 非静态方法

     + 没有static

     + 无法直接调用，需要实例化这个类 new

     + 对象类型 对象名

     + ```java
       public static void main(String[] args) {
           //实例化这个类
           //对象类型 对象名 = 对象值;
           Student student = new Student();
           student.say();
       }
       ```

     ```java
     public  void say(){
         System.out.println("输出学生");
     }
     ```

   + 形参和实参

   + 值传递和引用传递

     ```java
     //值传递
     public static void main(String[] args) {
         int a = 1;
         System.out.println(a);
         Demo04.change(a);
         System.out.println(a);
     }
     //返回值为空
     public static  void change(int a){
         a = 10;
     }
     ```

   + this关键字

#### 类与对象的关系

1. 类是一种抽象的数据类型，它是对某一类事物整体描述、定义，但是并不能代表某一具体的事物

   + 动物、植物、手机、电脑
   + Person类、Pet类、Cat类等，这些类都是用来描述/定义某一类具体的事物应该具备的特点和行为

2. 对象是抽象概念的具体实例

   1. 张三是人的一个具体实例

   2. 能够体现出特点，展现出功能是具体的实例，而不是抽象的概念

      ```java
      public static void main(String[] args) {
          //类：抽象的，需要进行实例化
          //类实例化后会放回一个自己的对象！
          //student对象就是一个Student类的具体实例
          Student xiaoming = new Student();
          Student xh = new Student();
      
          xiaoming.name = "小明";
          xiaoming.age = 3;
      
          System.out.println(xiaoming.name);
          System.out.println(xiaoming.age);
      
          xh.name ="小红";
          xh.age = 3;
      }
      ```

   ```java
   //属性：字段
   String name;
   int age;
   
   //方法
   public  void study(){
       System.out.println(this.name+"在学习");
   }
   ```

```java
public class Person {
    //一个类即使什么方法也不写，也会存在一个方法
    //显示的定义构造器
    String name;
    //实例化初始值
    //1.使用new关键字，本质是在调用构造器
    public Person(){
        this.name = "moning";
    }
    //有参构造:一旦定义了有参构造，无参就必须显示定义
    //定义了有参构造，就默认了定义了一个
    //用来初始化值
    public Person(String name){
        this.name = name;
    }
}
```

#### 创建有参构造

1. ![image-20210306010122623](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210306010122623.png)

![image-20210306010142149](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210306010142149.png)![image-20210306010212436](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210306010212436.png)

2. 创建无参构造

   ![image-20210306010310722](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210306010310722.png)

##### 构造器

1. 和类名相同
2. 没有返回值
3. 作用
   + new本质在调用构造方法
   + 初始化对象的值
4. 注意点
   + 定义有参构造之后，如果想使用无参构造，显示的定义一个无参的构造（大白话就是你想调用无参构造，在有有参构造存在的情况下，你还得创建一个空的无参构造）

##### 简单的内存分析

![image-20210306013840655](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210306013840655.png)

​	

```java
public static void main(String[] args) {

    //new 实例化了一个对象
    Pet dog = new Pet();
    dog.name = "旺财";
    dog.age = 3;
    dog.shout();

    System.out.println(dog.name);
    System.out.println(dog.age);
```

​	

```
public class Pet {
    String name;
    int age;
    public void shout(){
        System.out.println("叫了一声");

    }

}
```

1. 类与对象
   + 类是一个模板：抽象，对象是一个具体的实例
2. 方法
   1. 定义、调用
3. 对应的引用
   + 引用类型：基本类型
   + 对象是通过引用来操作的：栈-->堆
4. 属性：字段Field 成员变量
   + 默认初始化
     + 数字：0 0.0
     + char：u0000
     + boolean：false
     + 引用：都是null
5. 方法 ：修饰符 属性类型 属性名 = 属性值
6. 对象的创建和使用
   + 必须使用new 关键字创建对象，构造器 Person moning = new Person();
   + 对象的属性 moning.name
   + 对象的方法 moning.sleep()
7. 类
   + 静态的属性 属性
   + 动态的行为 方法

#### 封装

1. 该露的露，该藏的藏

2. 程序设计追求 高内聚，低耦合 ，高内聚就是类的内部数据操作细节自己完成，不允许外部干涉；低耦合，仅暴露少量的方法给外部使用

   ```java
   /*
   封装的意义
   1.提高程序的安全性
   2.隐藏代码的实现细节
   3.统一接口
   4.系统可维护增加了
   */
   ```

#### 继承（数据的隐藏）

1. 通常，应禁止访问一个对象中数据的实际表示，而且通过操作接口来访问，这称为信心隐藏

   属于私有，get/set

2. 继承的本质是对某一批类的抽象，从而实现对现实世界更好的建模

3. extends的意思是扩展，子类是父类的扩展

4. Java中类只有单继承，没有多继承

5. 继承是类和类之间的一种关系，除此之外，类和类之间的关系还有依赖、组合、聚合等

6. 继承关系的两个类，一个为子类（派生类），一个为父类（基类）。子类继承父类，使用extends来表示

7. 子类和父类之间，从意义上讲应该具有”is a“的关系

8. object类

9. super类

   + 显示父类属性

     注意点

     + super调用父类的构造方法，必须在构造方法的第一个
     + super必须只能出现在子类的方法或者构造方法中
     + super和this不能同时调用构造方法

   + 对比 this

     + 代表的对象不同
       + this：本身调用者这个对象
       + super：代表父类对象的应用
     + 前提
       + this：没有继承也可以使用
       + super：只能在继承条件下才可以使用
     + 构造方法
       + this():本类的构造
       + super();父类的构造

##### 方法重写

+ 静态方法的重写

```java
//方法的调用只和左边，定义的数据类型有关
A a = new A();//A是子类
a.test();
//父类的引用指向了子类
B b = new A();//B 是父类
b.test();
//输出结果
//A=>test()
//B=>test()
```

+ 非静态方法的重写

  ```java
  public static void main(String[] args) {
      //方法的调用只和左边，定义的数据类型有关
      A a = new A();//A是子类
      a.test();
      //父类的引用指向了子类
      B b = new A();//B 是父类
      b.test();
  }
  //输出结果
  //A=>test()
  //B=>test()
  ```

  ![image-20210306204145454](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210306204145454.png)

  ```java
  public static void main(String[] args) {
      //方法的调用只和左边，定义的数据类型有关
      //非静态：重写
      A a = new A();//A是子类
      a.test();
  
      //父类的引用指向了子类
      B b = new A();//B 是父类
      b.test();
  
  }
  ```

##### 重写

1. 方法名必须相同

2. 参数列表必须相同

3. 修饰符：范围可以扩大但不能缩小：public>Protected>Default>private

4. 抛出的异常：范围，可以被缩小，但是不能扩大：

   ClassNotFoundException --> Exception(大)

重写，子类的方法和父类必要一致：方法体不同！

为什么需要重写：

1. 父类的功能，子类不一定需要，或者不一定满足

#### 多态（讲得不太好，看了很多遍）

1. 动态编译：类型，可扩展

2. 即同一方法可以根据发送对象的不同而采用多种不同的行为方式

3. 一个对象的实际类型是确定的，但可以指向对象的引用的类型有很多（父类 有关系的类）

4. 多态存在的条件

   + 有继承关系
   + 子类重写父类的方法
   + 父类引用指向子类对象

   多态注意事项：

   + 多态是方法的多态，属性没有多态
   + 父类和子类，有联系 类型转换异常!ClassCastException
   + 存在条件：继承关系，方法需要重写，父类引用指向子类对象！ Father f1 = new Son();
     1. static 方法，属于类，它不属于实例
     2. final 常量
     3. private 方法

   大白话：

   1. 创建方法看左边对象是父类还是子类
   2. 当只调用父类的方式是，父类的方法可以调用
   3. 当子类继承父类的方法后，调用父类的方法时是使用子类的方法
   4. 当父类的方法没有该子类的方法，但还是想用父类的方法去使用子类的方法时，会强制将父类的方法转化为子类再进行调用子类的方法

##### instanceof

```java
public static void main(String[] args) {
//        System.out.println(X instanceof y);//能不能编译通过就看 X 和 y 有没有子类关系
        Object object = new Student();
        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof String);//false

        Person person = new Student();
        System.out.println(person instanceof Student);//true
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Object);//true
//        System.out.println(person instanceof Teacher);//编译报错
//        System.out.println(person instanceof String);//编译报错
```

```java
//类型之间的转化：父 子
    //高          低
    Person obj = new Student();

    //student将这个对象转化为Student类型，我们就可以使用Student类型的方法
    //大白话。利用父类创建方法，强制使用子类方法
    Student student = (Student) obj;
    student.go();
    //等同于 ((Student) obj).go();
    //子类转化为父类，可能丢失自己的本来的一些方法
    Student s1 = new Student();
    student.go();
    Person person = student;
    /*
        1.父类引用指向子类的对象
        2.把子类转化为父类，向上转型
        3，把父类转化为子类，向下转型：强制转换
        4.方便方法的调用，减少重复的代码
    */
```

##### Static关键字详解(没掌握)

1. 静态导入包

```java
//静态导入包，看官方文档说不定就懂了
//如果父类被final 就断子绝孙了
import static java.lang.Math.random;
public class Test {
    public static void main(String[] args) {

//        System.out.println(Math.random());
        //有静态导入包后可以直接不用Math了
        System.out.println(random());
    }
}
```



2. 静态代码块的运行顺序

   ```java
   public class Person {
       {
           //2.运行
           System.out.println("匿名代码块");
       }
       static {
           //1.先运行,只执行1次
           System.out.println("静态代码块");
       }
       public Person(){
           //3.运行
           System.out.println("构造方法");
       }
       public static void main(String[] args) {
           Person person = new Person();
           Person p2 = new Person();
       }
   }
   ```

3. 静态

   ```java
   public class Student {
       private static int age;//静态变量 多线程
       private double score;//非静态变量
       public static void main(String[] args) {
           Student s1 = new Student();
           System.out.println(Student.age);//建议使用类名变量
           System.out.println(s1.age);
           System.out.println(s1.score);
           //System.out.println(Student.score);//报错 无法使用
       }
   }
   ```

   4. 静态对象
      + 静态对象无法对非静态变量

##### 抽象类

```java
//abstract 抽象类：类 extends 单继承 （接口可以多继承）
public abstract class A {
    //约束~有人帮我们实现
    //abstract,抽象方法，只有方法名字，没有方法的实现
    public abstract void doSomething();
}
```

1. 不能new这个抽象类
2. 抽象类中可以写普通的方法
3. 抽象方法必须在抽象类中
4. 类中出现抽象方法，该类必须变成抽象类

##### 接口

1. 普通类：只有具体实现

2. 抽象类：具体实现和规范（抽象方法）都有

3. 接口：只有规范！自己无法写方法~专业的约束！约束和实现分离：面向接口编程

4. 接口就是规范，定义的是一组规则，体现了现实世界中”如果你是。。。则必须能“

5. 接口的本质是契约，就像我们人间的法律一样。制定好大家都遵守

6. OO（面向对象）的精髓，是对对象的抽象，最能体现这一点的就是接口，设计模式都只针具备了抽象能力的语言，实际就是合理的去抽象。

   声明类的关键字是class，声明接口的关键字是interface

7. 作用

   + 约束

   + 定义一些方法，让不同的人实现 比如你有10个员工，这些人都实现的都是1个接口

   + public abstract （接口中定义方法）

   + public static final（接口中的定义常量）

   + 接口不能被实例化，接口中没有构造方法

   + implements可以实现多个接口 

     + ```java
       public class UserServiceImpl implements UserService,TimeService{
           public UserServiceImpl() {
               super();
           }
       ```

   + 必须要重写接口中的方法

     ```java
     public class UserServiceImpl implements UserService,TimeService{
         public UserServiceImpl() {
             super();
         }
         @Override
         public void add(String name) {
         }
         @Override
         public void delete(String name) {
         }
         @Override
         public void update(String name) {
         }
         @Override
         public void query(String name) {
         }
     }
     ```

```java
//抽象的思维  通过接口来定义一个系统是非常难的 这就是架构的思想
public interface UserService {
    //接口中的所有定义其实都是抽象的public abstract
    //常量 public static final
    int AGE = 99;
    void add(String name);
    void delete(String name);
    void  update(String name);
    void query(String name);
}
```

##### N种内部类

1. 内部类就是在一个类中内部再定义一个类，比如，A类种定义一个B类，那么B类相对A类来说就称为内部类，而A类相对B类来说就是外部类了
   
+ ![image-20210307013753456](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210307013753456.png)
  
2. 类型

   + 成员内部类

     + ```java
       public class Outer {
           private int id;
           public void out(){
               System.out.println("这是外部类的方法");
           }
           class Inner{
               public void in(){
                   System.out.println("这是内部类的方法");
               }
               //获得外部类的私有属性
               public void getID(){
                   System.out.println(id);
               }
               //局部内部类
               public void method(){
                   class wait{
                       public void in(){
                       }
                   }
               }
           }
       }
       public static void main(String[] args) {
               Outer outer = new Outer();
               //通过这个外部类来实例化内部类
               Outer.Inner inner = outer.new Inner();
               inner.in();
           }
       ```

   + 静态内部类

     + 无法访问获取非静态的变量

   + 局部内部类

     + 类中还可以写方法

     + ```java
       public class Inter {
           //局部内部类
           public void method(){
               class Inner{
                   public void in(){
       
                   }
               }
           }
       }
       ```

   + 匿名内部类

     + ```java
       public class Test {
           public static void main(String[] args) {
               //没有名字初始化类，不用讲实例保存到变量种
               //Apple apple = new Apple();
               new Apple().eat();
               //匿名内部类
               UserSrtvice userSrtvice = new UserSrtvice(){
                   @Override
                   public void hello() {
                   }
               };
           }
       
       }
       class Apple{
           public void eat(){
               System.out.println("1");
           }
       }
       interface UserSrtvice{
           void hello();
       }
       ```

3. 一个Java类种可以有多个类，但public类只有一个

#### 异常机制

1. Exception
2. 异常指程序运行中出现的不期而至的各种状况，如：文件找不到、网络连接失败、非法参数等
3. 异常发生在程序运行期间，它影响了正常的程序执行流程
4. 三种类型异常
   + 检查性异常：最具代表的检查性异常时用户错误或问题引起的异常，这是程序员无法预见的。例如要打开一个不存在的文件，异常就发生了，这些在编码的时候不能被简单的忽略
   + 运行时异常：运行时异常时可能被程序员避免的异常。与检查性异常相反，运行时异常可以在编译时被忽略
   + 错误ERROR：错误不是异常而是脱离程序员控制的问题。错误在代码中通常被忽略。例如，当栈溢出时，一个错误就发生了，它们在编译也检查不到的
5. ![image-20210307023740399](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210307023740399.png)
6. java把异常当作对象来处理，并定义一个基类java.lang.Throwable作为所有异常的超类

#### 异常处理机制

1. 抛出异常
2. 捕获异常
3. 异常处理五个关键字
   + try、catch、finally、throw、throws

##### 异常体系结构

1. ```java
   
   public static void main(String[] args) {
   
           int a = 1;
           int b = 0;
   //假设要捕获多个异常：从小到大！
   try{
       new Test().a();
   }catch (Error e){
       System.out.println("程序出现异常");
   }catch (Exception e){
   
   }catch (Throwable t){
   
   }
   public void a(){
           b();
       }
       public void b(){
           a();
       }
   }
   ```

2. ```java
   try { //try监控区域
   
       System.out.println(a/b);
   
   }catch (ArithmeticException e){//catch 捕获异常//想要捕获的异常类型！
       System.out.println("程序出现异常，变量b不能为0");
   }finally {//处理善后工作
       System.out.println("finally");
   }
   //finally 可以不要finally，假设IO，资源，关闭
   ```

3. ```java
   public static void main(String[] args) {
       //假设这个错误在意料之中，我们可以使用try catch来跳过异常继续使用
       try {
           new Test().test(1,0);
       } catch (ArithmeticException e) {
           e.printStackTrace();
       }
   }
   //假设这方法中，处理不了这个异常，方法上抛出异常
   public void test(int a ,int b) throws ArithmeticException{
       if (b == 0 ){ //throw throws
           throw new ArithmeticException();//主动的抛出异常,一般在方法中使用
       }
   }
   ```



##### 自定义异常

1. 用户自定义异常类，只需要继承Exception

2. 步骤

   + 创建自定义异常类

   + 在方法中通过throw关键字抛出异常对象

   + 如果在当前抛出异常的方法中处理异常，可以使用try-catch语句捕获并处理；否则在方法的声明处通过throws关键字指明要抛出给方法调用者的异常，继续进行下一步操作

   + 再出现异常方法的调用者中捕获并处理异常

     ```java
     public class Test{
         static void test(int a)throws MyException {
             //可能会存在异常的方法
             System.out.println("传递的参数为："+a);
             if (a > 10) {
                 throw new MyException(a);//抛出
             }
             System.out.println("OK");
         }
         public static void main(String[] args) {
             try {
                 test(11);
             } catch (Exception e) {
                 //可以增加处理数据的代码块 比如让a减小
                 System.out.println("MyException=>"+e);
             }
         }
     }
     ```

     ```java
     public class MyException extends Exception{
         //传递信息
         private  int detail;
         public  MyException(int a ){
             this.detail = 3;
         }
         //toString:异常的打印信息
         @Override
         public String toString() {
             return "MyException{" + "detail=" + detail + '}';
         }
     }
     ```

### 注解 annotation

1. 个人理解
   + 注解有检查机制，还能被编译调用
   + 注解意思有废除重写版本作者等信息
2. 个人理解
   + 删除注解 提示该方法不推荐用 或者有更好的方法
   + 参数注解 取消未标明参数的编译器提示 不推荐使用
3. 个人理解 #
   + 元注解 自定义注解 可以设置一个value 值 设置注解的范围 一般在源码中有详细解释 Target
4. 个人理解 #
   + @interface 自定义注解 方法  里边可以设置注解的参数 以及注解对应的值

## 反射机制

1. 个人理解
   + 反射是可以在，运行时创建的一个类，通过反射获取相应的值
   + 动态编译 指可以在程序运行时可以更改其中代码的值 如 JS C# python
   + 静态编译 程序运行时无法修改其中的参数 如 c java 但java有反射机制，可以消耗一些内存修改参数调用参数值
2. 个人理解
   + 通过class 类获取对象
3. 个人理解
   + 利用对象.class 获得类
   + 利用forname 包名获得类
   + 利用类名 获得类
   + 利用数据类型 Inget TYPE 类型 获得类
   + 利用子类 获得 父类
4. 个人理解
   + 对象 Object类
   + 接口 类
   + 一维数组 多维数组   数组类型相同 维度相同  其类Class也相同
   + 注解类
   + void
   + 数据类型
   + 枚举
   + Class 自己本身类
5. 个人理解 *
   + 类内存分析  没听懂 分心了
   + 大概就是 加载 链接 初始化 
   + 加载 类静态方法 -> 堆 查询Class类 Class类只能查询 -> 栈 主函数运行 -> 堆 中创建对象 
6.  个人理解 #
   + 初始化 
     + 非初始化 在类创建空间 以及 变量的定义
7. 个人理解 # 
   + 类加载器 可以通过 get 获取子类 或者父类的类加载器 
   + 根 类 会显示为 null 会调用很多的jar 包 以及out.class
8. 个人理解 #
   + 获取对象 值 方法 构造器 指定构造器  
9. 个人理解
   + 通过反射 获取方法 属性 并且设置 若private 则要在 Aucess (true)
10. 个人理解
    + 关闭A 之后 测试 计算10亿次对象和反射对象 以及关闭安全后反射对象的速率
11. 个人理解 *
    + 通过反射去获取一个泛型 有点重要 通过一个方法 获取泛型的参数 如果是参数强制转换 然后输出

12. 个人理解 
    + 通过反射去获取注解里的对象信息  在数据库获取数据中也是挺重要的
13. 个人理解
    + 

## 网络编程

1. 个人理解
   + 讲述了javaweb 页面编程 B/S
   + 网络编程    TCP/IP C/S
2. 

## 多线程

#### 线程、进程、多线程

![image-20210308095932641](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210308095932641.png)

##### 进程Process和Thread

1. 一个进程可以可以有多个线程，如视频中的声音，弹幕等等

2.  程序：程序是指令和数据的有序集合，其本身没有任何运行的含义，是一个静态的概念

3. 进程:是执行程序的一次执行过程

4. 注意:很多多线程是模拟出来的，真正的多线程是指有多个cpu，即多核，如服务器。如果是模拟出来的多线程，即在一个cpu的情况下，在同一个时间点，cpu只能执行一个代码，因为切换很快，就有同时执行的错局

5. 核心知识

   + 程就是独立的执行路径

   + 在程序运行时，即使没有自己创建线程，后台也会有多个线程，如主线程，gc线程；
   + main()称之为主线程，为系统的入口，用于执行整个程序
   + 在一个进程中，如果开辟了多个线程，线程的运行由调度器安排调度，调度器是与操作系统紧密相关的，先后顺序是不能认为的干预的
   + 对同一份资源操作时，会存在资源抢夺的问题，需要加入并发控制
   + 线程会带来额外的开销，如cpu调度时间，并发控制开销
   + 每个线程在自己的工作内存交互，内存控制不当会造成数据不一致

#### 线程创建

1. 三种创建方式

   + Thread class 继承Thread类
   + Runnable接口 时间Runnable接口
   + Callable接口 实现Callable接口

2. ```java
   //创建线程的方式一：继承Thread类，重写run()方法，调用start开启线程
   //总结：注意，线程开启不一定立即执行，由cpu调度执行
   //运行结果，两种输出结果交替运行
   public class TestThreadOne extends Thread{
       @Override
       public void run() {
           for (int i = 0; i < 20; i++) {
               System.out.println("我在看代码"+i);
           }
       }
       public static void main(String[] args) {
           //main线程，主进程
           //创建一个线程对象
           TestThreadOne testThreadOne = new TestThreadOne();
           //调用start（）方法开启线程
           testThreadOne.start();
           for (int i = 0; i < 20; i++) {
               System.out.println("我在学习多线程"+i);
           }
       }
   }
   ```

3. ```java
   public class TestThreadTwo extends Thread{
       private String url;
       private String name;
   
       public TestThreadTwo(String url,String name){
           this.url = url;
           this.name = name;
       }
       @Override
       public void run() {
           WebDownloader webDownloader = new WebDownloader();
           WebDownloader.downloader(url,name);
           System.out.println("下载图片文件名为"+name);
           super.run();
       }
   
       public static void main(String[] args) {
           TestThreadTwo testThreadTwo = new TestThreadTwo(url:"");
       }
   }
   //下载器
   class WebDownloader{
       //下载方法
       public void downloader(String url,String name){
           try {
               FieldUtil.copyURLToFile(new URL(url),new File(name));
           } catch (IOException e) {
               e.printStackTrace();
               System.out.println("IO异常，downloader方法出现问题");
           }
       }
   }
   ```

##### 下载图片（记得下载下载包）

```java
import sun.reflect.misc.FieldUtil;
import java.io.IOException;
public class TestThreadTwo extends Thread{
    private String url;
    private String name;
    //用构造器丢入到url name 中
    public TestThreadTwo(String url,String name){
        this.url = url;
        this.name = name;
    }
    //下载器的执行体
    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        WebDownloader.downloader(url,name);
        System.out.println("下载图片文件名为"+name);
        super.run();
    }

    public static void main(String[] args) {
        TestThreadTwo s1 = new TestThreadTwo(url:"http://i0.hdslb.com/bfs/space/265ecddc52d74e624dc38cf0cff13317085aedf7.png@2200w_400h_1o.webp",name:"1.jpg");
        TestThreadTwo s2 = new TestThreadTwo(url:"http://i0.hdslb.com/bfs/space/265ecddc52d74e624dc38cf0cff13317085aedf7.png@2200w_400h_1o.webp",name:"2.jpg");

        s1.start();
        s2.start();
    }
}
//下载器
class WebDownloader{
    //下载方法 依靠URL和名字 下载
    public void downloader(String url,String name){
        try {
            FieldUtil.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}
```

#### 实现Runnable接口

1. 推荐使用Runnable接口

2. 继承Thread类

   + 子类继承Thread类具备多线程能力

   + 启动线程：子类对象.start()

   + 不建议使用：避免OPP单继承局限性

   + ```java
     //创建线程的方式一：继承Thread类，重写run()方法，调用start开启线程
     //总结：注意，线程开启不一定立即执行，由cpu调度执行
     //运行结果，两种输出结果交替运行
     public class TestThreadOne extends Thread {
         @Override
         public void run() {
             for (int i = 0; i < 20; i++) {
                 System.out.println("我在看代码"+i);
             }
         }
         public static void main(String[] args) {
             //main线程，主进程
             //创建一个线程对象
             TestThreadOne testThreadOne = new TestThreadOne();
             //调用start（）方法开启线程
             testThreadOne.start();
             for (int i = 0; i < 20; i++) {
                 System.out.println("我在学习多线程"+i);
             }
         }
     }
     ```

3. 实现Runnable类

   + 实现接口Runnable具有多线程能力

   + 启动线程：传入目标对象+ Thread对象.start()

   + 推荐使用：避免单继承局限性，灵活方便，方便同一个对象被多个线程使用

   + ```java
     //创建线程方法2：实现runnable接口，重写run()方法,执行线程需要对如runnable接口实现类，调用start方法
     public class TestThreadThree implements Runnable{
         @Override
         public void run() {
             for (int i = 0; i < 20; i++) {
                 System.out.println("我在看代码"+i);
             }
         }
         public static void main(String[] args) {
             //创建runnable接口的实现类对象
             TestThreadThree s1 = new TestThreadThree();
             //调用start（）方法开启线程
             Thread thread = new Thread(s1);
             thread.start();
             //二合一写法
             //new Thread(s1).start();
             for (int i = 0; i < 20; i++) {
                 System.out.println("我在学习多线程"+i);
             }
         }
     }
     ```

##### 初识并发问题

1. ```java
   //多个线程同时操作同一个对象
   //买火车票的例子
   //发现问题：多个线程操作同一个资源的情况下，线程不安全，数据紊乱
   public class TestThreadTwo implements Runnable{
       //票数
       private int ticketNums =10;
       @Override
       public void run() {
           while (true){
               if (ticketNums<=0){
                   break;
               }
               System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketNums--+"票");
           }
           //模拟延时
           try {
               Thread.sleep(200);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       public static void main(String[] args) {
           TestThreadTwo ticket = new TestThreadTwo();
           new Thread(ticket,"小明").start();
           new Thread(ticket,"小红").start();
           new Thread(ticket,"黄牛党").start();
       }
   }
   ```


###### 龟兔赛跑

+ ```java
  public class Race implements Runnable{
      //胜利者
      private static String winner;
      @Override
      public void run() {
          for (int i = 0; i <= 100; i++) {
              //模拟兔子休息
              if (Thread.currentThread().getName().equals("兔子")&& i%10==0){
                  try {
                      Thread.sleep(1/100);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
              //判断比赛是否结束
              boolean flag = gameOver(i);
              if (flag){
                  break;
              }
              System.out.println(Thread.currentThread().getName()+"跑了第"+i+"步");
          }
      }
      public boolean gameOver(int steps){
          //判断是否有胜利者
          if (winner!=null){
              return true;
          }{
              if (steps >= 100){
                  winner = Thread.currentThread().getName();
                  System.out.println("Winner is the"+winner);
                  return true;
              }
              return false;
          }
      }
      public static void main(String[] args) {
          Race s1 = new Race();
          new Thread(s1,"兔子").start();
          new Thread(s1,"乌龟").start();
      }
  }
  ```

+ 1. 首先来个赛道距离，然后要离重点越来越近
  2. 判断比赛是否结束
  3. 打印出胜利者
  4. 龟兔赛跑开始了
  5. 故事中乌龟是赢的，所以我们来模拟兔子睡觉
  6. 乌龟赢得胜利

##### 实现Callable接口（了解）

1. 实现Callable接口，需要返回值类型

2. 重写call方法，需要抛出异常

3. 创建目标对象

4. 创建执行服务：ExecutorService ser = Executors.newFixedThreadPool(1);

5. 提交执行：Future< Boolean>result1 =ser.submit(t1)

6. 获取结果：boolean r1 = result1.get()

7. 关闭服务：ser.shutdownNow();

8. ```java
   public class TestCallable implements Callable<Boolean> {
       private String url;
       private String name;
       //用构造器丢入到url name 中
       public TestCallable(String url,String name){
           this.url = url;
           this.name = name;
       }
       //下载器的执行体
       @Override
       public Boolean call() {
           WebDownloader webDownloader = new WebDownloader();
           WebDownloader.downloader(url,name);
           System.out.println("下载图片文件名为"+name);
           return true;
       }
       public static void main(String[] args) {
           TestCallable s1 = new TestCallable(url:"http://i0.hdslb.com/bfs/space/265ecddc52d74e624dc38cf0cff13317085aedf7.png@2200w_400h_1o.webp",name:"1.jpg");
           TestCallable s2 = new TestCallable(url:"http://i0.hdslb.com/bfs/space/265ecddc52d74e624dc38cf0cff13317085aedf7.png@2200w_400h_1o.webp",name:"2.jpg");
           TestCallable s3 = new TestCallable(url:"http://i0.hdslb.com/bfs/space/265ecddc52d74e624dc38cf0cff13317085aedf7.png@2200w_400h_1o.webp",name:"2.jpg");
           //1. 创建执行服务：
           ExecutorService ser = Executors.newFixedThreadPool(3);
           //2. 提交执行：
           Future< Boolean> r1 =ser.submit(s1);
           Future< Boolean> r2 =ser.submit(s2);
           Future< Boolean> r3 =ser.submit(s3);
           //3. 获取结果：
           boolean sr1 = r1.get();
           boolean sr2 = r2.get();
           boolean sr3 = r3.get();
           //打出返回值
           System.out.println(sr1);
           System.out.println(sr2);
           System.out.println(sr3);
           //4. 关闭服务：
           ser.shutdownNow();
       }
   }
   //下载器
   class WebDownloader{
       //下载方法 依靠URL和名字 下载
       public void downloader(String url,String name){
           try {
               FieldUtil.copyURLToFile(new URL(url),new File(name));
           } catch (IOException e) {
               e.printStackTrace();
               System.out.println("IO异常，downloader方法出现问题");
           }
       }
   }
   ```

##### 静态代理

1. ```java
   //静态代理模式总结
   //真实对象和代理对象都要实现同一个接口
   //代理对象要代理真实角色
   //好处
       //代理对象可以做很多真实对象做不了的事前
       //真实对象专注做自己的事情
   public class StacticProxy {
       public static void main(String[] args) {
           You you = new You();//你要结婚
   //        new Thread(()-> System.out.println("我爱你")).start();//这步分析虚拟代理和Runnable很像的结构
   //        WeddingCompany weddingCompany = new WeddingCompany(new you());
   //        weddingCompany.HappyMarry();
           new WeddingCompany(new You()).HappyMarry();
       }
   }
   interface Marry{
       void HappyMarry();
   }
   class You implements Marry{
       @Override
       public void HappyMarry() {
           System.out.println("我TM居然结婚了");
       }
   }
   //代理角色，帮助你结婚
   class WeddingCompany implements Marry{
       private Marry target;
       public WeddingCompany(Marry target){
           this.target = target;
       }
       @Override
       public void HappyMarry() {
           before();
           this.target.HappyMarry();//真实对象
           after();
       }
       public void after(){
           System.out.println("结婚之后，收尾款");
       }
       public void before(){
           System.out.println("结婚之前，布置现场");
       }
   }
   ```

#### Lamda表达式

1. 希腊文字第十一位字母

2. 避免匿名内部类过多

3. 实质属于函数式编程的概念

   + (params) -> expresion

     (params) -> statements[语句]

     (params) -> {statements}

   + ```java
     a -> System.out.println("I like lambda5"+a);
     ```

4. 为什么用lambda

   + 避免匿名内部类定义过多
   
   + 可以让代码更加简洁
   
   + 去掉了一堆没有意义的代码，留下核心的逻辑
   
   + ```java
     public class TestLambdaTwo {
     
         public static void main(String[] args) {
             //.lambda简化
             ILove love =  (int a) ->{
                     System.out.println("I like lambda"+a);
             };
             love.love(2);
             //简化1，参数类型
              love =  (int a) ->{
                 System.out.println("I like lambda"+a);
             };
             love.love(520);
             //简化2：简化括号
             love =  a ->{
                 System.out.println("I like lambda"+a);
             };
             love.love(521);
             //简化3：去掉花括号//起码只有1行
             love =  a -> System.out.println("I like lambda"+a);
             //总结
                 //前提式接口位函数式接口
                 //多个参数也可以去掉参数类型，要去掉就都去掉，必须加上括号
         }
     }
     interface ILove{
         void love(int a);
     }
     ```

#### 线程状态

![image-20210308150231855](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210308150231855.png)

![image-20210308150335991](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210308150335991.png)

##### 线程方法

![image-20210308150359290](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210308150359290.png)

##### 停止线程

+ @Deprecate 过期方法不推荐使用

+ 不推荐使用JDK提供的stop()、destroy()方法

+ 推荐线程自己停止下来

+ 建议使用一个标志位进行终止变量

  + 当flag=false,则终止线程运行

  + ```java
    //1.建议线程正常停止 --> 利用次数，不建议死循环
    //2.建议使用标志位 --> 设置一个标志位
    //
    public class TestStop implements Runnable{
        private boolean flag = false;
        @Override
        public void run() {
            int i = 0;
            while (flag){
                System.out.println("run...Thread"+i++);
            }
        }
        //2.设置一个公开的方法停止线程，转换标志位
        public void stop(){
            this.flag = false;
        }
        public static void main(String[] args) {
            TestStop testStop = new TestStop();
            new Thread(testStop).start();
            for (int i = 0; i < 1000; i++) {
                System.out.println("main"+i);
                if (i == 900){
                    testStop.stop();
                    System.out.println("线程停止了");
                }
            }
    
        }
    }
    ```

##### 线程休眠

1. sleep(时间)指定当前线程阻塞的毫秒数
2. sleep存在异常InterruptedExcption
3. sleep时间达到后线程进入状态
4. sleep可以莫宁网络延时，倒计时等
5. 每一个对象都有一个锁，sleep不会释放锁

###### 倒计时

```java
//模拟倒计时
    public static void tenDown() throws InterruptedException {
        int num = 10;
        while (true){
            Thread.sleep(1000);
            System.out.println(num--);
            if (num <=0)
                break;
        }
    }
```

###### 系统时间

```java
public class TestSleep {
    public static void main(String[] args) {
        //打印当前系统时间
        Date startTime = new Date(System.currentTimeMillis());
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
                startTime=new Date(System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
```

##### 线程礼让

1. 让当前正在执行的线程暂停，但不阻塞

2. 将线程从运行状态转为就绪状态

3. 让cpu重写调度，礼让不一定成功，看cpu心情

   + ```java
     //礼让不一定成功
     public class TestYield {
         public static void main(String[] args) {
             MyYield myYield = new MyYield();
             new Thread(myYield,"a").start();
             new Thread(myYield,"b").start();
     
         }
     }
     class MyYield implements Runnable{
         @Override
         public void run() {
             System.out.println(Thread.currentThread().getName()+"线程开始执行");
             Thread.yield();
             System.out.println(Thread.currentThread().getName()+"线程停止执行");
         }
     }
     //    b线程开始执行 
     //    b线程停止执行
     //    a线程开始执行
     //    a线程停止执行
     //礼让没成功
     ```

#### Join插队机制

1. Join合并线程，待此线程执行完成后，再执行其他线程，其他线程阻塞

2. ```java
   public class TestJoin implements Runnable{
       @Override
       public void run() {
           for (int i = 0; i < 500; i++) {
               System.out.println("VIP执行了"+i);
           }
       }
       public static void main(String[] args) throws InterruptedException {
           TestJoin testJoin = new TestJoin();
           Thread thread = new Thread(testJoin);
           thread.start();
           //主线程
           for (int i = 0; i < 200; i++) {
               if (i==100){
                   thread.join();
               }
               System.out.println("mian方法执行"+i);
           }
       }
   }
   ```

#### 线程状态观测

1. Thread.State
   + 线程状态。线程可以处于以下状态之一
     + new
       + 尚未启动的线程处于此状态
     + Runnable
       + 在Java虚拟机中执行的线程处于此状态
     + Blocked
       + 被阻塞等待监视器锁定的线程处于此状态
     + Waiting
       + 正在等待另一个线程执行特定动作的线程处于此状态
     + Timed_Waiting
       + 正在等待另一个线程执行动作达到指定等待时间的线程处于此状态
     + TerMinated
       + 已退出的线程处于此状态
   + 一个线程可以在给定时间点处于一个状态。这些状态式是不反映任何操作系统线程状态的虚拟机状态。
   + 死亡后的线程无法启动
   + ![image-20210309182112487](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210309182112487.png)

#### 线程的优先级

1. Java提供一个线程调度器来监控程序中启动后进入就绪状态的所有线程，线程调度器按照优先级决定应该调度那个线程来执行
2. 线程的优先级用数字表示，范围由1~10
   + Thread.MIN_PRIORITY = 1;
   + Thread.MIN_PRIORITY = 10;
   + Thread.MIN_PRIORITY = 5;
3. 使用以下方式改变或获取优先级
   + getPriority().setPriority(int xxx)

##### 性能倒置

1. 优先级低只是意味着获得调度的概率低，并不是优先级低就不会被调用了，这都是看cpu的调度

   ```java
   public class TestPriority extends Thread {
       public static void main(String[] args) {
           //主线程默认优先级
   
           MyPriority myPriority = new MyPriority();
   
           Thread tone = new Thread(myPriority);
           Thread ttwo = new Thread(myPriority);
           Thread tthree = new Thread(myPriority);
           Thread tfour = new Thread(myPriority);
   
           //先设置优先级再启动
           tone.start();
   
           ttwo.setPriority(1);
           ttwo.start();
   
           tthree.setPriority(4);
           tthree.start();
   
           tfour.setPriority(Thread.MAX_PRIORITY);//MAX_PRIORITY=10
           //优先级高不一定先跑
       }
   }
   class MyPriority implements Runnable{
       @Override
       public void run() {
           System.out.println(Thread.currentThread().getName() + "-->" +Thread.currentThread().getPriority());
       }
   }
   ```

#### 守护（deamon）线程

1. 线程分为用户线程和守护线程

2. 虚拟机必须确保用户线程执行完毕

3. 虚拟机不用等待守护线程执行完毕

4. 如后台记录操作日志、监护内存、垃圾回收机制

5. 疯狂报错（不知道原因）

   + ```java
     public class TestDaemon {
         public static void main(String[] args) {
             God god = new God();
             You you = new You();
             Thread thread = new Thread(god);
             thread.setDaemon(true);
             thread.start();//上帝守护线程启动
             new Thread(you).start();
         }
     }
     //上帝
     class God implements Runnable{
         @Override
         public void run() {
                 System.out.println("上帝保护着你");
         }
     }
     //你
     class You implements Runnable{
         @Override
         public void run() {
             for (int i = 0; i < 36; i++) {
                 System.out.println("你的一生开心的活者"+i);
             }
             System.out.println("=====goodjob");
         }
     }
     ```

#### 线程同步机制

1. 多个线程操作同一个资源--同一个资源，多个人使用
2. 处理多线程问题是，多个线程访问同一个对象，并且某些线程还想修改这个对象。这时候我们就需要线程同步，线程同步其实就是一种等待机制。多个需要同时访问此对象的线程进入这个对象的等待吃形成队列，等待前面线程使用完毕，下一个线程再使用。
3. 由于同一进程的多个线程共享同一块存储空间，在带来方便的同时，也带来了访问冲突问题，为了保证数据在方法中被访问时的正确性，在访问时加入锁机制 synchronized，当一个线程获得对象的排它锁，独占资源，其他线程必须等待，使用后释放锁即可，存在以下问题
   + 一个线程持有锁会导致其他所有需要此锁的线程挂起。
   + 在多线程竞争下，加锁，释放锁会导致比较多的上下文切换和调度延时，引起性能问题：
   + 如果一个优先级高的线程等待一个优先级低的线程释放锁，会导致优先级倒置，引起性能问题。

#### 三大不安全案例

```java
//不安全的买票
//线程不安全，有负数
//大白话，就是在抢第十张票的时候，3个线程同时看到票，此时按照内存的角度，3个线程会同时拿到票并保存，就会造成票负数情况
public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket,"学生").start();
        new Thread(buyTicket,"黄牛").start();
        new Thread(buyTicket,"市民").start();
    }
}
class BuyTicket implements Runnable{
    //票
    private int ticketNums = 10;
    boolean flag = true;//外部停止方法
    @Override
    public void run() {
        //买票
        while(flag){
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void buy() throws InterruptedException {
        //判断是否有票
        if (ticketNums <= 0 ){
            flag = false;
            return;
        }
        //模拟延时
        Thread.sleep(100);

        //买票
        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNums--);
    }
}
```

2. ```java
   public class UnsafeBank {
       public static void main(String[] args) {
           //账户
           Account account = new Account(100,"结婚基金");
           Drawing you =new Drawing(account,50,"你");
           Drawing girlfriend =new Drawing(account,100,"girlfriend");
           you.start();
           girlfriend.start();
       }
   }
   //账户
   class Account{
       int money;//
       String name;//卡名
   
       public Account(int money, String name) {
           this.money = money;
           this.name = name;
       }
   }
   //银行 模拟取钱
   class Drawing extends Thread{
       Account account;//账户
       //取了多少钱
       int drawingMoney;
       //现在手里有多少钱
       int nowMoney;
       //构造方法
       public Drawing(Account account, int drawingMoney, String name){
           super(name);
           this.account = account;
           this.drawingMoney = drawingMoney;
       }
       //取钱
       @Override
       public void run() {
           //判断有没有钱
           if (account.money-drawingMoney<0){
               System.out.println(Thread.currentThread().getName()+"账户余额不足");
               return;
           }
           //sleep 可以放大问题的放生性
           try {
               Thread.sleep(1000);
           } catch (Exception e) {
               e.printStackTrace();
           }
           //卡内余额 = 余额 - 你取的钱
           account.money = account.money - drawingMoney;
           //你手里的钱
           nowMoney = nowMoney + drawingMoney;
           System.out.println(account.name+"余额位："+account.money);
           //this.name = Thread.currentThread().getName()
           System.out.println(this.getName()+"手里的钱"+nowMoney);
       }
   }
   ```

3. ```java
   //线程不安全的集合
   //原因：同一瞬间，把两个数组覆盖在同一个位置，覆盖掉元素就会变少。
   //问题不安全的原因，内存都是各自的
   public class UnsafeLise {
       public static void main(String[] args) {
           List<String> list = new ArrayList<String>();
           for (int i = 0; i < 10000; i++) {
               new Thread(()->{
                   list.add(Thread.currentThread().getName());
               }).start();
           }
           System.out.println(list.size());
       }
   }
   ```

##### 对列和锁

1. 形成条件：队列+锁 -- 安全性

#### 线程同步

1. 由于同一进程的多个线程共享同一块存储空间，在带来方便的同时，也带来了访问冲突问题，为了保证数据在方法中被访问时的正确性，在访问时加入锁机制synchronized。当一个线程对象获得排它锁，独占资源，其他线程必须等待，使用后释放锁即可，存在以下问题
   + 一个线程持有锁会导致其他所有需要此锁的线程挂起
   + 在多线程竞争下，加锁，释放锁会导致比较多的上下文切换和调度延时，引起性能问题
   + 如果一个优先级高的线程等待一个优先级低的线程释放锁，会导致优先级倒置，引起性能问题

#### 同步方法

1. 通过private关键字来保证数据对象只能被方法访问，所以我们只需要针对方法提出一套机制，这套机制就是synchronized关键字，它包括两种方法：synchronized方法  synchronized块

   ```java
   //同步方法
   public synchronizied void method(int args){}
   ```

2. synchronized方法控制对“对象”的访问，每个对象对应一把锁，每个synchronized方法都必须获得调用该方法的对象的锁才能执行，否则线程会阻塞，方法一旦执行，就独占该锁，直到该方法返回才释放锁，后面被阻塞的线程才能获得这个锁，继续执行

   + 缺陷：若将一个大的方法申明为synchronized将会影响效率
   + 方法里面只需要修改的才需要锁，锁太多影响性能

   + synchronized默认锁的是this

#### 同步块

1. synchronized(Obj){}
2. Obj 称为同步监视器
   + Obj可以是任何对象，但是推荐使用共享资源作为同步监视器
   + 同步方法中无需指定同步监视器，因为同步方法的同步监视器就是this，就是这个对象本身，或者是class
3. 同步监视器的执行过程
   + 第一个线程访问，锁定同步监视器，执行其中代码
   + 第二个线程访问，发现同步监视器被锁定，无法访问
   + 第一个线程访问完毕，解锁同步监视器
   + 第二个线程访问，发现同步监视器没有锁，然后锁定并访问

#### JUC安全类的集合

```java
//测试JUC安全类的集合
public class TestJUC {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
```

#### 死锁

1. 多个线程各自占有一些共享资源，并且互相等待其他线程占有的资源才能运行，而导致两个或者多个线程都在等待对方释放资源，都停止执行的情形，某一个同步块同时拥有“两个以上对象的锁”就会有可能出现死锁的现象

   + 多个线程各自占用共有资源
   + 多个线程等待
   + 某一个同步块同时拥有两个以上对象的锁

2. 产生死锁的四个必要条件

   + 互斥条件：一个资源每次只能被一个进程使用

   + 请求与保持条件：一个进程因请求资源而阻塞时，对已获得的资源保持不放

   + 不剥夺条件：进程已获得的资源，在未使用完之前，不能强行剥夺

   + 循环等待条件：若干进程之间形成一种头尾相接的循环等待资源关系

     四个死锁的必要条件，只要想办法破坏其中的任意一个或多个条件就可以避免死锁发生

#### Lock（锁）

1. 从JDK5.0开始，java提供了更强打的线程同步机制--通过显式定义同步锁对象来实现同步。同步锁使用Lock对象充当
2. java.util.concurrent.locks.Look接口是控制多个线程对共享资源进行访问的工具。锁提供了对共享资源的独占访问，每次只能由一个线程对Lock对象加锁，线程开始访问共享资源之前应先获得Lock对象
3. ReentrantLock类实现了Lock,它拥有与synchronized相同的并发性和内存语义，在实现线程安全的控制中，比较常用的是ReentrantLock，可以显式加锁、释放锁

#### synchronized和Lock的对比

1. Lock是显式锁（手动开启和关闭锁，别忘记关闭锁）synchronized是隐式锁，除了作用域自动释放
2. Lock只有代码块锁，synchronized有代码块锁和方法锁
3. 使用Lock锁，JVM将花费较少时间来调度线程，性能更好。并且具有更好的扩展性（提供更多的子类）
4. 优先使用顺序
   + lock >同步代码块（已经进入了方法体，分配了相应资源）> 同步方法（在方法体之外）

### 线程协作

+ 生产者消费者模式  +问题
+ 生产者生产，消费者消费，两者互不干扰，相互通信
+ 解决方法
  + 缓冲池法
  + 信号法

#### 管程法

#### 使用线程池

1. 背景：经常创建和销毁、使用量特别大的资源，比如并发情况下的线程，对性能影响很大。

2. 思路：提前创建好多个线程，放入线程池中，使用时直接获取，使用完返回池中。可以避免频繁创建销毁、实现重复利用。类似生活中的公共交通工具

3. 好处

   + 提高响应速度（减少了创建新线程的时间）
   + 降低资源消耗（重复利用线程池中线程，不需要每次都创建）
   + 便于线程管理（）
     + corePoolSize:核心池的大小
     + maximumPoolSize:最大线程数
     + keepAliveTime: 线程没有任务时最多保持多长时间后会终止

   API：Executor

### 多并发

1. ![image-20210310221525138](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210310221525138.png)

java.util 工具包

1. 业务：普通的线程代码 Thread
2. Runnable 没有返回值、效率比Callable低

#### 线程和进程

+ 线程和进程，如果不能使用一句话说出来的技术，不扎实

+ 一个进程往往可以包含多个线程，至少包含一个

+ Java默认有几个线程？2个 main、 GC

+ 线程：开了一个进程Typora  写字 自动保存

+ 对java而言：Thread、Runnable、Callable

+ Java能开启一个线程吗？不能，有native 本地方法开启，java没有这个权限开启

  ```java
  public synchronized void start() {
      /**
       * This method is not invoked for the main method thread or "system"
       * group threads created/set up by the VM. Any new functionality added
       * to this method in the future may have to also be added to the VM.
       *
       * A zero status value corresponds to state "NEW".
       */
      if (threadStatus != 0)
          throw new IllegalThreadStateException();
  
      /* Notify the group that this thread is about to be started
       * so that it can be added to the group's list of threads
       * and the group's unstarted count can be decremented. */
      group.add(this);
  
      boolean started = false;
      try {
          start0();
          started = true;
      } finally {
          try {
              if (!started) {
                  group.threadStartFailed(this);
              }
          } catch (Throwable ignore) {
              /* do nothing. If start0 threw a Throwable then
                it will be passed up the call stack */
          }
      }
  }
  //本地方法，调用底层c++,Java无法操作硬件（建立虚拟机之上的）
  private native void start0();
  ```

+ 并发、并行

  + 并发（多线程操作同一个资源）

    + CPU单核，模拟出来多条线程

  + 并行（多个人一起行走）

    + CPU多核，多线程同时执行

  + ```java
    public class Test {
        public static void main(String[] args) {
            //获取cpu的核数
            //cpu密集型、IO密集型
            System.out.println(Runtime.getRuntime().availableProcessors());
        }
    }
    ```

  + 并发编程的本质：充分利用CPU的资源

##### 线程状态。6种

+ ```java
  public enum State {
      //新生
      NEW,
  
      //运行
      RUNNABLE,
  
     //阻塞
      BLOCKED,
  
      //等待，死死的等
      WAITING,
  
    //超时等待
      TIMED_WAITING,
  
     //终止
      TERMINATED;
  }
  ```

##### wait/sleep区别

1. 类不同

   + wait => Object 

   + sleep = > Thread

2. 关于锁的释放

   + wait 会释放锁，sleep睡觉锁，不释放锁

3. 使用范围不同

   + wait
     + 必须在同步代码块种
   + sleep 可以在任何地方睡

4. 是否需要捕获异常

   + wait 不需要捕获异常
   + sleep 需要捕获异常

##### Lock锁

1. 传统synchronized
2. 真正的多线程开发，公司中的开发，降低耦合性
   + 线程就是一个单独的资源类，没有任何附属的操作
   + 属性、方法
   + ![image-20210310233505829](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210310233505829.png)
   + ​	![image-20210310233619247](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210310233619247.png)
   
   + ![image-20210310235008578](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210310235008578.png)
   
   + 公平锁：十分公平：可以先来后到
   + 非公平锁：十分不公平：可以插队（默认）

##### synchronized 和 Lock的区别

1. synchronized 内置的Java关键字 Lock 是一个类
2. synchronized 无法判断获取锁的状态，Lock 可以判断是否获取到了锁
3. Synchronized 会自动释放锁，lock必须要手动释放锁！如果不释放锁，死锁
4. synchronized 线程1（获得锁，阻塞）、线程2（等待，傻等）；Lock就不一定会等待下去
   + lock.tryLock() 尝试获取锁 尝试去防止阻塞等待
5. synchronized 可重入锁，不可以中断的，非公平；Lock，可重入锁，可以判断锁，非公平（可以自己设置）
6. synchronized 适合锁少量的代码同步问题，Lock适合锁大量的同步代码



##### 公司是挣钱的，服务器崩了那就完了，细节决定成败

#### 生产者何消费者问题

面试题：单例模式、排序算法、生产者和消费者、死锁

synchronized版 wait notify

Juc lock

+ 线程之间的通信问题：生产者和消费者问题！等待唤醒，通知唤醒
+ 线程交替执行 A B 操作同一变量 num=0
+ A num+1 B num-1

+ ```java
  public class A {
      public static void main(String[] args) {
          Data data = new Data();
          new Thread(() -> {
              for (int i = 0; i < 10; i++) {
                  try {
                      data.increment();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          },"A").start();
          new Thread(() -> {
              for (int i = 0; i < 10; i++) {
                  try {
                      data.decrement();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          },"B").start();
      }
  }
  //判断等待，业务，通知
  class Data{
      private  int number = 0;
      //+1
      public synchronized void increment() throws InterruptedException {
          if (number != 0){
              //等待
              this.wait();
          }
          number++;
          System.out.println(Thread.currentThread().getName()+"=>"+number);
          //通知其他线程 我完毕了
          this.notifyAll();
      }
      //-1
      public synchronized void decrement() throws InterruptedException {
          if (number == 0){
              this.wait();
              //等待
          }
          number--;
          System.out.println(Thread.currentThread().getName()+"=>"+number);
          //通知其他线程 我完毕了
          this.notifyAll();
      }
  }
  ```

+ 问题：存在ABCD 四个线程，输出结果会出错

+ 这里我解释下：同步方法确实是不会同时进入到代码块中，但是在if语句块中使用了wait()等待，导致释放了锁，当其他线程通知该等待线程重新恢复时，由于恢复位置在if语句块中，wait是释放锁的，唤醒的时候还是随机抢锁，被别的线程抢到锁，唤醒的线程（已经过了判断语句）就得等锁，出问题

+ ![image-20210311003709225](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210311003709225.png)

+ 是生产者notifyall时，是另外一个正在wait的生产者抢到了锁。唤醒是唤醒了多个，但只有一个抢到了锁

+ 防止虚假唤醒

+ ```java
  public class A {
      public static void main(String[] args) {
          Data data = new Data();
          new Thread(() -> {
              for (int i = 0; i < 100; i++) {
                  try {
                      data.increment();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          },"A").start();
          new Thread(() -> {
              for (int i = 0; i < 100; i++) {
                  try {
                      data.decrement();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          },"B").start();
          new Thread(() -> {
              for (int i = 0; i < 100; i++) {
                  try {
                      data.increment();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          },"C").start();new Thread(() -> {
              for (int i = 0; i < 100; i++) {
                  try {
                      data.decrement();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          },"D").start();
      }
  }
  //判断等待，业务，通知
  class Data{
      private  int number = 0;
      //+1
      public synchronized void increment() throws InterruptedException {
          while (number != 0){
              //等待
              this.wait();
          }
          number++;
          System.out.println(Thread.currentThread().getName()+"=>"+number);
          //通知其他线程 我完毕了
          this.notifyAll();
      }
      //-1
      public synchronized void decrement() throws InterruptedException {
          while (number == 0){
              this.wait();
              //等待
          }
          number--;
          System.out.println(Thread.currentThread().getName()+"=>"+number);
          //通知其他线程 我完毕了
          this.notifyAll();
      }
  }
  ```

#### 探索新知识的方法

1. 新旧对比![image-20210311005247116](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210311005247116.png)

2. 通过Lock 帮助文档 发现方法
   
+ ![image-20210311005409250](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210311005409250.png)
  
3. 任何一个新的技术，绝对不是仅仅知识覆盖了原来的技术，优势和补充

4. 替换后问题 随机无序

5. ![image-20210311010627076](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210311010627076.png)

6. condition精准的通知和唤醒线程

   + ```java
     import java.util.concurrent.locks.Condition;
     import java.util.concurrent.locks.Lock;
     import java.util.concurrent.locks.ReentrantLock;
     
     public class C {
         public static void main(String[] args) {
             Data3 data3 = new Data3();
             new Thread(() -> {
                 for (int i = 0; i < 10; i++) {
                     data3.printA();
                 }
             }).start();
             new Thread(() -> {
                 for (int i = 0; i < 10; i++) {
                     data3.printB();
                 }
             }).start();
             new Thread(() -> {
                 for (int i = 0; i < 10; i++) {
                     data3.printC();
                 }
             }).start();
         }
     }
     class Data3 extends Thread{
         private Lock lock = new ReentrantLock();
         private Condition condition1 = lock.newCondition();
         private Condition condition2 = lock.newCondition();
         private Condition condition3 = lock.newCondition();
     
         private  int number = 1;//1A 2B 3C
     
         public  void printA(){
             lock.lock();
             //业务，判断 -> 执行-> 通知
             try {
                 while (number !=1 ){
                     condition1.await();
                 }
                 System.out.println(Thread.currentThread().getName()+"-> AAAAAA");
                 number =2;//通知2去执行
                 condition2.signalAll();
             } catch (Exception e) {
                 e.printStackTrace();
             }finally {
                 lock.unlock();
             }
         }
     
         public  void printB(){
             lock.lock();
             //业务，判断 -> 执行-> 通知
             try {
                 while (number !=2){
                     condition2.await();
                 }
                 System.out.println(Thread.currentThread().getName()+"->BBBBBBB");
                 number =3;
                 condition3.signalAll();
             } catch (Exception e) {
                 e.printStackTrace();
             }finally {
                 lock.unlock();
             }
         }
     
         public  void printC(){
             lock.lock();
             //业务，判断 -> 执行-> 通知
             //生产线：下单 -> 支付 -> 交易 -> 物流
             try {
                 while (number !=3){
                     condition3.await();
                 }
                 System.out.println(Thread.currentThread().getName()+"->CCCCCCC ");
                 number =1;
                 condition1.signalAll();
             } catch (Exception e) {
                 e.printStackTrace();
             }finally {
                 lock.unlock();
             }
         }
     }
     ```

#### 8锁现象

锁是什么？如何判断锁的是谁？

对象、class

new  this 具体的手机

static 静态 class

```java
import base.oop.demo09.TimeService;
//标准情况下 两个线程先打印 发短信 打电话
//发短信延时4s   还是发短信 打电话  是因为有锁的存在 synchronized 锁的对象是方法的调用者 两个方法用的是同一把锁，谁先拿到谁先执行
import java.util.concurrent.TimeUnit;

public class Lock8 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        new Thread(() -> {
           phone.sendSms();
        },"A").start();
        //捕获
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(() -> {
            phone.call();
        },"B").start();
    }
}
class Phone{
    public synchronized void sendSms(){
        System.out.println("发短信");
    }
    public synchronized void call(){
        System.out.println("打电话");
    }
}
```

​	

```java
import java.util.concurrent.TimeUnit;
//3.增加一个普通方法hello() 先执行发短信还是先执行hello  ； hello  再执行发短信
//4.两个对象，两个同步方法，先执行发短信 还是先执行hello？
public class Test02 {
    public static void main(String[] args) {
        Phone1 phone1 = new Phone1();
        Phone1 phone2 = new Phone1();
        new Thread(() -> {
            phone1.sendSms();
        },"A").start();
        //捕获
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(() -> {
            phone2.call();
        },"B").start();
    }
}
class Phone1{
    public synchronized void sendSms(){
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信");
    }
    public synchronized void call(){
        System.out.println("打电话");
    }
    //这里没有锁，不受锁得影响
    public  void hello(){
        System.out.println("hello");
    }
}
```

```java
import java.util.concurrent.TimeUnit;
//两个静态的同步方法，只有一个对象，先打印 发短信还是打电话 / 先发短信再打电话 ，在synchronized 的情况下，由于有static 锁的对象为class
//两个对象的情况下，两个静态的同步方法，只有一个对象，先打印 发短信还是打电话 ，//也还是先发短信 再打电话

public class Test03 {
    public static void main(String[] args) {
        Phone2 phone2 = new Phone2();
        Phone2 phone1 = new Phone2();
        new Thread(() -> {
            phone1.sendSms();
        },"A").start();
        //捕获
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(() -> {
            phone2.call();
        },"B").start();
    }
}
class Phone2{
    //锁的是class
    //用的是static
    public static synchronized void sendSms(){
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信");
    }
    public static synchronized void call(){
        System.out.println("打电话");
    }
    //这里没有锁，不受锁得影响
    public  void hello(){
        System.out.println("hello");
    }
}
```

```java
import java.util.concurrent.TimeUnit;
//1个静态方法 发短信 1个普通的同步方法，打电话。先运行发短信 还是打电话？ //先运行打电话 ，再进行发短信 因为静态锁的是class类，普通锁的调用者，两者不同，无需等待，
//1个静态方法 发短信 1个普通的同步方法，2个对象  打电话。先运行发短信 还是打电话？ //先打电话
public class Test04 {
    public static void main(String[] args) {
        Phone3 phone2 = new Phone3();
        Phone3 phone1 = new Phone3();
        new Thread(() -> {
            phone1.sendSms();
        },"A").start();
        //捕获
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(() -> {
            phone2.call();
        },"B").start();
    }
}
class Phone3{
    //锁的是class
    //用的是static
    public static synchronized void sendSms(){
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信");

    }//锁的是调用者
    public  synchronized void call(){
        System.out.println("打电话");
    }
    //这里没有锁，不受锁得影响
    public  void hello(){
        System.out.println("hello");
    }
}
```

#### 集合类不安全

#### String类

+ 利用String类来创造和操作字符串

+ String类不可变，底层由final 修饰

  + 如

    ```java
    private final char value[];
    ```

  + ```java
    private static final long serialVersionUID = -6849794470754667710L;
    ```

    版本序列化：目的是为了验证版本的一致性，

    **JVM会把传来的字节流中的serialVersionUID于本地相应实体类的serialVersionUID进行比较。如果相同说明是一致的，可以进行反序列化，否则会出现反序列化版本一致的异常，即是InvalidCastException。**

+ 有11种构造方法

  + 提供字符数组参数

    ```java
    public class TestString {
        public static void main(String[] args) {
            char[] helloArray = {'h','e','l','l','o'};
            String helloString =new String(helloArray);
            System.out.println(helloString);
        }
    }
    ```

  + stringnameone.length() 字符串长度

  + stringnameone.concat(stringnametwo)连接字符串

  +  charAt(6) ,指定索引的 字符串

  + str1.compareTo(str2 )

  + compareTolgnoreCase() 按字典顺序比较两个字符串

  + str1 concat(str2 ) 字符串连接

  + str1.equals(str2)

    ```java
    public class TestString {
        public static void main(String[] args) {
            char[] helloArray = {'h','e','l','l','o'};
            String helloString =new String(helloArray);
            System.out.println(helloString);
            int len = helloString.length();
            System.out.println("字符串长度为："+len);
            String worldString = new String(" world");
            System.out.println((helloString.concat(worldString)));
            int cmp=helloString.compareTo(worldString);
            System.out.println(cmp);
            char x=helloString.charAt(1);
            char y=worldString.charAt(1);
            System.out.println(x);
            System.out.println(y);
        }
    }
    ```

#### enum枚举

+ 自定义常量  java.lang.Enum类
+ values() 返回枚举类中的所有值
+ ordinal() 找到对应的索引
+ valueOf() 返回字符串值得枚举常量

##### List不安全



![image-20210312170546611](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312170546611.png)

![image-20210312170755669](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312170755669.png)

![image-20210312171058407](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312171058407.png)

```java
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

//java.util.ConcurrentModificationException 并发修改异常 还可以扩展：内存溢出 栈溢出
public class ListTest {
    public static void main(String[] args) {
        //并发下ArrayList 不安全
        //解决方案：
        //1.List<String> list = new Vector<>();
        //2.List<String> list = Collections.synchronizedList(new ArrayList<>());
        //3.List<String> list = new CopyOnWriteArrayList<>() //JUC 解决方案
        //CopyOnWrite 写入时复制 COW 计算机程序设计的一种优化策略
        //多个线程调用的时候，list，读取的时候，固定的，写入 （覆盖）
        //读写分离
        //CopyOnWrite 比Vector<>() 高级的原因  Vector<>()有用synchronized 的锁 CopyOnWrite 用的是lock锁
        List<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i <= 10; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
    }
}
```

##### 学习方法

+ 先会用
+ 货比三家、需要其他解决方案
+ 分析源码

#### Set类

![image-20210312172150631](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312172150631.png)

![image-20210312173319530](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312173319530.png)

1. hashSet底层

   + ```java
     public HashSet() {
         map = new HashMap<>();
     }
     ```

2. 寻找add 中的 HashSet方法

   ![image-20210312174133168](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312174133168.png)

   + ```java
     public boolean add(E e) {
         return map.put(e, PRESENT)==null;
     }
     //add set 本质就是 map key 是无法重复的
     ```

   + ```java
     // Dummy value to associate with an Object in the backing Map
     private static final Object PRESENT = new Object();
     //不变的值
     ```

#### HashMap

1. ![image-20210312174809993](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312174809993.png)

2. ![image-20210312175100427](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312175100427.png)

   + 回顾
   + ![image-20210312175659848](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312175659848.png)

   2.ConcurrentHashMap 研究ConcurrentHashMap原理

#### Callable（简单）

![image-20210312181128524](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312181128524.png)

1. 可以有返回值

2. 可以抛出异常

3. 方法不同、run()/ call()

4. ![image-20210312181345977](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312181345977.png)

   + ![image-20210312182104917](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312182104917.png)

   + ![image-20210312182120512](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312182120512.png)![image-20210312182222949](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312182222949.png)

   + ```java
     import java.util.concurrent.Callable;
     import java.util.concurrent.ExecutionException;
     import java.util.concurrent.FutureTask;
     
     public class CallableTest {
         public static void main(String[] args) throws ExecutionException, InterruptedException {
             //new Thread(new Runnable()).start();
             //new Thread(new FutureTask<V>()).start();
             //new Thread(new FutureTask<V>(Callable)).start();
             new Thread().start();//怎么启用Callable 先调用Runnable  再调用Thread
             myThread thread = new myThread();
             FutureTask futureTask = new FutureTask(thread);//配饰类
     
             new Thread(futureTask,"A").start();
             new Thread(futureTask,"B").start();//结果会被缓存，提高效率
             Integer o =(Integer) futureTask.get();//获取Callable的返回结果//get方法可能会阻塞 把他放到最后 或者异步通信处理
             System.out.println(o);
         }
     }
     class myThread implements Callable<Integer>{
     
         @Override
         public Integer call(){
             System.out.println("call()");
             return 1024;
             }
     }
     ```

   + 细节 有缓存
   + 结果可能需要等待，有缓存



![image-20210312210122388](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312210122388.png)

#### CountDownLatch

+  countDownLatch.countDown();//数量-1

+ countDownLatch.await();//等待计数器清零

+ ```java
  public class CountDownLatchDemo {
      public static void main(String[] args) throws InterruptedException {
          //总数是6 必须要执行任务的时候 再使用
          CountDownLatch countDownLatch = new CountDownLatch(6);
          for (int i = 0; i <= 6; i++) {
              new Thread(() -> {
                  System.out.println(Thread.currentThread().getName()+"GO out");
                  countDownLatch.countDown();//数量-1
              },String.valueOf(i)).start();
          }
          countDownLatch.await();
          System.out.println("Close Door");
      }
  }
  ```

#### 线程加法计数器CyclicBarrier

+ ```java
  import java.util.concurrent.BrokenBarrierException;
  import java.util.concurrent.CyclicBarrier;
  
  public class CyclicBarrierDemo {
      public static void main(String[] args) {
          CyclicBarrier cyclicBarrier = new CyclicBarrier(7,() -> {
              System.out.println("召唤神龙成功");
          });
          for (int i = 0; i <= 7; i++) {
              final int temp = i;
              //lambda能操作到i 吗？ 不能 需要个中间量
              new Thread( () -> {
                  System.out.println(Thread.currentThread().getName()+"收集"+temp+"龙珠");
                  try {
                      cyclicBarrier.await();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  } catch (BrokenBarrierException e) {
                      e.printStackTrace();
                  }
              }).start();
          }
          //Thread-0收集0龙珠
          //Thread-5收集5龙珠
          //Thread-7收集7龙珠
          //Thread-4收集4龙珠
          //Thread-3收集3龙珠
          //Thread-2收集2龙珠
          //Thread-1收集1龙珠
          //Thread-6收集6龙珠
          //召唤神龙成功
      }
  }
  ```

#### Semaphore

+ 抢车位

+ ```java
  semaphore.acquire();//获得，假设已经满了，等待，等待被释放为止
  ```

+ ```java
  semaphore.release();//release()释放，会将当前的信号量释放+1，然后唤醒等待的线程
  ```

+ 作用：多个共享资源互斥的使用！并发限流，控制最大的线程数！

+ ```java
  import java.util.concurrent.Semaphore;
  import java.util.concurrent.TimeUnit;
  
  public class SemaphoreDemo {
      public static void main(String[] args) {
          //线程数量：停车位 限流  规范
          Semaphore semaphore = new Semaphore(3);
          for (int i = 0; i <= 6; i++) {
              new Thread( () -> {
                  //acquire() 得到
                  try {
                      semaphore.acquire();
                      System.out.println(Thread.currentThread().getName()+"抢车位");
                      TimeUnit.SECONDS.sleep(2);
                      System.out.println(Thread.currentThread().getName()+"离开车位");
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }finally {
                      semaphore.release();//release()释放
                  }
                  //release() 释放
              },String.valueOf(i)).start();
          }
      }
  }
  ```

#### 读写锁ReadWriteLock

1. 读可以被多个线程读，写的时候只有一个线程写

2. 独占锁（写锁）一次只有一个线程占有

3. 共享锁（读锁）多个线程可以同时占有

4. ```java
   import java.util.HashMap;
   import java.util.Map;
   import java.util.concurrent.locks.Lock;
   import java.util.concurrent.locks.ReentrantLock;
   import java.util.concurrent.locks.ReentrantReadWriteLock;
   
   //问题：有多个线程写入
   public class ReadWriteLock {
       public static void main(String[] args) {
           MyCach2 myCache = new MyCache2();
           for (int i = 1; i <= 5; i++) {
               final int temp = i;
               new Thread( () -> {
                   myCache.put(temp+" ",temp+" ");
               },String.valueOf(temp)).start();
           }
           for (int i = 1; i <= 5; i++) {
               final int temp = i;
               new Thread( () -> {
                   myCache.get(temp+" ");
               },String.valueOf(temp)).start();
           }
       }
   }
   //加锁的e
   class MyCache2{
       private volatile Map<String,Object> map = new HashMap<>();
       private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
       //存 ，写人的时候，只希望
       public void put(String key,Object value){
           readWriteLock.writeLock().lock();
   
   
           try {
               System.out.println(Thread.currentThread().getName()+"写入"+key);
               map.put(key,value);
               System.out.println(Thread.currentThread().getName()+"写入OK");
           } catch (Exception e) {
               e.printStackTrace();
           }finally {
               readWriteLock.writeLock().unlock();
           }
       }
       //取，读
       public void get(String key){
           readWriteLock.readLock().lock();
   
           try {
               System.out.println(Thread.currentThread().getName()+"读取"+key);
               Object o = map.get(key);
               System.out.println(Thread.currentThread().getName()+"读取OK");
           } catch (Exception e) {
               e.printStackTrace();
           }finally {
               readWriteLock.readLock().unlock();
           }
       }
   }
   //无锁
   class MyCache{
       private volatile Map<String,Object> map = new HashMap<>();
       //存 ，写
       public void put(String key,Object value){
           System.out.println(Thread.currentThread().getName()+"写入"+key);
           map.put(key,value);
           System.out.println(Thread.currentThread().getName()+"写入OK");
       }
       //取，读
       public void get(String key){
           System.out.println(Thread.currentThread().getName()+"读取"+key);
           Object o = map.get(key);
           System.out.println(Thread.currentThread().getName()+"读取OK");
       }
   }
   ```

#### 阻塞队列 BlockingQueue

1. 阻塞 FIFO 先进先出 写入时队列满就必须阻塞等待
2. 取：如果队列空的，必须阻塞等待生产
3. 阻塞队列
4. ![image-20210312233503197](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312233503197.png)

5. ![image-20210312234525453](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312234525453.png)

+ 由图可看出BlockingQueue 本身就是个队列

+ 什么情况下我们会使用阻塞队列：
  
  + 多线程并发处理，线程池
+ ![image-20210312235807492](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210312235807492.png)

+ ![image-20210313000007910](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210313000007910.png)

+ 学会使用队列

  + 添加、移除

+ 四组API

  + 抛出异常

  + 不会抛出异常

  + 阻塞等待

  + 等待超时

  + | 方式       | 抛出异常 | 有返回值 | 阻塞等待 | 等待超时  |
    | ---------- | -------- | -------- | -------- | --------- |
    | 添加       | add      | offer()  | put()    | offer(,,) |
    | 移除       | remove   | poll()   | take()   | poll(,)   |
    | 判断队列首 | element  | peek     |          |           |

  + ```java
    import java.util.Arrays;
    import java.util.Collection;
    import java.util.concurrent.ArrayBlockingQueue;
    import java.util.concurrent.TimeUnit;
    
    public class BlockingQueueTest {
        public static void main(String[] args) throws InterruptedException {
            //collection
            //List
            //Set
            //抛出异常
            test4();
        }
        public static void test1(){
            //队列大小
            ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue<>(3);
            System.out.println(blockingQueue.add("a"));
            System.out.println(blockingQueue.add("b"));
            System.out.println(blockingQueue.add("c"));
            //System.out.println(blockingQueue.add("d"));//java.lang.IllegalStateException: Queue full
            System.out.println(blockingQueue.element());//知道队首是 a
            System.out.println("====================");
    
            System.out.println(blockingQueue.remove());
            System.out.println(blockingQueue.element());//移除a后 队首是b
            System.out.println(blockingQueue.remove());
            System.out.println(blockingQueue.remove());
            //System.out.println(blockingQueue.remove());//java.util.NoSuchElementException
        }
        public static void test2(){
            ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue<>(3);
    
            System.out.println(blockingQueue.offer("a"));
            System.out.println(blockingQueue.offer("b"));
            System.out.println(blockingQueue.offer("c"));
            System.out.println(blockingQueue.offer("d"));//返回false
            System.out.println(blockingQueue.peek());//知道队首是a
    
            System.out.println("========================");
            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll());//返回值 null
    
        }
        public static void test3() throws InterruptedException {
            ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue<>(3);
            blockingQueue.put("a");
            blockingQueue.put("b");
            blockingQueue.put("c");
            //blockingQueue.put("d");//知道写入d时 一直等待 直到d能写入为止
            System.out.println("==============");
            System.out.println(blockingQueue.take());
            System.out.println(blockingQueue.take());
            System.out.println(blockingQueue.take());
    //        System.out.println(blockingQueue.take());//一直读取 直到能读为止
        }
        public static void test4() throws InterruptedException {
            ArrayBlockingQueue<Object> blockingQueue = new ArrayBlockingQueue<>(3);
            blockingQueue.offer("a",2, TimeUnit.SECONDS);
            blockingQueue.offer("b",2, TimeUnit.SECONDS);
            blockingQueue.offer("c",2, TimeUnit.SECONDS);
            //blockingQueue.offer("d",2, TimeUnit.SECONDS);//等待2s写入，2s无法写入就退出
            System.out.println(blockingQueue.poll(2,TimeUnit.SECONDS));
            System.out.println(blockingQueue.poll(2,TimeUnit.SECONDS));
            System.out.println(blockingQueue.poll(2,TimeUnit.SECONDS));
            System.out.println(blockingQueue.poll(2,TimeUnit.SECONDS));//等待2秒读取 如果读取超时失败 返回null
        }
    }
    ```

双端队列

+ 两端可写入

##### 同步队列

1. 同步队列中的put、和take语法



#### 线程池（重点）

1. 池化技术
   + 程序的运行，本质：占用系统的资源！优化资源的使用！ 
   + 线程池、连接池、内存池、对象池//创建、销毁、十分浪费资源
   + 池化技术: 事先准备资源，有人要用，就拿，用完还我
   + 默认大小：2
   + max: 
2. 线程池的好处：
   + 降低资源消耗
   + 提高响应速度
   + 方便管理
   + 线程复用、可以控制最大并发数、管理线程

3. 线程的三大方法

   ![image-20210316190611439](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210316190611439.png)

4. 源码分析

   + ```java
     public static ExecutorService newCachedThreadPool() {
         return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                                       60L, TimeUnit.SECONDS,
                                       new SynchronousQueue<Runnable>());
     }
     ```

   + ```java
     public static ExecutorService newFixedThreadPool(int nThreads) {
         return new ThreadPoolExecutor(nThreads, nThreads,
                                       0L, TimeUnit.MILLISECONDS,
                                       new LinkedBlockingQueue<Runnable>());
     }
     ```

   + ```java
     public static ExecutorService newSingleThreadExecutor() {
         return new FinalizableDelegatedExecutorService
             (new ThreadPoolExecutor(1, 1,
                                     0L, TimeUnit.MILLISECONDS,
                                     new LinkedBlockingQueue<Runnable>()));
     }
     ```

5. 本质ThreadPoolExecutor分析

   + ```java
     public ThreadPoolExecutor(int corePoolSize,//核心线程池大小
                               int maximumPoolSize,//最大核心线程池大小
                               long keepAliveTime,//超时了没有人调用就会释放
                               TimeUnit unit,//超时单位
                               BlockingQueue<Runnable> workQueue,//阻塞队列
                               ThreadFactory threadFactory,//线程工厂，创建线程的一般不用
                               RejectedExecutionHandler handler//拒绝策略) {
         if (corePoolSize < 0 ||
             maximumPoolSize <= 0 ||
             maximumPoolSize < corePoolSize ||
             keepAliveTime < 0)
             throw new IllegalArgumentException();
         if (workQueue == null || threadFactory == null || handler == null)
             throw new NullPointerException();
         this.acc = System.getSecurityManager() == null ?
                 null :
                 AccessController.getContext();
         this.corePoolSize = corePoolSize;
         this.maximumPoolSize = maximumPoolSize;
         this.workQueue = workQueue;
         this.keepAliveTime = unit.toNanos(keepAliveTime);
         this.threadFactory = threadFactory;
         this.handler = handler;
     }
     ```

6. 7大要素设置
7. 4种拒绝策略
   
   + ![image-20210316194548294](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210316194548294.png)
   
   + 如何找到默认值
   
     + ![image-20210317160608279](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210317160608279.png)
     + ![image-20210317160710009](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210317160710009.png)
   
     + ![image-20210317160751380](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210317160751380.png)
   
     + ![image-20210317160825093](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210317160825093.png)
   
   + ```java
     new ThreadPoolExecutor.AbortPolicy()//银行满员，还有人进来，不处理抛出异常 
         //RejectedExecutionException
     new ThreadPoolExecutor.CallerRunsPolicy()//哪来的回哪去 main线程执行
     new ThreadPoolExecutor.DiscardPolicy()//队列满了,不会抛出异常，丢掉任务
     new ThreadPoolExecutor.DiscardOldestPolicy()//队列满了，尝试竞争，满了扔掉，竞争到了运行，不跑出异常
     
     ```
   
   + 如何定义最大线程池
     + ```java
       *
        最大线程到底如何定义
        1.CPU 密集型，几核就是几，
        2.IO 密集型 > 判断你程序中十分耗io的线程有多少个
           程序 15个大型任务，io十分占用资源
        */
       //获取CPU核数
       System.out.println(Runtime.getRuntime().availableProcessors());
       ```

### 四大函数式接口

1. 新时代函数接口：lambda 表达式、链表编程、函数式接口、Stream流式计算

2. JDK1.5 泛型、枚举、反射

3. 函数式接口：只有一个方法的接口

   + ```java
     @FunctionalInterface
     public interface Runnable{
         public abstract void run();
     }
     ```

4. ![image-20210317164919658](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210317164919658.png)

3. Function接口

   + ![image-20210317170347661](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210317170347661.png)

   + ```java
     public static void main(String[] args) {
     //        Function function = new Function<String, String>() {
     //            @Override
     //            public String apply(String str) {
     //                return str;
     //            }
     //        };
             Function<String, String> function = str ->{return str;};
             //lambda 表达式简写
             System.out.println(function.apply("ast"));
         }
     }
     ```

4. Predicate接口

   + ![image-20210317191804439](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210317191804439.png)

   + ```java
     /*
     * 断定型接口:有一个输入参数，返回值只能是布尔值
     * */
     public class Demo02 {
         public static void main(String[] args) {
             //判断字符串是否为空
     //        Predicate<String> predicate = new Predicate<String>(){
     //            @Override
     //            public boolean test(String str) {
     //                return str.isEmpty();
     //            }
     //        };
             Predicate<String> predicate =str -> {
                 return str.isEmpty();
             };
             System.out.println(predicate.test(""));
         }
     }
     ```

5. Consumer消费型接口：只有输入。没有返回值

   + ![image-20210317192909688](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210317192909688.png)

   + ```java
     /*Consumer消费型接口：只有输入。没有返回值、
     * */
     public class Demo03 {
         public static void main(String[] args) {
             //打印字符串
     //        Consumer<String> consumer = new Consumer<String>(){
     //            @Override
     //            public void accept(String str) {
     //                System.out.println(str);
     //            }
     //        };
     //         consumer.accept("asfts");
             Consumer<String> consumer =str -> { 
                 System.out.println(str);
             };
             consumer.accept("aststr");
         }
     }
     ```

6. Supplier 供给型接口

   + ![image-20210317194136232](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210317194136232.png)

   + ```java
     /*供给型接口： 得到一个结果 返回一个结果
     * */
     public class Demo04 {
         public static void main(String[] args) {
     //        Supplier<Integer> supplier = new Supplier<Integer>(){
     //            @Override
     //            public Integer get() {
     //                System.out.println("get()");
     //                return 1024;
     //            }
     //        };
             Supplier supplier = () -> {
                 return 1024;
             };
             System.out.println(supplier.get());
         }
     }
     ```

#### Stream流计算

1. 大数据：存储+计算

2. 集合、MySQL本质就是存储东西

3. 计算都交给流来操作

4. ```java
   //有参、无参构造、get、 set、toString 方法
   //使用lombok 简化这些方法
   
   public class User {
        private int id ;
        private String name ;
        private int age;
   
       public int getId() {
           return id;
       }
   
       public void setId(int id) {
           this.id = id;
       }
   
       public String getName() {
           return name;
       }
   
       public void setName(String name) {
           this.name = name;
       }
   
       public int getAge() {
           return age;
       }
   
       public void setAge(int age) {
           this.age = age;
       }
       public User (int id,String name, int age){
           this.id = id;
           this.name = name;
           this.age = age;
       }
   }
   ```

5. ```java
   import java.util.Arrays;
   import java.util.List;
   import java.util.Locale;
   /*
   * 现在有5名用户 筛选：
   * 1.ID 必须是偶数
   * 2.年龄必须是大于23岁
   * 3.用户名转为大写字母
   * 4.用户名字母倒序
   * 5.只输出一个用户
   * */
   public class Test {
       public static void main(String[] args) {
           User u1 = new User(1,"a",20);
           User u2 = new User(2,"b",21);
           User u3 = new User(3,"c",22);
           User u4 = new User(4,"d",23);
           User u5 = new User(5,"e",24);
           User u6 = new User(6,"f",25);
           //集合就是存储
           List<User> list= Arrays.asList(u1,u2,u3,u4,u5,u6);
           //计算交给Stream流
           list.stream()
                   .filter(u->{ return  u.getId()%2==0; })
                   .filter(u -> { return u.getAge()>23; })
                   .map( u -> { return u.getName().toUpperCase(); })
                   .sorted((uu1,uu2) -> {return  uu2.compareTo(uu1); })
                   .limit(1)
                   .forEach(System.out::println);
       }
   }
   ```

### ForkJoin

1. ![image-20210321012438491](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210321012438491.png)

2. Forkjoin特点
   + 工作窃取：不会让线程去等待，完成的线程帮助运行未完成线程任务
   + 这里边维护的都是双端队列
   + ![image-20210321012631211](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210321012631211.png)
   
3. ![image-20210321014601053](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210321014601053.png)

4. ![image-20210321014843683](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210321014843683.png)

5. ```java
   import java.util.concurrent.RecursiveTask;
   /*
   * 求和计算的任务
   * 3000 6000（ForkJoin）  9000（Stream并行流）
   * 如何使用ForkJoin
   * 1.forkjinPool 通过它来执行
   * 2.计算任务 forkjoinPool.execute(ForkJoinTast tast)
   * 3.计算 要继承forkjoin
   * */
   public class ForkJoin extends RecursiveTask<Long> {
       private Long start;
       private Long end;
   
       //临界值
       private Long temp = 10000L;
   
       public ForkJoin(Long start,long end){
           this.start = start;
           this.end = end;
       }
       @Override
       protected Long compute() {
           if ((end-start)<temp){
               Long sum = 0L;
               for (Long i = start; i <= end; i++) {
                   sum += i;
               }
               return sum;
           }else {//ForkJoin 递归
               long middle = (start+end) /2 ;
               ForkJoin test1 = new ForkJoin(start, middle);
               test1.fork();//拆分任务，把任务压入线程队列
               ForkJoin test2 = new ForkJoin(middle+1,end);
               test2.fork();//拆分任务，把任务压入线程队列
               return test1.join() + test2.join();
           }
       }
   }
   ```

6. ```java
   import java.util.concurrent.ExecutionException;
   import java.util.concurrent.ForkJoinPool;
   import java.util.concurrent.ForkJoinTask;
   import java.util.stream.LongStream;
   
   public class TestForkJoin {
       public static void main(String[] args) throws ExecutionException, InterruptedException {
   //    test1();//sum= 500000000500000000 时间：6179
   //        test2();//sum=500000000500000000时间： 4607
       test3();//sum= 500000000500000000 时间： 215
       }
       //普通程序员
       public static void test1(){
           Long sum = 0L;
           long start = System.currentTimeMillis();
           for (Long i = 1L; i <= 10_0000_0000; i++) {
               sum += i;
           }
           long end = System.currentTimeMillis();
           System.out.println("sum= "+sum+" 时间："+(end-start));
       }
       //会使用forkjoin
       public static void test2() throws ExecutionException, InterruptedException {
           long start = System.currentTimeMillis();
           ForkJoinPool forkJoinPool = new ForkJoinPool();
           ForkJoinTask<Long> test = new ForkJoin(0L,10_0000_0000);//Task 任务
           ForkJoinTask<Long> submit = forkJoinPool.submit(test);//提交任务
   
           Long sum= submit.get();//容易引起阻塞
   
           long end = System.currentTimeMillis();
           System.out.println("sum="+sum+ "时间： "+(end-start));
       }
       //高阶玩家 会用steam流 并行流
       public static void test3(){
           long start = System.currentTimeMillis();
           //.parallel并行计算 reduce 分解 原理 将这些全部分解后再并行计算
           Long sum = LongStream.rangeClosed(0L,10_0000_0000).parallel().reduce(0,Long::sum);
           long end = System.currentTimeMillis();
           System.out.println("sum= "+sum+ " 时间： "+(end-start));
       }
   }
   ```

#### Future

1. 表示异步计算的结果。
   + 检查计算是否完成的方法
   + 等待计算的完成并获取计算的结果
     + 计算完成后只能用get方法来获取结果
2. ![image-20210321150430604](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210321150430604.png)

3. ```java
   import java.util.concurrent.CompletableFuture;
   import java.util.concurrent.ExecutionException;
   import java.util.concurrent.TimeUnit;
   /*
   *并步执行
   * 成功回调
   * 失败回调
   * */
   public class Future {
       public static void main(String[] args) throws ExecutionException, InterruptedException {
   //        //发起一个请求
   //        //没有返回值的runAsync 异步回调
   //        /* 执行结果
   //        11111
   //        ForkJoinPool.commonPool-worker-1runAsync=>Void
   //         */
   //        CompletableFuture<Void> comparableFuture = CompletableFuture.runAsync(() -> {
   //            try {
   //                TimeUnit.SECONDS.sleep(2);
   //            } catch (InterruptedException e) {
   //                e.printStackTrace();
   //            }
   //            System.out.println(Thread.currentThread().getName()+"runAsync=>Void");
   //        });
   //        System.out.println("11111");
   //        comparableFuture.get();//获取阻塞执行结果
           //有返回值的 supplyAsync 异步回调
           //ajax,成功和失败的回调
           //返回的是错误信息
           CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
               System.out.println(Thread.currentThread()+"supplyAsync => INteger");
               int i = 10/0;
               return 1024;
           });
           completableFuture.whenComplete((t,u)-> {
               System.out.println("t ->" +t);//正常的返回结果
               System.out.println("u ->" +u);//错误信息 u ->java.util.concurrent.CompletionException: java.lang.ArithmeticException: / by zero
           }).exceptionally((e)->{
               System.out.println(e.getMessage());
               return 233;//可以获取到错误的返回结果
           }).get();
       }
   }
   ```

### JMM

1. 请你谈谈对Volatile的理解
   + Volatile是java虚拟机提供轻量级的同步机制
   + 保证可见性
   + 不保证原子性
   + 禁止指令重排
2. 什么是JMM
   + java内存模型，不存在的东西，概念

3. 关于JMM的一些同步的约定：
   + 线程解锁前,必须把**共享变量**立刻刷回主存
     + ![image-20210321165548962](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210321165548962.png)
   + 线程加锁前，必须读取主存中的最新值到工作内存中！
   + 加锁和解锁是同一把锁
4. 线程 工作内存 、 主内存

5. 8种操作
   +  ![image-20210321174655350](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210321174655350.png)

#### Volatile

1. 可见性

   + ```java
     import java.util.concurrent.TimeUnit;
     //未添加volatile 程序一直循环，
     //添加volatile 保证可见性
     public class Volatile {
         private static volatile int sum = 0;
         public static void main(String[] args) {
             new Thread(() -> {
                 while (sum == 0) {
                 }
             }).start();
             try {
                 TimeUnit.SECONDS.sleep(2);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
     }
     ```

2. 原子性：不可分割

   + 线程A在执行任务的时候，不能被打扰
   + ![image-20210322145134886](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210322145134886.png)

   + 使用原子类，解决原子性问题

   + ```java
     import java.util.concurrent.atomic.AtomicInteger;
     //volatile 不保证原子性 main 19530
     //使用原子类保证原子性
     //cas 在内存中修改值
     public class VDemo02 {
         private static volatile AtomicInteger num = new AtomicInteger();
         //private static volatile int num = 0;
         public static void add(){
             num.getAndIncrement();//AtomicIneger方法 CAS 比num++ 更好
             //num++ 在底层中
         }
     
         public static void main(String[] args) {
             for (int i = 1; i <= 20; i++) {
                 new Thread(() -> {
                     for (int j = 0; j < 1000; j++) {
                         add();
                     }
                 }).start();
             }
             while (Thread.activeCount()>2){
                 Thread.yield();
             }
             System.out.println(Thread.currentThread().getName() + " "+ num);
         }
     }
     ```

#### 指令重排

1. 你写的程序，计算机并不是按照你写的代码执行

   + 源代码--> 编译器优化的重排 --> 内存系统也会重排 --> 执行
   + 处理器在指令重排的时候，考虑：数据之间的依赖性

   | 线程A | 线程B |
   | ----- | ----- |
   | x=a   | y=b   |
   | b=1   | a=2   |

   + 正常结果 x=0 y=0;但是由于指令重排

   | 线程A | 线程B |
   | ----- | ----- |
   | b=1   | a=2   |
   | x=1   | y=1   |

   + 指令重排导致的诡异结果： x=2; y=1;

2. volatile 可以避免指令重排

   内存屏障、CPU指令，作用：

   + 保证特定的操作的执行顺序
   + 可以保证某些变量的内存可见性
   +    ![image-20210322150725094](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210322150725094.png)

### 单例模式

1. 饿汉式

2. ```java
   //饿汉式单例模式
   public class Hungry {
       //可能会浪费空间
       private byte[] data1 = new byte[1024*1024];
       private byte[] data2 = new byte[1024*1024];
       private byte[] data3 = new byte[1024*1024];
       private byte[] data4 = new byte[1024*1024];
   
       private Hungry(){
   
       }
       private final static Hungry HUNGRY = new Hungry();
       public static Hungry getInstance(){
           return HUNGRY;
       }
   }
   ```

3. DCL 懒汉式

   + ```java
     import sun.security.jca.GetInstance;
     import java.lang.reflect.Constructor;
     import java.lang.reflect.Field;
     
     public class LazyMan {
         private static boolean qinjiang = false;
     
         private LazyMan(){
             synchronized (LazyMan.class){
                 if (qinjiang == false){
                     qinjiang = true;
                 }else {
                     throw new RuntimeException("不要试图用单射破坏异常");
                 }
             }
         }
         private static LazyMan lazyMan;
     
         //双重检测锁模式的 懒汉式单例 DLC懒汉式
         public static LazyMan getInstance(){
             if (lazyMan == null){
                 lazyMan = new LazyMan();//不是原子性操作
                 /*
                 * 1.分配内存空间
                 * 2.执行构造方法
                 * 3.把这个对象指向这个空间
                 *
                 * 123
                 * 132 A
                 *     线程B 指向这个lazyMan 认为不等于null 跳过 此时没有构造lazyMan
                 * 结论
                 * */
             }
             return lazyMan;
         }
     //    //多线程开发
     //    public static void main(String[] args) {
     //        for (int i = 0; i < 10; i++) {
     //            new Thread(() -> {
     //                lazyMan.getInstance();
     //            }).start();
     //        }
     //    }
         //反射
         public static void main(String[] args) throws Exception {
     //        LazyMan instance = LazyMan.getInstance();
             Field qinjiang = LazyMan.class.getDeclaredField("qinjiang");//获取qinjiang这个值
             qinjiang.setAccessible(true);//将qinjiang的值更改
     
             Constructor<LazyMan> declaredConstructor = LazyMan.class.getDeclaredConstructor(null);
             declaredConstructor.setAccessible(true);
     
             LazyMan instance = declaredConstructor.newInstance();//通过反射来创建对象
     
             qinjiang.set(instance,false);
     
             LazyMan instance2 = declaredConstructor.newInstance();//通过反射来创建对象
             System.out.println(instance);
             System.out.println(instance2);
             //反射破坏了单例
             /*base.single.LazyMan@1b6d3586
                 base.single.LazyMan@4554617c
             * */
         }
     }
     ```

   4. 静态内部类

      + ```java
        //静态内部类
        public class Holder {
            private Holder(){
                
            }
            public static Holder getInstance() {
                return InnerClass.HOLDER;
            }
            
            public static class InnerClass{
                private static final Holder HOLDER = new Holder();
            }
        }
        ```

   > 单例不安全 推射出反射

   + ```java
     import java.lang.reflect.Constructor;
     import java.lang.reflect.InvocationTargetException;
     
     //enum 是什么 ？ 本身也是一个class类
     public enum Enumsingle {
         INSTANCE;
         public Enumsingle getInstance(){
             return INSTANCE;
         }
     }
     
     class Test{
         public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
             Enumsingle instance1 = Enumsingle.INSTANCE;
             //Constructor<Enumsingle> declaredConstructor = Enumsingle.class.getDeclaredConstructor(null);//设置枚举类为空 （但反编译后入参并不是空）
             Constructor<Enumsingle> declaredConstructor = Enumsingle.class.getDeclaredConstructor(String.class,int.class);//修改枚举类的参数值为String.class,int.class
             //单例反射确实不能破坏枚举
             //Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects //不能用反射创建枚举类
             // at java.lang.reflect.Constructor.newInstance(Constructor.java:417)
             declaredConstructor.setAccessible(true);//将私有权限破除
             Enumsingle instance2 = declaredConstructor.newInstance();//创建对象
     
             System.out.println(instance1);//将对象打印
             System.out.println(instance2);
             //为了探寻枚举是不是个构造方法，源码分析 不能使用反射的方法创建枚举
             //Exception in thread "main" java.lang.NoSuchMethodException: base.single.Enumsingle.<init>() 类里边没有空参的构造器
         }
     }
     ```

   + ![image-20210322214943978](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210322214943978.png)

   + ![image-20210322215528826](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210322215528826.png)
     
     + 

#### 深入理解CAS

1. 什么是CAS  compere And Swap 比较并交换 又称乐观锁

   + X86架构下 cmpxchg指令支持CAS
   + ARM架构下 LL/SC 支持CAS

   + 比较当前工作内存中的值和主内存的值，如果这个值是期望的，那么则执行操作，如果不是一直循环
   + 缺点
     + 循环耗时（但比java循环好
     + 一次性只能保证一个共享变量的原子性
     + ABA问题

   + 大厂必须深入研究底层！修内控。操作系统、计算机网络原理

   + ```java
     public final boolean compareAndSet(int expect, int update) {
         return unsafe.compareAndSwapInt(this, valueOffset, expect, update);
     }
     ```

   + ```java
     import java.util.concurrent.atomic.AtomicInteger;
     
     public class CASDemo01 {
         //CAS compareAndSet 比较并且交换
         public static void main(String[] args) {
             AtomicInteger atomicInteger = new AtomicInteger(2020);
             AtomicInteger atomicInteger2 = new AtomicInteger(2020);
             //期望、更新
             //public final boolean compareAndSet(int expect, int update)
             //如果我期望的值达到2020 就更新 否则不更新,CAS 是CPU的并发原因
             //捣乱线程
             System.out.println(atomicInteger.compareAndSet(2020, 2021));
             System.out.println(atomicInteger.get());
             atomicInteger.getAndIncrement();
     
             //期望线程
             System.out.println(atomicInteger2.compareAndSet(2020, 6666));
             System.out.println(atomicInteger2.get());
         }
     }
     ```

   + ![image-20210322221941325](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210322221941325.png)

   + unsafe类![image-20210322222221078](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210322222221078.png)

   + ![image-20210322222821163](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210322222821163.png)

   + ![image-20210322223015114](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210322223015114.png)

   + CAS：ABA问题（狸猫换太子）

     ![image-20210322223738286](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210322223738286.png)

#### 原子引用

+ 解决ABA问题，引入原子引用！对应的思想：乐观锁

+ ![image-20210322232325291](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210322232325291.png)

+ ```java
  import java.util.concurrent.TimeUnit;
  import java.util.concurrent.atomic.AtomicStampedReference;
  
  public class CASDemo02 {
      //CAS compareAndSet :比较并交换
      //AtomicStampedReference 注意，如果泛型是一个包装类，注意对象的引用问题
      //正常业务中比较的是一个对象 这里用了原子类的Integer
      public static void main(String[] args) {
  
          AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(1,1);
          new Thread(() -> {
              int stamp = atomicStampedReference.getStamp();//获得版本号
              System.out.println("a1 => "+stamp);
  
              try {
                  TimeUnit.SECONDS.sleep(1);//添加延时，保证版本号为同一个
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              System.out.println(atomicStampedReference.compareAndSet(1, 2,
                      atomicStampedReference.getStamp(), atomicStampedReference.getStamp() + 1));//期待1 更改2 获取线程版本 更改版本加1
              System.out.println("a2 => "+atomicStampedReference.getStamp());
  
              atomicStampedReference.compareAndSet(2,1,
                      atomicStampedReference.getStamp(),atomicStampedReference.getStamp()+1);//期待2 更改1 获取线程版本 更改版本加1
              System.out.println("a3 => "+atomicStampedReference.getStamp());
  
  
              },"a").start();
          //乐观锁的原理
          new Thread(() -> {
              int stamp = atomicStampedReference.getStamp();//获得版本号
              System.out.println("b1 => "+stamp);
              try {
                  TimeUnit.SECONDS.sleep(1);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              System.out.println(atomicStampedReference.compareAndSet(1, 6, stamp, stamp + 1));//期待1 更改6 获取stamp版本 更改stamp加1
              System.out.println("b2 => "+atomicStampedReference.getStamp());
  
          },"b").start();
      }
      /*问题 版本修改未成功 原子类Integer 有范围 直播时用了2020 导致范围超出
      a1 => 1
  b1 => 1
  false
  false
  a2 => 1
  b2 => 1
  a3 => 1
      * */
  }
  ```

#### AQS

AbstractQueuedSynchronizer

JUC.lock

### 各种锁的理解

#### 公平锁、非公平锁

公平锁：非常公平，不能够插队，必须先来后到

非公平锁:非常不公平，能够插队

```java
ReentrantLock lock = new ReentrantLock();
```

```java
public ReentrantLock() {
    sync = new NonfairSync();
}//不公平锁
```

+ 改成公平锁

![image-20210323002545421](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210323002545421.png)

+ ```java
  public ReentrantLock(boolean fair) {
      sync = fair ? new FairSync() : new NonfairSync();
  }
  ```

#### 可重入锁（递归锁）

![image-20210323002946194](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210323002946194.png)

+ synchronized

  + `

    ```java
    //synchronized
    public class Demo01 {
        //当线程A运行完 线程B才能拿到锁
        public static void main(String[] args) {
            Phone phone = new Phone();
            new Thread(() -> {
                phone.sms();
            },"A").start();
    
            new Thread(() -> {
                phone.sms();
            },"B").start();
        }
    }
    class Phone{
        public synchronized void sms(){
            System.out.println(Thread.currentThread().getName() + "sms");
            call();//有锁的
        }
        public synchronized void call(){
            System.out.println(Thread.currentThread().getName()+ "call");
        }
    }
    ```

+ lock

  + ```java
    import java.util.concurrent.locks.Lock;
    import java.util.concurrent.locks.ReentrantLock;
    
    public class Demo02 {
        //当线程A运行完 线程B才能拿到锁
        public static void main(String[] args) {
            Phone1 phone = new Phone1();
            new Thread(() -> {
                phone.sms();
            },"A").start();
    
            new Thread(() -> {
                phone.sms();
            },"B").start();
        }
    }
    class Phone1{
        Lock lock = new ReentrantLock();
        public  void sms(){
            lock.lock();//lock锁必须配对使用，否则死程序锁
            try {
                System.out.println(Thread.currentThread().getName() + "sms");
                call();//有锁的
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
        public  void call(){
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName()+ "call");
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
    ```



#### 自旋锁

​	skiplock

1. ![image-20210322223015114](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210322223015114.png)

2. ```java
   import java.util.concurrent.atomic.AtomicReference;
   
   public class SpinlockDemo {
       AtomicReference<Thread> atomicReference = new AtomicReference<>();
       //加锁
       public void mylock(){
           Thread thread = Thread.currentThread();
           System.out.println(Thread.currentThread().getName() + "==> mylock");
   
           //自旋锁
           while(!atomicReference.compareAndSet(null,thread)){
           }
       }
       //解锁
       //加锁
       public void myUnLock(){
           Thread thread = Thread.currentThread();
           System.out.println(Thread.currentThread().getName() + "==> myUnLock");
           atomicReference.compareAndSet(thread,null);
       }
   }
   ```

3. ```java
   public static void main(String[] args) throws InterruptedException {
   //        ReentrantLock lock = new ReentrantLock();
   //        lock.lock();
   //        lock.unlock();
   
           //底层使用的自旋锁CAS
           SpinlockDemo lock = new SpinlockDemo();
           new Thread(() -> {
               lock.mylock();
               try {
                   TimeUnit.SECONDS.sleep(3);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }finally {
                   lock.myUnLock();
               }
           },"T1").start();
   
           TimeUnit.SECONDS.sleep(1);//优先线程T1拿到锁 所以延时
   
           new Thread(() -> {
               try {
                   TimeUnit.SECONDS.sleep(3);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           },"T2").start();
           lock.mylock();
           lock.myUnLock();
       }
   }
   ```

#### 死锁

1. 死锁是什么

   + 两者拿着各自的资源，试图获取对方的锁

     ```java
     import java.util.concurrent.TimeUnit;
     
     public class DeadLockDemo {
         public static void main(String[] args) {
     
             String lockA = "lockA";
             String lockB = "lockB";
     
             new Thread(new MyThread(lockA,lockB),"T1").start();
             new Thread(new MyThread(lockB,lockA),"T2").start();
         }
     }
     class MyThread implements Runnable{
         private String lockA;
         private String lockB;
     
         public MyThread(String lockA,String lockB){
             this.lockA = lockA;
             this.lockB = lockB;
         }
         @Override
         public void run() {
             //b想拿a，a想拿b
             synchronized (lockA){
                 System.out.println(Thread.currentThread().getName() + "lock:" + lockA+ "lockB" + lockB);
                 try {
                     TimeUnit.SECONDS.sleep(2);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 synchronized (lockB){
                     System.out.println(Thread.currentThread().getName() + "lock:" + lockA+ "lockB" + lockB);
                 }
             }
         }
     }
     ```

   + 排除解决问题

     + 使用jps

     + ![image-20210323000932342](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210323000932342.png)

     + jstack +进程号

       ![image-20210323001350712](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210323001350712.png)

     + ![image-20210323001320002](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210323001320002.png)

2. 面试、工作中！排查问题

   + 日志
   + 堆栈信息

#### 分布式锁



## JVM

1. 个人理解
   + 初步认识java文件运行时所用到的空间
   + ![image-20210325161536464](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210325161536464.png)

2. 个人理解 *
   + 创建对象时，class类文件 类加载器 堆 栈 之间的变化与联系，栈相当于放置了指针 地址内容指向堆 堆负责创建空间 
   + 双亲委派机制 boot ext 
3. 沙盒机制
   + 本地代码机制、数字签名
   + 双亲委派机制
   + 防止栈大量堆积‘
   + 字节码机制
4. Native、方法区 *
   + Native ：调用本地方法库 c c++ 库
   + 方法区：Class、final、 

5. 栈方式详解
   + 栈：先进后出、后进先出、类似在杯里放东西
   + 队列：先进先出 （FIFO: First Input First Output）
   + 栈溢出错误
   + 栈内部调用原理
6. 堆详解
   + 三种堆环境
     + Java HotSpot(TM) 64-Bit Server VM (build 25.251-b08, mixed mode)
     + jRocket
     + J9 IBM
   + 堆 空间分布
7. 堆中 新生代 堆内存优化 *
   + 内存空间规划以及内存空间大小分布
   + OM 内存满时 扩容机制

8. 
9. OOM内存溢出问题解决方案
   + 代码调试
   + 软件检查
10. GC 垃圾回收机制
    + 轻回收GC 重回收GC
    + 内存区 Eden from to 
    + 引用计数回收 效率低

11. 新生区中复制算法
    + 没有内存碎片
    + 内存to区是空的，浪费空间
    + 使用环境：内存对象存在 新手代中

12. 标记算法以及优化
    + 不浪费内存空间
    + 产生内存碎片、
    + 压缩（排序）减少内存碎片
13. JVM总结
    + 内存效率：复制算法>标记清除法> 标记压缩算法（时间复杂度）
    + 内存整齐度：复杂算法 = 标记压缩算法 > 标记清除算法
    + 内存利用率：标记压缩算法 =  标记压缩算法 > 复杂算法
    + 系统总结内存以及深入了解JVM 和算法题
14. 新知识学习方式
    + JMM 是什么
      + Java Memory Model  Java内存模型
    + 它是干嘛的
      + 约束读写规定
      + 作用：缓存一致性协议、用于定义数据读写的规则
    + 它是怎么用的，他该如何学习
      + JMM是抽象概念 学习关键字 volatile 内存可见性机制 锁问题 等等

## HTML

超文本标记语言 Hyper Text Markup Language ( 包含图片、链接、音频等文件)

HTML5+CSS3

W3C （万维网联盟 World Wide Web Consortium）标准

+ 结构化标准语言（HTML、XML）
+ 表现标准语言（CSS）
+ 行为标准（DOM、EXCMAScript）

#### 网页基本结构

idea注释 ctrl+/ 

```html
<!--DOCTYPE 告诉网页使用版本-->
<!DOCTYPE html>
<html lang="en">

<!--网页头部-->
<head>
<!--    meta描述性标签，用来描述网页的一些信息-->
<!--    一般用meta-->
    <meta charset="UTF-8">
    <meta name="keywords" content="学习HTML">
    <title>Title</title>
</head>
<!--网页主体-->
<body>
Hello world
</body>
</html>
```

#### 网页标签

标题标签 <h1><h2><h3>

段落标签 <p></p>

换行标签 <br/>

水平线标签 <hr/>

粗体  <strong>粗体</strong>

斜体 <em>i long</em>

特殊符号

空格 &nbsp 

大于&gt 

小于&lt

&copy

#### 图像标签

![image-20210408155705209](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210408155705209.png)

#### 链接标签



锚链接

1. 需要一个锚标记

2. 跳转到标记 #top #title 等等

   <a href= '#top'>回到顶部</a>

   <a href= '#tille'>回到标题1</a>

#### 列表标签

<dd></dd>

+ 

#### 表格标签

<table border="1px">
    <tr>
        <td></td>
    </tr>

</table>

#### 视频音频元素

<video src ="../resource/xx.mp4"  controls autoplay></video>

<audeo src ="../resource/xx.mp3"  controls autoplay></audio>

#### 页面结构标签

header 头部

<header><h2></h2></header>

脚步

<footer><h2></h2></footer>

#### iframe 内联框架

<iframe src="//player.bilibili.com/player.html?aid=55631961&bvid=BV1x4411V75C&cid=97257967&page=11" scrolling="no" border="0" frameborder="no" framespacing="0" allowfullscreen="true"> </iframe>

#### 表单语法

文本输入框、

![image-20210408180812199](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210408180812199.png)

<input type="button" name="btn1" value="点我跳转">

![image-20210408164303514](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210408164303514.png)

1. form [post/get]
2. 文本框
3. 密码框
4. 单选框
5. 多选框
6. 按钮
7. 下拉框
8. 滑块

#### 表单应用

1. 隐藏域
2. 只读
3. 禁用

#### 表单初级验证

placeholder 提示信息

required 非空判断

pattern 正则表达式

```html
<p>自定义邮箱：
    <input type="text" name="diymail" pattern="/^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/
/^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/">
</p>
```

```html
<!--DOCTYPE 告诉网页使用版本-->
<!DOCTYPE html>
<html lang="en">

<!--网页头部-->
<head>
<!--    meta描述性标签，用来描述网页的一些信息-->
<!--    一般用meta-->
    <meta charset="UTF-8">
    <meta name="keywords" content="学习HTML">
    <title>Title</title>
</head>
<!--网页主体-->
<body>
<p>
    <select name="类别名称">
        <option value="china">中国</option>
        <option value="us">美国</option>

    </select>
</p>
<!--文本域
    cols=“” rows=""
-->
<p>文本内容:
    <textarea name="textarea" cols="50" rows="10"  >文本内容</textarea>

</p>
<p>自定义邮箱：
    <input type="text" name="diymail" pattern="/^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/
/^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/">
</p>
<!--文件域
    input type="file " name="file"
    -->

<p>
    <lebel for ="mark">你点我试试</lebel>
    <input type="text">
</p>

<p>
    <input type="file" name="files">
    <input type="button" value="上传" name="upload">
</p>
<P>
<!--    滑块-->
    
</P>
Hello world
</body>
</html>
```

### MySQL

#### 事务 （要么一起成功要么一起失败）

原子性 

一致性 

持久性 

+ 事务没有提交，恢复原状

+ 事务提交，数据库存储

隔离性

​	

隔离所导致的问题

+ 脏读
+ 不可重复读
+ 虚读（幻读）

### JDBC

![image-20211126192713647](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20211126192713647.png)

![image-20211126192736455](https://typora-1300217515.cos.ap-nanjing.myqcloud.com/typore/image-20211126192736455.png)

![image-20211126192752312](https://typora-1300217515.cos.ap-nanjing.myqcloud.com/typore/image-20211126192752312.png)

![image-20211126192811324](https://typora-1300217515.cos.ap-nanjing.myqcloud.com/typore/image-20211126192811324.png)

#### 数据库的字段属性

Unsigned: 

+ 无符号数字
+ 声明了该列不能声明为负数



zerofill:

+ 0填充
+ 不足的位数，使用0来填充 



自增

+ 自动在上一条记录的基础上+1
+ 通常用来设计唯一的主键~index， 必须是整数类型
+ 可以自定义设计主键自增的起始值和步长

非空 Null not null

+ 假设设置为 not null ，如果不给它赋值，就会报错
+ NULL，如果不填写值，默认就是null

默认：DEFAULT

+ 设置默认的值！
+ sex，默认值为男，如果不指定该列的值，则会有默认的值

id 主键

`version` 乐观锁

is_delete 伪删除

gmt_create 创建时间

gmt_update 修改时间

#### 建表

```mysql
CREATE TABLE IF NOT EXISTS `student`(
    `id` INT(4) NOT NULL DEFAULT COMMENT '学号',
    PRIMARY KEY(`id`)
)ENGINE=InooDB DEFAULT CHARSET=utf8
```

```mys
SHOW CREATE DATABASE school --查看创建数据库的语句
SHOW CREATE TABLE sstudent --查看student数据表的定义
desc student --显示表的结构
```

![image-20211126201334183](https://typora-1300217515.cos.ap-nanjing.myqcloud.com/typore/image-20211126201334183.png)

![image-20211126201448550](https://typora-1300217515.cos.ap-nanjing.myqcloud.com/typore/image-20211126201448550.png)

## JavaWeb

#### 基本概念

1. web开发：
   + web，网页的意思
   + 静态web
     + html css
     + 提供给所有人看到的数据始终不会变化
   + 动态web
     + 淘宝几乎所有网页
     + 提供给所有人看的数据始终会发生变化，每个人在每段时间看的内容都不同
     + 技术栈：Servlet，ASP，PHP
   + 在java中，动态web资源开发的技术统称为javaWeb

#### web应用程序

1. web应用程序：可以提供游览器访问的程序
   + 多个web资源，这些web资源可以被外界访问，对外界提供服务
   + 你们能访问到的任何一个页面和资源，都存在于这个世界的一个角落
   + URL
   + 这个统一的web资源会被放在同一个文件夹下，web应用程序--> Tomcat:服务器
   + 一个web应用由多部分组成（静态web，动态web）
     + html、css、js
     + jsp、servlet
     + java程序
     + jar包
     +  配置文件（Properties）
   + web应用程序编写完毕后，若想提供给外界访问：需要一个服务器来同一管理

#### 静态web

1. *.htm, *html,这些都是网页的后缀，如果服务器上一直存在这些东西，我们就可以直接进行读取，通络；
2. ![image-20210401153836845](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210401153836845.png)

3. 静态web缺点
   + Web网页无法动态更新，所有用户看到的都是一个页面
     + 轮播图，点击特性：伪特效
     + JavaScript[实际开发中，它用得最多]
     + VBScript

#### 动态Web

1. ![image-20210401154520147](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210401154520147.png)

2. 缺点

   + 加入服务器的动态web资源出现了错误，需要重新编写我们的后台程序，重新发布
     + 停机维护

3. 优点

   + Web页面可以动态更新，所有用户看到都不是同一个页面
   + 可以与数据库交互（数据持久化：注册，商品信息、用户信息。。。。。）

4. ![image-20210401154636309](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210401154636309.png)

   新手村 --> 魔鬼训练（分析源码，看源码）--PK场

#### Web服务器技术组成

1. Asp

   + 微软

   + 在HTML中嵌套了VB的脚本， ASP+COM

   + 在ASP开发中，基本一个页面都有几千行代码，页面及其换乱

   + 维护成本高

   + C#

   + llS

     ```asp
     <h1>
     	<h1><h1>
     		<h1>
     			<h1>
                     <h1>	
     		<h1>
                 <%
                 System.out.println("hello");
                 %>
                 <h1>
     		<h1>
     	<h1><h1>
     <h1>			
     ```

     

2. php

3. JSP/Servlet

   B/S:游览和服务器

   C/S：客户端和服务器

   + sun公司主推B/S架构
   + 基于Java语言的
   + 可以承载三高问题带来的影响
   + 语法想ASP，ASP --> JSP， 加强市场强度
   + 

#### Web服务器

​		服务器是有一种被动的操作，用来处理用户的一些请求和给用户一些响应信息

1. llS
   + 微软的ASP 自带
2. Tomat 
   + 免费开源轻量级应用服务器
   + 工作3-5年 尝试手写Tomat服务器
   + 下载tomat
     + 安装 解压
     + 了解配置环境 以及目录结构
     + 这个东西的作用
     + 根加载机制从哪来
       + jar包中获取

#### Tomat

1. 下载、

   ![image-20210401165348211](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210401165348211.png)

2. 解压配置 tomat文件

   ![image-20210401165904757](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210401165904757.png)

3. 启动 关闭

   ![image-20210401170043594](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210401170043594.png)

   + 地址
   + ![image-20210401170916486](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210401170916486.png)

   + 可以配置启动的端口号

     + tomat的默认端口号：8080

     + mysql：3306

     + http：80

     + https：443

     + ```xml
       <Connector port="8033" protocol="HTTP/1.1"
                  connectionTimeout="20000"
                  redirectPort="8443" />
       ```

   + 可以配置主机的名称

     + 默认的主机名为：localhost -> 127.0.0.1

     + 默认网站应用

     + ```xml
         <Host name="localhost"  appBase="webapps"
               unpackWARs="true" autoDeploy="true">
       ```

#### 网站如何访问

1. 输入域名：回车

2. 检查本机的C:\Windows\System32\drivers\etc\host 配置文件下有没有这个域名映射

   + 有 直接返回对应的ip地址，这个地址中，有我们需要访问的web程序。可以直接访问

   + ```
     127.0.0.1          www.mning.com
     ```

   + 没有：去DNS服务器找，找到的话就进入，找不到就返回报错

3. ![image-20210401174350580](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210401174350580.png)
4. ![image-20210401174516247](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210401174516247.png)

5. 可以配置以下环境变量

#### 网页结构

1. ```java
   --webapps : Tomcat服务器的web目录
       -Root
       -mning ：网站目录名
       	-WEB -INF
       		-classes：java程序
       		-lib:web 应用所依赖的jar包
               -web.xml :网站配置文件
            -index.html 默认的首页
            -static
                   -css
                   	-style.css
                   -js
                   -img
                   ......
   ```

#### HTTP

1. 超文本传输协议（Hypertext Transfer Protocol，HTTP）是一个简单的请求-响应协议，它通常运行在[TCP](https://baike.baidu.com/item/TCP/33012)之上。
2. 它指定了客户端可能发送给服务器什么样的消息以及得到什么样的响应。请求和响应消息的头以[ASCII](https://baike.baidu.com/item/ASCII/309296)形式给出；而消息内容则具有一个类似[MIME](https://baike.baidu.com/item/MIME/2900607)的格式。这个简单模型是早期[Web](https://baike.baidu.com/item/Web/150564)成功的有功之臣，因为它使开发和部署非常地直截了当。
   + 文本：html，字符串，
   + 超文本：图片，音乐，视频，定位，地图
   + 80系列
3. Https：安全的
   + 443系列

#### 两个时代

1. http1.0
   + HTTP/1.0: 客户端可以与web服务器连接后，只能获得一个web资源，断开连接
2. http2.0
   + HTTP/1.1：客户端可以与web服务器连接后，可以获得多个web资源

#### Http请求

1. ```
   客户端 -- 发请求（Request） ---服务端
   Request URL: https://www.baidu.com/  //请求地址
   Request Method: GET        get方法/post方法
   Status Code: 200 OK       状态码：200
   Remote Address: 110.242.68.3:443   
   Referrer Policy: strict-origin-when-cross-origin
   ```

```java
Cache-Control: no-cache  //缓存控制
Connection: keep-alive  //连接
Content-Encoding: gzip
Content-Type: text/html;charset=utf-8
Coremonitorno: 0
```

3. 请求行

   + 请求行中的请求方式：GET
   + 请求方式：Get,Post,HEAD,DeLETE,PUT,TRACT
     + get:请求能够携带的参数比较少，大小由限制，会在游览器的URL地址栏显示数据内容，不安全，但高效
     + Post：请求能够携带的参数没有限制，大小没有限制，不会再游览器的URL地址栏显示数据内容，安全，但不高效（但现在5g 不担心流量）

4. 消息头

   ```java
   Accept: text/html, //告诉游览器，它所支持的数据类型
   Accept-Encoding: gzip, deflate, br //支持哪种编码格式 GBK UTF-8 GB2312 ISO8859-1 等等
   Accept-Language: zh-CN,zh;q=0.9 //告诉游览器它的语言环境
   Cache-Control: max-age=0 //缓存控制
   Connection: keep-alive //告诉游览器，请求完成是断开还是保持连接
   Host: www.baidu.com  //主机
   ```

#### HTTP响应

1. 响应体

   ```java
   Accept: text/html, //告诉游览器，它所支持的数据类型
   Accept-Encoding: gzip, deflate, br //支持哪种编码格式 GBK UTF-8 GB2312 ISO8859-1 等等
   Accept-Language: zh-CN,zh;q=0.9 //告诉游览器它的语言环境
   Cache-Control: max-age=0 //缓存控制
   Connection: keep-alive //告诉游览器，请求完成是断开还是保持连接
   Host: www.baidu.com  //主机
   ```

2. 响应状态码

   + 200:响应请求成功
   + 3xx:请求重定向
     + 重定向：你重新到我给你新位置去
   + 4xx:找不到资源 404
     + 资源不存在
     + ![image-20210402155216687](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210402155216687.png)
   + 5xx:服务器代码错误 500 502：网关错误

#### TCP三次握手

 问题：当你浏览器中地址栏输入地址并回车的一瞬间到页面能够展示回来，经历了什么？

我来统一回答一下，  首先1.浏览器基于TCP的三次握手协议和服务器建立连接2.浏览器将请求信息发送给web服务器3.web服务器将请求信息封装成resquest对象发送给servlet，如果该servlet未加载，web服务器将它加到虚拟机并执行它， 然后servlet将应答信息返回给web服务器  web服务器将信息返回给浏览器 浏览器基于TCP的四次挥手协议和服务器断开连接

### Maven

https://maven.apache.org/

1. 在javaweb中需要大量的jar包，
2. Maven能够自动导入和配置这个jar包

#### Maven项目架构管理工具

Maven：**约定大于配置**

+ 有约束，不要去影响

Maven

![image-20210402160044575](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210402160044575.png)

电脑上的所有环境都放在一个文件夹下，方便管理

#### Maven配置环境

![image-20210402161458926](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210402161458926.png)

![image-20210402161538774](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210402161538774.png)

安装完成后 mvn -version 查看版本信息

![image-20210402161314257](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210402161314257.png)

#### 阿里云镜像安装

+ 镜像：miroos

![image-20210402162029425](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210402162029425.png)

```xml
<mirror>
	<id>nexus-aliyun</id>
	<mirrorOf>*,!jeech,!jeecg-snapshots</mirrorOf>
	<name>Nexus aliyun</name>
	<url>http://maven.aliyun.com/nexus/content/groups/public></url>
</mirror>
```
#### 建立本地仓库

建立一个本地仓库：localRepository

```xml
<localRepository>D:\solfwere\apache-maven-3.6.3\Maven-repo</localRepository>
```

![image-20210402162843645](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210402162843645.png)

#### IDEA使用Maven

![image-20210402163713126](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210402163713126.png)

![image-20210402164151923](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210402164151923.png)

![image-20210402164624692](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210402164624692.png)

问题 联通网络问题导致无法下载maven

![image-20210402165602884](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210402165602884.png)

Cannot resolve plugin org.apache.maven.plugins:maven-clean-plugin:2.5

弄了很久，大概就是文件权限问题，以及本地仓库地址/ D:/environment/apache-maven-3.6.3/Maven-repo这样设置 ,而不是D:\environment\apache-maven-3.6.3\Maven-repo 默认设置

还有maven 全局设置

![image-20210402212642391](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210402212642391.png)

![image-20210402212727274](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210402212727274.png)

#### 在IDEA中文件标注

![image-20210402212838637](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210402212838637.png)

![image-20210409194356691](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210409194356691.png)

#### 在IDEA中配置Tocat

![image-20210409195106989](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210409195106989.png)

![image-20210409195113449](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210409195113449.png)

![image-20210409195152832](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210409195152832.png)

![image-20210409195504884](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210409195504884.png)

![image-20210409195629637](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210409195629637.png)

#### pom文件

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!--Maven版本和头文件-->
<!-- $Id: pom.xml 642118 2008-03-28 08:04:16Z reinhard $ -->
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">

  <modelVersion>4.0.0</modelVersion>
<!--  项目的打包方式
jar:java应用
war:JavaWeb应用
-->
  <packaging>war</packaging>
<!--配置的GAV-->
  <name>Maven05</name>
  <groupId>org.example</groupId>
  <artifactId>Maven05</artifactId>
  <version>1.0-SNAPSHOT</version>
  
  <build>
    <plugins>
      <plugin>
        <groupId>org.mortbay.jetty</groupId>
        <artifactId>maven-jetty-plugin</artifactId>
        <version>6.1.7</version>
        <configuration>
          <connectors>
            <connector implementation="org.mortbay.jetty.nio.SelectChannelConnector">
              <port>8888</port>
              <maxIdleTime>30000</maxIdleTime>
            </connector>
          </connectors>
          <webAppSourceDirectory>${project.build.directory}/${pom.artifactId}-${pom.version}</webAppSourceDirectory>
          <contextPath>/</contextPath>
        </configuration>
      </plugin>
    </plugins>
  </build>
<!--项目依赖-->
<!--  Maven的高级之处，能帮你导入这个jar包所依赖的其他jar-->
<!--  在build中配置resources，来防止我们资源导出失败的问题-->
  <dependencies>
    <!--dependency>
      <groupId>org.example</groupId>
      <artifactId>[the artifact id of the block to be mounted]</artifactId>
      <version>1.0-SNAPSHOT</version>
    </dependency-->

    <!-- https://mvnrepository.com/artifact/junit/junit -->
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

</project>
```

#### Maven资源导出问题 

Maven - webapp tomcat问题

web.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>

<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                      http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
         version="4.0">
  <display-name>Archetype Created Web Application</display-name>
</web-app>
```

### Servlet

#### Servlet简介

1. servlet就是sun公司开发动态web的一门技术
2. Sun再这些API中提供一个接口叫做：Servlet，如果想开发一个Servlet程序，只需要两步
   + 编写一个类，实现Servlet接口
   + 把开发好的java类部署到web服务器中
3. 把实现了Servlet接口的Java程序叫做，Servlet

#### 创建一个Servlet

sun公司默认的实现类：HttpServlet

1. 构建一个普通的Maven，删除里面的src目录

2. Maven

   + java servlet 4.0.1
   + javax.servlet.jsp

3. maven 父子工程的理解

   + ```xml
     <modules>
         <module>servlet-01</module>
       </modules>
     ```

   + ```xml
     <parent>
       <artifactID>javaweb-02-servlet</artifactID>
       <groupID>com.kuang</groupID>
       <version>1.0-SNAPSHOT</version>
     </parent>
     ```

   + 父项目中的JAVA子项目可以直接使用

     ```java
     son extends father
     ```

 3. Maven环境优化

    + 修改web.xml (最新版4.01)
    + 将maven的结构搭建完整

	4. 编写一个Servlet程序

    + 编写一个普通类 继承接口 Httpservlet

    + ```java
      public class HelloServer extends HttpServlet {
          //由于get或者post 只是请求实现的不同方式，可以相互调用，业务逻辑都一样
          @Override
          protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
              System.out.println("进入doGet方法");
              PrintWriter writer = response.getWriter();//响应流
              writer.print("hello");
          }
      
          @Override
          protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
              super.doPost(req, resp);
          }
      }
      ```

	5. 编写Servlet的映射

    为什么需要映射：我们写的式JAVA程序，但是要通过游览器访问，而游览器需要连接web服务器，所以我们需要在web服务中注册我们写的servlet，还需要给它一个游览器访问的

    ```xml
    <!--  注册Servlet-->
      <servlet>
    <!--    注册servlet-->
        <servlet-name>helloServer</servlet-name>
        <servlet-class>com.mning.servlet.HelloServer</servlet-class>
      </servlet>
    <!--  一个servlet对应一个mapping：映射-->
      <servlet-mapping>
        <servlet-name>helloServer</servlet-name>
    <!--    请求路径-->
        <url-pattern>/</url-pattern>
      </servlet-mapping>
    ```

6. 配置Tomcat
   
   + 配置项目设置参数

#### Servlet原理

![image-20210410152004616](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210410152004616.png)

#### mapping问题

servlet的请求路径

1. 一个servlet可以指定一个映射路径

2. 一个servlet可以指定多个映射路径

3. 默认请求路径

   ```xml
   <!--    默认请求路径-->
       <servlet-mapping>
           <servlet-name>hello</servlet-name>
           <url-pattern>/*</url-pattern>
       </servlet-mapping>
   ```

   缺点：该项目会跳过主页

4. 指定一些后缀或者前缀等等

   ```xml
   <servlet-mapping>
           <servlet-name>hello</servlet-name>
           <url-pattern>*.do</url-pattern>
       </servlet-mapping>
   ```

5. 自定义404，优先级问题

   指定了固有的映射路径优先级最高，如果找不到就会走默认的处理请求；

   ```xml
   <servlet>
       <servlet-name>error</servlet-name>
       <servlet-class>com.mning.servlet.ErrorServlet</servlet-class>
   </servlet>
   <servlet-mapping>
       <servlet-name>error</servlet-name>
       <url-pattern>/*</url-pattern>
   </servlet-mapping>
   ```

#### ServletContext

web容器在启动的时候，它会为每个web程序都创建一个对应的初始化配置

![image-20210410154317906](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210410154317906.png)

大白话：利用ServletContext 存储网页配置等信息，当其他用户地址访问时，从ServletContext调取网页配置、网页内同等参数信息

共享数据

1. 主体helloservlet

   ```java
   public class HelloServer extends HttpServlet {
       //由于get或者post 只是请求实现的不同方式，可以相互调用，业务逻辑都一样
       @Override
       protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
   //        this.getInitParameter() 初始化参数
   //        this.getServletConfig() servlet配置
   //        this.getServletContext() servlet上下文
           ServletContext context = this.getServletContext();
           String username = "莫宁";
           context.setAttribute("username",username);//将一个数据保存在ServletContext中，名字为username，值username
       }
   }
   ```

2. GetServlet

   ```java
   public class GetServlet extends HttpServlet {
       @Override
       protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           ServletContext context = this.getServletContext();
           String username = (String) context.getAttribute("username");//从context中获取username数据，强转成string属性
           resp.setContentType("text/html");//设置连接文本
           resp.setCharacterEncoding("utf-8"); //设置编码格式
           resp.getWriter().print("名字"+username);//设置文本内容输出
       }
   
       @Override
       protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       }
   }
   ```

3. 配置web默认地址

   ```xml
   <servlet>
           <servlet-name>hello</servlet-name>
           <servlet-class>com.mning.servlet.HelloServer</servlet-class>
       </servlet>
       <servlet-mapping>
           <servlet-name>hello</servlet-name>
           <url-pattern>hello</url-pattern>
       </servlet-mapping>
   <!--    默认请求路径-->
       <servlet>
           <servlet-name>getc</servlet-name>
           <servlet-class>com.mning.servlet.GetServlet</servlet-class>
       </servlet>
       <servlet-mapping>
           <servlet-name>getc</servlet-name>
           <url-pattern>getc</url-pattern>
       </servlet-mapping>
   ```

#### 获取初始化、资源化参数

获取资源路径 资源流 

1. ```java
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       ServletContext context = this.getServletContext();
       String url = context.getInitParameter("url");
       resp.getWriter().print(url);
   }
   ```

2. ```xml
   <servlet>
       <servlet-name>url</servlet-name>
       <servlet-class>jdbc:mysql://localhost:3306/mybatis</servlet-class>
   </servlet>
   <servlet-mapping>
       <servlet-name>url</servlet-name>
       <url-pattern>url</url-pattern>
   </servlet-mapping>
   ```

####  请求转发

大白话

![image-20210410164537018](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210410164537018.png)

1. ```java
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       ServletContext context = this.getServletContext();
       System.out.println("进入了ServletDemo04");
       RequestDispatcher requestDispatcher = context.getRequestDispatcher("/gp");//转发的请求路径
       requestDispatcher.forward(req,resp);//调用forward实现请求转发
       context.getRequestDispatcher("/gp").forward(req,resp);
   }
   ```

2. ```xml
   <servlet>
       <servlet-name>up</servlet-name>
       <servlet-class>com.mning.servlet.ServletDemo04</servlet-class>
   </servlet>
   <servlet-mapping>
       <servlet-name>up</servlet-name>
       <url-pattern>up</url-pattern>
   </servlet-mapping>
   ```

同理

##### 读取资源文件

properties

1. 在java目录下新建properties

2. 在resources目录下新建properties+

   + 发现都被打包到了同一个路径下：classes，我们熟称这个路径为classpath：

   + 思路：需要一个文件流

   + db. properties

   + ```java
     username=root
     password=123456
     #classpath
     ```

   + ```java
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         InputStream is = this.getServletContext().getResourceAsStream("WEB-INF/classes/com/mning/servlet/aa.properties")
         Properties prop = new Properties();
         prop.load(is);
         String user = prop.getProperty("username");
         String pwd = prop.getProperty("password");
         resp.getWriter().print(user+": "+pwd);
     }
     ```









### MySQL

#### 环境配置

1. 环境配置安装5.7

   + 下载zip安装包 尽量用zip exe有注册表删除不干净

   + 把安装包解压到目录下

   + 创建my.ini文件 包含

     + ```
       [mysqld]
       basedir=D:\\solfwere\mysql-5.7.33\
       datadir=D:\\solfwere\mysql-5.7.33\data
       port=3306
       skip-grant-tables
       ```

       data文件是创建数据库后自动生成

       skip-grant-tables 跳过密码

   + 启动管理员模式CMD 到mysql目录下 

     ```django
     cd /d D:\solfwere\mysql-5.7.33\bin mysqld -installed
     ```

      安装 mysql服务![image-20210331154636394](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210331154636394.png)

   + ```mysql
     mysqld --initialize-insecure --user=mysql
     ```

     

     + 初始化数据文件 自行创建data文件夹
     + ![image-20210331155556326](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210331155556326.png)

   + 启动MySQL 修改密码

     + ```mysql
       net start mysql
       ```

       

     + ![image-20210331155745299](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210331155745299.png)

     + ```mysql
       mysql -u root -p
       ```

       设置密码

     + 进入界面后更改root密码

     + ```mysql
       update mysql.user set authentication_string=password('123456') where user='root' and Host='localhost';
       ```

       

     + ![image-20210331160320914](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210331160320914.png)

     + ```mysql
       flush privileges;
       ```

       刷新权限

     + ![image-20210331160516391](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210331160516391.png)

     + 修改跳过密码

     + ![image-20210331160604781](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210331160604781.png)

     + 重启使用

     + ```mysql
       net stop mysql
       net start mysql
       ```

     + ![image-20210331161229047](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210331161229047.png)

   + mysqlyog安装
     
     + ![image-20210331162555358](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210331162555358.png)

2. #### 创建数据库

   + ![image-20210331181709049](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210331181709049.png)
   + 创建表![image-20210331182152779](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210331182152779.png)

   ```mysql
   CREATE DATABASE `mybatis`；
   
   USE `mybatis`；
   
   CREATE TABLE ‘user’(
   `id` INT(20) NOT NULL PRIMARY KEY,
   `name` VARCHAR(30) DEFAULT NULL,
   `pwd` VARCHAR(30) DEFAULT NULL
   )ENGINE=INNODB DEFAULT CHARSET = utf8;
   
   INSERT INTO `user` (`id`,`name`,`pwd`) VALUES
   (1,'莫宁','1234'),
   (2,'张三','1234'),
   (3,'李四','1234')
   ```

   ## Mybatis

   ```mysql
   DROP TABLE IF EXISTS `student`; #清除学生表
   
   CREATE TABLE `student`(
   	`student_id` int(10) unsigned NOT AUTO_INCREMENT COMMENT `编号`,
       `name` varchar(20) DEFAULT NULL COMMENT `姓名`,
       `phone` varchar(20) DEFAULT NULL COMMENT `电话`,
       `email` varchar(40) DEFAULT NULL COMMENT `邮箱`,
       `sex` tinyint(4) DEFAULT NULL COMMENT `性别`,
       `locked` tinyint(4) DEFAULT NULL COMMENT `状态（0:正常,1:锁定）`,
       `gmt_created` datetime DEFAULT CURRENT_TIMESTAMP COMMENT `存入数据库的时间`,
       `gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT `修改的时间`
       `delete` int(11) DEFAULT NULL,
       PRIMARY KEY (`student_id`)
   )ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT=`学生表`;
   ```
   
   
   
   







### MyBatis

1. Mybatis作用简介 #

   + 简单，减轻JDBC的复杂性
   + 将SQL和接口区分，以xml的方法区分
   + 持久层

2. 搭载Mybatis

   + 数据库引擎原理
   + 配置环境以及依赖
     + ![image-20210331145237061](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210331145237061.png)
   + 创建项目

   ![image-20210401144006696](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210401144006696.png)

   

### Spring



1. Rod Johnson

2. 2002 https://www.runoob.com/w3cnote/basic-knowledge-summary-of-spring.html

3. 解决企业复杂性

   + SSH Struct2 + Spring +Hibernate
   + SSM Spring

4. ```xml
   <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
   <dependency>
       <groupId>org.springframework</groupId>
       <artifactId>spring-webmvc</artifactId>
       <version>5.3.4</version>
   </dependency>
   <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
   <dependency>
       <groupId>org.springframework</groupId>
       <artifactId>spring-jdbc</artifactId>
       <version>5.3.4</version>
   </dependency>
   
   ```

5. 优点

   + Spring是一个开源的免费的框架（容器）！
   + Spring是一个轻量级的、非入侵式的框架
   + 控制反转（IOC），面向切面编程（AOP）
   + 支持事务的处理，对框架的整合的支持
   + Spring就是一个轻量级的控制反转（IOC）和面向切面编程（AOP）的框架

#### Spring7大模块

+ 容器：利用BeanFactory 的工厂模式，使用IOC，将配置文件和依赖规范和实际应用程序代码分开
+ Spring上下文context：Spring上下文是配置文件，提供上下文信息，如校验和调度功能
+ AOP：面向切面编程，将通用任务 安全 事务 日志等集中管理
+ DAO：JDBC DAO抽象层 提供异常层次结构，管理以成处理和不同数据库供应商抛出的错误信息
+ ORM：ORM 对象关系工具，包含JDO、Hibernate和IBatis SQL Map ,遵从Spring 的通用事务和DAO异常层次结构
+ MVC：负责网络模块 、通过策略接口、MVC框架变成为高度可配置，MVC容纳了大量视图技术，包含JSP、Velocity、Tiles、iText、POI
+ WEB：简化处理多部分请求以及将请求参数绑定到域对象的工作







1. 构建一切、协调一切、连接一切
   + Spring Boot
     + 一个快速开发的脚手架
     + 基于Spring和Boot可以快速的开发单个微服务
     + 约定大于配置
   + Spring Cloud
     + 基于Springboot实现的
   + 弊端：配置十分繁琐、
   + 

#### IOC理论推导

1. 在之前业务中，用户的需求可能会影响我们原来的代码。我门需要根据用户的需求去修改源代码
   + UserDao接口
   + UserDaoImpl实现类
   + UserService业务接口
   + UserServiceImpl业务实现类
2. 使用一个Set接口，利用动态的扩展去调用接口，

```java
public interface UserService {
    void getUser();
}
```

```java
public class UserServiceImpl implements UserService{
    //private UserDao userDao= new UserServiceImpl();
    private UserDao userDao;
    //利用set进行动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser(){
        userDao.getUser();
    }
}
```

```java
public class MyTest {
    public static void main(String[] args) {
        //用户实际调用的是业务层，
        UserServiceImpl userService = new UserServiceImpl();
        //用户修改参数调用对象，控制反转
        ((UserServiceImpl) userService).setUserDao(new UserMySQL());
        userService.getUser();
    }
}
```

#### IOC原理

![image-20210413174053416](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210413174053416.png)

引入中间件概念、IOC容器去连接

1. 控制反转IOC（Inversion of Control）是一种设计思想，DI（依赖注入）是实现IOC的一种方法。

2. 控制反转后将对象的创建转移个第三方。

3. Spring容器在初始化中先读取配置文件，根据配置文件，或元数据创建与组织对象存入容器中，程序使用时再从Ioc容器中取出需要的对象。

4. 控制反转是一种通过描述（XML或注解）并通过第三方去生产或获取特定对象的方式，在Spring中实现控制反转的是IOC容器，其实现方法是依赖注入（Dependency Injection,DI）

5. ```xml
   <!---->
       <bean id="MySQL" class="com.mning.dao.UserDaoImpl"/>
       <bean id="oracle" class="com.mning.dao.OracleImpl"/>
       <bean id="UserService" class="com.mning.service.UserServiceImpl"/>
   <!--        <property name="userDao" ref="oracleImpl"/>-->
       <bean id="hello" class="com.mning.dao.Hello">
           <property name="str" value="Spring"/>
   <!--    ref:引用Spring容器中创建好的对象
           value：具体的值，基本数据类型
   </bean>
   
   
   ```

#### IOC创建对象的方式

1. 使用无参构造创造对象
2. 



#### 别名

#### 注入依赖 *

#### Set注入

1. 依赖注入：Set注入

   + 依赖：bean对象的创建依赖于容器！
   + 注入：bean对象中的所有属性，由容器来注入！

   环境搭建

   1. 复杂类型
   2. 真实对象

#### 扩展方式注入

#### 使用注解开发

1. xml与注解：

   + xml更加万能，适用于任何场合！维护简单方便
   + 注解不是自己类使用不了，维护相对复杂

2. xml与注解的最佳实践

   + xml用来管理bean；

   + 注解只负责完成属性的注入；

   + 在使用过程中，只需要注意：必须让注解生效，就需要开启注解的支持

     ```xml
     <!--指定要扫描的包，这个报下的注解就会生效-->
     <context:component-scan base-package="com.mning"/>
     <context:annotation-config/>
     ```

#### 使用Java的方式配置

JavaConfig是一个Spring的子项目，在spring4后是

User

```java
//这里这个注解的意思，就是说明这个类被Spring接管了，注册到了容器中
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }
    @Value("mning")//注入值
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
```

```java
//这个也会被Spring容器托管，注册到容器中，因为他本身就是一个Component、
//@configuration代表的是一个配置类，就和我们之间看到的beans.xml
@Configuration
@ComponentScan("com.mning.polo")
@Import(MningConfigTwo.class)
public class MningConfig {
    //注册一个bean 就相当于我们之前写的一个bean标签
    //这个方法的名字 ，就相当于bean标签中的id属性
    //这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User();
    }
}
```

测试类

```java
public class Mytest {
    public static void main(String[] args) {
        //如果完全使用了配置类方式去做，我们就只能通过AnnotationConfig上下文来获取容器，通过配置类class来加载
        ApplicationContext context = new AnnotationConfigApplicationContext(MningConfig.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());

    }
}

```

这种纯java的配置方式，在SpringBoot中随处可见

SpringBoot

+ 一个快速开发脚手架、
+ 基于Springboot可以快速开发单个微服务
+ 约定大于配置
+ ![image-20210421114758091](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210421114758091.png)

SpringCloud

+ SpringCloud是基于SpringBoot实现的

#### 自学一定要看源码

#### AOP（必须要会）

##### 代理模式

SpringAOP的底层

中介：

代理模式的分类：

+ 静态代理

  角色分析

  + 抽象角色：一般会使用接口或者抽象类解决
  + 真实角色：被代理的角色
  + 代理角色：代理真实角色后，我们一般会做一些附属操作
  + 客户：访问代理对象的人！

+ 动态代理

![image-20210421120044159](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210421120044159.png)

代理模式的好处：

+ 可以使真实角色的操作更加纯粹！不用关注一些公共的业务
+ 公共也就交给代理角色！实现了业务的分工
+ 公共业务发生扩展的时候，方便集中管理

缺点



程序 数据结构+算法 程序猿

程序 面向对象+框架 码农



### Spring Boot

1. 是什么 为了解决企业开发复杂度，简化开发
2. 微服务阶段
   + 节省了调用资源
   + 每个功能元素的服务否是一个可替换的、可独立升级的软件代码
   + ![image-20210505154214212](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210505154214212.png)
   + 高内聚 低耦合
   + ![image-20210505154513646](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210505154513646.png)
   + 软实力：聊天+举止+谈吐+见解
   + 你主导面试官 13k 
   + 面试官主导你 8k

#### 创建第一个SpringBoot程序

1. web依赖 tomcat dispatcherServlet xml
2. spring-boot-starter 
3. 打包成jar包后 不用idea 可直接运行

#### 配置如何编写 yaml

#### 自动装配原理：重要：谈资

#### 集成web开发:业务的核心

#### 集成 数据库 Druid

#### 分布式开发：Dubbo（RPC）+zookeeper

#### swagger:接口文档

#### 任务调度

#### SpringSecurity: Shiro



### Spring Cloud

#### 微服务

#### springcloud入门

#### Restful

#### Eureka

#### Ribbon

#### Feign

#### HyStrix

#### Zuul路由网关

#### SpringCloud config: git



### git![image-20210313012059619](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210313012059619.png)

![image-20210313012148053](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210313012148053.png)

+ Git 可以直接看到更新了哪些代码和文件！

#### Linux基本命令

![image-20210313013520497](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210313013520497.png)

#### Git使用设置

```c
git config --global user.name "mning"

git config --global user.name "mning6229@gmail.com"
```

#### Git核心理论

![image-20210313015616116](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210313015616116.png)

![image-20210313015643979](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210313015643979.png)

![image-20210313015912458](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210313015912458.png)

![image-20210313015927175](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210313015927175.png)

#### Git文件操作

![image-20210313020359593](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210313020359593.png)

```shell
git status [filenname] #查看指定文件状态

git status  #查看所有文件状态

git add . #添加所有文件到暂存区

git commit -m #提交暂缓取中的内容到本地仓库 -m 提交信息
```

![image-20210313021605394](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210313021605394.png)

![image-20210313021646420](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210313021646420.png)

![image-20210313021659051](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210313021659051.png)

##### 生产SSH

```c
 ssh-keygen -t rsa
```

 Git Github 章节已经生成了自己的 SSH 公钥，所以我们只需要将用户主目录下的 ~/.ssh/id_rsa.pub 文件的内容粘贴 Gitee 上

git branch dev #新建分支

git branch #查看分支

git checkout -b [branch] # 新建并且切换分支

git merge [branch] #合并指定分支到当前分支

git branch -d [branch-name] #删除分支

git push origin --delete [branch-name] #删除远程分支

git branch -dr [remote/brance]



### 项目分析

+ 后端

![image-20210407151554131](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210407151554131.png)

+ 前端
+ ![image-20210407152020684](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210407152020684.png)

#### 观察项目特点

1. 用了哪些技术(springboot, vue, Redis, MQ)
2. 是否有数据库 (mySQL)
3. 你的环境是否匹配（java ,Maven ,npm ,nodejs,redis）

#### 跑起来第一步

1. 创建数据库

2. 前端跑起来

3. 后端项目导入  导入记得

   + 期间有用redis 

     ```
     redis-server.exe redis.windows.conf
     ```

4. 等待所有项目跑成功

   + xml 中有可能报错 Terminal 进行当前项目 mvn install
   + 安装完成 重启 idea
   + 

5. 只要发现了Swagger ,先运行swagger

6. 查看端口 redis端口，进入配置查看需要与环境地址
   localhost:8000/swagger-ui.html

7. 前端就是安装依赖，启动测试运行，看接口是否正常

### 前后端分离套路

1. 从前端开始分析，打开控制台，点一个接口，分析一波调用关系
2. 点后端端口调用不一致 8013--8000 怎么操作
   + 封装了接口请求 ajax axios request
   + 找到配置
   + ![image-20210418144118056](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210418144118056.png)
   + 前后端分离项目的重点，找到接口的调用关系
   + Springboot提供服务！前端调用接口数据！Vue负责渲染页面
3. 前端项目的固定文件套路
   + ![image-20210418144420115](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210418144420115.png)
   + 通过抓取f12前端的请求，找到后端对应的接口

## 23种设计模式

### OOP七大原则

1. 对象和

### 单例模式

### 工厂模式

1. 简单工厂模式
   + 从消费者直接造车（创建对象）进行优化，为工厂造车，消费者直接对工厂提车，工厂造车（包含汽车方法，对象创建以及属性）
   + 缺点，要对工厂进行修改
2. 工厂方法模式
   + 在不修改工厂的基础下，创建多个不同品牌工厂，每个品牌工厂只创建该品牌的产品，品牌下有多种产品对象以及方法
   + 缺点：大量的品牌工厂创建，增加代码量以及重复量

### 抽象工厂模式 *

1. 增加抽象接口，包含抽象接口工厂（创建工厂接口），抽象工厂接口创建





## 算法

#### 快排

+ 要点，确定 start  end key 第一次从后向前排，比key 小交换，大不变，end -1 然后从前往后排 比key 小 start ++ 比key 大 交换；递归low start end high；

```java
public class Main {
    public static void main(String []args) {
        System.out.println("Hello World!");
        int[] a={3,16,32,45,7,15,6};
        sort(a, 0, 6);
        for(int i = 0 ; i < a.length; i++ ){
            System.out.print(a[i]+"++");
        }
    }

    public static void sort(int[] a, int low,int high){

        int start = low;
        int end = high;
        int key = a[low];
        while(end>start){
            while(end>start && a[end]>=key)
                end--;
            if (a[end] <= key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }

                while (end > start && a[start] <= key)
                    start++;
                if (a[start] >= key) {
                    int temp = a[end];
                    a[end] = a[start];
                    a[start] = temp;
                }

        }
        if(low < start) sort (a, low, start-1);
        if(end < high) sort (a, end+1, high);
    }
}
```





# 项目

## 数据库设计

![image-20210507234048555](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210507234048555.png)



![image-20210507235443537](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210507235443537.png)

![image-20210507235520640](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210507235520640.png)![image-20210507235620189](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210507235620189.png)![image-20210507235650833](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210507235650833.png)

![image-20210507235537978](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210507235537978.png)

## 项目结构设计

![image-20210507234115850](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210507234115850.png)

![image-20210507154616548](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210507154616548.png)

创建数据库







![image-20210507164737665](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210507164737665.png)



# Java基础学习

### 异常：

是什么：是捕获错误所作出的反应，对预期的错误（运行时出现的错误）进行捕获，有Exception父类之下

+ ![image-20210725142500879](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210725142500879.png)

为什么：在编译期间并不能找到所有的错误，有一些NullPointerException和
ClassNotFoundException异常在编译期找不到，这些异常是RuntimeException 运行时异常，这些异常往往在运行时才能被发现。

怎么做：

throws 和 throw

throw：用在方法体内，表示抛出异常，由方法体内的语句处理

throws：声明这个方法会抛出这种类型的异常，是它的调用者知道要捕获这个异常



try finally catch 

try catch 对某一段代码可能抛出异常进行捕获

try finally  不管代码执行何种情况，都会finally中的代码

try catch finally 异常捕获后，再走finally中的代码

Error

是什么：是程序无法处理的错误，运行应用程序中较严重

为什么： 大多数是运行JVM时出现的问题，绝大多数是程序运行时不允许出现的状况，如OutOfMemoryError和StackOverflowError异常
java1.7

![image-20210725144519170](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210725144519170.png)

虚拟机栈：如果线程请求的栈深度大于虚拟机栈所允许的深度，则会出现stackOverflowError异常 如果虚拟机动态扩展无法申请到足够的内存，则出现OutofMemoryError
本地方法栈：和虚拟机栈一样

堆：Java堆可以处于物理上不连续，逻辑上连续，如果磁盘空间，如果堆中没有内

方法区：方法区无法满足内存分配需求时，抛出OutOfMemoryError异常

怎么做：找到对应的error错误，分析错误的来源，

内部类:

![image-20210725150719383](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210725150719383.png)

是什么：

为什么：

怎么做：









业务上的功能设计，建表，功能实现，技术选型

# 面试题

强引用、软引用、弱引用、虚引用的区别

 **强引用  >  软引用  >  弱引用  >  虚引用**

```java
强引用（StrongReference）
典型编码Object obj = new Object()中的obj
    就是强引用通过关键字new创建的对象所关联的引用就是强引用。 当JVM内存空间不足，JVM宁愿抛出OutOfMemoryError运行时错误（OOM），使程序异常终止，也不会靠随意回收具有强引用的“存活”对象来解决内存不足的问题。对于一个普通的对象，如果没有其他的引用关系，只要超过了引用的作用域或者显式地将相应（强）引用赋值为 null，就是可以被垃圾收集的了，具体回收时机还是要看垃圾收集策略。

2 软引用

特点：软引用通过SoftReference类实现。 软引用的生命周期比强引用短一些。只有当 JVM 认为内存不足时，才会去试图回收软引用指向的对象：即JVM 会确保在抛出OutOfMemoryError之前，清理软引用指向的对象。软引用可以和一个引用队列（ReferenceQueue）联合使用，如果软引用所引用的对象被垃圾回收器回收，Java虚拟机就会把这个软引用加入到与之关联的引用队列中。后续，我们可以调用ReferenceQueue的poll()方法来检查是否有它所关心的对象被回收。如果队列为空，将返回一个null,否则该方法返回队列中前面的一个Reference对象。

应用场景：软引用通常用来实现内存敏感的缓存。如果还有空闲内存，就可以暂时保留缓存，当内存不足时清理掉，这样就保证了使用缓存的同时，不会耗尽内存。

3 弱引用

弱引用通过WeakReference类实现。 弱引用的生命周期比软引用短。在垃圾回收器线程扫描它所管辖的内存区域的过程中，一旦发现了具有弱引用的对象，不管当前内存空间足够与否，都会回收它的内存。由于垃圾回收器是一个优先级很低的线程，因此不一定会很快回收弱引用的对象。弱引用可以和一个引用队列（ReferenceQueue）联合使用，如果弱引用所引用的对象被垃圾回收，Java虚拟机就会把这个弱引用加入到与之关联的引用队列中。

应用场景：弱应用同样可用于内存敏感的缓存。

4 虚引用

特点：虚引用也叫幻象引用，通过PhantomReference类来实现。无法通过虚引用访问对象的任何属性或函数。幻象引用仅仅是提供了一种确保对象被 finalize 以后，做某些事情的机制。如果一个对象仅持有虚引用，那么它就和没有任何引用一样，在任何时候都可能被垃圾回收器回收。虚引用必须和引用队列 （ReferenceQueue）联合使用。当垃圾回收器准备回收一个对象时，如果发现它还有虚引用，就会在回收对象的内存之前，把这个虚引用加入到与之关联的引用队列中。
ReferenceQueue queue = new ReferenceQueue ();
PhantomReference pr = new PhantomReference (object, queue);
程序可以通过判断引用队列中是否已经加入了虚引用，来了解被引用的对象是否将要被垃圾回收。如果程序发现某个虚引用已经被加入到引用队列，那么就可以在所引用的对象的内存被回收之前采取一些程序行动。

应用场景：可用来跟踪对象被垃圾回收器回收的活动，当一个虚引用关联的对象被垃圾收集器回收之前会收到一条系统通知。

```



NoClassDefFoundError和ClassNotFoundException的区别

一个是

StringBuffer和StringBuilder的区别

![image-20210827141345052](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210827141345052.png)

string 值不可变  底层final写的

![image-20210827142142353](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210827142142353.png)

https://blog.csdn.net/itchuxuezhe_yang/article/details/89966303?utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.control&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.control

ArrayList和LinkedList的区别
SynchronizedList 怎么去对ArrayList进行封装
HashMap底层数据结构

HashMap扩容机制

负载因子和它那个Capacity 的容量有什么作用（扩容的时候怎么去判断这个机制？

HashMap底层数据加一个Key-value的键值数组，那么下标如何确定？

如果有Hash冲突如何解决？

HashSet如何保证数据不重复？

新生代和老年代有什么区别？

垃圾回收算法

类加载的过程

双亲委派模型 的优势

线程池的工作原理
线程池shutdown和shutdownNow有什么区别？
synchronized和ReentrantLock有什么区别？

#和dollar符号有什么区别？

springboot常用的注解？

component和bean注解有什么区别？

mybatis里面嵌套查询和嵌套结果有什么区别？
servlet他的生命周期是什么？

mysql分页怎么做？

JDK1.8的新特性

http和https有什么区别？

Spring的理解

![image-20210830142201329](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210830142201329.png)

# 面试编程题目

+ 给你一串字符串，统计该字符串的字母、数字、空格、符号和其他字符

+ 写出安全的单例模式(单例模式，保证对象只有一个实例）（在一个jvm中，该对象只有一个实例存在

  + 类创建繁琐

  + 省去new操作符，降低内存使用频率

  + 一些核心类（如交易引擎，只能有一个，保证核心，不能多创建）

    + 单例模式 
  + 饱汉型
    + 
    + 饿汉型
    + 双重检验锁：
    
    ```java
    public class Singleton(){
    	private static volatile Singleton instance = null;
        private Singleton(){}
        public static Singlenton getInstance(){
            if(instance == null){
                synchronized(Singleton.class){
                    if(instance == null){
                        instance = new Singleton();
                    }
                }
            }
          return instace;
        }
  }
    ```
    
    + 静态内部类:同时保证延迟加载和线程安全
    
      ```java 
      public class Singleton{
          private static class SingletonHoleder{
              public static Singleton instance = new Singleton(
          } 
          private Singleton(){}
          public static Singleton newInstance(){
            return SingletonHolder.instance;
          }
      }
      ```
    
      

+ 根据TCP/ip协议，写出小demo客户端发送数据给服务端

  ```java
  public class Client{
      public static void main(String[] args){
          try{
              Socket socket = new Socket("127.0.0.1",3500);
              socket.setkeepAlive(true);
              BuffereWriter wr = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
              BuffereWriter br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
              int i =  0;
              boolean isOnline = true ;
              while(isOnline){
                   //发送信息时，需要加上换行符，否则服务器端的readline()会阻塞
                  wr.write();
                   //使用flush方法可以立即清空buffer，让消息马上发出去，否则在buffer满之前消息都不会发出去
                  wr.flush();
                  	socket.sendUrgentData(0xFF);//发送心跳包
                  System.out.println();
                  String line = br.readLine();
                  sout (""+ line);
                  Thread.sleep(100);
              }
          }catch (Exception ex)
              Logger.getLogger(Client.class.getName()).log(Level.SEVERE,null,ex);
      }
  }
  ```

  服务端

  ```java
  //服务端
  public class Server{
  public static void main(String[] args) {
          //创建端口3500的服务器socket
          ServerSocket ss = null;
          try {
              ss = new ServerSocket(3500);
          } catch (Exception e) {
              e.printStackTrace();
          }
   //防止客户端断开之后服务端程序挂掉
          while (ss != null) {
              try {
                  //在返回客户端socket之前，accept将会一直阻塞
                  Socket s = ss.accept();//接收客户端的连接
                  // 将请求指定一个线程去执行
                  Thread start = new Thread(new Runnable() {
                      @Override
                      public void run() {
                          try {
                              BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                              BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                              int i = 0;
                              logger.debug("客户端已链接");
                              while (true) {
                                  //发送信息时，需要加上换行符，否则客户端的readline()会阻塞
                                  wr.write("服务器返回消息成功[" + i++ + "]\n");
                                  //使用flush方法可以立即清空buffer，让消息马上发出去，否则在buffer满之前消息都不会发出去
                                  wr.flush();
                                  String line = br.readLine();
                                  logger.debug("来自客户端的数据：==" +line);
  
                              }
                          } catch (Exception e) {
  //                            e.printStackTrace();
                              logger.debug("客户端已断开");
                          }
                      }
                  });
                  start.start();
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }
      }
  
  }
  ```

  

+ 多线程中start 和run的区别

  + start方法启动多线程，处在就绪未运行状态
  +  Java 线程调用 start->start0 的方法，实际上会调用到 JVM_StartThread 方法，而 JVM_StartThread 最终调用的是 Java 线程的 run 方法
  + run方法只是thread的一个普通方法调用，还是在主线程里执行，是不会开启多线程的

+ 手写快排 输入一串数组，有最大值 high和最小值low 取一个基准值，start 和low ；先从后向前比较，比基数小的和start换位置，比基数大的end减一，第一次比较后，从前向后比较，比基数小的换位置，比基数大的不换， 之后用递归 递归两个函数，参数为low>start 和end<high end+1

  ```java
  public void sort(int[] a, low, high){
     	int start=low;
      int end =high;
      int key=a[low];
      while (end>start){
          while(end>start && a[end]>=key){
              end--;
              if(a[end]<=key){
                  int temp = a[end];
                  a[end]=a[start];
                  a[start]=temp;
              }
          }
          while(end>start && a[start]<=key){
              start++;
              if(a[start] >=key){
                  int temp = a[start];
                  a[start] =a[end];
                  a[end]=temp;
              }
          }
      }
      if(low <start) sort(a, low, start-1);
      if(end < high) sort(a, end+1, high);
  }
  ```

   

  public 

mysql、redis、mq消息队列、并发编程、jvm、spring、springboot、mybatis、集合、hashmap、arraylist、hashset、数据结构和算法

问哪里能答上来、

项目选型+架构设计、业务上的设计、扩展、秒杀

面试官问，如果业务升级

基础架构、自研的一些架构、底层有一定的了解

![image-20210827154706464](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210827154706464.png)

![image-20210827154727153](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210827154727153.png)



照搬代码  刷面试题   hashmap

# Redis

![image-20210830093443469](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210830093443469.png)
你就可以用“典型案例驱动”的方式学习了。我们可以重点解读一些对 Redis 的“三高”特性影响较大的使用案例，例如，多家大厂在万亿级访问量和万亿级数据量的情况下对 Redis 的深度优化，解读这些优化实践，非常有助于你透彻地理解 Redis。

![image-20210830094017615](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210830094017615.png)

《Redis 设计与实现》虽然《Redis 设计与实现》和《Redis 使用手册》是同一个作者写的，但是它们的侧重点不一样，这本书更加关注 Redis 关键机制的实现原理。介绍 Redis 原理的资料有很多，但我认为，这本书讲解得非常透彻，尤其是在 Redis 底层数据结构、RDB 和 AOF 持久化机制，以及哨兵机制和切片集群的介绍上，非常容易理解，我建议你重点学习下这些部分的内容

当然，要想真正提升实战能力，光读书是远远不够的，毕竟，“纸上得来终觉浅”。所以，我还想再给你分享两条建议。第一个建议是阅读源码。读源码其实也是一种实战锻炼，可以帮助你从代码逻辑中彻底理解 Redis 系统的实际运行机制，当遇到问题时，可以直接从代码层面进行定位、分析和解决问题。阅读 Redis 源码，最直接的材料就是 Redis 在 GitHub 上的源码库https://github.com/redis/redis。另外，有一个网站提供了 Redis 3.0 源码的部分中文注释，**https://github.com/huangz1990/redis-3.0-annotated**你也可以参考一下。

#### 7年工作经验用户学习方法

![image-20210830105208057](C:\Users\MastJack\AppData\Roaming\Typora\typora-user-images\image-20210830105208057.png)

也狠狠地恶补了 Redis 方面的知识，看过书，读过源码，出过 Bug，踩过坑，一路走来，我逐渐梳理出了一套高效的学习路径，我把它分为三大模块：

+ 掌握数据结构和缓存的基本使用方法；
+ 掌握支撑 Redis 实现高可靠、高性能的技术；
+ 精通 Redis 底层实现原理。



+ 如果你只需要存储简单的键值对，或者是对数字进行递增递减操作，就可以使用 String 存储；

+ 如果需要一个简单的分布式队列服务，List 就可以满足你的需求；

+ 如果除了需要存储键值数据，还想单独对某个字段进行操作，使用 Hash 就非常方便；

+ 如果想得到一个不重复的集合，就可以使用 Set，而且它还可以做并集、差集和交集运算；

+ 如果想实现一个带权重的评论、排行榜列表，那么，Sorted Set 就能满足你。

  当数据量很小时，我们想要计算 App 里某一天的用户 UV 数，只需要使用一个 Set 存储这一天的访问用户，再使用 SCARD，就可以计算出结果了。但是，假如一天的访问用户量达到了亿级，就不能这样存储了，因为这会消耗非常大的内存空间。而且，这么大的 key 在过期时会引发阻塞风险。这个时候，我们就需要学习 Redis 的数据结构的高阶用法了。



​	Redis 提供了三种扩展数据类型，就是咱们前面学到的 HyperLogLog、Bitmap 和 GEO。HyperLogLog 就非常适合存储 UV 这样的业务数据，而且它占用的内存非常小。同样地，当需要计算大量用户的签到情况时，你会发现，使用 String、Set、Sorted Set 都会占用非常多的内存空间，而 Redis 提供的位运算就派上用场了。如果你遇到了缓存穿透问题，就可以使用位运算的布隆过滤器，这种方法能够在占用内存很少的情况下解决我们的问题



​	掌握支撑 Redis 实现高性能、高可靠的技术点如果你看过软件架构设计相关的文章，应该就会知道，一个优秀的软件，必须符合三个条件：高可靠、高性能、易扩展。作为一个非常优秀的数据库软件，Redis 也是符合这些条件的。不过，易扩展是针对深度参与 Redis 开发来说的，我们接触得比较少，暂时可以忽略。我们需要关注另外两个：高可靠、高性能。

Redis 之所以可以实现高可靠、高性能，和它的持久化机制、主从复制机制、哨兵、故障自动恢复、切片集群等密不可分。所以，我们还要掌握这一系列机制。这样的话， 在出现问题时，我们就可以快速地定位和解决问题了。而且，我们还可以从 Redis 身上学习一个优秀软件的设计思想，这也会给我们学习其他数据库提供非常大的帮助。我先从一个最简单的单机版 Redis 说起，和你聊一聊我的理解。



假设我们只部署一个 Redis 实例，然后把业务数据都存储在这个实例中，而 Redis 只把数据存储在内存中，那么，如果此时，这个 Redis 实例故障宕机了，就意味着，我们的业务数据就全部丢失了，这显然是不能接受的。那该如何处理呢？

这就需要 Redis 有持久化数据的能力。具体来说，就是可以把内存中的数据持久化到磁盘，当实例宕机时，我们可以从磁盘中恢复数据。所以，Redis 提供了两种持久化方式：RDB 和 AOF，分别对应数据快照和实时的命令持久化，它们相互补充，实现了 Redis 的持久化功能。

有了数据的持久化，是不是就可以高枕无忧了？不是的。当实例宕机后，如果我们需要从磁盘恢复数据，还会面临一个问题：恢复也是需要时间的，而且实例越大，恢复的时间越长，对业务的影响就越大。

针对这个问题，解决方案就是：采用多个副本。我们需要 Redis 可以实时保持多个副本的同步，也就是我们说的主从复制。这样，当一个实例宕机时，我们还有其他完整的副本可以使用。这时，只需要把一个副本提升为主节点，继续提供服务就可以了，这就避免了数据恢复过程中的一些影响。

但是，进一步再想一下，当主节点宕机后，我们把从节点提升上来，这个过程是手动的。手动触发就意味着，当故障发生时，需要人的反应时间和操作时间，这个过程也需要消耗时间。晚操作一会儿，就会对业务产生持续的影响，这怎么办呢？我们很容易会想到，当故障发生时，是不是可以让程序自动切换主从呢？要实现主从自动切换，就需要能够保证高可用的组件：哨兵。

哨兵可以实时检测主节点的健康情况。当主节点故障时，它会立即把一个从节点提升为主节点，实现自动故障转移，整个过程无需人工干预，程序自动完成，大大地减少了故障带来的影响。所以你看，经过刚刚的分析，我们知道，为了保证可靠性，一个数据库软件必然需要做到数据持久化、主从副本和故障自动恢复。其他的数据库软件也遵循这样的原则，你可以留意观察一下。到这里，我们说的都是针对单个 Redis 实例的功能，如果我们业务的读写请求不大，使用单个实例没有问题，但是当业务写入量很大时，单个 Redis 实例就无法承担这么大的写入量了。这个时候，我们就需要引入切片集群了，也就是把多个 Redis 实例组织起来，形成一个集群，对外提供服务。同时，这个集群还要具有水平扩展的能力，当业务量再增长时，可以通过增加机器部署新实例的方法，承担更大的请求量，这样一来，我们的集群性能也可以变得很高。所以，就有了 Redis Cluster、Twemproxy、Codis 这些集群解决方案。其中，Redis Cluster 是官方提供的集群方案，而 Twemproxy 和 Codis 是早期 Redis Cluster 不够完善时开发者设计的。既然是多个节点存储数据，而且还要在节点不足时能够增加新的节点扩容集群，这也对应着切片集群的核心问题：数据路由和数据迁移。数据路由用于解决把数据写到哪个节点的问题，而数据迁移用于解决在节点发生变更时，集群数据重新分布的问题。

当我们从单机版 Redis 进入到切片集群化的领域时，就打开了另一个世界的大门。

不知道你有没有思考过这样一个问题：当我们的系统需要承担更大体量的请求时，从应用层到数据层，容易引发性能问题的地方在哪儿？

其实，最终都会落到数据库层面。因为我们的应用层是无状态的，如果性能达到了瓶颈，就可以增加机器的横向扩展能力，部署多个实例，非常容易。但是，应用层水平扩容后，数据库还是单体的，大量请求还是只有一个机器的数据库在支撑，这必然会产生性能瓶颈。所以，最好的方案是，数据库层也可以做成分布式的，这也就是说，数据也可以分布在不同的机器上，并且拥有横向扩展的能力，这样，在业务层和数据库层，都可以根据业务的体量进行弹性伸缩，非常灵活。切片集群虽然更可靠，性能更好，但是因为涉及到多个机器的部署，所以就会引入新的问题，比如说，多个节点如何组织？多个节点的状态如何保持一致？

跨机器的故障如何检测？网络延迟时集群是否还能正常工作？这些就涉及到分布式系统领域相关的知识了。上面这些都是跟可靠性相关的知识，下面我们再来看看高性能。Redis 的数据都存储在内存中，再加上使用 IO 多路复用机制，所以，Redis 的性能非常高。如果配合切片集群的使用，性能就会再上一个台阶。但是，这也意味着，如果发生操作延迟变大的情况，就会跟我们的预期不符。所以，如何使用和运维好 Redis 也是需要我们重点关注的，只有这样，才可以让 Redis 持续稳定地发挥其高性能。而性能问题，就贯穿了刚刚我们说到的所有方面，业务使用不当，高可靠、切片集群运维不当，都会产生性能问题。例如，在业务使用层面，使用复杂度过高的命令、使用 O(N) 命令而且 N 很大、大量数据集中过期、实例内存达到上限等，都会导致操作延迟变大；在运维层面，持久化策略选择不当、主从复制参数配置不合理、部署和监控不到位、机器资源饱和，等等，也会产生性能问题。Redis 性能涉及到了 CPU、内存、网络甚至磁盘的方方面面，一旦某个环节出现问题，都会影响到性能。所以，在第二个阶段，我们就需要掌握跟高可靠、高性能相关的一系列机制。这个时候，我们的 Redis 使用能力就超过了很多人，不过还达不到精通的程度。要想成为 Redis 大神，我们还必须具备能够随时解决棘手问题的能力。这个时候，我们就要去学习 Redis 的底层原理了。

精通 Redis 底层实现原理我们要知道各种数据类型的底层原理。这个时候，可以去看下源码。例如，t_string.c、t_list.c、t_hash.c、t_set.c、t_zset.c。

在阅读源码的时候，我们就会了解每种数据结构的具体实现，例如 List 在底层是一个链表，在 List 中查找元素时就会比较慢，而 Hash 和 Set 底层都是哈希表实现的，所以定位元素的速度非常快，而 Sorted Set 是把哈希表和跳表结合起来使用，查找元素和遍历元素都比较快。如果你不了解这些数据结构的实现，就无法选择最佳的方案。如果你看得比较仔细的话，还会发现，每种数据结构对应了不同的实现，例如 List、Hash、Sorted Set 为了减少内存的使用，在数据量比较少时，都采用压缩列表（ziplist）存储，这样可以节省内存。

而 String 和 Set 在存储数据时，也尽量选择使用 int 编码存储，这也是为了节省内存占用。

这些都是 Redis 针对数据结构做的优化。只有了解了这些底层原理，我们在使用 Redis 时才能更加游刃有余，把它的优势真正发挥出来。

另外，我们还需要掌握跟高性能、高可靠相关的一系列原理，主要就是持久化、主从同步、故障转移、切片集群是如何做的，比如说：RDB 和 AOF 重写都使用了操作系统提供的"fork"机制进行数据持久化，这涉及到了操作系统层面的知识；故障转移使用哨兵集群实现，而哨兵集群的维护就涉及到了分布式系统的选举问题和共识问题；切片集群是操作多个机器上的节点，如何对多个节点进行管理、调度和维护，也涉及到分布式系统的很多问题，例如 CAP 原理、分布式事务、架构设计；

说到这儿，我想给你分享一个我的小故事。之前我在业务部门做开发时，大部分时间都在写业务代码，对 Redis 也只停留在“会用”的层面，并不了解它的原理，更别说分析和定位性能问题了。后来一个偶然的机会，我可以去公司的基础架构部门做数据库中间件相关的工作。我当时非常犹豫：一方面，我知道，这个工作要求熟练掌握 Redis 的方方面面，难度非常高，我觉得我可能无法胜任；但另一方面，我也非常想踏出舒适区，突破一下自己。最终，我还是选择了接受挑战。刚开始时，我确实遭遇了难以想象的困难，比如说不熟悉 Redis 的运行原理、看 Redis 源码时一头雾水、在系统发生问题时不知所措等等。还好，面对压力，我的斗志被激发了，于是就疯狂地恶补数据结构、网络协议、操作系统等知识，一行行地去啃源码……真正走出舒适区之后，我看到了自己的飞速成长和进步，不仅很快就胜任了新工作，而且，我越来越自信了。之后，每次遇到新问题的时候，我再也不会害怕了，因为我知道，只要花时间去研究，就可以搞定一切。所以，我真的想和你说，面对任何可以让自己成长的机会，都不要轻易错过，一定不要给自己设限。你要相信，你的潜能会随着你面临的压力而被激发出来，而且它的威力巨大！



我认为，任何领域的学习，在研究具体的方法之前，我们都需要先在心理上领先别人一步。什么意思呢？其实就是要建立并保持好奇心，并且不给自己设限。我发现，很多人是缺乏好奇心的，突出表现在只知其然，不知其所以然，不善于思考和挖掘问题。给你举个小例子。刚开始接触 Redis 时，你肯定听说过一句话，Redis 是单线程，高性能。很多人听完也就过去了，但是有好奇心的人，会进一步思考：“单线程如何处理多个客户端的网络请求呢？采用单线程的话，只能用到一个 CPU 核心，怎么达到高性能呢？”顺着这个思路去学习的话，你就会发现，Redis 虽然采用了单线程，但是它使用了多路复用技术，可以处理多个客户端的网络请求。而且，它的数据都存储在内存中，再加上高效的数据结构，所以处理每个请求的速度极快。你看，带着好奇心去看问题，最终我们得到的远远超出想象。所以，我们要永远保持好奇心和深入探究的精神，它是我们不断进步的核心驱动力。我要说的第二点，就是不要给自己设限。不要没有做任何尝试，就先去说“我做不到”。如果你这样做，就相当于提前放弃了自己的成长机会。我特别喜欢的一个心态是：“我现在虽然不会，但是只要给我时间，我就能学会它。”



**如果在查资料时，遇到了细节问题，找不到答案，不要犹豫，一定要去看源码。源码是客观的，是最细节的表现，不要只会从别人那里获取东西，要学着自己动手觅食，而源码，往往能够给我们提供清晰易懂的答案。**



我采用的方式是用番茄工作法。我会把这些细化的目标加入到番茄任务中，并且排列好优先级。随后，我会在工作日晚上或者周末，抽出一整块的时间去完成这些小目标。在开启番茄钟时，我会迅速集中精力去完成这些任务。同时，我会把手机静音，放在自己够不到的地方。等一个番茄钟（25 分钟）结束后，休息 5 分钟，调整下状态，然后再投入到一个番茄任务中。

在实施的过程中，我们可能会遇到一些阻碍，比如说某个任务比想象中的难。这个时候，我会尝试多用几个番茄钟去攻克它，或者是把它的优先级向后放，先完成其他的番茄任务，最后再花时间去解决比较难的问题。长时间使用这种方法，我发现，我的效率非常高。而且，把番茄任务一个个划掉之后，也会有一些小小的成就感，这种成就感会激励我持续学习。最后，我还想再说一点，就是要投入足够多的时间。不要总是抱怨想要的得不到，在抱怨之前，你要先想一想，有没有远超出他人的投入和付出。想要走在别人的前面，就要准备好投入足够多的时间。

另一方面，不要幻想着只在地铁上学一会儿，就能把它学会，这样就有点太高估自己了。因为在很短的时间内，我们没有办法深入地去思考，去深入了解这个知识点的前因后果。你必须在晚上或者周末抽出一整块时间，去理清每个知识点之间的关系和边界，必要时还需要动手实践。

## 基础



### 一个引发惨案的地方（缓冲区溢出

如何查看输入缓冲区的内存使用情况，以及如何避免溢出

```mysql
CLIENT LIST
id=5 addr=127.0.0.1:50487 fd=9 name= age=4 idle=0 flags=N db=0 sub=0 psub=0 multi=-1 qbuf=26 qbuf-free=32742 obl=0 oll=0 omem=0 events=r cmd=client
```

client list

显示多个客户端的连接端口号和地址信息

cmd 使用什么指令 client

qbuf 	内存空间大

qbuf-free  	可用空间小

我们可以从两个角度去考虑如何避免**输入缓冲区溢出**，一是把缓冲区调大，二是从数据命令的发送和处理速度入手。

一方面1G的内存够大

如果再大的话，Redis 就有可能因为客户端占用了过多的内存资源而崩溃

从数据命令的发送和处理速度入手，也就是前面提到的避免客户端写入 bigkey，以及避免 Redis 主线程阻塞。

好了，我们来总结下如何应对输出缓冲区溢出：避免 bigkey 操作返回大量数据结果；避免在线上环境中持续使用 MONITOR 命令。使用 client-output-buffer-limit 设置合理的缓冲区大小上限，或是缓冲区连续写入时间和写入量上限。以上就是关于客户端缓冲区，我们要重点掌握的内容了。我们继续看看在主从集群间使用缓冲区，需要注意什么问题。

全量复制：

增量复制：增量复制只会把主从库网络断连期间主库收到的命令，同步给从库

#### 复制缓冲区的溢出问题：

一方面，我们可以控制主节点保存的数据量大小。按通常的使用经验，我们会把主节点的数据量控制在 2~4GB，这样可以让全量同步执行得更快些，避免复制缓冲区累积过多命令。

另一方面，我们可以使用 client-output-buffer-limit 配置项，来设置合理的复制缓冲区大小。设置的依据，就是主节点的数据量大小、主节点的写负载压力和主节点本身的内存大小。

主节点上复制缓冲区的内存开销，会是每个从节点客户端输出缓冲区占用内存的总和。如果集群中的从节点数非常多的话，主节点的内存开销就会非常大。所以，我们还必须得控制和主节点连接的从节点个数，不要使用大规模的主从集群。

#### 复制积压缓冲区的溢出问题

复制积压缓冲区是一个大小有限的环形缓冲区。当主节点把复制积压缓冲区写满后，会覆盖缓冲区中的旧命令数据。如果从节点还没有同步这些旧命令数据，就会造成主从节点间重新开始执行全量复制。

为了应对复制积压缓冲区的溢出问题，我们可以调整复制积压缓冲区的大小，也就是设置 repl_backlog_size 这个参数的值。具体的调整依据，你可以再看下第 6 讲中提供的 repl_backlog_size 大小的计算依据。

#### 缓冲区溢出总结

从缓冲区溢出对 Redis 的影响的角度，我再把这四个缓冲区分成两类做个总结。缓冲区溢出导致网络连接关闭：普通客户端、订阅客户端，以及从节点客户端，它们使用的缓冲区，本质上都是 Redis 客户端和服务器端之间，或是主从节点之间为了传输命令数据而维护的。这些缓冲区一旦发生溢出，处理机制都是直接把客户端和服务器端的连接，或是主从节点间的连接关闭。网络连接关闭造成的直接影响，就是业务程序无法读写 Redis，或者是主从节点全量同步失败，需要重新执行。缓冲区溢出导致命令数据丢失：主节点上的复制积压缓冲区属于环形缓冲区，一旦发生溢出，新写入的命令数据就会覆盖旧的命令数据，导致旧命令数据的丢失，进而导致主从节点重新进行全量复制。从本质上看，缓冲区溢出，无非就是三个原因：命令数据发送过快过大；命令数据处理较慢；缓冲区空间过小。明白了这个，我们就可以有针对性地拿出应对策略了。针对命令数据发送过快过大的问题，对于普通客户端来说可以避免 bigkey，而对于复制缓冲区来说，就是避免过大的 RDB 文件。针对命令数据处理较慢的问题，解决方案就是减少 Redis 主线程上的阻塞操作，例如使用异步的删除操作。针对缓冲区空间过小的问题，解决方案就是使用 client-output-buffer-limit 配置项设置合理的输出缓冲区、复制缓冲区和复制积压缓冲区大小。当然，我们不要忘了，输入缓冲区的大小默认是固定的，我们无法通过配置来修改它，除非直接去修改 Redis 源码。

应用程序和Redis实例交互时，应用程序中使用的客户端需要使用缓冲区吗？如果使用的话，对Redis的性能和内存使用有什么影响？

#### **客户端需要使用缓冲区的好处**

1、客户端和服务端交互，一般都会制定一个交互协议，客户端给服务端发数据时，都会按照这个协议把数据拼装好，然后写到客户端buffer中，客户端再一次性把buffer数据写到操作系统的网络缓冲区中，最后由操作系统发送给服务端。这样服务端就能从网络缓冲区中读取到一整块数据，然后按照协议解析数据即可。使用buffer发送数据会比一个个发送数据到服务端效率要高很多。

2、客户端还可以使用Pipeline批量发送命令到服务端，以提高访问性能。不使用Pipeline时，客户端是发送一个命令、读取一次结果。而使用Pipeline时，客户端先把一批命令暂存到buffer中，然后一次性把buffer中的命令发送到服务端，服务端处理多个命令后批量返回结果，这样做的好处是可以减少来回网络IO的次数，降低延迟，提高访问性能。当然，Redis服务端的buffer内存也会相应增长，可以控制好Pipeline命令的数量防止buffer超限。

缓冲区其实无处不在，客户端缓冲区、服务端缓冲区、操作系统网络缓冲区等等，凡是进行数据交互的两端，一般都会利用缓冲区来降低两端速度不匹配的影响。没有缓冲区，就好比一个个工人搬运货物到目的地，每个工人不仅成本高，而且运输效率低。而有了缓冲区后，相当于把这些货物先装到一个集装箱里，然后以集装箱为单位，开车运送到目的地，这样既降低了成本，又提高了运输效率。缓冲区相当于把需要运送的零散数据，进行一块块规整化，然后分批运输。

另外，关于Redis服务端为客户端分配的输出缓冲区，我想补充一点：主库上的从库输出缓冲区（slave client-output-buffer）是不计算在Redis使用的总内存中的，也就是说主从同步延迟，数据积压在主库上的从库输出缓冲区中，这个缓冲区内存占用变大，不会超过maxmemory导致淘汰数据。只有普通客户端和订阅客户端的输出缓冲区内存增长，超过maxmemory时，才会淘汰数据。

（接下来，我们看下输出缓冲区大小设置的问题。和输入缓冲区不同，我们可以通过 client-output-buffer-limit 配置项，来设置缓冲区的大小。具体设置的内容包括两方面：设置缓冲区大小的上限阈值；设置输出缓冲区持续写入数据的数量上限阈值，和持续写入数据的时间的上限阈值。在具体使用 client-output-buffer-limit 来设置缓冲区大小的时候，我们需要先区分下客户端的类型。对于和 Redis 实例进行交互的应用程序来说，主要使用两类客户端和 Redis 服务器端交互，分别是常规和 Redis 服务器端进行读写命令交互的普通客户端，以及订阅了 Redis 频道的订阅客户端。此外，在 Redis 主从集群中，主节点上也有一类客户端（从节点客户端）用来和从节点进行数据同步，我会在介绍主从集群中的缓冲区时，向你具体介绍。当我们给普通客户端设置缓冲区大小时，通常可以在 Redis 配置文件中进行这样的设置：client-output-buffer-limit normal 0 0 0其中，normal 表示当前设置的是普通客户端，第 1 个 0 设置的是缓冲区大小限制，第 2 个 0 和第 3 个 0 分别表示缓冲区持续写入量限制和持续写入时间限制。对于普通客户端来说，它每发送完一个请求，会等到请求结果返回后，再发送下一个请求，这种发送方式称为阻塞式发送。在这种情况下，如果不是读取体量特别大的 bigkey，服务器端的输出缓冲区一般不会被阻塞的。所以，我们通常把普通客户端的缓冲区大小限制，以及持续写入量限制、持续写入时间限制都设置为 0，也就是不做限制。对于订阅客户端来说，一旦订阅的 Redis 频道有消息了，服务器端都会通过输出缓冲区把消息发给客户端。所以，订阅客户端和服务器间的消息发送方式，不属于阻塞式发送。不过，如果频道消息较多的话，也会占用较多的输出缓冲区空间。因此，我们会给订阅客户端设置缓冲区大小限制、缓冲区持续写入量限制，以及持续写入时间限制，可以在 Redis 配置文件中这样设置：client-output-buffer-limit pubsub 8mb 2mb 60其中，pubsub 参数表示当前是对订阅客户端进行设置；8mb 表示输出缓冲区的大小上限为 8MB，一旦实际占用的缓冲区大小要超过 8MB，服务器端就会直接关闭客户端的连接）