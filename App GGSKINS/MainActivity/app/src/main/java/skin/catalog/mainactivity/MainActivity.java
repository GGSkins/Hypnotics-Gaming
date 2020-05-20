package skin.catalog.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView categorymain;
    ImageView namemain;
    ImageView asiimov, candyapple, eco, justice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categorymain = (ImageView) findViewById(R.id.categorymain);
        namemain = (ImageView) findViewById(R.id.namemain);
        asiimov = (ImageView) findViewById(R.id.asiimov);
        candyapple = (ImageView) findViewById(R.id.candyapple);
        eco = (ImageView) findViewById(R.id.eco);
        justice = (ImageView) findViewById(R.id.justice);

        categorymain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, CategoryActivity.class);
                startActivity(i);
            }
        });
        asiimov.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, Ak47Asiimov.class);
                startActivity(i);
            }
        });
        candyapple.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, Mac10CandyApple.class);
                startActivity(i);
            }
        });
        eco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, Cz75autoEco.class);
                startActivity(i);
            }
        });
        justice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, Mag7Justice.class);
                startActivity(i);
            }
        });
        namemain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, NameActivity.class);
                startActivity(i);
            }
        });
    }
}
