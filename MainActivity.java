package com.nikku.myfirstpro;

 

import java.util.Random;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	Button butn;
	EditText edt;
	TextView txt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		edt=(EditText)findViewById(R.id.editText1);
		txt=(TextView)findViewById(R.id.textView1);
		butn=(Button)findViewById(R.id.button1);
		butn.setOnClickListener(this);
	}

	

	@Override
	public void onClick(View v) 
	{
		// TODO Auto-generated method stub
		Random rndm=new Random(); 
		String str=edt.getText().toString();
		char[] chstr=str.toCharArray();
		int i=0,j=0;
		char temp;
		int len=str.length();
		while(i<len)
		{
			j=rndm.nextInt(len);		//giving limit to rndm ..till len
			temp=chstr[j];				//swapping each character with randomly chosen one!
			chstr[j]=chstr[i];
			chstr[i]=temp;
			i++;
		}
		txt.setText(chstr, 0, len);
	}

}