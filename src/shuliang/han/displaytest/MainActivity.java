package shuliang.han.displaytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class MainActivity extends Activity {

	//屏幕的宽高, 单位像素
	private int screenWidth;
	private int screenHeight;
	
	//屏幕的密度
	private float density;	//只有五种情况 : 0.75/ 1.0/ 1.5/ 2.0/ 3.0
	private int densityDpi;	//只有五种情况 : 120/ 160/ 240/ 320/ 480
	
	//水平垂直精确密度
	private float xdpi;	//水平方向上的准确密度, 即每英寸的像素点
	private float ydpi;	//垂直方向上的准确密度, 即没音村的像素点
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
//		getPixelWindowManager();
//		getPixelDisplayMetrics();
		getPixelDisplayMetricsII();
		
		System.out.println("宽:" + screenWidth + ", 高:"+screenHeight);
		System.out.println("密度 density:" + density + ",densityDpi:" +densityDpi);
		System.out.println("精确密度 xdpi:" + xdpi + ", ydpi:" + ydpi);
	}
	
	private void getPixelWindowManager() {
		screenWidth = getWindowManager().getDefaultDisplay().getWidth();
		screenHeight = getWindowManager().getDefaultDisplay().getHeight();
	}
	
	private void getPixelDisplayMetrics() {
		DisplayMetrics dm = new DisplayMetrics();
		dm = getResources().getDisplayMetrics();
		
		screenWidth = dm.widthPixels;
		screenHeight = dm.heightPixels;
		
		density = dm.density;
		densityDpi = dm.densityDpi;
		
		xdpi = dm.xdpi;
		ydpi = dm.ydpi;
	}
	
	private void getPixelDisplayMetricsII() {
		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		
		screenWidth = dm.widthPixels;
		screenHeight = dm.heightPixels;
		
		density = dm.density;
		densityDpi = dm.densityDpi;
		
		xdpi = dm.xdpi;
		ydpi = dm.ydpi;
	}
}
