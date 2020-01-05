package in.blogspot.tecnopandit.textwatcherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText editText;
TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView2);
        t3=findViewById(R.id.textView3);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                t1.setText("before text changed "+" start "+ Integer.toString(start)+" count "+Integer.toString(count)+" after "+Integer.toString(after)+editText.getText().toString());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                t2.setText("before text changed "+" start "+ Integer.toString(start)+" count "+Integer.toString(count)+" after "+Integer.toString(before)+editText.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                t3.setText("after text changed "+editText.getText().toString());
            }
        });
    }
}
