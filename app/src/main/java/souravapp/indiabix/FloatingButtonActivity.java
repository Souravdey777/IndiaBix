package souravapp.indiabix;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

/**
 * Created by SOURAV on 2/12/2017.
 */
public class FloatingButtonActivity extends AppCompatActivity {
    FloatingActionButton fab1,fab2,fab3;
    TextView fabtv1,fabtv2,fabtv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.floatingbutton);
        Snackbar.make(findViewById(R.id.coordinator),":: WELCOME TO THE DICUSSION FORUM ::",Snackbar.LENGTH_LONG).show();
        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab1_animation);
        fab1.startAnimation(animation1);
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        Animation animation2 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab2_animation);
        fab2.startAnimation(animation2);
        fab3 = (FloatingActionButton) findViewById(R.id.fab3);
        Animation animation3 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab3_animation);
        fab3.startAnimation(animation3);
        fabtv1 = (TextView) findViewById(R.id.favtv1);
        Animation animation4 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fabtv1);
        fabtv1.startAnimation(animation4);
        fabtv2 = (TextView) findViewById(R.id.favtv2);
        Animation animation5 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fabtv2);
        fabtv2.startAnimation(animation5);
        fabtv3 = (TextView) findViewById(R.id.favtv3);
        Animation animation6 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fabtv3);
        fabtv3.startAnimation(animation6);


        CoordinatorLayout coordinatorLayout=(CoordinatorLayout)findViewById(R.id.coordinator);
            coordinatorLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FloatingButtonActivity.this,WEBVIEW0.class);
                intent.putExtra("Option",1);
                startActivity(intent);
            }
        });
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FloatingButtonActivity.this,WEBVIEW0.class);
                intent.putExtra("Option",2);
                startActivity(intent);
            }
        });
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FloatingButtonActivity.this,WEBVIEW0.class);
                intent.putExtra("Option",3);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0,0);
    }
}
