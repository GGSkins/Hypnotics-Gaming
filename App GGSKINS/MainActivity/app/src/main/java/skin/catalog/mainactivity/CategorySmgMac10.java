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

public class CategorySmgMac10 extends AppCompatActivity {

    ImageView mac10candyapple;
    private RecyclerView recyclerViewItem;
    private RecyclerViewAdaptador adaptadorItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categorysmgmac10skins);

        mac10candyapple = (ImageView) findViewById(R.id.mac10candyapple);

        recyclerViewItem=(RecyclerView) findViewById(R.id.recyclerMac10);
        recyclerViewItem.setLayoutManager(new LinearLayoutManager(this));

        adaptadorItem=new RecyclerViewAdaptador(getItem());
        recyclerViewItem.setAdapter(adaptadorItem);

        mac10candyapple.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategorySmgMac10.this, Ak47Asiimov.class);
                startActivity(i);
            }
        });
    }
    public List<ItemModel> getItem(){
        List<ItemModel> item= new ArrayList<>();
        item.add(new ItemModel("Candy Apple","Text","Text","Text","Text",R.drawable.mac10candyapple));
        item.add(new ItemModel("Indigo","Text","Text","Text","Text",R.drawable.mac10indigo));
        return  item;
    }
}
