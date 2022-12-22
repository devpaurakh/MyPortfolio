package np.com.paurakhsaud.paurakhsaud;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class NavigatorActivity extends AppCompatActivity {
    //init-ing the navigationview
    BottomNavigationView bottomNavigationView;
    //init-ing all the fragments of the app
    HomeFragment homeFragment = new HomeFragment(); //homefragment
    HobbiesFragment hobbiesFragment = new HobbiesFragment();//hobbiesfragment
    ContactFragment contactFragment = new ContactFragment();//contactfragment
    ProfileFragment profileFragment = new ProfileFragment();//profilefragment
    SkillFragment skillFragment = new SkillFragment();//skillfragmnent
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigator);
        bottomNavigationView = findViewById(R.id.bottomNavi); //getting the bottom navigation view by id.

        //This will help to replace framelayout by homefragment. onCreate function.
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,homeFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull  MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        //This will help to replace framelayout by homefragment
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,homeFragment).commit();
                        return true;
                    case R.id.skill:
                        //This will help to replace framelayout by skillfragment
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,skillFragment).commit();
                        return true;
                    case R.id.hobbies:
                        //This will help to replace framelayout by hobbiesfragment
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,hobbiesFragment).commit();
                        return true;
                    case R.id.contact:
                        //This will help to replace framelayout by contactfragment
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,contactFragment).commit();
                        return true;
                    case R.id.profile:
                        //This will help to replace framelayout by profilefragment
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,profileFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }
}