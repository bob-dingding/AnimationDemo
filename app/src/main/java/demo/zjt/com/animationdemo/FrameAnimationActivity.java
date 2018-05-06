package demo.zjt.com.animationdemo;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * 作者：Created by Ding on 2018/5/1
 * 文件描述：
 */

public class FrameAnimationActivity extends AppCompatActivity implements View.OnClickListener {

    AnimationDrawable animationDrawable;
    ImageView iv_frame;
    Button btn_start;
    Button btn_stop;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        iv_frame = findViewById(R.id.iv_frame);
        btn_start = findViewById(R.id.btn_start);
        btn_stop = findViewById(R.id.btn_stop);


        btn_start.setOnClickListener(this);
        btn_stop.setOnClickListener(this);



            // 通过逐帧动画的资源文件获得AnimationDrawable示例
            animationDrawable = (AnimationDrawable) getResources().getDrawable(
            R.drawable.anim_frame);
            iv_frame.setBackground(animationDrawable);

//
//            //如果通过代码添加的话
//          animationDrawable = new AnimationDrawable();
//           // 为AnimationDrawable添加动画帧
//            animationDrawable.addFrame(
//                getResources().getDrawable(R.drawable.frame_one), 50);
        // 设置为循环播放
//        animationDrawable.setOneShot(false);
//        iv_frame.setBackground(animationDrawable);
    }


    @Override
    public void onClick(View view) {
     switch (view.getId()){
         case R.id.btn_start:
             if (animationDrawable != null && !animationDrawable.isRunning()) {
                 animationDrawable.start();
             }
             break;
         case R.id.btn_stop:
             if (animationDrawable != null && animationDrawable.isRunning()) {
                 animationDrawable.stop();
             }
             break;
     }
    }
}
