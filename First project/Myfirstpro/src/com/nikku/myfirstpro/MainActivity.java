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
		Random crazy=new Random(); 
		String str=edt.getText().toString();
		char[] chstr=str.toCharArray();
		int len,n,i;
		char temp;
		len=str.length();
		for(i=0;i<len;i++)
		{
			n=crazy.nextInt(len);		//giving limit to crazy ..till len
			temp=chstr[n];				//swapping each character with randomly chosen one!
			chstr[n]=chstr[i];
			chstr[i]=temp;
		}
		txt.setText(chstr, 0, len);
	}

}