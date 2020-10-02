package cn.mm.test;

import com.alibaba.fastjson.JSON;

public class Test01 {

    public static void main(String[] args) {
        Model model = new Model();
        model.setId(10);
        model.setName("zhangsan");

        String s = JSON.toJSONString(model);
        System.out.println(s);
    }
}
