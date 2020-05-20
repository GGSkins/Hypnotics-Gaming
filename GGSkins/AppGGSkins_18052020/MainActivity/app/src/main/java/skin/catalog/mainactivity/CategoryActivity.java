package skin.catalog.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryActivity extends AppCompatActivity {

    ImageView categorypistols;
    ImageView categorysmg;
    ImageView categoryknives;
    ImageView categoryrifles;
    ImageView categoryheavys;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        categorypistols = (ImageView) findViewById(R.id.categorypistols);
        categorysmg = (ImageView) findViewById(R.id.categorysmg);
        categoryknives = (ImageView) findViewById(R.id.categoryknives);
        categoryrifles= (ImageView) findViewById(R.id.categoryrifles);
        categoryheavys = (ImageView) findViewById(R.id.categoryheavys);

        categorypistols.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategoryActivity.this, CategoryPistolsActivity.class);
                startActivity(i);
            }
        });

        categorysmg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategoryActivity.this, CategorySmgActivity.class);
                startActivity(i);
            }
        });

        categoryknives.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategoryActivity.this, CategoryKnivesActivity.class);
                startActivity(i);
            }
        });
        categoryrifles.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategoryActivity.this, CategoryRiflesActivity.class);
                startActivity(i);
            }
        });
        categoryheavys.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategoryActivity.this, CategoryHeavysActivity.class);
                startActivity(i);
            }
        });



    }
}
