package bwf.chengduyan.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 欢迎页面的广告
 */
public class SplashInfo implements Parcelable {

    public String add_time;
    public String title;
    public String imageUrl;//图片url
    public String status;//
    public String url;//点击广告跳转的url


    @Override
    public String toString() {
        return "SplashInfo{" +
                "add_time='" + add_time + '\'' +
                ", title='" + title + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", status='" + status + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.add_time);
        dest.writeString(this.title);
        dest.writeString(this.imageUrl);
        dest.writeString(this.status);
        dest.writeString(this.url);
    }

    public SplashInfo() {
    }

    protected SplashInfo(Parcel in) {
        this.add_time = in.readString();
        this.title = in.readString();
        this.imageUrl = in.readString();
        this.status = in.readString();
        this.url = in.readString();
    }

    public static final Creator<SplashInfo> CREATOR = new Creator<SplashInfo>() {
        @Override
        public SplashInfo createFromParcel(Parcel source) {
            return new SplashInfo(source);
        }

        @Override
        public SplashInfo[] newArray(int size) {
            return new SplashInfo[size];
        }
    };
}