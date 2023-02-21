package com.lquan;

import com.lquan.bean.Company;
import com.lquan.bean.Fans;
import com.lquan.bean.Star;

/**
 * @program: DesignPatterns
 * @description: 测试类
 * @author: lquan
 * @create: 2023-02-02 17:01
 **/
public class Client {

    public static void main(String[] args) {
        //创建经纪人类
        Agent agent = new Agent();

        //创建明星对象
        Star star = new Star("林青霞");

        agent.setStar(star);

        //创建粉丝对象
        Fans fans = new Fans("李四");
        agent.setFans(fans);

        //创建媒体公司对象
        Company company = new Company("黑马程序员");
        agent.setCompany(company);

        agent.meeting();
        agent.business();
    }
}
