package ssu.hollandt.androidlab2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // class variables
    private Button navigateButton;
    private EditText nameEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigateButton = findViewById(R.id.navigate_button);
        nameEditText = findViewById(R.id.name_edit_text);


        navigateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String name = nameEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, OtherActivity.class);

                intent.putExtra(OtherActivity.NAME_KEY, name);
                startActivity(intent);
            }
        });



    }


}
