## 简介

* `Author` : *GoogTech*
* `Website` : *https://algorithm.show*
* `Email` : *GoogTech@qq.com*
* `Date` :  *2021,6,15 ~ 2021,6,22*



---



## 第一个C++程序

```cpp
#include <iostream>

int main() {
    std::cout << "Hello, World!" << std::endl;
    return 0;
}
```



---



## 基础教程 : 头文件与命名空间

```cpp
/**
 * Video 01: 头文件, 注释, 命名空间
 *
 * 1. cpp 头文件不必是 ".h" 结尾, cpp 语言中的标准库头文件如 "math.h",
 * "stdio.h" 在 cpp 中被名为: "cmath", "cstdio"
 *
 * 2. cpp 支持多行注释
 */
#include <cmath>
#include "cstdio"
int main() {
    double a = 1.2;
    double b = sin(a);
    // %f代表单精度浮点型数据(float), %lf代表双精度浮点型数据(double)
    printf("%lf\n", b); // 0.932039
}
```

```cpp
/**
 * Video 01: 命名空间 namespace
 * 为了防止名字冲突(出现同名), cpp 引入了命名空间(namespace)
 * 通过 "::" 运算符限定某个名字属于哪个名字空间
 *
 * 如区分: "计科01: GoogTech" 与 "计科02: GoogTech"
 *
 * 通常有 3 中方法适用命名空间 X 的名字 name:
 * 1. 引入整个名字空间: using namespace X;
 * 2. 使用单个名字: using X::name;
 * 3. 程序中加上名字空间前缀: X::name;
 */
#include "cstdio"
namespace first {
    int a;
    void f() { a = a + 1; }
    int g() { return a + 2; }
}

namespace second {
    int a;
    double f() { return a + 1; }
    char g;
}

int main() {
    first::a = 2;
    second::a = 6;
    first::a = first::g() + second::f();
    second::a = first::g() + 6;
    printf("%d\n", first::a); // 11
    printf("%lf\n", second::a); // 0.000000
}
```



---



## 基础教程 : 标准输入输出流

```cpp
/**
 * Video 02: 标准输入输出流
 *
 * cpp 新的输入输出流库 <iostream> 将输入输出看成一个流, 并用输出运算符
 * ">>" 和输入运算符 "<<" 对数据进行输入输出
 *
 * 其中 "count" 和 "bin" 分别代表标准输出流对象(窗口)和标准输入流对象
 * (键盘)
 *
 * 标准库中的名字都属于标准名字空间 std
 */
#include "iostream"
#include <cmath>

using std::cout;

int main() {
    double a;
    // std::endl 是一个操纵符,作用为换行和将缓冲区中的内容刷新到屏幕
    cout << "Please input a number: " << std::endl;
    std::cin >> a; // 100
    double b = sin(a);
    cout << b; // -0.506366
    return 0;
}
```

```cpp
/**
 * Video 02: 标准输入输出流
 *
 * 引入整个名字空间 std 中的所有名字, 其 cout, cin 都属于名字空间 std;
 */
#include "iostream"
#include "cmath"

using namespace std;

int main() {
    double a;
    cout << "Please input a number: " << endl;
    cin >> a; // 100
    double b = sin(a);
    cout << b; // -0.506366
    return 0;
}
```



---



## 基础教程 : 变量及其作用域

```cpp
/**
 * Video 03: 变量及其作用域
 *
 * 较 C 而言 cpp 变量 "即用即定义", 且可用表达式初始化
 */
#include "iostream"

using namespace std;

int main() {

    double a = 12 * 3.25;
    double b = a + 1.112;
    cout << "a's value :" << a << endl; // a's value :39
    cout << "b's value :" << b << endl; // b's value :40.112

    a = a * 2 + b;
    double  c = a + b * a;
    cout << "c's value :" << c << endl; // c's value :4855.82
    return 0;
}
```

