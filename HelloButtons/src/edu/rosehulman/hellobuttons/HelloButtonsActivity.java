package edu.rosehulman.hellobuttons;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HelloButtonsActivity extends Activity {

    private int mCount = 0;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final TextView textView = (TextView) findViewById(R.id.myTextView);
        final Button button = (Button) findViewById(R.id.myButton);

        mCount++;
        String msg = getString(R.string.message_format, mCount);
        textView.setText(msg);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mCount++;
                String msg = String.format(getString(R.string.message_format), mCount);
                textView.setText(msg);
            }

        });
    }
}