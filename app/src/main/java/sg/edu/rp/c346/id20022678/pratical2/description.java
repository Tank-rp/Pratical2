package sg.edu.rp.c346.id20022678.pratical2;

/*
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Student Name: Tan Ke Ting
 * Student ID: 200226678
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class description extends AppCompatActivity {

    TextView tvURL;
    TextView tvDes;
    TextView tvName;
    float fontSize = 20f;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        tvURL = findViewById(R.id.URLTV);
        tvDes = findViewById(R.id.descriptionTV);
        tvName = findViewById(R.id.nameTV);
        btnReturn = findViewById(R.id.button11);

        Intent intentReveied = getIntent();
        String des = intentReveied.getStringExtra("Description");
        String URL = intentReveied.getStringExtra("URL");
        String name = intentReveied.getStringExtra("name");
        tvURL.setText(URL);
        tvDes.setText(des);
        tvDes.setGravity(Gravity.CENTER);
        tvName.setText(name);
        tvName.setGravity(Gravity.CENTER);
        tvName.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);

        registerForContextMenu(tvDes);

       tvURL.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                   Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
                   startActivity(intent);
           }
       });

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void onCreateContextMenu(ContextMenu menu, View v,
                ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,0,0,"Increase font size");
        menu.add(0,1,1,"Decrease font size");

        }

    public boolean onContextItemSelected(MenuItem item){
        if(item.getItemId() == 0){
            if (fontSize > 24){
                Toast.makeText(description.this, "Text cannot be any bigger", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(description.this, "Font size has been increase", Toast.LENGTH_SHORT).show();
                fontSize += 2;
                tvDes.setTextSize(TypedValue.COMPLEX_UNIT_DIP, fontSize);
            }
        }
        else if (item.getItemId() == 1){
            if (fontSize < 16){
                Toast.makeText(description.this, "Text cannot be any smaller", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(description.this, "Font size has been decrease", Toast.LENGTH_SHORT).show();
                fontSize -= 2;
                tvDes.setTextSize(TypedValue.COMPLEX_UNIT_DIP, fontSize);
            }
        }
        return true;
    }
}