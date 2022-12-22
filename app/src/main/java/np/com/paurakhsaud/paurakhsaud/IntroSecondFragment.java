package np.com.paurakhsaud.paurakhsaud;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class IntroSecondFragment extends Fragment {

    TextView next;
    TextView back;
    ViewPager viewPager;

    public IntroSecondFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_intro_second, container, false);

        viewPager = getActivity().findViewById(R.id.viewpager); //Initialize Viewpager from Main Activity
        next = view.findViewById(R.id.secondNext);
        back = view.findViewById(R.id.Back);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });
        return view;
    }
}
