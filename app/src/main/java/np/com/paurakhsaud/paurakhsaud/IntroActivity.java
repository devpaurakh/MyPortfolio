package np.com.paurakhsaud.paurakhsaud;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class IntroActivity extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        viewPager = findViewById(R.id.viewpager);
        IntroAdpter adpter= new IntroAdpter(getSupportFragmentManager());
        viewPager.setAdapter(adpter);
    }
}