package lib.hck.com.android_libs;

import android.app.Activity;
import android.os.Bundle;

import com.hck.lib.picter.Utils;

public class MainActivity extends Activity {
   private int a=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utils.log("哈哈哈啊哈哈");
    }
}
