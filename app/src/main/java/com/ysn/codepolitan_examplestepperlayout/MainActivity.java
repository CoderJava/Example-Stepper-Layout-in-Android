package com.ysn.codepolitan_examplestepperlayout;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static View viewCircleFinishStep1, viewCircleCurrentStep1;
    public static View viewHorizontalOn1, viewHorizontalOff1;
    public static View viewCircleFinishStep2, viewCircleCurrentStep2;
    public static View viewHorizontalOn2, viewHorizontalOff2;
    public static View viewCircleFinishStep3, viewCircleCurrentStep3;
    public static int width = 0;
    public static int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadComponent();
        loadFragment();
    }

    private void loadComponent() {
        viewCircleFinishStep1 = (View) findViewById(R.id.view_circle_finish_step_1);
        viewCircleCurrentStep1 = (View) findViewById(R.id.view_circle_current_step_1);
        viewHorizontalOn1 = (View) findViewById(R.id.view_horizontal_on_1);
        viewHorizontalOff1 = (View) findViewById(R.id.view_horizontal_off_1);
        viewCircleFinishStep2 = (View) findViewById(R.id.view_circle_finish_step_2);
        viewCircleCurrentStep2 = (View) findViewById(R.id.view_circle_current_step_2);
        viewHorizontalOn2 = (View) findViewById(R.id.view_horizontal_on_2);
        viewHorizontalOff2 = (View) findViewById(R.id.view_horizontal_off_2);
        viewCircleFinishStep3 = (View) findViewById(R.id.view_circle_finish_step_3);
        viewCircleCurrentStep3 = (View) findViewById(R.id.view_circle_current_step_3);

        viewHorizontalOff1.post(new Runnable() {
            @Override
            public void run() {
                width = viewHorizontalOff1.getWidth();
            }
        });
    }

    private void loadFragment() {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame_layout, new Step1Fragment())
                .commit();
    }

    public static void goToStepOrangTua() {
        position = 2;
        ObjectAnimator objectAnimatorCircleFinish = ObjectAnimator.ofFloat(viewCircleFinishStep1, "alpha", 0, 1);
        objectAnimatorCircleFinish.setDuration(500);
        objectAnimatorCircleFinish.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                ObjectAnimator objectAnimatorHorizontal = ObjectAnimator.ofFloat(viewHorizontalOff1, "translationX", 0, width);
                objectAnimatorHorizontal.setDuration(500);
                objectAnimatorHorizontal.addListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ObjectAnimator objectAnimatorCircle = ObjectAnimator.ofFloat(viewCircleCurrentStep2, "alpha", 0, 1);
                        objectAnimatorCircle.setDuration(500);
                        objectAnimatorCircle.start();
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });
                objectAnimatorHorizontal.start();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        objectAnimatorCircleFinish.start();
    }

    public static void goToStepUlasan() {
        position = 3;
        ObjectAnimator objectAnimatorCircleFinish = ObjectAnimator.ofFloat(viewCircleFinishStep2, "alpha", 0, 1);
        objectAnimatorCircleFinish.setDuration(500);
        objectAnimatorCircleFinish.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                ObjectAnimator objectAnimatorHorizontal = ObjectAnimator.ofFloat(viewHorizontalOff2, "translationX", 0, width);
                objectAnimatorHorizontal.setDuration(500);
                objectAnimatorHorizontal.addListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ObjectAnimator objectAnimatorCircle = ObjectAnimator.ofFloat(viewCircleCurrentStep3, "alpha", 0, 1);
                        objectAnimatorCircle.setDuration(500);
                        objectAnimatorCircle.start();
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });
                objectAnimatorHorizontal.start();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        objectAnimatorCircleFinish.start();
    }

    public static void backToStepBiodataDiri() {
        final ObjectAnimator objectAnimatorCircleCurrent = ObjectAnimator.ofFloat(viewCircleCurrentStep2, "alpha", 1, 0);
        objectAnimatorCircleCurrent.setDuration(500);
        objectAnimatorCircleCurrent.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                ObjectAnimator objectAnimatorHorizontal = ObjectAnimator.ofFloat(viewHorizontalOff1, "translationX", width, 0);
                objectAnimatorHorizontal.setDuration(500);
                objectAnimatorHorizontal.addListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ObjectAnimator objectAnimatorCircleFinish = ObjectAnimator.ofFloat(viewCircleFinishStep1, "alpha", 1, 0);
                        objectAnimatorCircleFinish.setDuration(500);
                        objectAnimatorCircleFinish.start();
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });
                objectAnimatorHorizontal.start();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        objectAnimatorCircleCurrent.start();
    }

    public static void backToStepOrangTua() {
        ObjectAnimator objectAnimatorCurrent = ObjectAnimator.ofFloat(viewCircleCurrentStep3, "alpha", 1, 0);
        objectAnimatorCurrent.setDuration(500);
        objectAnimatorCurrent.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                ObjectAnimator objectAnimatorHorizontal = ObjectAnimator.ofFloat(viewHorizontalOff2, "translationX", width, 0);
                objectAnimatorHorizontal.setDuration(500);
                objectAnimatorHorizontal.addListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ObjectAnimator objectAnimatorCircleFinish = ObjectAnimator.ofFloat(viewCircleFinishStep2, "alpha", 1, 0);
                        objectAnimatorCircleFinish.setDuration(500);
                        objectAnimatorCircleFinish.start();
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });
                objectAnimatorHorizontal.start();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        objectAnimatorCurrent.start();
    }

    @Override
    public void onBackPressed() {
        position--;
        if (position == 1) {
            backToStepBiodataDiri();
        } else if (position == 2) {
            backToStepOrangTua();
        }
        super.onBackPressed();
    }
}
