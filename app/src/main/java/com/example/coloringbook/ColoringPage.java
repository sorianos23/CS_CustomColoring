package com.example.coloringbook;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class ColoringPage extends SurfaceView {

    private PageModel pageModel;
    private Paint boatpaint;

    public ColoringPage(Context context){
        super(context);
        initialize();
    }

    public ColoringPage(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
        this.pageModel = new PageModel();

        this.setBackgroundColor(Color.WHITE);
    }

    private void initialize(){
        this.boatpaint = new Paint();
        boatpaint.setColor(Color.BLUE);
        boatpaint.setStyle(Paint.Style.FILL);

        setWillNotDraw(false);
        this.setBackgroundColor(Color.WHITE);
    }

    public void drawBoat(Canvas canvas){

        Path boatpath = new Path();
        boatpath.reset();
        boatpath.moveTo(500.0f, 500.0f); // used for first point
        boatpath.lineTo(1000.0f, 500.0f);
        boatpath.lineTo(900.0f, 800.0f);
        boatpath.lineTo(600.0f, 800.0f);
        boatpath.lineTo(500.0f, 500.0f);

        canvas.drawPath(boatpath, boatpaint);
        canvas.drawRect(50.0f,50.0f,500.0f,500.0f, boatpaint);
    }
    public void OnDraw(Canvas canvas){
        drawBoat(canvas);
        canvas.drawOval(100.0f, 100.0f, 200.0f, 150.0f, this.boatpaint);
    }

    public PageModel getPageModel(){
        return this.pageModel;
    }
}
