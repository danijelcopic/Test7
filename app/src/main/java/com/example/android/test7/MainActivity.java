package com.example.android.test7;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.LinkedList;

import static android.R.attr.button;
import static android.R.attr.start;

public class MainActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinkedList<Kontakt> list = KontaktAPI.getMyContacts();

        LinearLayout mainScrollView = (LinearLayout) findViewById(R.id.mainScrollView);

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        for (Kontakt kontakt: list) {
            RelativeLayout item = (RelativeLayout) inflater.inflate(R.layout.my_view, null);

            ((TextView) item.findViewById(R.id.labelIme)).setText(kontakt.getIme());
            ((TextView) item.findViewById(R.id.labelVrednost)).setText(kontakt.getVrednost());

            ImageView imageUser = (ImageView) item.findViewById(R.id.imageUser);


            switch (kontakt.getTipKontakta()) {
                case EMAIL:
                        imageUser.setImageResource(R.drawable.email);
                    break;
                case PHONE:
                    imageUser.setImageResource(R.drawable.phone);
                    break;
                case SKYPE:
                    imageUser.setImageResource(R.drawable.skype);
                    break;
            }

            mainScrollView.addView(item);
        }







    }

}