```cpp
/**
 * Video 03: 变量及其作用域
 *
 * 程序块 "{}" 内部作用域可定义与外部作用域同名的变量,在该块里就隐藏了外部变量
 */
#include "iostream"

using namespace std;

int main() {

    double a;
    cout << "Please input a number :"; // Please input a number :100
    cin >> a;

    {
        int a = 1;
        a *= 10;
        // 输出程序块 {} 内部定义的变量 "int a"
        cout << "Local number :" << a << endl; // Local number :10
    }

    // 输出 main 作用域的变量 "double a"
    cout << "You inputed number :" << a << endl; // You inputed number :100
}
```

```cpp
/**
 * Video 03: 变量及其作用域
 *
 * for 循环语句可以定义局部变量
 */
#include "iostream"

using namespace std;

int main() {

    int i = 0;

    for(int i = 0; i < 4; i++) {
        cout << i << ""; // 0123
    }

    for(i = 0; i < 1; i++) {
        for(int i = 0; i < 4; i++) {
            cout << i << ""; // 0123
        }
        cout << endl;
    }
    return 0;
}
```



---



## 基础教程 : 引用

```cpp
/**
 * Video 04: 引用
 *
 * cpp 引入了 "引用类型", 即一个变量是另一个变量的别名
 */
#include "iostream"

using namespace std;

int main() {
    double a = 3.14;
    double &b = a; //  b 引用 a, 即 b 为 a 的别名, 进而 b 就是 a
    b = 100;
    cout <<  "a's value :" << a << endl; // a's value :100
}
```

```cpp
/**
 * Video 04: 引用
 *
 * 引用经常用作函数的形参,表示形参和实参实际上是同一个对象.
 * 在函数中对形参的修改也就是对实参的修改.
 */
#include "iostream"

using namespace std;

void swap(int x, int y) {
    cout << "swap before: " << x << " " << y << endl; // swap before: 3 4
    int t = x; x = y; y = t;
    cout << "swap after: " << x << " " << y << endl; // swap after: 4 3
}

int main() {
    int a = 3, b = 4;
    swap(a, b);
    // a, b 的最终值并未因 swap 函数而改变
    cout << "main: " << a << " " << b << endl; // main: 3 4
}
```

```cpp
/**
 * 方法一 : 使用指针
 * 修改上述程序, 使得 a, b 的最终值因 swap 函数而发生交换
 */
#include "iostream"

using namespace std;

void swap(int *x, int *y) {
    cout << "swap before: " << *x << " " << *y << endl; // swap before: 3 4
    int t = *x; *x = *y; *y = t;
    cout << "swap after: " << *x << " " << *y << endl; // swap after: 4 3
}

int main() {
    int a = 3, b = 4;
    // &a 将 a 值赋值给 x, x 为 int* 指针, 指向 a
    swap(&a, &b);
    // a, b 的最终值因 swap 函数而发生交换
    cout << "main: " << a << " " << b << endl; // main: 4 3
}


/**
 * 方法二 : 使用引用
 * 修改上述程序, 使得 a, b 的最终值因 swap 函数而发生交换
 */
#include "iostream"

using namespace std;

void swap(int &x, int &y) {
    cout << "swap before: " << x << " " << y << endl; // swap before: 3 4
    int t = x; x = y; y = t;
    cout << "swap after: " << x << " " << y << endl; // swap after: 4 3
}

int main() {
    int a = 3, b = 4;
    // x, y 分别是 a, b 的引用, 即 x 就是 a, y 就是 b
    swap(a, b);
    // a, b 的最终值因 swap 函数而发生交换
    cout << "main: " << a << " " << b << endl; // main: 4 3
}
```

```cpp
/**
 * 当实参占据内存较大时,用引用代替传值( 需要复制 )可提高效率,
 * 如果不希望无意中修改实参, 可以用 const 修改符, 实例如下:
 */
#include "iostream"

using namespace std;

void change(double &x, const double &y, double z) {
    x = 100;
    // Error: Cannot assign to variable 'y' with const-qualified type 'const double &'
    y = 200;
    z = 300;
}
```



---



## 基础教程 : 内联函数, 异常处理

