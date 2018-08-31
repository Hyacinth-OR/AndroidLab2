package ssu.hollandt.androidlab2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    // class variables
    private Button navigateButton;
    private EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.name_edit_text);


        navigateButton = findViewById(R.id.navigate_button);
        navigateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this,OtherActivity.class);
                intent.putExtra(OtherActivity.NAME_KEY, name);
                startActivity(intent);

        }

    });
}
}
