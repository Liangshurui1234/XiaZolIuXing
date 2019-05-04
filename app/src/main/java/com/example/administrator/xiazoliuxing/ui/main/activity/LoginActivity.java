package com.example.administrator.xiazoliuxing.ui.main.activity;


import android.support.v4.app.FragmentManager;
import com.example.administrator.xiazoliuxing.R;
import com.example.administrator.xiazoliuxing.base.BaseActivity;
import com.example.administrator.xiazoliuxing.presenter.LoginPresenter;
import com.example.administrator.xiazoliuxing.ui.main.fragment.LoginOrBindFragment;
import com.example.administrator.xiazoliuxing.view.main.LoginView;
public class LoginActivity extends BaseActivity<LoginView, LoginPresenter> implements LoginView {

    @Override
    protected LoginPresenter initPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initData() {
        mPresenter.getVerifyCode();
    }

    @Override
    protected void initView() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.fl_container,new LoginOrBindFragment()).commit();
    }
}
