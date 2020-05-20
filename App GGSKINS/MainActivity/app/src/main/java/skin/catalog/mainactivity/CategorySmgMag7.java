package skin.catalog.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CategorySmgMag7 extends AppCompatActivity {

    ImageView mag7justice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categorysmgmag7skins);

        mag7justice = (ImageView) findViewById(R.id.mag7justice);
        //
        //

        mag7justice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategorySmgMag7.this, Mag7Justice.class);
                startActivity(i);
            }
        });
    }
}
