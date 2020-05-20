package skin.catalog.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryHeavysMac10 extends AppCompatActivity {

    ImageView mac10candyapple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categoryheavysmac10skins);

        mac10candyapple = (ImageView) findViewById(R.id.mac10candyapple);
        //
        //

        mac10candyapple.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategoryHeavysMac10.this, Mac10CandyApple.class);
                startActivity(i);
            }
        });
    }
}
