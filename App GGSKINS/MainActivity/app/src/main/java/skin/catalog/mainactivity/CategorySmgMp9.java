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

public class CategorySmgMp9 extends AppCompatActivity {

    ImageView mac10candyapple;

    private RecyclerView recyclerViewItem;
    private RecyclerViewAdaptador adaptadorItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categorysmgmp9skins);

        mac10candyapple = (ImageView) findViewById(R.id.mp9hydra);

        recyclerViewItem=(RecyclerView) findViewById(R.id.recyclerMp9);
        recyclerViewItem.setLayoutManager(new LinearLayoutManager(this));

        adaptadorItem=new RecyclerViewAdaptador(getItem());
        recyclerViewItem.setAdapter(adaptadorItem);

        mac10candyapple.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategorySmgMp9.this, Ak47Asiimov.class);
                startActivity(i);
            }
        });

    }
    public List<ItemModel> getItem(){
        List<ItemModel> item= new ArrayList<>();
        item.add(new ItemModel("Hydra","Text","Text","Text","Text",R.drawable.mp9hydra));
        item.add(new ItemModel("Modest Threat","Text","Text","Text","Text",R.drawable.mp9modestthreat));
        return  item;
    }
}
