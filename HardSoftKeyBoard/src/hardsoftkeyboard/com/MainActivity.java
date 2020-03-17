package hardsoftkeyboard.com;

import org.w3c.dom.Text;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText txtInput;
	TextView txtMsg;
	int keyCount= 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		txtMsg= (TextView)findViewById(R.id.txtMsg);
		txtInput= (EditText)findViewById(R.id.txtInput);
		txtInput.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), "OTC " + s, 1).show();
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), "BTC " + s, 1).show();
				
			}
			
			@Override
			public void afterTextChanged(Editable theWatchedText) {
				// TODO Auto-generated method stub
				String msg= "count: " + txtInput.getText().toString().length() + " " + theWatchedText.toString();
				txtMsg.setText( msg);
				
			}
		});
			
	}

	

}
