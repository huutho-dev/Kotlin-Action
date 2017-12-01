package com.huutho.kotlin_action.`interface`

import android.view.View

/**
 * Created by ThoNh on 11/30/2017.
 */
class Button : IOnItemClick, IOnFocusable {
    override fun setFocusable(focus: Boolean) {
    }


    override fun onItemClick(view: View) = println("Clicked!")


    override fun showOff(): String {
        super<IOnFocusable>.showOff()
        super<IOnItemClick>.showOff()
        return  ""
    }


}