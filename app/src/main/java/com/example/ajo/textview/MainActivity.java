package com.example.ajo.textview;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text1, text2, text3, text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = this.findViewById(R.id.text1);
        text2 = this.findViewById(R.id.text2);
        text3 = this.findViewById(R.id.text3);
        text4 = this.findViewById(R.id.text4);

        text2.setText("This is Text2 Value content for TextView");

        Typeface font = Typeface.createFromAsset(getAssets(),"Righteous.ttf");
        text3.setText("This is Text3 Value content for TextView");
        text3.setTextColor(getResources().getColor(R.color.colorPrimary));
        text3.setTypeface(font);

        text4.setText("This is Text4 Value content for TextView");
        text4.setTypeface(font);
        text4.setTextSize(25);
        text4.setSingleLine(true);
        text4.setSelected(true);
        text4.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        text4.setTextColor(getResources().getColor(R.color.colorAccent));


    }
}
