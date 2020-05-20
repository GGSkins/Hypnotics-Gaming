package skin.catalog.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryHeavysActivity extends AppCompatActivity {

    ImageView heavysmac10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoryheavys);

        heavysmac10 = (ImageView) findViewById(R.id.heavysmac10);
        //
        //

        heavysmac10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategoryHeavysActivity.this, CategoryHeavysMac10.class);
                startActivity(i);
            }
        });

    }
}
