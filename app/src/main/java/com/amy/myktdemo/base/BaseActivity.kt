package com.amy.myktdemo.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.startActivity

/**
 * Created by amy on 2018/2/10.
 */
abstract class BaseActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initView()
        initData()
        initListener()
    }

    open  protected fun initListener() {

    }

    open protected fun initData() {

    }

    open protected fun initView() {
    }

    inline fun< reified T : BaseActivity> startActivityAndFinish(){
        startActivity<T>()
        finish()
    }


    abstract fun getLayoutId(): Int
}