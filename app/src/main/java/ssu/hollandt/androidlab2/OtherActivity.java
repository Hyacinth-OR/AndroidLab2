package ssu.hollandt.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    private TextView welcomeText;
    private Button returnButton;

    public static final String NAME_KEY = "USER_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);


        welcomeText = findViewById(R.id.welcome_text);
        returnButton = findViewById(R.id.welcomeText);

        Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(NAME_KEY);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OtherActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        if(name == null || name.isEmpty()) {
            name = "Please enter a name";
        }

        welcomeText.setText("Welcome" + name);
    }
}
