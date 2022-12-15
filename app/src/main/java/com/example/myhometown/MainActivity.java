package com.example.myhometown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Button btn_last,btn_next;
    TextView txt;
    private int[] imgs={
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
    };
    int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=(ImageView)findViewById(R.id.img);
        txt=(TextView)findViewById(R.id.text);
        btn_last=(Button)findViewById(R.id.btn_last);
        btn_next=(Button)findViewById(R.id.btn_next);
        btn_last.setOnClickListener(new mclick());
        btn_next.setOnClickListener(new mclick());
    }
    class mclick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (v==btn_last){
                if (index<=0) index=6;
                index--;
                img.setImageResource(imgs[index]);
                txt.setText("图片"+(index+1));

            }
            if (v==btn_next){
                index++;
                index=index%imgs.length;
                img.setImageResource(imgs[index]);
                txt.setText("图片"+(index+1));
            }
        }
    }
}