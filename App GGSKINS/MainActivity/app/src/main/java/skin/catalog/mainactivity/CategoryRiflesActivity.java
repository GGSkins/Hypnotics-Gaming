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

public class CategoryRiflesActivity extends AppCompatActivity {

    ImageView botonAwp,botonAk47,botonM4a4;

    private RecyclerView recyclerViewItem;
    private RecyclerViewAdaptador adaptadorItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoryrifles);

        botonAwp = (ImageView) findViewById(R.id.botonAwp);
        botonAk47 = (ImageView) findViewById(R.id.botonAk47);
        botonM4a4 = (ImageView) findViewById(R.id.botonM4a4);

        recyclerViewItem=(RecyclerView) findViewById(R.id.recyclerRifles);
        recyclerViewItem.setLayoutManager(new LinearLayoutManager(this));

        adaptadorItem=new RecyclerViewAdaptador(getItem());
        recyclerViewItem.setAdapter(adaptadorItem);

        botonAk47.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategoryRiflesActivity.this, CategoryRiflesAk47.class);
                startActivity(i);
            }
        });
        botonAwp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategoryRiflesActivity.this, CategoryRiflesAwp.class);
                startActivity(i);
            }
        });
        botonM4a4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategoryRiflesActivity.this, CategoryRiflesM4a4.class);
                startActivity(i);
            }
        });

    }
    public List<ItemModel> getItem(){
        List<ItemModel> item= new ArrayList<>();
        item.add(new ItemModel("AWP","Text","Text","Text","Text",R.drawable.awpacheron));
        item.add(new ItemModel("AK47","Text","Text","Text","Text",R.drawable.ak47asiimov));
        item.add(new ItemModel("M4A4","Text","Text","Text","Text",R.drawable.m4a4evildaimyo));
        return  item;
    }
}
