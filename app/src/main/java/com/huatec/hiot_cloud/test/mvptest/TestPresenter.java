package com.huatec.hiot_cloud.test.mvptest;

import com.huatec.hiot_cloud.test.mvptest.model.User;

public class TestPresenter {

    private TestView view;

    public TestPresenter(TestView view) {
        this.view = view;
    }

    public void login(User user) {
        if ("chenshengqing".equals(user.getUserName()) && "111".equals(user.getPassword())) {
           view.showMessage("登陆成功");
        }else {
            view.showMessage("登陆失败");
        }

    }
}
