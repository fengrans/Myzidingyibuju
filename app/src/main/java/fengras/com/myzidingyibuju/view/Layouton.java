package fengras.com.myzidingyibuju.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/4/7.
 */
public class Layouton extends View {
    public Layouton(Context context) {
        super(context);
    }

    public Layouton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Layouton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(2);
        RectF ref=new RectF(100,100,300,500);

        //绘制椭圆
        canvas.drawOval(ref,paint);

    }
}
