package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView cview = findViewById(R.id.cakeview);
        CakeController controller = new CakeController(cview);

        Button blowout = findViewById(R.id.blowout);
        CakeController cc = new CakeController(cview);
        blowout.setOnClickListener(cc);

        Switch candleshow = findViewById(R.id.candleSwitch);
        candleshow.setOnCheckedChangeListener(cc);

        SeekBar seek = findViewById(R.id.candles);
        seek.setOnSeekBarChangeListener(cc);

    }



    public void goodbye(View button) {
        Log.i("button", "Goobye");
        finishAffinity();
    }
}