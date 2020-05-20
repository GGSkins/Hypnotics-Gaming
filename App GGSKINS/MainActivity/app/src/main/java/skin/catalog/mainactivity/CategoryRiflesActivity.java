package skin.catalog.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryRiflesActivity extends AppCompatActivity {

    ImageView riflesak47;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoryrifles);

        riflesak47 = (ImageView) findViewById(R.id.riflesak47);
        //
        //

        riflesak47.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategoryRiflesActivity.this, CategoryRiflesAk47.class);
                startActivity(i);
            }
        });

    }

}
