package com.lp.sdk

import android.content.Context

class LpSdk {

    companion object {
        lateinit var mContext: Context
        fun init(context: Context) {
            mContext = context
        }
    }
}