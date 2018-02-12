package com.amy.myktdemo.ui.activity

import android.support.v4.view.ViewCompat
import android.support.v4.view.ViewPropertyAnimatorListener
import android.view.View
import com.amy.myktdemo.R
import com.amy.myktdemo.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*

/**
 * Created by amy on 2018/2/10.
 */
class SplashActivity : BaseActivity(), ViewPropertyAnimatorListener {
    override fun onAnimationEnd(view: View?) {

            startActivityAndFinish<MainActivity>()
    }

    override fun onAnimationCancel(view: View?) {
    }

    override fun onAnimationStart(view: View?) {
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun initView() {
        super.initView()
    }

    override fun initData() {
       ViewCompat.animate(imageView).scaleX(1.0f).scaleY(1.0f).setListener(this).setDuration(2000)
    }

    override fun initListener() {
        super.initListener()
    }


}