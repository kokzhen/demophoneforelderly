package sg.edu.rp.c346.id22014093.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button son;
    Button daughter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        son=findViewById(R.id.buttonCallSon);
        daughter=findViewById(R.id.buttonCallDaughter);


        son.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Calling Peter", Toast.LENGTH_SHORT).show();
                Intent intentCall = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+ 92240336));
                startActivity(intentCall);
            }
        });
        daughter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Calling Mary", Toast.LENGTH_SHORT).show();
                Intent intentCall = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+ 89675543));
                startActivity(intentCall);
            }
        });


    }



}