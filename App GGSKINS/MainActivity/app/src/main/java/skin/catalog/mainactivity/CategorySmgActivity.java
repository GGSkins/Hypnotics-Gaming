package skin.catalog.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CategorySmgActivity extends AppCompatActivity {

    ImageView mag7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorysmg);

        mag7 = (ImageView) findViewById(R.id.mag7);
        //
        //

        mag7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategorySmgActivity.this, CategorySmgMag7.class);
                startActivity(i);
            }
        });
    }
}
