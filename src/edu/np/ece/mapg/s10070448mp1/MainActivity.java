package edu.np.ece.mapg.s10070448mp1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

	int myNumber = 8;
	EditText etNumber;
	TextView textView1;
	Button btGuess;
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        etNumber = (EditText)this.findViewById(R.id.etNumber);
    	textView1 = (TextView)this.findViewById(R.id.textView1);
    	btGuess = (Button)this.findViewById(R.id.btGuess);
    	btGuess.setOnClickListener(listener);
    }

    
    private View.OnClickListener listener = new View.OnClickListener()
    {
    	@Override
    	public void onClick (View v){
    		
    		try{
    		String message = etNumber.getText().toString();
    		int Num = Integer.parseInt(message);
    		
    		
    		
    		
    		 if( Num == myNumber )
    		{
    			Toast.makeText(MainActivity.this,"Bingo Correct number:)", Toast.LENGTH_LONG).show();        		
        		
    			
    		}
    		 
    		 if(Num >9){Toast.makeText(MainActivity.this,"Enter a number between 0 and 9", Toast.LENGTH_LONG).show(); }
    		 
    		 else {
    			Toast.makeText(MainActivity.this,"Try Aagin..", Toast.LENGTH_LONG).show();
    		}}
    		catch(Exception e){
    			Toast.makeText(MainActivity.this,"Enter number only", Toast.LENGTH_LONG).show();  
    		}
    		
    		
    	}
    	
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
