package mine.calender.com.example.shivangi.technoferia;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.transition.TransitionInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.pushbots.push.Pushbots;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    CardView cd1, cd2, cd3, cd4;
    TextView textView, textView2, tv2, tv22, tv3, tv33, tv4, tv44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pushbots.sharedInstance().init(this);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        cd1 = (CardView) findViewById(R.id.card_view1);
        cd2 = (CardView) findViewById(R.id.card_view2);
        cd3 = (CardView) findViewById(R.id.card_view3);
        cd4 = (CardView) findViewById(R.id.card_view);
        textView = (TextView) findViewById(R.id.t1);
        textView2 = (TextView) findViewById(R.id.t11);
        tv2 = (TextView) findViewById(R.id.t2);
        tv22 = (TextView) findViewById(R.id.t22);
        tv3 = (TextView) findViewById(R.id.t3);
        tv33 = (TextView) findViewById(R.id.t33);
        tv4 = (TextView) findViewById(R.id.t);
        tv44 = (TextView) findViewById(R.id.tt);
        setSupportActionBar(toolbar);
        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/bold.ttf");
        Typeface face2 = Typeface.createFromAsset(getAssets(), "fonts/light.ttf");
        textView.setTypeface(face);
        textView2.setTypeface(face2);
        tv2.setTypeface(face);
        tv22.setTypeface(face2);
        tv3.setTypeface(face);
        tv33.setTypeface(face2);
        tv4.setTypeface(face);
        tv44.setTypeface(face2);

        cd1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       View viewStart = findViewById(R.id.img1);

                                       ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, viewStart, "profile");

                                       Intent intent = new Intent(getBaseContext(), Navigation.class);
                                       ActivityCompat.startActivity(MainActivity.this, intent, optionsCompat.toBundle());

                                   }
                               }
        );
        cd2.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       View viewStart = findViewById(R.id.img1);

                                       ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, viewStart, "profile");
//MainActivity.this.finish();
                                       Intent intent = new Intent(getBaseContext(), Schedule.class);
                                       ActivityCompat.startActivity(MainActivity.this, intent, optionsCompat.toBundle());

                                   }
                               }
        );
        cd3.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                      // MainActivity.this.finish();
                                       Intent intent = new Intent(getBaseContext(), events2.class);
                                       startActivity(intent);


                                   }
                               }
        );
        cd4.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       //MainActivity.this.finish();
                                       Intent intent = new Intent(getBaseContext(), Register.class);
                                       startActivity(intent);


                                   }
                               }
        );
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}