## PAT真题共有顶级、甲级、乙级三套

目前处于乙级真题的实现中……

### 乙级真题

| 标号 | 标题 | C语言 |    C++  |  Java  | 解题关键 |
| ---- | ---- | :----: | :----: | :----: | ---- |
| 1036 | 跟奥巴马一起编程 | [答案](/BasicLevel_C/1036.%20跟奥巴马一起编程.md) | | | 四舍五入 |
| 1037 | 在霍格沃茨找零钱 | [答案](/BasicLevel_C/1037.%20在霍格沃茨找零钱.md) | | | 判断正负；进制换算 |
| 1038 | 统计同成绩学生 | [答案](/BasicLevel_C/1038.%20统计同成绩学生.md) | | | 找准解题角度 |
| 1039 | 到底买不买 | [答案](/BasicLevel_C/1039.%20到底买不买.md) | | | 对珠子的判断方式 |
| 1040 | 有几个PAT | [答案](/BasicLevel_C/1040.%20有几个PAT.md) | | | **重要** |
| 1041 | 考试座位号 | [答案](/BasicLevel_C/1041.%20考试座位号.md) | | | \ |
| 1042 | 字符统计 | [答案](/BasicLevel_C/1042.%20字符统计.md) | | | 确认筛选条件 |
| 1043 | 输出PATest | [答案](/BasicLevel_C/1043.%20输出PATest.md) | | | \ |
| 1044 | 火星数字 | [答案](/BasicLevel_C/1044.%20火星数字.md) | | | 火星文表达的特点 |
| 1045 | 快速排序 | [答案](/BasicLevel_C/1045.%20快速排序.md) | | | **重要** |
| 1046 | 划拳 | [答案](/BasicLevel_C/1046.%20划拳.md) | | | \ |
| 1047 | 编程团体赛 | [答案](/BasicLevel_C/1047.%20编程团体赛.md) | | | \ |
| 1048 | 数字加密 | [答案](/BasicLevel_C/1048.%20数字加密.md) | | | 加密的正整数更长时 |
| 1049 | 数列的片段和 | [答案](/BasicLevel_C/1049.%20数列的片段和.md) | | | **整型大小溢出** |
| 1050 | 螺旋矩阵 | [答案](/BasicLevel_C/1050.%20螺旋矩阵.md) | | | **重要** |



---
提示：
- **Java不适合作为算法入门的语言**，建议通过C语言或C++进行数据结构及算法的入门学习。
- PAT的负责人陈越老师在知乎上有这样一个对PAT考试的回答：
>Java在编译运行的时间上肯定比C慢了很多。但是只要不用Scanner读大规模的数据，应该还好啦。因为题目的时间上限是用C标程的时间放大3~5倍，再另加100毫秒给Java启动，这样来定的。

然而真题中就是有大规模数据的案例，那么，可以采用什么方式代替Scanner读取控制台的输入？  
方法之一是采用`BufferedReader`，**亲测有效**。  

---
参考网站：[Scanner究竟有多慢](https://www.cpe.ku.ac.th/~jim/java-io.html)