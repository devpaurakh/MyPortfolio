package np.com.paurakhsaud.paurakhsaud;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.Objects;


public class ProfileFragment extends Fragment {
    ImageView addImage;
    Activity context;
    ImageView imageView9;
    int cameraCode = 1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }


    @Override
    public void onStart() {
        super.onStart();
        addImage = (ImageView) context.findViewById(R.id.addImage);

        addImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(iCamera,1);


            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        imageView9 = (ImageView) context.findViewById(R.id.imageView9);
        if(requestCode == cameraCode){

            Bitmap img = (Bitmap) (Objects.requireNonNull(data).getExtras().get("data"));
            imageView9.setImageBitmap(img);
        }

    }
}