```cpp
/**
 * Video 05: 内敛函数
 *
 * 对于不包含循环的简单语句, 建议用 inline 关键字声明为 "inline 内联函数",
 * 编译器将内联函数调用其代码展开, 称为 "内联展开", 避免函数调用开销, 进而提
 * 高程序的运行效率.
 */
#include "iostream"
#include "cmath"

using namespace std;

inline double distance(double a, double b) {
    return sqrt(a * a + b * b);
}

int main() {

   double  a = 1, b = 2;

   // 下面两行代码的作用相同
   cout << distance(a, b) << endl; // 2.23607
   cout << sqrt(a * a + b * b) << endl; // 2.23607

   return 0;
}
```

```cpp
/**
 * Video 05: 异常处理
 *
 * cpp 通过 try-catch 处理异常情况,
 * 正常代码放在 try{} 中, catch{} 代码块用于捕获 try {} 代码块中抛出的异常
 */
#include "iostream"

using namespace std;

double division(int a, int b) {
    if(b == 0) {
        throw "Division By Zero Condition !";
    }
    return (a / b);
}

int main() {

    int x = 50, y = 0;
    double z = 0;

    // 抛出一个除以零的异常, 并在 catch 块中捕获该异常
    try {
        z = division(x, y);
        cout << z << endl;
    }catch(const char* msg) {
        cerr << msg << endl; // Division By Zero Condition !
    }

    return 0;
}
```



----



## 基础教程 : 函数的默认参数

```cpp
/**
 * Video 06: 函数的默认参数
 *
 * 函数的形参可带默认值, 但必须一律靠右
 */
#include "iostream"

using namespace std;

double add(double a, double b = 2) {
    return a + b;
}

int main() {
    cout << add(1) << endl; // 3
    cout << add(1, 3) << endl; // 4
    return 0;
}
```



---



## 基础教程 : 函数的重载

```cpp
/**
 * Video 07: 函数的重载
 *
 * cpp 允许函数同名, 只要它们的形参不一样(个数或对应参数类型),
 * 调用函数时将根据实参和形参的匹配选择最佳函数.
 */
#include "iostream"

using namespace std;

double add(double a, double b) {
    return a + b;
}

double add(int a, int b) {
    return a + b;
}

int main() {
    cout << add(1.1, 2.2) << endl; // 3.3
    cout << add(1, 2) << endl; // 3
    return 0;
}
```

> 当然还有`运算符`重载, 这里就不在举例了. . .



---



## 基础教程 : 模板函数

```cpp
/**
 * Video 08: 模板函数
 *
 * 对于任何不同类型间的大小比较, 可使用如下模板函数让编译器自动生成
 * 一个针对该数据类型的具体函数
 */
#include "iostream"

using namespace std;

template<class T1, class T2>
T1 minValue(T1 t1, T2 t2) {

    return t1 ? t2 > t1 : t2;
}

int main() {
    cout << "INT Min :" << minValue(1, 2) << endl; // INT Min :1
    cout << "DOUBLE Min :" << minValue(1.1, 2.2) << endl; // DOUBLE Min :1
    cout << "INT AND DOUBLE Min :" << minValue(1, 1.1) << endl; // INT AND DOUBLE Min :1
    return 0;
}
```



---



## 基础教程 : 虚函数

```cpp
/**
 * cpp 基础教程: 虚函数
 *
 * 定义一个函数为虚函数, 不代表函数为不被实现的函数。
 * 定义他为虚函数是为了允许用基类的指针来调用子类的这个函数。
 *
 * 下面这个例子是虚函数的一个典型应用,
 * 通过这个例子, 也许你就对虚函数有了一些概念。
 * 它虚就虚在所谓 "推迟联编 " 或者 "动态联编 "上,
 * 一个类函数的调用并不是在编译时刻被确定的, 而是在运行时刻被确定的。
 * 由于编写代码的时候并不能确定被调用的是基类的函数还是哪个派生类的函数, 所以被成为 "虚 " 函数。
 *
 * 注: 虚函数只能借助于指针或者引用来达到多态的效果。
 *
 * https://www.runoob.com/w3cnote/cpp-virtual-functions.html
 */
#include <iostream>

using namespace std;

class A {
public:
    virtual void foo() {
        cout << "A::foo() is called" << endl;
    }
};

class B : public A {
public:
    void foo() {
        cout << "B::foo() is called" << endl;
    }
};

int main() {
    A *a = new B();
    // a 虽然是指向 A 的指针, 但是被调用的函数 foo() 却是 B 的!
    a->foo(); // B::foo() is called

    return 0;
}
```



