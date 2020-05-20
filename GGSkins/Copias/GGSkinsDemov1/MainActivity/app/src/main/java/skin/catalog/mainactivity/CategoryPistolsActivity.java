package skin.catalog.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryPistolsActivity extends AppCompatActivity {

    ImageView cz75auto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorypistols);

        cz75auto = (ImageView) findViewById(R.id.cz75auto);
        //
        //

        cz75auto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategoryPistolsActivity.this, CategoryPistolsCz75auto.class);
                startActivity(i);
            }
        });
    }

}
