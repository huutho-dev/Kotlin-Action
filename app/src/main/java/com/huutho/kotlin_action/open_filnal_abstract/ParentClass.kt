package com.huutho.kotlin_action.open_filnal_abstract

import com.huutho.kotlin_action.`interface`.IOnFocusable

/**
 * Created by ThoNh on 12/1/2017.
 */

open class ParentClass : IOnFocusable {

    /**
     * function override is open func
     */
    override fun setFocusable(focus: Boolean) {
    }

    /**
     * prevent subclass override
     */
   final override fun showOff(): String {
        return super.showOff()
    }

    fun thisIsFinalFunctionCannotInherit() {

    }

    open fun thisMethodMarkOpenMayOverrideFromSubClass() {

    }
}