---



## 基础教程 : new与delete

```cpp
/**
 * Video 09: new 与 delete
 *
 * cpp 中使用 new 运算符来为任意的数据类型动态分配内存, 使用 delete 操作符释放它所占用的内存,
 * new 与 malloc() 函数相比, 其主要的优点为 new 不只是分配了内存, 它还创建了对象.
 */
#include "iostream"

using namespace std;

int main() {

    // 初始化为值 NULL 的指针
    double* pvalue = NULL;
    // 为变量请求内存
    pvalue = new double;
    // 为分配的地址赋值
    *pvalue = 3.14;
    // 打印内存地址
    cout << "Address of pvalue :" << pvalue << endl; // Address of pvalue :0xd21790
    // 打印内存地址中存储的值
    cout << "Value of pvalue :" << *pvalue << endl; // Value of pvalue :3.14
    // 释放内存
    delete pvalue;
    return 0;
}
```



---



## 面向对象 : 类与对象

```cpp
/**
 * cpp 面向对象: 类与对象
 * 
 * cpp 在 C 语言的基础上增加了面向对象编程, cpp 支持面向对象程序设计.
 *
 * https://www.runoob.com/cplusplus/cpp-classes-objects.html
 */
#include "iostream"

using namespace std;

// 类定义
class Box {
public:
    double length;
    double breadth;
    double height;

    double get(void);
    void set(double len, double bre, double hei);
};

// 定义成员函数 get()
double Box::get() {
    return length * breadth * height;
}

// 定义成员函数 set()
void Box::set(double len, double bre, double hei) {
    length = len;
    breadth = bre;
    height = hei;
}

int main() {

    Box box1;
    Box box2;
    double volume = 0.0; // 面积

    box1.length = 1;
    box1.breadth = 2;
    box1.height = 3;
    volume = box1.length * box1.breadth * box1.height;
    cout << "box1 area: " << volume << endl; // box1 area: 6

    box2.set(1, 2, 3);
    volume = box2.get();
    cout << "box2 area: " << volume << endl; // box2 area: 6

    return 0;
}
```



---



## 面向对象 : 继承

```cpp
/**
 * cpp 面向对象: 继承
 *
 * 一个类可以派生自多个类, 这意味着, 它可以从多个基类继承数据和函数.
 * 定义一个派生类, 我们使用一个类派生列表来指定基类. 类派生列表以一个或多个基类命名, 形式如下 :
 * class derived-class: access-specifier base-class
 *
 * https://www.runoob.com/cplusplus/cpp-inheritance.html
 */
#include "iostream"

using namespace std;

// 基类
class Shape {

protected:
    int width;
    int height;

public:
    void setWidth(int w) {
        width = w;
    }
    void setHeight(int h) {
        height = h;
    }
};

// 派生类
class Rectangle: public Shape {
public:
    int getArea() {
        return (width * height);
    }
};

// 主方法
int main() {
    Rectangle rectangle;
    rectangle.setWidth(10);
    rectangle.setHeight(20);

    // The area of rectangle: 200
    cout << "The area of rectangle: " << rectangle.getArea() << endl;

    return 0;
}
```

```cpp
/**
 * cpp 面向对象: 继承
 *
 * 多继承即一个子类可以有多个父类, 它继承了多个父类的特性.
 * cpp 类可以从多个类继承成员, 语法如下:
 *
 * class <派生类名>:<继承方式1><基类名1>, <继承方式2><基类名2>, ...
 * {
 * <派生类类体>
 * };
 *
 * https://www.runoob.com/cplusplus/cpp-inheritance.html
 */
#include "iostream"

using namespace std;

// 基类 Shape
class  Shape {

protected:
    int width;
    int height;

public:
    void setWidth(int w) {
        width = w;
    }
    void setHeight(int h) {
        height = h;
    }
};

// 基类 PaintCost
class PaintCost {
public:
    int getCost(int area) {
        return area * 100;
    }
};

// 派生类继承 Shape 及 PaintCost
class Rectangle: public Shape, public PaintCost {
public:
    int getArea() {
        return (width * height);
    }
};

// 主方法
int main() {
    int area;
    Rectangle rectangle;

    rectangle.setHeight(10);
    rectangle.setWidth(20);

    area = rectangle.getArea();

    // The Total of area: 200
    cout << "The Total of area: " << rectangle.getArea() << endl;
    // The Total of paint cost: 20000
    cout << "The Total of paint cost: " << rectangle.getCost(area) << endl;

    return 0;
}
```



