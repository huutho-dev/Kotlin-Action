package com.huutho.kotlin_action.open_filnal_abstract

/**
 * Created by ThoNh on 12/1/2017.
 */
abstract class Animated {                   /*Abstract class --> Cannot create this Class*/

    abstract fun animate()                  /*Abstract Function  --> Must be override in SubClass*/

    open fun stopAnimating(){               /*Non-abs function, may be override in SubClass because it marked 'open'*/
        // todo something here
    }

    fun animateTwice(){                     /*Normal function --> default is final, cannot override in SubClass*/

    }

}