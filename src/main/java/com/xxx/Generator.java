package com.xxx;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;

public class Generator {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/vueblog?serverTimezone=UTC", "likai", "!QAZ1qaz")
                .globalConfig(builder -> {
                    builder.author("wukong") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
//                            .fileOverride() // 覆盖已生成文件
                            .outputDir("E:\\out_code"); // 指定输出目录
                })
                .packageConfig(builder ->
                    builder.parent("com.xxx") // 设置父包名
                )
                .strategyConfig(builder -> {
                    builder.addInclude("m_user", "m_blog") // 设置需要生成的表名
                            .addTablePrefix("m_", "c_"); // 设置过滤表前缀
                })
//                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }

}