---



## 面向对象 : 重载运算符与函数

```cpp
/**
 * cpp 面向对象: 重载运算符和重载函数
 *
 * 在同一个作用域内, 可以声明几个功能类似的同名函数,
 * 但是这些同名函数的形式参数(指参数的个数, 类型或者顺序)必须不同.
 * 您不能仅通过返回类型的不同来重载函数.
 *
 * https://www.runoob.com/cplusplus/cpp-overloading.html
 */
#include "iostream"

using namespace std;

class printData {
public:
    void print(int i) {
        cout << "Int value: " << i << endl;
    }
    void print(double f) {
        cout << "Double value: " << f << endl;
    }
    void print(char c[]) {
        cout << "Char value: " << c << endl;
    }
};

int main() {
    printData p;

    p.print(1); // Int value: 1
    p.print(1.1); // Double value: 1.1
    char c[] = "hi"; // Char value: hi
    p.print(c);

    return 0;
}
```

```cpp
/**
 * cpp 面向对象: 重载运算符和重载函数
 *
 * 您可以重定义或重载大部分 cpp 内置的运算符. 这样, 您就能使用自定义类型的运算符.
 * 重载的运算符是带有特殊名称的函数, 函数名是由关键字 operator 和其后要重载的运算符符号构成的.
 * 与其他函数一样, 重载运算符有一个返回类型和一个参数列表.
 *
 * https://www.runoob.com/cplusplus/cpp-overloading.html
 */
#include "iostream"

using namespace std;

class Box {

private:
    double length;
    double breadth;
    double height;

public:
    double getVolume() {
        return length * breadth * height;
    }

    void setLength(double len) {
        length = len;
    }

    void  setBreadth(double bre) {
        breadth = bre;
    }

    void setHeight(double hei) {
        height = hei;
    }

    // 重载运算符 " + ", 用于把两个 Box 对象相加
    Box operator+(const Box& b) {
        Box box;
        box.length = this -> length + b.length;
        box.breadth = this -> breadth + b.breadth;
        box.height = this -> height + b.height;
        return box;
    }
};

int main() {
    Box b1;
    Box b2;
    Box b3;
    double volume = 0.0; // 体积

    // 初始化 b1 对象中的属性值
    b1.setLength(6.0);
    b1.setBreadth(7.0);
    b1.setHeight(5.0);

    // 初始化 b2 对象中的属性值
    b2.setLength(12.0);
    b2.setBreadth(13.0);
    b2.setHeight(10.0);

    // 输出 b1 的体积
    volume = b1.getVolume();
    cout << "Volume of Box1: " << volume << endl; // Volume of Box1: 210

    // 输出 b2 的体积
    volume = b2.getVolume();
    cout << "Volume of Box2: " << volume << endl; // Volume of Box2: 1560

    // 把两个对象相加得到 b3, 然后输出其体积
    b3 = b1 + b2;
    volume = b3.getVolume();
    cout << "Volume of Box3: " << volume << endl; // Volume of Box3: 5400

    return 0;
}
```

