package com.lquan;

import com.lquan.bean.Company;
import com.lquan.bean.Fans;
import com.lquan.bean.Star;

/**
 * @program: DesignPatterns
 * @description: 经纪人类
 * @author: lquan
 * @create: 2023-02-02 17:00
 **/
public class Agent {
    private Star star;

    private Fans fans;

    private Company company;

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    //和粉丝见面的方法
    public void meeting(){
        System.out.println(star.getName() + "和粉丝" + fans.getName() + "见面");
    }

    //和媒体公司洽谈的方法
    public void business(){
        System.out.println(star.getName() + "和" + company.getName() + "洽谈");
    }
}
