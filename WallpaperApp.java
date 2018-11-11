package XXXXXXXXXXXXXXXXXXXXXX;

import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.*;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private AdView adView;
    private InterstitialAd interstitial;
    private InterstitialAd interstitial2;
    private InterstitialAd interstitial3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // BANNER AD ////////////////////////////////////////////////////////////////////
        adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-XXXXXXXXXXXXXXXXXXXXXX");

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.container);
        layout.addView(adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();

        // Start loading the ad in the background.
        adView.loadAd(adRequest);
        // END BANNER AD /////////////////////////////////////////////////////////////////


    }


    int count1 = 1;

    /** Called when the user touches the button */
    public void next(View view) {
        // Do something in response to button click


        ImageView image = (ImageView) findViewById(R.id.imageView1);
        TextView tcount = (TextView) findViewById(R.id.textView1);

        if (count1 == 15)
        {
            image.setImageResource(R.mipmap.a1);
            image.setTag("a1");
            tcount.setText("Image 1 of 15");
            count1 = 0;

            // INTERSTITIAL AD //////////////////////////////////////////////////////////////
            // Create the interstitial.
            interstitial3 = new InterstitialAd(this);
            interstitial3.setAdUnitId("ca-app-pub-XXXXXXXXXXXXXXXXXXXXXX");

            // Create ad request.
            AdRequest adRequest4 = new AdRequest.Builder().build();

            // Begin loading your interstitial.
            interstitial3.loadAd(adRequest4);

            interstitial3.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    interstitial3.show();
                }

            });
            // END INTERSTITIAL AD /////////////////////////////////////////////////////////////////

        }

        if (count1 == 14)
        {
            image.setImageResource(R.mipmap.a15);
            image.setTag("a15");
            tcount.setText("Image 15 of 15");
            count1 = 15;
        }

        if (count1 == 13)
        {
            image.setImageResource(R.mipmap.a14);
            image.setTag("a14");
            tcount.setText("Image 14 of 15");
            count1 = 14;
        }

        if (count1 == 12)
        {
            image.setImageResource(R.mipmap.a13);
            image.setTag("a13");
            tcount.setText("Image 13 of 15");
            count1 = 13;
        }

        if (count1 == 11)
        {
            image.setImageResource(R.mipmap.a12);
            image.setTag("a12");
            tcount.setText("Image 12 of 15");
            count1 = 12;
        }

        if (count1 == 10)
        {
            image.setImageResource(R.mipmap.a11);
            image.setTag("a11");
            tcount.setText("Image 11 of 15");
            count1 = 11;
        }

        if (count1 == 9)
        {
            image.setImageResource(R.mipmap.a10);
            image.setTag("a10");
            tcount.setText("Image 10 of 15");
            count1 = 10;
        }

        if (count1 == 8)
        {
            image.setImageResource(R.mipmap.a9);
            image.setTag("a9");
            tcount.setText("Image 9 of 15");
            count1 = 9;

        }

        if (count1 == 7)
        {
            image.setImageResource(R.mipmap.a8);
            image.setTag("a8");
            tcount.setText("Image 8 of 15");
            count1 = 8;
        }

        if (count1 == 6)
        {
            image.setImageResource(R.mipmap.a7);
            image.setTag("a7");
            tcount.setText("Image 7 of 15");
            count1 = 7;
        }

        if (count1 == 5)
        {
            image.setImageResource(R.mipmap.a6);
            image.setTag("a6");
            tcount.setText("Image 6 of 15");
            count1 = 6;

            // INTERSTITIAL AD //////////////////////////////////////////////////////////////
            // Create the interstitial.
            interstitial2 = new InterstitialAd(this);
            interstitial2.setAdUnitId("ca-app-pub-XXXXXXXXXXXXXXXXXXXXXX");

            // Create ad request.
            AdRequest adRequest3 = new AdRequest.Builder().build();

            // Begin loading your interstitial.
            interstitial2.loadAd(adRequest3);

            interstitial2.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    interstitial2.show();
                }

            });
            // END INTERSTITIAL AD /////////////////////////////////////////////////////////////////

        }

        if (count1 == 4)
        {
            image.setImageResource(R.mipmap.a5);
            image.setTag("a5");
            tcount.setText("Image 5 of 15");
            count1 = 5;
        }


        if (count1 == 3)
        {
            image.setImageResource(R.mipmap.a4);
            image.setTag("a4");
            tcount.setText("Image 4 of 15");
            count1 = 4;
        }

        if (count1 == 2)
        {
            image.setImageResource(R.mipmap.a3);
            image.setTag("a3");
            tcount.setText("Image 3 of 15");
            count1 = 3;
        }

        if (count1 == 1)
        {
            image.setImageResource(R.mipmap.a2);
            image.setTag("a2");
            tcount.setText("Image 2 of 15");
            count1 = 2;

            // INTERSTITIAL AD //////////////////////////////////////////////////////////////
            // Create the interstitial.
            interstitial2 = new InterstitialAd(this);
            interstitial2.setAdUnitId("ca-app-pub-XXXXXXXXXXXXXXXXXXXXXX");

            // Create ad request.
            AdRequest adRequest3 = new AdRequest.Builder().build();

            // Begin loading your interstitial.
            interstitial2.loadAd(adRequest3);

            interstitial2.setAdListener(new AdListener(){
                public void onAdLoaded(){
                    interstitial2.show();
                }

            });
            // END INTERSTITIAL AD /////////////////////////////////////////////////////////////////

        }

        if (count1 == 0)
        {
            count1 = 1;
        }

    }




    /** Called when the user touches the button */
    public void previous(View view) {
        // Do something in response to button click


        ImageView image = (ImageView) findViewById(R.id.imageView1);
        TextView tcount = (TextView) findViewById(R.id.textView1);

        if (count1 == 1)
        {
            image.setImageResource(R.mipmap.a15);
            image.setTag("a15");
            tcount.setText("Image 15 of 15");
            count1 = 0;
        }

        if (count1 == 2)
        {
            image.setImageResource(R.mipmap.a1);
            image.setTag("a1");
            tcount.setText("Image 1 of 15");
            count1 = 1;
        }

        if (count1 == 3)
        {
            image.setImageResource(R.mipmap.a2);
            image.setTag("a2");
            tcount.setText("Image 2 of 15");
            count1 = 2;
        }

        if (count1 == 4)
        {
            image.setImageResource(R.mipmap.a3);
            image.setTag("a3");
            tcount.setText("Image 3 of 15");
            count1 = 3;
        }

        if (count1 == 4)
        {
            image.setImageResource(R.mipmap.a3);
            image.setTag("a3");
            tcount.setText("Image 3 of 15");
            count1 = 3;
        }

        if (count1 == 5)
        {
            image.setImageResource(R.mipmap.a4);
            image.setTag("a4");
            tcount.setText("Image 4 of 15");
            count1 = 4;
        }

        if (count1 == 6)
        {
            image.setImageResource(R.mipmap.a5);
            image.setTag("a5");
            tcount.setText("Image 5 of 15");
            count1 = 5;
        }

        if (count1 == 7)
        {
            image.setImageResource(R.mipmap.a6);
            image.setTag("a6");
            tcount.setText("Image 6 of 15");
            count1 = 6;
        }

        if (count1 == 8)
        {
            image.setImageResource(R.mipmap.a7);
            image.setTag("a7");
            tcount.setText("Image 7 of 15");
            count1 = 7;
        }

        if (count1 == 9)
        {
            image.setImageResource(R.mipmap.a8);
            image.setTag("a8");
            tcount.setText("Image 8 of 15");
            count1 = 8;
        }

        if (count1 == 10)
        {
            image.setImageResource(R.mipmap.a9);
            image.setTag("a9");
            tcount.setText("Image 9 of 15");
            count1 = 9;
        }

        if (count1 == 11)
        {
            image.setImageResource(R.mipmap.a10);
            image.setTag("a10");
            tcount.setText("Image 10 of 15");
            count1 = 10;
        }

        if (count1 == 12)
        {
            image.setImageResource(R.mipmap.a11);
            image.setTag("a11");
            tcount.setText("Image 11 of 15");
            count1 = 11;
        }

        if (count1 == 13)
        {
            image.setImageResource(R.mipmap.a12);
            image.setTag("a12");
            tcount.setText("Image 12 of 15");
            count1 = 12;
        }

        if (count1 == 14)
        {
            image.setImageResource(R.mipmap.a13);
            image.setTag("a13");
            tcount.setText("Image 13 of 15");
            count1 = 13;
        }

        if (count1 == 15)
        {
            image.setImageResource(R.mipmap.a14);
            image.setTag("a14");
            tcount.setText("Image 14 of 15");
            count1 = 14;
        }


        if (count1 == 0)
        {
            count1 = 15;
        }
    }



    public void setwall(View view) {

        ImageView image = (ImageView) findViewById(R.id.imageView1);
        String imagetag = (String) image.getTag();
        int imagevalue = getResources().getIdentifier(imagetag,"mipmap","bluewallpaper.exle.com.bluewallpaper");

        WallpaperManager myWallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        try {
            myWallpaperManager.setResource(imagevalue);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
