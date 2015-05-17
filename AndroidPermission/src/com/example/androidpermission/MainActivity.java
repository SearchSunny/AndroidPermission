package com.example.androidpermission;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
/**
 * android自定义权限的实现
 * @author miaowei
 *
 */
public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		 LinearLayout view = new LinearLayout(this);  
	        view.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,  
	                LayoutParams.WRAP_CONTENT));  
	        view.setOrientation(LinearLayout.HORIZONTAL);  
	        TextView nameLbl = new TextView(this);  
	        nameLbl.setText("Hello from android自定义权限的实现");  
	        view.addView(nameLbl);  
	        setContentView(view); 
	}
	
	
}
