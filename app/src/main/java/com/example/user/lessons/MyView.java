package com.example.user.lessons;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.Calendar;

public class MyView extends View {

    private Paint paintCircle;
    private Paint paintRect;
    private RectF rectF;

    public void setListener(OnMyViewClickListener listener) {
        this.listener = listener;
    }

    private OnMyViewClickListener listener;

    public MyView(Context context) {
        super(context);
        init();
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init() {
        paintCircle = new Paint();
        paintCircle.setColor(getResources().getColor(R.color.red));
        paintCircle.setAntiAlias(true);

        paintRect = new Paint();
        paintRect.setColor(getResources().getColor(R.color.black));
        paintRect.setStrokeWidth(10);
        paintRect.setAntiAlias(true);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        rectF = new RectF();
        rectF.left = getWidth() * 0.1f;
        rectF.top = getHeight() * 0.3f;
        rectF.right = getWidth() - rectF.left;
        rectF.bottom = getHeight() - rectF.top;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float radius = Math.min(getWidth(), getHeight()) / 2;
        float yLine = getHeight() / 2;
        float xLine = getWidth() / 2;

        float yEdge = getHeight() / 2 - radius;

        canvas.drawCircle(xLine,
                yLine,
                radius,
                paintCircle);
        float yStartLine = yEdge * 0.9f;
        float yEndLine = yEdge * 1.1f;

        canvas.save();
        float step = 360 / 12f;
        for (int i = 0; i < 12; i++) {
            canvas.drawLine(xLine, yStartLine, xLine, yEndLine, paintRect);
            canvas.rotate(step, xLine, yLine);
        }


        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);

        canvas.save();
        canvas.rotate(step * hour + step/60*minute, xLine, yLine);
        canvas.drawLine(xLine, getHeight() / 2, xLine, getHeight() / 2 - radius / 2, paintRect);

        canvas.restore();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            Log.e("AAA", "ACTION_DOWN");
            return true;
        }else if(event.getAction() == MotionEvent.ACTION_UP) {
            Log.e("AAA", "ACTION_UP");
            if(listener!=null)listener.onClick();
            return true;

        } else if(event.getAction() == MotionEvent.ACTION_MOVE){
            Log.e("AAA", "ACTION_MOVE");
            return true;

        }
        return super.onTouchEvent(event);
    }

}
