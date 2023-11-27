package np.com.paurakhsaud.paurakhsaud;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class ContactFragment extends Fragment {

    ImageView insta,twitter,linkedin,github;
    TextView callMe;
    Button sendMail;
    EditText editTextEmail;
    Activity context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        context = getActivity();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }


    @Override
    public void onStart() {
        super.onStart();
        insta = (ImageView) context.findViewById(R.id.instagram);
        twitter = (ImageView) context.findViewById(R.id.twitter);
        linkedin = (ImageView) context.findViewById(R.id.linkedIn);
        github = (ImageView) context.findViewById(R.id.github);
        callMe = (TextView) context.findViewById(R.id.callme);
        sendMail= (Button) context.findViewById(R.id.sendMail);
        editTextEmail = (EditText) context.findViewById(R.id.editTextEmail);

        callMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phoneDial = new Intent(Intent.ACTION_DIAL);
                phoneDial.setData(Uri.parse("tel:9848840209"));
                startActivity(phoneDial);

            }
        });

        sendMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("mailto:"+editTextEmail.getText().toString()));
                   startActivity(intent);
               }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/_itsmeace/");
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gotoUrl("https://twitter.com/_itsmeace01");
            }
        });
        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/pau-rock-vikr%C3%A5m-saud-17b4021a3/");

            }
        });
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/Paurakh1");

            }
        });


    }

    private void gotoUrl(String s){

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}