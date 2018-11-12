package lib.hck.com.android_libs;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
   private int a=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
