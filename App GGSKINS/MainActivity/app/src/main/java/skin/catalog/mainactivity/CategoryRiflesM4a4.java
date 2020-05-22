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

public class CategoryRiflesM4a4 extends AppCompatActivity {

    ImageView ak47asiimov;
    private RecyclerView recyclerViewItem;
    private RecyclerViewAdaptador adaptadorItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categoryriflesm4a4skins);

        ak47asiimov = (ImageView) findViewById(R.id.ak47asiimov);

        recyclerViewItem=(RecyclerView) findViewById(R.id.recyclerm4a4);
        recyclerViewItem.setLayoutManager(new LinearLayoutManager(this));

        adaptadorItem=new RecyclerViewAdaptador(getItem());
        recyclerViewItem.setAdapter(adaptadorItem);

        ak47asiimov.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategoryRiflesM4a4.this, Ak47Asiimov.class);
                startActivity(i);
            }
        });
    }
    public List<ItemModel> getItem(){
        List<ItemModel> item= new ArrayList<>();
        item.add(new ItemModel("Evil Daimyo","Text","Text","Text","Text",R.drawable.m4a4evildaimyo));
        item.add(new ItemModel("The Emperor","Text","Text","Text","Text",R.drawable.m4a4theemperor));
        return  item;
    }
}
