package com.example.coloringbook;


import android.widget.SeekBar;

public class PageController implements SeekBar.OnSeekBarChangeListener{

    private ColoringPage cP;
    private PageModel pM;

    public PageController(ColoringPage colorP){
        this.cP = colorP;
        this.pM = cP.getPageModel();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        this.pM.redValue = i;
        //TODO: update count
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //not used
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //not used
    }
}
