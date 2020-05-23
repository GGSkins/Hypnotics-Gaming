package skin.catalog.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CategorySmgActivity extends AppCompatActivity {

    ImageView mag7,botonmMac10,botonMp9;

    private RecyclerView recyclerViewItem;
    private RecyclerViewAdaptador adaptadorItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorysmg);

        mag7 = (ImageView) findViewById(R.id.mag7);
        botonmMac10 = (ImageView)findViewById(R.id.botonMac10);
        botonMp9 = (ImageView)findViewById(R.id.botonMp9);

        recyclerViewItem=(RecyclerView) findViewById(R.id.recyclersSmg);
        recyclerViewItem.setLayoutManager(new LinearLayoutManager(this));

        adaptadorItem=new RecyclerViewAdaptador(getItem());
        recyclerViewItem.setAdapter(adaptadorItem);
        //
        //

        mag7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategorySmgActivity.this, CategorySmgMag7.class);
                startActivity(i);
            }
        });

        botonmMac10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategorySmgActivity.this, CategorySmgMac10.class);
                startActivity(i);
            }
        });

        botonMp9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategorySmgActivity.this, CategorySmgMp9.class);
                startActivity(i);
            }
        });


    }
    public List<ItemModel> getItem(){
        List<ItemModel> item= new ArrayList<>();
        item.add(new ItemModel("MAC-10","Text","Text","Text","Text",R.drawable.mac10candyapple));
        item.add(new ItemModel("MP9","Text","Text","Text","Text",R.drawable.mp9hydra));
        item.add(new ItemModel("UMP-45","Text","Text","Text","Text",R.drawable.ump45plastique));
        return  item;
    }
}
