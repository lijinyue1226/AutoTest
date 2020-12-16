package testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本注释，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){

        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    //在每一个测试方法之前都会运行一次
    @BeforeMethod
    public void  beforMethod(){
        System.out.println("BeforMethod这是在测试方法之前运行的");
    }

    //在每一个测试方法之后都会运行一次/
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是在类之前运行的");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在类运行之后运行的");
    }
    @BeforeSuite
    public  void beforeSuit(){
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("AfterSuite测试套件");
    }
}
