package skin.catalog.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewItem;
    private RecyclerViewAdaptador adaptadorItem;

    ImageView categorymain;
    ImageView namemain;
    ImageView go;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewItem=(RecyclerView) findViewById(R.id.recyclerObject);
        recyclerViewItem.setLayoutManager(new LinearLayoutManager(this));
        categorymain = (ImageView) findViewById(R.id.categorymain);
        namemain = (ImageView) findViewById(R.id.namemain);


        adaptadorItem=new RecyclerViewAdaptador(getItem());
        recyclerViewItem.setAdapter(adaptadorItem);

        categorymain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, CategoryActivity.class);
                startActivity(i);
            }
        });
        namemain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, NameActivity.class);
                startActivity(i);
            }
        });


    }



    public List<ItemModel> getItem(){
        List<ItemModel> item= new ArrayList<>();
        item.add(new ItemModel("Assimov","Text","Text","Text","Text",R.drawable.asiimov));
        item.add(new ItemModel("Candy Apple","Text","Text","Text","Text",R.drawable.candyapple));
        item.add(new ItemModel("Distressed","Text","Text","Text","Text",R.drawable.distressed));
        item.add(new ItemModel("Doppler","Text","Text","Textd","Text",R.drawable.doppler));
        return  item;
    }
}
