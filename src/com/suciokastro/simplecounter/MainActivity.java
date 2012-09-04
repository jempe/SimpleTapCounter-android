package com.suciokastro.simplecounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.GestureDetector;
import android.view.MotionEvent;


public class MainActivity extends Activity

	implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener
{

	public int tap_count = 0;
	private GestureDetector gesturedetector = null;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

		gesturedetector = new GestureDetector(this, this);
        gesturedetector.setOnDoubleTapListener(this);


        setContentView(R.layout.main);

		TextView display_count = new TextView(this);
		display_count = (TextView)findViewById(R.id.display_count); 

		String current_count = String.valueOf(tap_count);

		display_count.setText(current_count);
    }

	@Override
	public boolean onTouchEvent(MotionEvent event) {
			return gesturedetector.onTouchEvent(event);
	}

	@Override
	public boolean onDown(MotionEvent e) {
			return false;
	}

	@Override
	public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX,float velocityY) 
	{
			return false;
	}

	@Override
	public void onLongPress(MotionEvent e) 
	{

	}

	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,float distanceY)
	{
			return false;
	}

	@Override
	public void onShowPress(MotionEvent e) 
	{
	}

	@Override
	public boolean onSingleTapUp(MotionEvent e) 
	{
		tap_count++;
		TextView display_count = new TextView(this);
		display_count = (TextView)findViewById(R.id.display_count); 

		String current_count = String.valueOf(tap_count);

		display_count.setText(current_count);
		return false;
	}

	@Override
	public boolean onDoubleTap(MotionEvent e) 
	{
			return false;
	}

	@Override
	public boolean onDoubleTapEvent(MotionEvent e) 
	{
			return false;
	}

	@Override
	public boolean onSingleTapConfirmed(MotionEvent e) 
	{
			return false;
	}
}
