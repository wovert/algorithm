# Algorithm

- 计算机科学使用的算法
  - 游戏编程
  - 图形学
  - 人工智能
  - 编译器
  - 操作系统
  - 文件压缩
  - 搜索引擎
  - 网络安全
  - 虚拟现实
  - 电子货币

- 使用语言： Java 8

## GUI

- Java Swing
- iSO
- Android
- H5 Canvas

## 排序可视化

## 概率模拟问题

## 走迷宫

## 扫雷

## Move the box 自动求解

- 人工智能基础就是算法
  - 传统的人工智能方法：搜索技术
  - 机器学习：算法 + 统计学

## 分形图形的绘制

## 关于调试

### 分拆代码，单元测试

- 归并排序为例：先测试 merge，在测试 mergeSort
- 逐步完成程序
- 使用小数量调试
- 点输出关键结果
- 尝试各种测试用例

## Java Swing

```Java
import javax.swing.*

// 最原始 GUI 组件 AWT: Abstract Window Toolkit
import java.awt.*;

JFrame frame = new JFrame("Welcome"); // 创建窗口
frame.setSize(500, 500); // 设置宽度和高度
frame.setResizable(false); // 不能改变窗口大小
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭窗口时关闭程序
frame.setVisible(true); // 显示窗口
```

