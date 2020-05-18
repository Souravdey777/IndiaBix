package souravapp.indiabix;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    //Conectivity Manager to Access Network State
        ConnectivityManager cm =(ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info =cm.getActiveNetworkInfo();
        if(!(info!=null && info.isConnected())) {
            Snackbar.make(findViewById(R.id.main_content)," YOU ARE OFFLINE",Snackbar.LENGTH_LONG)
                    .setAction("Settings", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
                        }
                    })
                    .setActionTextColor(Color.GREEN)
                    .show();
        }


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Floating Action Button for Discussion Forum
        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,FloatingButtonActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                //360* Rotation
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_animation);
                fab.startAnimation(animation1);

            }
        });

        //Button for Online Test
        Button ot =(Button)findViewById(R.id.btn);
        ot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Online_Test.class);
                startActivity(i);
            }
        });

        //Button for puzzles
        Button  puzzle =(Button)findViewById(R.id.btn1);
        puzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Puzzles.class);
                startActivity(i);
            }
        });

        //Button for ga
        Button  ga =(Button)findViewById(R.id.btn2);
        ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,GeneralAptitutude.class);
                startActivity(i);
            }
        });

        //Button for VR
        Button  VR =(Button)findViewById(R.id.btn3);
        VR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,VerbalAndReasoning.class);
                startActivity(i);
            }
        });

        //Button for gk
        Button  gk =(Button)findViewById(R.id.btn4);
        gk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,GeneralKnowledge.class);
                startActivity(i);
            }
        });

        //Button for eng
        Button  eng =(Button)findViewById(R.id.btn5);
        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Engineering.class);
                startActivity(i);
            }
        });

        //Button for programming
        Button  prog =(Button)findViewById(R.id.btn6);
        prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Programming.class);
                startActivity(i);
            }
        });

        //Button for IP
        Button  ip =(Button)findViewById(R.id.btn7);
        ip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,InterviewPattern.class);
                startActivity(i);
            }
        });

        //Button for ti
        Button  ti =(Button)findViewById(R.id.btn8);
        ti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,InterviewTechnical.class);
                startActivity(i);
            }
        });

        //Button for al
        Button  al =(Button)findViewById(R.id.btn9);
        al.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Alarm.class);
                startActivity(i);
            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_general_aptitude) {
            Intent intent= new Intent(getApplicationContext(),GeneralAptitutude.class);
            startActivity(intent);

        } else if (id == R.id.nav_verbal_and_Reasoning) {
            Intent intent= new Intent(getApplicationContext(),VerbalAndReasoning.class);
            startActivity(intent);

        } else if (id == R.id.nav_general_knowledge) {
            Intent intent= new Intent(getApplicationContext(),GeneralKnowledge.class);
            startActivity(intent);

        } else if (id == R.id.nav_engineering) {
            Intent intent= new Intent(getApplicationContext(),Engineering.class);
            startActivity(intent);

        } else if (id == R.id.nav_programming) {
            Intent intent= new Intent(getApplicationContext(),Programming.class);
            startActivity(intent);

        } else if (id == R.id.Pattern) {
            Intent intent= new Intent(getApplicationContext(),InterviewPattern.class);
            startActivity(intent);

        } else if (id == R.id.Technical) {
            Intent intent= new Intent(getApplicationContext(),InterviewTechnical.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}