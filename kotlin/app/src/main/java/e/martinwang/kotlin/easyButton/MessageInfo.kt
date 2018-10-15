package e.martinwang.kotlin.easyButton

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by martinwang on 2018/10/15.
 */
@SuppressLint("ParcelCreator")
@Parcelize
data class MessageInfo(val content: String, val send_time: String):Parcelable {
}