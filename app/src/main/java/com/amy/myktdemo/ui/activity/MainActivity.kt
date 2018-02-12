package com.amy.myktdemo.ui.activity


import android.support.v7.widget.Toolbar
import com.amy.myktdemo.R
import com.amy.myktdemo.base.BaseActivity
import com.amy.myktdemo.utils.ToolBarManager
import org.jetbrains.anko.find

class MainActivity:BaseActivity() ,ToolBarManager{
    override val toolBar by lazy {
        find<Toolbar>(R.id.toolbar)
    }



    override fun getLayoutId(): Int {

       return R.layout.activity_main
    }

    override fun initView() {
        initMainToolBar()
    }

}
