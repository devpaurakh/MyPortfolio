package np.com.paurakhsaud.paurakhsaud;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeFragment extends Fragment {
    Activity context;
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            context = getActivity();
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_home, container, false);
        }
        public  void onStart(){
            super.onStart();
            Button btnTOGame = (Button) context.findViewById(R.id.buttonToGame);
            btnTOGame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(context,GameActivity.class);
                    startActivity(i);
                }
            });
        }
    }