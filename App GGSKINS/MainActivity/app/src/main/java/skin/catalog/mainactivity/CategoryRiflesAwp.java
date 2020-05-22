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

public class CategoryRiflesAwp extends AppCompatActivity {

    ImageView ak47asiimov;
    private RecyclerView recyclerViewItem;
    private RecyclerViewAdaptador adaptadorItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categoryriflesawpskins);

        ak47asiimov = (ImageView) findViewById(R.id.ak47asiimov);

        recyclerViewItem=(RecyclerView) findViewById(R.id.recyclerawp);
        recyclerViewItem.setLayoutManager(new LinearLayoutManager(this));

        adaptadorItem=new RecyclerViewAdaptador(getItem());
        recyclerViewItem.setAdapter(adaptadorItem);

        ak47asiimov.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategoryRiflesAwp.this, Ak47Asiimov.class);
                startActivity(i);
            }
        });
    }
    public List<ItemModel> getItem(){
        List<ItemModel> item= new ArrayList<>();
        item.add(new ItemModel("Acheron","Text","Text","Text","Text",R.drawable.awpacheron));
        item.add(new ItemModel("BOOM","Text","Text","Text","Text",R.drawable.awpboom));
        return  item;
    }
}