```cpp
/**
 * cpp 面向对象: 多态
 *
 * cpp 多态意味着调用成员函数时, 会根据调用函数的对象的类型来执行不同的函数.
 */
#include "iostream"

using namespace std;

class Shape {
protected:
    int width, height;

public:
    Shape(int a = 0, int b = 0) {
        width = a;
        height = b;
    }
    // 虚函数是在基类中使用关键字 virtual 声明的函数.
    // 在派生类中重新定义基类中定义的虚函数时, 会告诉编译器不要静态链接到该函数.
    virtual int area() {
        cout << "Parent class area" << endl;
        return 0;
    }
};

class Rectangle: public Shape {
public:
    Rectangle(int a = 0, int b = 0): Shape(a, b ) {}
    int area() {
        cout << "Rectangle class area" << endl;
        return (width * height);
    }
};

class Triangle: public Shape {
public:
    Triangle(int a = 0, int b = 0): Shape(a, b) {}
    int area() {
        cout << "Triangle class area" << endl;
        return (width * height / 2);
    }
};

int main() {
    Shape *shape;
    Rectangle rectangle(10, 7);
    Triangle triangle(10, 5);

    // 获取矩形类的地址, 并调用矩形求面积的函数 area()
    shape = &rectangle;
    shape -> area(); // Rectangle class area

    // 获取三角形类的地址, 并调用三角形求面积的函数 area()
    shape = &triangle;
    shape -> area(); // Triangle class area

    return 0;
}
```



---



## 面向对象 : 数据封装

```cpp
/**
 * cpp 面向对象: 数据封装
 *
 * 封装是面向对象编程中的把数据和操作数据的函数绑定在一起的一个概念,
 * 这样能避免受到外界的干扰和误用, 从而确保了安全.
 * 数据封装引申出了另一个重要的 OOP 概念, 即数据隐藏.
 *
 * 通常情况下, 我们都会设置类成员状态为私有(private), 除非我们真的需要将其暴露,这样才能保证良好的封装性.
 *
 * https://www.runoob.com/cplusplus/cpp-data-encapsulation.html
 */
#include "iostream"

using namespace std;

class Adder {
private:
    int total;

public:
    Adder(int i = 0) {
        total = i;
    }

    void addNum(int number) {
        total += number;
    }

    int getTotal() {
        return total;
    }
};

int main() {
    Adder adder;
    adder.addNum(10);
    adder.addNum(20);
    cout << "Total value :" << adder.getTotal() << endl; // Total value :30

    return 0;
}
```



---



## 面向对象 : 接口(抽象类)

```cpp
/**
 * cpp 面向对象: 接口(抽象类)
 *
 * cpp 接口是使用抽象类来实现的, 抽象类与数据抽象互不混淆, 数据抽象是一个把实现细节与相关的数据分离开的概念.
 * 如果类中至少有一个函数被声明为纯虚函数, 则这个类就是抽象类.
 *
 * https://www.runoob.com/cplusplus/cpp-interfaces.html
 */
#include "iostream"

using namespace std;

// 基类
class Shape {

protected:
    int width;
    int height;

public:
    // 提供接口框架的纯虚函数.
    // 基类 Shape 提供了一个接口 getArea(),
    // 在两个派生类 Rectangle 和 Triangle 中分别实现了 getArea().
    virtual int getArea() = 0;

    void setWidth(int w) {
        width = w;
    }

    void setHeight(int h) {
        height = h;
    }
};

// 派生类 Rectangle
class  Rectangle: public Shape {
public:
    int getArea() {
        return (width * height);
    }
};

// 派生类 Triangle
class Triangle: public Shape {
public:
    int getArea() {
        return (width * height) / 2;
    }
};

int main() {
    Rectangle rectangle;
    Triangle triangle;

    rectangle.setWidth(5);
    rectangle.setHeight(7);
    // The total area of rectangle: 35
    cout << "The total area of rectangle: " << rectangle.getArea() << endl;

    triangle.setWidth(5);
    triangle.setHeight(7);
    // The total area of triangle: 17
    cout << "The total area of triangle: " << triangle.getArea() << endl;

    return 0;
}
```



---



## 高级教程 : 文件和流

