# GitLab Webhook 测试仓库

用于测试 GitLab Webhook 服务的代码审查功能。

## 项目结构

```
src/main/java/com/example/
├── Calculator.java   # 计算器类（包含除法无检查问题）
└── UserService.java  # 用户服务类（包含多个安全问题）
```

## 代码问题列表

### Calculator.java
- ❌ 除法方法没有检查除零

### UserService.java
- ❌ 密码明文存储
- ❌ 登录方法没有输入验证
- ❌ 空指针风险
- ❌ 文件资源未关闭
- ❌ 使用废弃方法

## 测试目的

这些代码故意包含了一些常见的编程问题，用于测试代码审查服务能否正确识别并报告这些问题。
