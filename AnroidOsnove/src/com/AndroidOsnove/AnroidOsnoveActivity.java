package com.AndroidOsnove;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnroidOsnoveActivity extends Activity {
    /** Called when the activity is first created. */
   
	private boolean igrac;
	
	@Override
		public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
       igrac=true;
        
    }
	
	public void onButton0Clicked (View v) {
		
		Button t0=(Button) v;
		t0.setText("Igra traje");
		
		
		Button b0=(Button) findViewById(R.id.button0);
		Button b1=(Button) findViewById(R.id.button1);
		Button b2=(Button) findViewById(R.id.button2);
		Button b3=(Button) findViewById(R.id.button3);
		Button b4=(Button) findViewById(R.id.button4);
		Button b5=(Button) findViewById(R.id.button5);
		Button b6=(Button) findViewById(R.id.button6);
		Button b7=(Button) findViewById(R.id.button7);
		Button b8=(Button) findViewById(R.id.button8);
		Button b9=(Button) findViewById(R.id.button9);
		
	
		
		b1.setText(".");
		b2.setText("..");
		b3.setText("...");
		b4.setText("....");
		b5.setText(".....");
		b6.setText("......");
		b7.setText(".......");
		b8.setText("........");
		b9.setText(".........");
		
		
		
		
	}
	
	public void onButtonClicked(View v) {
		
		Button t = (Button) v;
		
		if(this.igrac) {
			t.setText("X"); t.setBackgroundColor(1); this.igrac=false;
		}
		else {
			t.setText("O"); t.setBackgroundColor(1); this.igrac=true;
		}
		this.win();
	}
	
	public void win(){
		
		Button b0=(Button) findViewById(R.id.button0);
		Button b1=(Button) findViewById(R.id.button1);
		Button b2=(Button) findViewById(R.id.button2);
		Button b3=(Button) findViewById(R.id.button3);
		Button b4=(Button) findViewById(R.id.button4);
		Button b5=(Button) findViewById(R.id.button5);
		Button b6=(Button) findViewById(R.id.button6);
		Button b7=(Button) findViewById(R.id.button7);
		Button b8=(Button) findViewById(R.id.button8);
		Button b9=(Button) findViewById(R.id.button9);
		
		if( b1.getText().equals(b2.getText()) && b2.getText().equals(b3.getText()) ||
				b4.getText().equals(b5.getText()) && b5.getText().equals(b6.getText()) ||
				b7.getText().equals(b8.getText()) && b8.getText().equals(b9.getText()) ||
				b1.getText().equals(b4.getText()) && b4.getText().equals(b7.getText()) ||
				b2.getText().equals(b5.getText()) && b5.getText().equals(b8.getText()) ||
				b3.getText().equals(b6.getText()) && b6.getText().equals(b9.getText()) ||
				b1.getText().equals(b5.getText()) && b5.getText().equals(b9.getText()) ||
				b7.getText().equals(b5.getText()) && b5.getText().equals(b3.getText()) )  {
			
			TextView t=(TextView) findViewById(R.id.text1);
			if(!this.igrac) {t.setText("Pobednik je igrac X"); }
			else
				t.setText("Pobednik je igrac O");
			b0.setText("Igra je zavrsena");
		
				b1.setClickable(false);
				b2.setClickable(false);
				b3.setClickable(false);
				b4.setClickable(false);
				b5.setClickable(false);
				b6.setClickable(false);
				b7.setClickable(false);
				b8.setClickable(false);
				b9.setClickable(false);
		}
				
				
		
	}
	
	
}