package com.amy.myktdemo.utils


import android.content.Intent
import android.support.v7.widget.Toolbar
import com.amy.myktdemo.R
import com.amy.myktdemo.ui.activity.SettingActivity

/**
 * Created by amy on 2018/2/10.
 */
interface ToolBarManager{
    //让需要用到的类去实现toolBar的初始化
    val toolBar : Toolbar

    fun initSettingToolBar(){
        toolBar.setTitle("设置")
    }

    fun initMainToolBar(){
        toolBar.setTitle("手机影音")
        toolBar.inflateMenu(R.menu.main)

        toolBar.setOnMenuItemClickListener{
            toolBar.context.startActivity(Intent(toolBar.context,SettingActivity::class.java))
            true
        }
/*
        toolBar.setOnMenuItemClickListener(object : Toolbar.OnMenuItemClickListener{
            override fun onMenuItemClick(item: MenuItem?): Boolean {
                when(item?.itemId){
                    R.id.setting ->{
                        //跳转到设置界面
                        toolBar.context.startActivity(Intent(toolBar.context,SettingActivity::class.java))
                    }
                }
                return true
            }
        })*/
    }
}