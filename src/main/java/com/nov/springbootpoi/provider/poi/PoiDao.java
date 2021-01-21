package com.nov.springbootpoi.provider.poi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * 模拟数据
 * @Author: november
 * Date: 2021/1/21 4:11 下午
 */
public class PoiDao {

    public List<Teacher> getTeachers() {
        List<Teacher> classmateList= new ArrayList<>();
        classmateList.add(new Teacher("1","张三","1","123456"));
        classmateList.add(new Teacher("2","李四","1","123456"));
        classmateList.add(new Teacher("3","王五","2","123456"));
        classmateList.add(new Teacher("4","赵六","2","123456"));
        classmateList.add(new Teacher("5","周八","3","123456"));
        return classmateList;
    }
}
