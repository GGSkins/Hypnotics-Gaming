package skin.catalog.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryRiflesAk47 extends AppCompatActivity {

    ImageView ak47asiimov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categoryriflesak47skins);

        ak47asiimov = (ImageView) findViewById(R.id.ak47asiimov);
        //
        //

        ak47asiimov.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategoryRiflesAk47.this, Ak47Asiimov.class);
                startActivity(i);
            }
        });
    }
}
