package com.dongnaoedu.animator;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.widget.ImageView;

public class MainActivity extends com.lythonliu.LinkAppCompatActivity {
	@Override
	public String getAppName(){
		return BuildConfig.APP_NAME;
	}

	private ImageView iv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		iv = (ImageView)findViewById(R.id.button1);
	}
	
	public void startAnimation(View v) {
		Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.abc_fade_in);
		
		
		//1.-------------���Զ�������--------------------
//		iv.setTranslationX(100);
//		iv.setScaleX(scaleX);
//		iv.setAlpha(alpha);
//		iv.setRotation(rotation)
//		iv.setBackgroundColor(color);
		
//		//ֻҪview������setXXX()�����Ϳ���ͨ������ﵽ�仯��Ŀ��
//		ObjectAnimator oa = ObjectAnimator.ofFloat(iv, "translationX", 0f,200f);
////		ObjectAnimator oa = ObjectAnimator.ofFloat(iv, "backgroundColor", Color.RED,Color.BLUE);
//		oa.setDuration(500);
//		oa.start();
		
		//2.-------------�������ͬʱִ��----------------------
/*		//���� 1) ���ö���������ͬ����������������
		ObjectAnimator animator = ObjectAnimator.ofFloat(iv, "hehe", 0f,100f);
//		ObjectAnimator animator = ObjectAnimator.ofFloat(iv, "translationX", 0f,100f);
		animator.setDuration(300);
		animator.addUpdateListener(new AnimatorUpdateListener() {
			
			@Override
			public void onAnimationUpdate(ValueAnimator animation) {
				// ���������ص�
//				animation.getAnimatedFraction();//����ִ�еİٷֱ� 0~1 //API 12+
				float value = (float) animation.getAnimatedValue();//�õ�0f~100f���е����ʱ����Ӧ��ֵ
				iv.setScaleX(0.5f+value/200);
				iv.setScaleY(0.5f+value/200);
//				iv.setTranslationX(value);
			}
		});
		animator.start();
//		animator.setRepeatCount(2);
//		animator.setRepeatCount(ValueAnimator.INFINITE);
//		animator.setRepeatMode(ValueAnimator.RESTART);
//		animator.setRepeatMode(ValueAnimator.REVERSE.)
*/		
//		animator.addListener(new AnimatorListener() {
//			
//			@Override
//			public void onAnimationStart(Animator animation) {
//			}
//			
//			@Override
//			public void onAnimationRepeat(Animator animation) {
//			}
//			
//			@Override
//			public void onAnimationEnd(Animator animation) {
////				animator.setRepeatCount(ValueAnimator.RESTART);
//			}
//			
//			@Override
//			public void onAnimationCancel(Animator animation) {
//			}
//		});
		
//		animator.addListener(new AnimatorListenerAdapter() {
//			@Override
//			public void onAnimationEnd(Animator animation) {
//				// TODO Auto-generated method stub
//				super.onAnimationEnd(animation);
//			}
//		});
		
		//���� 2��---------------ValueAnimator---���ֻ��Ҫ����ֵ�仯����ValueAnimator---------------
/*		ValueAnimator animator = ValueAnimator.ofFloat(0f, 200f);
		animator.setDuration(200);
		animator.addUpdateListener(new AnimatorUpdateListener() {
			
			@Override
			public void onAnimationUpdate(ValueAnimator animation) {
				float value = (float) animation.getAnimatedValue();//�õ�0f~100f���е����ʱ����Ӧ��ֵ
				iv.setScaleX(0.5f+value/200);
				iv.setScaleY(0.5f+value/200);
			}
		});
		animator.start();
*/
		//���� 3) 
//		PropertyValuesHolder holder1 = PropertyValuesHolder.ofFloat("alpha", 1f,0.5f);
//		PropertyValuesHolder holder2 = PropertyValuesHolder.ofFloat("scaleX", 1f,0.5f);
//		PropertyValuesHolder holder3 = PropertyValuesHolder.ofFloat("scaleY", 1f,0.5f);
//		ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(iv, holder1,holder2,holder3);
//		animator.setDuration(200);
//		animator.start();
		
		//���� 4��-------------��������-----------------
/*	ObjectAnimator animator1 = ObjectAnimator.ofFloat(iv, "translationX", 0f,100f);
//		animator1.setRepeatCount(3);
		ObjectAnimator animator2 = ObjectAnimator.ofFloat(iv, "alpha", 0f,1f);
//		animator2.setStartDelay(startDelay)//�����ӳ�ִ��
		ObjectAnimator animator3 = ObjectAnimator.ofFloat(iv, "scaleX", 0f,2f);
		AnimatorSet animatorSet = new AnimatorSet();
		animatorSet.setDuration(500);
//		animatorSet.play(animator3).with(animator2).after(animator1);//animator1��ǰ��
		animatorSet.play(animator3).with(animator2).before(animator1);//animator1�ں���
//		animatorSet.playTogether(animator1,animator2,animator3);
		animatorSet.playSequentially(animator1,animator2,animator3);
		animatorSet.start();*/
	
		
		//4.------------------������ʵ����������������Ч��---���ﳵ��������ָ��-----------------
		/**
		 * x: ����
		 * y: ���ٶ� y=vt=1/2*g*t*t
		 * ��ֵ��---��������PointF(x,y)
		 */
/*		ValueAnimator valueAnimator = new ValueAnimator();
//		valueAnimator.setInterpolator(value)
		valueAnimator.setDuration(2000);
		valueAnimator.setObjectValues(new PointF(0, 0));
//		valueAnimator.setObjectValues(new PointF(0, 0),new PointF(10, 10));
		final PointF pointF = new PointF();
		//��ɫ��ֵ��
//		setBackgroundColor((Integer) sArgbEvaluator.evaluate(ratio, mDiscrollveFromBgColor, mDiscrollveToBgColor));
		valueAnimator.setEvaluator(new TypeEvaluator<PointF>() {

			@Override
			public PointF evaluate(float fraction, PointF startValue,
					PointF endValue) {
				// ��ֵ���㷽��---������ִ�еĹ��̵��и�Ԥ�ı����Ե�ֵ---��Ч�������Լ����㷨������
				//���ϵ�ȥ�����޸�����
				//x�����˶� x=v*t Ϊ�˿�����Ч��������t���fraction*5
				pointF.x = 100f*(fraction*5);
				//���ٶ� y=vt=1/2*g*t*t
//				pointF.y = 0.5f*9.8f*(fraction*5)*(fraction*5);
				pointF.y = 10f*0.5f*9.8f*(fraction*5)*(fraction*5);
				return pointF;
			}
		});
		valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
			
			@Override
			public void onAnimationUpdate(ValueAnimator animation) {
				PointF f = (PointF) animation.getAnimatedValue();
				iv.setX(f.x);
				iv.setY(f.y);
			}
		});
		valueAnimator.start();
		*/
		
		//6.---------��ֵ������������Interpolater-----------
		ObjectAnimator oa = ObjectAnimator.ofFloat(iv, "translationY", 0f,1000f);
		oa.setDuration(800);
//		TimeInterpolator
//		oa.setInterpolator(new AccelerateInterpolator(1));
//		oa.setInterpolator(new AccelerateDecelerateInterpolator());
//		oa.setInterpolator(new BounceInterpolator());
//		oa.setInterpolator(new AnticipateInterpolator());
		oa.setInterpolator(new CycleInterpolator(5));
		
		oa.start();
		
	}

	
}
