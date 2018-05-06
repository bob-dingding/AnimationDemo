package demo.zjt.com.animationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

/**
 * 作者：Created by Ding on 2018/5/1
 * 文件描述：
 */

public class TweenAnimationActivity extends AppCompatActivity implements View.OnClickListener {

   /**位移动画按钮*/
    Button btn_translate;
    /**缩放动画按钮*/
    Button btn_scale;
    /**渐变动画按钮*/
    Button btn_alpha;
    /**旋转动画按钮*/
    Button btn_rotate;
    /**set组合使用*/
    Button btn_set;


    ImageView iv_translate;
    ImageView iv_scale;
    ImageView iv_alpha;
    ImageView iv_rotate;
    ImageView iv_set;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
        btn_translate = findViewById(R.id.btn_translate);
        btn_scale = findViewById(R.id.btn_scale);
        btn_alpha = findViewById(R.id.btn_alpha);
        btn_rotate = findViewById(R.id.btn_rotate);
        btn_set = findViewById(R.id.btn_set);


        iv_translate = findViewById(R.id.iv_translate);
        iv_scale = findViewById(R.id.iv_scale);
        iv_alpha = findViewById(R.id.iv_alpha);
        iv_rotate = findViewById(R.id.iv_rotate);
        iv_set = findViewById(R.id.iv_set);

        btn_translate.setOnClickListener(this);
        btn_scale.setOnClickListener(this);
        btn_alpha.setOnClickListener(this);
        btn_rotate.setOnClickListener(this);
        btn_set.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_translate:
                //如果代码中定义的话为new translateAnimation=new AlphaAnimation(0.1f, 1.0f);set等属性,其他三种动画都类似
                Animation translateAnimation = AnimationUtils.loadAnimation(TweenAnimationActivity.this, R.anim.translate);
                iv_translate.startAnimation(translateAnimation);
            break;
            case R.id.btn_scale:
                Animation scaleAnimation = AnimationUtils.loadAnimation(TweenAnimationActivity.this, R.anim.scale);
                iv_scale.startAnimation(scaleAnimation);
            break;
            case R.id.btn_alpha:
                Animation alphaAnimation = AnimationUtils.loadAnimation(TweenAnimationActivity.this, R.anim.alpha);
                iv_alpha.startAnimation(alphaAnimation);
            break;
            case R.id.btn_rotate:
                Animation rotateAnimation = AnimationUtils.loadAnimation(TweenAnimationActivity.this, R.anim.rotate);
                iv_rotate.startAnimation(rotateAnimation);
            break;
            case R.id.btn_set:
                Animation setAnimation = AnimationUtils.loadAnimation(TweenAnimationActivity.this, R.anim.set);
                setAnimation.setDuration(5000);
                iv_set.startAnimation(setAnimation);
                break;
        }



    }
}
