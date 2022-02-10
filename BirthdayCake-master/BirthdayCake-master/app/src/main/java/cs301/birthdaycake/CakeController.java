package cs301.birthdaycake;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class CakeController implements View.OnClickListener,
        CompoundButton.OnCheckedChangeListener,
        SeekBar.OnSeekBarChangeListener {
    private CakeModel cake;
    private CakeView cview;
    //private TextView sbTV;

    public CakeController(CakeView cview){
        this.cview = cview;
        this.cake = cview.getMod();
    }


    //@Override
    public void onClick(View view) {
        this.cake.lit = !this.cake.lit;
        this.cview.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        this.cake.candles = !this.cake.candles;
        this.cview.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seek, int i, boolean b) {
        this.cake.candleCount = i;
        this.cview.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
