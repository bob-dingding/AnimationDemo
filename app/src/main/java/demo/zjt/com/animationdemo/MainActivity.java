package demo.zjt.com.animationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btn_frame;
    Button btn_tweened;
    Button btn_property;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_frame = findViewById(R.id.btn_frame_animation);
        btn_tweened = findViewById(R.id.btn_tweened_animation);
        btn_property = findViewById(R.id.btn_property_animation);


        btn_frame.setOnClickListener(this);
        btn_tweened.setOnClickListener(this);
        btn_property.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_frame_animation:
                Intent frameIntent =new Intent(MainActivity.this,FrameAnimationActivity.class);
                startActivity(frameIntent);

                break;
            case R.id.btn_tweened_animation:
                Intent tweenedIntent =new Intent(MainActivity.this,TweenAnimationActivity.class);
                startActivity(tweenedIntent);
                break;
            case R.id.btn_property_animation:
                Toast.makeText(MainActivity.this,"Sorry,敬请期待",Toast.LENGTH_LONG).show();
                break;
        }
    }


}
