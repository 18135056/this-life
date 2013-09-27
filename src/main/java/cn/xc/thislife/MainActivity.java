package cn.xc.thislife;

import net.youmi.android.AdManager;
import net.youmi.android.offers.OffersManager;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    	// 初始化接口，应用启动的时候调用
		// 参数：appId, appSecret, 调试模式
		AdManager.getInstance(this).init("73057fb81878f2ba",
				"f2707618edb7c2a4", false);
		// 如果使用积分广告，请务必调用积分广告的初始化接口:
		OffersManager.getInstance(this).onAppLaunch();
		// demo按钮点击事件绑定
	//	findViewById(R.id.toOffersActivity).setOnClickListener(this); // 有积分广告demo导航
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(cn.xc.thislife.R.menu.main, menu);
	return true;
    }

}

