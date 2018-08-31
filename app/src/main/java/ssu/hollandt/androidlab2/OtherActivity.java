package ssu.hollandt.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.BreakIterator;

public class OtherActivity extends AppCompatActivity {

    private TextView welcomeText;

    public static final String NAME_KEY = "USER_NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        welcomeText =  findViewById(R.id.welcome_text);
        Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(NAME_KEY);

        if(name == null || name.isEmpty())
        {
            name = "Not Bob";
        }


        welcomeText.setText ("Welcome, " + name);
    }
}
