package com.example.administrator.xiazoliuxing.ui.main.fragment;


import com.example.administrator.xiazoliuxing.R;
import com.example.administrator.xiazoliuxing.base.BaseFragment;
import com.example.administrator.xiazoliuxing.presenter.VerifyPresenter;
import com.example.administrator.xiazoliuxing.view.main.VerifyView;

public class VerifyFragment extends BaseFragment<VerifyView,VerifyPresenter> implements VerifyView{
    @Override
    protected VerifyPresenter initPresenter() {
        return new VerifyPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_verify;
    }
}