```cpp
/**
 * cpp 高级教程: 文件和流
 *
 * ofstream : 该数据类型表示输出文件流, 用于创建文件并向文件写入信息.
 * ifstream : 该数据类型表示输入文件流, 用于从文件读取信息.
 * fstream  : 该数据类型通常表示文件流, 同时具有 ofstream 和 ifstream 两种功能.
 * close    : 在程序终止前关闭所有打开的文件.
 *
 * https://www.runoob.com/cplusplus/cpp-files-streams.html
 */
#include "iostream"
#include "fstream"

using namespace std;

int main() {
    char data[100];

    // 以写模式打开文件
    ofstream write;
    write.open("test.dat");

    // 接收用户输入的数据
    cout << "Write the data to file" << endl;
    cout << "Enter your name: ";
    cin.getline(data, 100);
    // 将数据写入到文件中
    write << data << endl;

    // 再次接收用户输入的数据
    cout << "Enter you age: ";
    cin >> data;
    cin.ignore();
    // 将数据写入到文件中
    write << data << endl;

    // 关闭打开的文件
    write.close();

    // 以读模式打开文件
    ifstream read;
    read.open("test.dat");

    // 读取文件中的数据并输出
    cout << "Read the data from file" << endl;
    read >> data;
    cout << data <<endl;

    // 再次从文件中读取数据并输出
    read >> data;
    cout << data << endl;

    // 关闭打开的文件
    read.close();

    return 0;
}

// Write the data to file
// Enter your name:GoogTech
// Enter you age:24
// Read the data from file
// GoogTech
// 24s
```



---



## 高级教程 : 命名空间

```cpp
/**
 * cpp 高级教程: 命名空间
 *
 * 命名空间这个概念专门用于解决上面的问题,
 * 它可作为附加信息来区分不同库中相同名称的函数、类、变量等.
 * 使用了命名空间即定义了上下文. 本质上,命名空间就是定义了一个范围.
 *
 * https://www.runoob.com/cplusplus/cpp-namespaces.html
 */
#include "iostream"

using namespace std;

// 自定义命名空间
namespace firstSpace {
    void func() {
        cout << "this is first space" << endl;
    }
}

namespace secondSpace {
    void func() {
        cout << "this is second space" << endl;
    }
}

int main() {

    // 调用自定义命名空间中的函数
    firstSpace::func(); // this is first space
    secondSpace::func(); // this is second space

    return 0;
}
```

```cpp
/**
 * cpp 高级教程: 命名空间
 *
 * 您可以使用 using namespace 指令,
 * 这样在使用命名空间时就可以不用在前面加上命名空间的名称.
 * 这个指令会告诉编译器, 后续的代码将使用指定的命名空间中的名称.
 *
 * https://www.runoob.com/cplusplus/cpp-namespaces.html
 */
#include "iostream"

using namespace std;

namespace firstSpace {
    void func() {
        cout << "this is first space" << endl;
    }
}

using namespace firstSpace;

int main() {

    func(); // this is first space
    return 0;
}
```

```cpp
/**
 * cpp 高级教程: 命名空间
 *
 * 命名空间可以嵌套, 您可以在一个命名空间中定义另一个命名空间.
 *
 * https://www.runoob.com/cplusplus/cpp-namespaces.html
 */
#include "iostream"

using namespace std;

namespace firstSpace {
    void func() {
        cout << "this is first space" << endl;
    }

    namespace innerSpace {
        void func() {
            cout << "this is inner space" << endl;
        }
    }
}

using namespace firstSpace;

int main() {

    // 调用自定义命名空间 firstSpace 中的函数
    func(); // this is first space

    // 调用自定义命名空间 innerSpace 中的函数
    firstSpace::innerSpace::func(); // this is inner space

    return 0;
}
```



---



## 高级教程 : 模板

```cpp
/**
 * cpp 高级教程: 模板
 *
 * 模板是泛型编程的基础, 泛型编程即以一种独立于任何特定类型的方式编写代码.
 * 模板是创建泛型类或函数的蓝图或公式.
 * 库容器, 比如迭代器和算法, 都是泛型编程的例子, 它们都使用了模板的概念.
 *
 * 模板函数的一般形式如下所示:
 * template <typename type> ret-type func-name(parameter list)
 * {
 *  // 函数的主体
 * }
 *
 * https://www.runoob.com/cplusplus/cpp-templates.html
 */
#include "iostream"

using namespace  std;

// 自定义函数模板, 返回不同类型数据中的最大值
template <typename T>
inline T const& Max(T const& a, T const& b) {
    return a < b ? b : a;
}

int main() {

    cout << Max(1, 2) << endl; // 2
    cout << Max(1.1, 2.2) << endl; // 2.2
    cout << Max("A", "B") << endl; // A

    return 0;
}
```

