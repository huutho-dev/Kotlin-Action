package com.huutho.kotlin_action.entity

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by ThoNh on 11/30/2017.
 */
data class BaseEntity(val source: Parcel) : Parcelable {

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {}

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<BaseEntity> = object : Parcelable.Creator<BaseEntity> {
            override fun createFromParcel(source: Parcel): BaseEntity = BaseEntity(source)
            override fun newArray(size: Int): Array<BaseEntity?> = arrayOfNulls(size)
        }
    }
}