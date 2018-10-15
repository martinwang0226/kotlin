package e.martinwang.kotlin.easyButton.java;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by martinwang on 2018/10/15.
 */

public class MessageInfo implements Parcelable {
    public String content;
    public String send_time;

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(content);
        out.writeString(send_time);
    }

    public static final Parcelable.Creator<MessageInfo> CREATOR =
            new Parcelable.Creator<MessageInfo>() {
                public MessageInfo createFromParcel(Parcel in) {
                    MessageInfo info = new MessageInfo();
                    info.content = in.readString();
                    info.send_time = in.readString();
                    return info;
                }

                public MessageInfo[] newArray(int size) {
                    return new MessageInfo[size];
                }
            };

    @Override
    public int describeContents() {
        return 0;
    }

}
