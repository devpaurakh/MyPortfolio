package np.com.paurakhsaud.paurakhsaud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Creating handler object to use post delay
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // This object of intent will help to set routes
                Intent i = new Intent(MainActivity.this, IntroActivity.class);
                startActivity(i);
                finish();
            }
        },2000);
    }
}
