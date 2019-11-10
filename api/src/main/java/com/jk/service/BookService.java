package com.jk.service;

import com.jk.model.BookBean;
import com.jk.model.EchartsBean;
import com.jk.model.TreeBean;
import com.jk.model.UserBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author:ll
 * create time:2019/10/11
 * email: 15290573855@163.com
 * tel: 业精于勤荒于嬉 行成于思毁于随
 */
public interface BookService {

    List<BookBean> queryBook();

    UserBean queryUserYan(String userName);

    void addUser(UserBean u);

    List<TreeBean> queryTree(Integer id);

    HashMap<String,Object> queryRole(Integer page,Integer rows);

    List<TreeBean> queryTreeQx(Integer roleid);

    HashMap<String,Object> queryUser(Integer page,Integer rows);

    void saveRolePower(Integer roleid, String[] ids);

    List<TreeBean> queryPowerMenu(Integer powerid);

    List<String> queryPowerByUserid(Integer id);

    List<UserBean> findUser();

    void addUSers(ArrayList<UserBean> list);

    void addPower(TreeBean power);

    void deletePowerById(Integer powerid);

    List<EchartsBean> queryEcharts();

    List<UserBean> queryUserRedis();

}
