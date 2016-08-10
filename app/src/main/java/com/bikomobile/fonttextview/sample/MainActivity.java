package com.bikomobile.fonttextview.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.bikomobile.widget.fontview.FontTextView;
import com.bikomobile.widget.fontview.FontUtils;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FontTextView fontTextView = (FontTextView) findViewById(R.id.font_text_view);
        fontTextView.setFontPath("fonts/Ubuntu-Regular.ttf");
        fontTextView.setText("Programmatically");

        Button button = (Button) findViewById(R.id.button);
        FontUtils.getInstance().replaceFontFromAsset(button, "fonts/Ubuntu-Regular.ttf");
        button.setText("Button");

    }
}
