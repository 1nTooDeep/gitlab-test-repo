package com.example;

/**
 * 用户服务类
 * 包含一些代码问题用于测试审查功能
 */
public class UserService {

    private String username;
    private String password;

    // 问题1: 密码明文存储
    public void setPassword(String password) {
        this.password = password;
    }

    // 问题2: 没有输入验证
    public boolean login(String user, String pass) {
        return user.equals(username) && pass.equals(password);
    }

    // 问题3: 空指针风险
    public String getEmail() {
        // 假设从数据库获取，但没有null检查
        return getEmailFromDatabase().toLowerCase();
    }

    private String getEmailFromDatabase() {
        return null; // 模拟返回null
    }

    // 问题4: 资源未关闭
    public void processFile(String filename) {
        try {
            java.io.FileReader reader = new java.io.FileReader(filename);
            char[] buffer = new char[1024];
            reader.read(buffer);
            // 没有关闭reader
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 问题5: 过时的方法使用
    @SuppressWarnings("deprecation")
    public void deprecatedMethod() {
        // 使用已废弃的方法
    }
}
