package sg.edu.rp.c346.id20022678.pratical2;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6= findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn10 = findViewById(R.id.button10);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description.class);
                intent.putExtra("Description", getString(R.string.MBS_Des));
                intent.putExtra("URL",getString(R.string.MSB_URL));
                intent.putExtra("name",getString(R.string.MBS));
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description.class);
                intent.putExtra("Description", getString(R.string.GBTB_Des));
                intent.putExtra("URL",getString(R.string.GBTB_URL));
                intent.putExtra("name",getString(R.string.GBTB));
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description.class);
                intent.putExtra("Description", getString(R.string.USS_Des));
                intent.putExtra("URL",getString(R.string.USS_URL));
                intent.putExtra("name",getString(R.string.USS));
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description.class);
                intent.putExtra("Description", getString(R.string.SBG_Des));
                intent.putExtra("URL",getString(R.string.SBG_URL));
                intent.putExtra("name",getString(R.string.SBG));
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description.class);
                intent.putExtra("Description", getString(R.string.SF_Des));
                intent.putExtra("URL",getString(R.string.SF_URL));
                intent.putExtra("name",getString(R.string.SF));
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description.class);
                intent.putExtra("Description", getString(R.string.SZ_Des));
                intent.putExtra("URL",getString(R.string.SZ_URL));
                intent.putExtra("name",getString(R.string.SZ));
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description.class);
                intent.putExtra("Description", getString(R.string.NS_Des));
                intent.putExtra("URL",getString(R.string.NS_URL));
                intent.putExtra("name",getString(R.string.NS));
                startActivity(intent);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description.class);
                intent.putExtra("Description", getString(R.string.NMS_Des));
                intent.putExtra("URL",getString(R.string.NMS_URL));
                intent.putExtra("name",getString(R.string.NMS));
                startActivity(intent);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description.class);
                intent.putExtra("Description", getString(R.string.FS_Des));
                intent.putExtra("URL",getString(R.string.FS_URL));
                intent.putExtra("name",getString(R.string.FS));
                startActivity(intent);

            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description.class);
                intent.putExtra("Description", getString(R.string.OR_Des));
                intent.putExtra("URL",getString(R.string.OR_URL));
                intent.putExtra("name",getString(R.string.OR));
                startActivity(intent);
            }
        });

    }

}