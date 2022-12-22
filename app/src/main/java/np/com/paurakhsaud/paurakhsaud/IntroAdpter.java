package np.com.paurakhsaud.paurakhsaud;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class IntroAdpter extends FragmentPagerAdapter {


    public IntroAdpter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new IntroFirstFragment();
            case 1:
                return new IntroSecondFragment();
            case 2:
                return new IntroThirdFragment();
            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
