package XXXXXXXXXXXXXXXXXXXXXX;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


public class MainActivity extends AppCompatActivity {

    private AdView mAdView;
    private AdView mAdView2;
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-XXXXXXXXXXXXXXXXXXXXXX");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-XXXXXXXXXXXXXXXXXXXXXX");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }

    public int questionnum = (int) (Math.random()*33 - 1);

    public String[][] charArray = new String[][]{
            { "The first computer bug was formed by faulty wires.", "True", "False", "", "", "False"},
            { "What does the Prt Sc button do?", "Captures what's on the screen and copies it to your clipboard", "Saves a .png file of what's on the screen in your screenshots folder in photos", "Nothing", "Closes all windows", "Captures what's on the screen and copies it to your clipboard"},
            { "The computer OEM manufacturer Clevo, known for its Sager notebook line, is based in which country?", "United States", "Taiwan", "Germany", "China", "Taiwan"},
            { "What was the first commerically available computer processor?", "AMD AM386", "TMS 1000", "Intel 486SX", "Intel 4004", "Intel 4004"},
            { "Windows NT is a monolithic kernel.", "True", "False", "", "", "False"},
            { "In the server hosting industry IaaS stands for...", "Internet as a Service", "Internet and a Server", "Infrastructure as a Service", "Infrastructure as a Server", "Infrastructure as a Service"},
            { "AMD created the first consumer 64-bit processor.", "True", "False", "", "", "True"},
            { "In the programming language 'Python' which of these statements would display the string 'Hello World' correctly?", "print('Hello World')", "console.log('Hello World')", "echo 'Hello World'", "printf('Hello World')", "print('Hello World')"},
            { "In 'Hexadecimal', what color would be displayed from the color code? '#00FF00'?", "Red", "Green", "Blue", "Yellow", "Green"},
            { "In most programming languages, the operator ++ is equivalent to the statement '+= 1'.", "True", "False", "", "", "True"},
            { "Early RAM was directly seated onto the motherboard and could not be easily removed.", "True", "False", "", "", "True"},
            { "Which data structure does FILO apply to?", "Stack", "Queue", "Heap", "Tree", "Stack"},
            { "When did the online streaming service 'Mixer' launch?", "2009", "2011", "2013", "2016", "2016"},
            { "What is the name given to layer 4 of the Open Systems Interconnection (ISO) model?", "Session", "Data link", "Transport", "Network", "Transport"},
            { "Who invented the 'Spanning Tree Protocol'?", "Paul Vixie", "Radia Perlman", "Vint Cerf", "Michael Roberts", "Radia Perlman"},
            { "Which company was established on April 1st, 1976 by Steve Jobs, Steve Wozniak and Ronald Wayne?", "Commodore", "Atari", "Apple", "Microsoft", "Apple"},
                    { "How many bytes are in a kilobyte of RAM?", "1000", "1024", "500", "512", "1000"},
                    { "The logo for Snapchat is a Bell.", "True", "False", "", "", "False"},
                    { "Pointers were not used in the original C programming language; they were added later on in C++.", "True", "False", "", "", "False"},
                    { "To bypass US Munitions Export Laws, the creator of the PGP published all the source code in book form.", "True", "False", "", "", "True"},
                    { "While Apple was formed in California, in which western state was Microsoft founded?", "Colorado", "Washington", "New Mexico", "Arizona", "New Mexico"},
                    { "HTML stands for Hypertext Markup Language.", "True", "False", "", "", "True"},
                    { "What does LTS stand for in the software market?", "Long Term Support", "Long Taco Service", "Ludicrous Transfer Speed", "Ludicrous Turbo Speed", "Long Term Support"},
                    { "The Windows ME operating system was released in the year 2000.", "True", "False", "", "", "True"},
                    { ".at is the top-level domain for what country?", "Angola", "Australia", "Argentina", "Austria", "Austria"},
                    { "America Online (AOL) started out as which of these online service providers?", "GEnie", "Prodigy", "Quantum Link", "CompuServe", "Quantum Link"},
                    { "What internet protocol was documented in RFC 1459?", "HTTP", "IRC", "HTTPS", "FTP", "IRC"},
                    { "Which of these is not a key value of Agile software development?", "Comprehensive documentation", "Individuals and interactions", "Customer collaboration", "Responding to change", "Comprehensive documentation"},
                    { "Which RAID array type is associated with data mirroring?", "RAID 1", "RAID 0", "RAID 10", "RAID 5", "RAID 1"},
                    { "What does CPU stand for?", "Central Process Unit", "Central Processing Unit", "Computer Personal Unit", "Central Processor Unit", "Central Processing Unit"},
                    { "Linus Torvalds created Linux and Git.", "True", "False", "", "", "True"},
                    { "In CSS, which of these values CANNOT be used with the 'position' property?", "static", "absolute", "relative", "center", "center"},
                    { "Who is the original author of the realtime physics engine called PhysX?", "Ageia", "NovodeX", "Nvidia", "AMD", "NovodeX"}
    };


    public void q1(View view) {
        setContentView(R.layout.q1);

        if (mInterstitialAd.isLoaded() && (questionnum % 5 == 0)) {
            mInterstitialAd.show();
        }

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });

        mAdView2 = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView2.loadAd(adRequest);

        if(charArray.length > questionnum + 1) {
            questionnum++;
        } else {
            questionnum = 0;
        }

        TextView question = (TextView)findViewById(R.id.textView);
        final TextView answer = (TextView)findViewById(R.id.textView3);
        TextView counter1 = (TextView)findViewById(R.id.textView4);
        Button button2 =  (Button)findViewById(R.id.button2);
        Button button3 =  (Button)findViewById(R.id.button3);
        Button button4 =  (Button)findViewById(R.id.button4);
        Button button5 =  (Button)findViewById(R.id.button5);

        int qcount = questionnum + 1;
        counter1.setText("Question: " + Integer.toString(qcount) + " / " + Integer.toString(charArray.length));
        question.setText(charArray[questionnum][0]);
        button2.setText(charArray[questionnum][1]);
        button3.setText(charArray[questionnum][2]);
        button4.setText(charArray[questionnum][3]);
        button5.setText(charArray[questionnum][4]);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (charArray[questionnum][1] == charArray[questionnum][5]) {
                    answer.setText("Correct!");
                } else {
                    answer.setText("Wrong");
                }
            }  });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (charArray[questionnum][2] == charArray[questionnum][5]) {
                    answer.setText("Correct!");
                } else {
                    answer.setText("Wrong");
                }
            }  });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (charArray[questionnum][3] == charArray[questionnum][5]) {
                    answer.setText("Correct!");
                } else {
                    answer.setText("Wrong");
                }
            }  });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (charArray[questionnum][4] == charArray[questionnum][5]) {
                    answer.setText("Correct!");
                } else {
                    answer.setText("Wrong");
                }
            }  });


    }


}
