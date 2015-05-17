package com.example.androidpermissioncustom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
/**
 * 调用具有自定义权限的应用
 * @author miaowei
 *
 */
public class MainActivity extends Activity {

	/**
	 * 启动另一个应用
	 */
	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button = (Button)findViewById(R.id.btn);
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent();  
                // 通过指定包名来启动我们想要启动的 Activity 注意第二个参数是完全限定包名  
				
                intent.setClassName("com.example.androidpermission","com.example.androidpermission.MainActivity");  
                startActivity(intent);  
				
			}
		});
	}
}
