package com.fastcloud.cn.support.common.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 代码生成器
 *
 * @author OreChou
 * @create 2018-06-12 3:38 PM
 */
public class CodeGenerator {

    private static String PACKAGE_NAME = "com.fastcloud.cn.support";
    public static String MODULE = "system";

    private static String OUT_PUT_DIR = "/Users/orechou/Documents/Project/Private/fastcloud/support/document/output/";
    private static String AUTHOR = "OreChou";

    private static String DB_USERNAME = "root";
    private static String DB_PASSWORD = "rootroot";
    private static String DB_URL = "jdbc:mysql://127.0.0.1:3306/fastcloud?characterEncoding=utf8";

    public static void main(String[] args) {

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        mpg.setGlobalConfig(
                // 全局配置
                new GlobalConfig()
                        .setOutputDir(OUT_PUT_DIR)//输出目录
                        .setFileOverride(true)// 是否覆盖文件
                        .setActiveRecord(false)// 开启 activeRecord 模式
                        .setEnableCache(false)// XML 二级缓存
                        .setBaseResultMap(true)// XML ResultMap
                        .setBaseColumnList(true)// XML columList
                        .setAuthor(AUTHOR)
                        // 自定义文件命名，注意 %s 会自动填充表实体属性！
                        .setXmlName("%sMapper")
                        .setServiceImplName("%sService")
        );
        mpg.setDataSource(
                // 数据源配置
                new DataSourceConfig()
                        .setDbType(DbType.MYSQL)// 数据库类型
                        .setTypeConvert(new MySqlTypeConvert() {
                            // 自定义数据库表字段类型转换【可选】
                            @Override
                            public DbColumnType processTypeConvert(String fieldType) {
                                //System.out.println("转换类型：" + fieldType);
                                if (fieldType.toLowerCase().contains("tinyint")) {
                                    return DbColumnType.BOOLEAN;
                                }
                                return super.processTypeConvert(fieldType);
                            }
                        })
                        .setDriverName("com.mysql.jdbc.Driver")
                        .setUsername(DB_USERNAME)
                        .setPassword(DB_PASSWORD)
                        .setUrl(DB_URL)
        );
        mpg.setStrategy(
                // 策略配置
                new StrategyConfig()
                        // .setCapitalMode(true)// 全局大写命名
                        .setDbColumnUnderline(true)//全局下划线命名
                        // .setInclude(new String[]{"tb_sms_record"}) // 需要生成的表
                        .setTablePrefix(new String[]{"sys_", "tb_"})// 此处可以修改为您的表前缀
                        .setNaming(NamingStrategy.underline_to_camel)// 表名生成策略
                        // .setExclude(new String[]{"test"}) // 排除生成的表
                        // 自定义实体父类
                        // .setSuperEntityClass("com.baomidou.demo.TestEntity")
                        // 自定义实体，公共字段
                        //.setSuperEntityColumns(new String[]{"test_id"})
                        //.setTableFillList(tableFillList)
                        // 自定义 mapper 父类
                        // .setSuperMapperClass("com.baomidou.demo.TestMapper")
                        // 自定义 service 父类
                        // .setSuperServiceClass("com.chj.service.support.IBaseService")
                        // 自定义 service 实现类父类
                        // .setSuperServiceImplClass("com.chj.service.support.BaseServiceImpl")
                        // 自定义 controller 父类
                        // .setSuperControllerClass("com.chj.platform.controller.support.BaseController")
                        // 【实体】是否生成字段常量（默认 false）
                        // public static final String ID = "test_id";
                        // .setEntityColumnConstant(true)
                        // 【实体】是否为构建者模型（默认 false）
                        // public User setName(String name) {this.name = name; return this;}
                        // .setEntityBuilderModel(true)
                        // 【实体】是否为lombok模型（默认 false）<business href="https://projectlombok.org/">document</business>
                        .setEntityLombokModel(true)
                        // Boolean类型字段是否移除is前缀处理
                        .setEntityBooleanColumnRemoveIsPrefix(true)
                        .setRestControllerStyle(true)
                        .setControllerMappingHyphenStyle(true)
                        .setVersionFieldName(null)
        );
        mpg.setPackageInfo(
                // 包配置
                new PackageConfig()
                        .setMapper("dao."+MODULE)
                        .setEntity("domain."+MODULE)
                        .setService("service."+MODULE)
                        .setServiceImpl("service."+MODULE+".impl")
                        //.setModuleName("domain")
                        .setParent(PACKAGE_NAME)// 自定义包路径
                        .setController("controller."+MODULE)// 这里是控制器包名，默认 web
        );
        List<FileOutConfig> fileOutConfigList = new ArrayList<>();
        fileOutConfigList.add(new FileOutConfig("/templates/mapper.xml.vm") {
            // 自定义输出文件目录
            @Override
            public String outputFile(TableInfo tableInfo) {
                return OUT_PUT_DIR + "/mapper/" + MODULE + "/" + tableInfo.getEntityName() + "Mapper.xml";
            }
        });
        mpg.setCfg(
                // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
                new InjectionConfig() {
                    @Override
                    public void initMap() {
                        Map<String, Object> map = new HashMap<>();
                        map.put("module", MODULE);
                        this.setMap(map);
                    }
                }.setFileOutConfigList(fileOutConfigList)
        );
        mpg.setTemplate(
                // 关闭默认 xml 生成，调整生成 至 根目录
                new TemplateConfig().setXml(null)
                // 自定义模板配置，模板可以参考源码 /mybatis-plus/src/main/resources/templates 使用 copy
                // 至您项目 src/main/resources/templates 目录下，模板名称也可自定义如下配置：
                // .setController("...");
                // .setEntity("...");
                // .setMapper("...");
                // .setXml("...");
                // .setService("...");
                // .setServiceImpl("...");
        );

        // 执行生成
        mpg.execute();

    }

}