```cpp
/**
 * cpp 高级教程: 模板
 *
 * 也可以定义类模板, 泛型类声明的一般形式如下所示:
 * template <class type> class class-name {
 * }
 *
 * 向量(Vector)是一个封装了动态大小数组的顺序容器(Sequence Container).
 * 跟任意其它类型容器一样, 它能够存放各种类型的对.
 * 可以简单的认为, 向量是一个能够存放任意类型的动态数组.
 *
 * https://www.runoob.com/cplusplus/cpp-templates.html
 */
#include "iostream"
#include "vector"
#include "string"
#include "stdexcept"

using namespace std;

// 定义类 Stack<>, 并实现泛型方法来对元素进行入栈出栈操作
template <class T>
class Stack {

private:
    vector<T> element;

public:
    void push(T const&); // 添加元素
    void pop(); // 弹出元素
    T top() const; // 查看栈顶元素
    bool isEmpty() const { // 判断栈是否为空
        return element.empty();
    }
};

template <class T>
void Stack<T>::push(const T & e) {
    element.push_back(e);
}

template <class T>
void Stack<T>::pop() {
    if(isEmpty()) {
        throw out_of_range("Pop error: Stack is empty");
    }
    element.pop_back();
}

template <class T>
T Stack<T>::top() const {
    if (isEmpty()) {
        throw out_of_range("Top error: Stack is empty");
    }
    return element.back();
}

int main() {
    try {
        Stack<int> intStack; // int 类型的栈
        Stack<string> stringStack; //string 类型的栈

        // 操作 int 类型的栈
        intStack.push(1);
        cout << intStack.top() << endl; // 1
        intStack.pop();

        // 操作 string 类型的栈
        stringStack.push("googtech");
        cout << stringStack.top() << endl; // googtech
        stringStack.pop();
        stringStack.pop(); // Pop error: Stack is empty

    }catch (exception const& msg) {
        cerr << msg.what() << endl;
        return -1;
    }
}
```



---



## 高级教程 : 多线程

```cpp
/**
 * cpp 高级教程: 多线程
 *
 * 多线程是多任务处理的一种特殊形式,
 * 多任务处理允许让电脑同时运行两个或两个以上的程序.
 *
 * https://www.cnblogs.com/DOMLX/p/10945309.html
 */
#include "iostream"
#include "chrono" // 用于时间延时
#include "thread" // 用于创建线程

using namespace std;

// 两线程共享的变量
int number = 1;

int firstThread() {
    while(number < 10) {
        cout << "First  Thread :" << number << endl;
        ++ number;
        this_thread::sleep_for(std::chrono::milliseconds(10)); // 间隔 10 毫秒
    }
    return 0;
}

int secondThread() {
    while(number < 10) {
        cout << "Second Thread :" << number << endl;
        ++ number;
        this_thread::sleep_for(std::chrono::milliseconds(10));
    }
    return 0;
}


int main() {

    // 创建两个线程
    thread t1(firstThread);
    thread t2(secondThread);

    // join()为阻塞线程,
    // 阻塞的目的就是让 Main 主线程等待一下创建的线程
    t1.join();
    t2.join();

    return 0;
}

// First  Thread :1
// Second Thread :2
// Second Thread :3
// First  Thread :4
// Second Thread :5
// First  Thread :6
// Second Thread :7
// First  Thread :8
// Second Thread :9
// First  Thread :10
```



---



## 致谢

*以上部分代码参考了如下教程, Thanks .*

* *https://www.bilibili.com/video/BV1kW411Y76d*

* *https://www.runoob.com/cplusplus/cpp-tutorial.html*



---



## 总结

我学过并使用过很多种编程语言, 如 `Java`、`Python`、`Golang`、`C`、`JS`. . . 我想说的是编程语言之间是互通的, 其本身并不重要, 它仅仅是一个可以帮助我们解决不同问题的工具而已, 重要的是要学会培养及锻炼自己的逻辑思维、以及动手解决实际问题的能力 .

之所以花几个小时去学习 `C++`, 是因为临近期末, 总结 `408科目` 中的数据结构与算法题时需要用到它 .