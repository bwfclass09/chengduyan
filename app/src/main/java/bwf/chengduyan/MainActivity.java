package bwf.chengduyan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import bwf.chengduyan.net.HttpHelper;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Map<String,String> params = new HashMap<>();
//        params.put("progressId","1");
//        params.put("app_version","android_com.aiyiqi.galaxy_1.1");
//        params.put("buildingId","1546885141936223088");
//        params.put("page","0");
//        params.put("pageSize","20");
//        HttpHelper.getResult(params);

        HttpHelper.getSms("18681234706");
//        HttpHelper.login("18681234706","123456");
//        HttpHelper.setPassword("13320983170","123456","095132");

//        String result = "{\n" +
//                "    error: \"0\",\n" +
//                "    message: \"成功\",\n" +
//                "    switch:\"123\"\n" +
//                "}";
//
//        TestBean testBean = JSON.parseObject(result, TestBean.class);
//        ToastUtil.showToast(testBean.toString());
    }

}
