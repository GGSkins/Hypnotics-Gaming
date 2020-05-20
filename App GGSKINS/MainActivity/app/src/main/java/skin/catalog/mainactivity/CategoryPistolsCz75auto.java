package skin.catalog.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryPistolsCz75auto extends AppCompatActivity {

    ImageView cz75autoeco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categorypistolscz75autoskins);

        cz75autoeco = (ImageView) findViewById(R.id.cz75autoeco);
        //
        //

        cz75autoeco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategoryPistolsCz75auto.this, Cz75autoEco.class);
                startActivity(i);
            }
        });
    }
}
