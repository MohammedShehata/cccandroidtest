package com.sh.cccandroidtest.data

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

object Utils {
    private const val SERVER_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss"
    const val ESTIMATE_DATE_FORMAT = "yyyy-MM-dd"

    fun formatDate(date: Date, format: String): String {

        val sdf = SimpleDateFormat(format, Locale.ENGLISH)
        return sdf.format(date)
    }

    @SuppressLint("SimpleDateFormat")
    fun formatDate(dateString: String, dateFormat: String): String {
        val sdf = SimpleDateFormat(dateFormat)
        val date = sdf.parse(SERVER_DATE_FORMAT)!!
        return formatDate(date, dateFormat)
    }

}
