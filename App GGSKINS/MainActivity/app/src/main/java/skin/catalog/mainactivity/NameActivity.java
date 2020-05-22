package skin.catalog.mainactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class NameActivity extends AppCompatActivity {

    EditText edtID,edtNombre, edtWear,edtPrice,edtMarket;
    Button btnBuscar,btnAgregar;

    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        edtNombre=(EditText)findViewById(R.id.edtNombre);
        edtWear=(EditText)findViewById(R.id.edtWear);
        edtID=(EditText)findViewById(R.id.edtID);
        edtPrice=(EditText)findViewById(R.id.edtPrice);
        edtMarket=(EditText)findViewById(R.id.edtMarket);

        btnBuscar=(Button)findViewById(R.id.btnBuscar);
        btnAgregar=(Button)findViewById(R.id.btnAgregar);

        btnBuscar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                buscarItem("http://martinpoot.atwebpages.com/buscar_producto.php?id="+edtID.getText()+"");
            }
        });

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ejecutarServicio("http://martinpoot.atwebpages.com/insertar_producto.php");
            }
        });
    }

    private void ejecutarServicio(String URL){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "Operacion exitosa", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),error.toString(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError{
                Map<String, String> parametros = new HashMap<>();
                parametros.put("name",edtNombre.getText().toString());
                parametros.put("id",edtID.getText().toString());
                parametros.put("casename",edtWear.getText().toString());
                parametros.put("price",edtPrice.getText().toString());
                parametros.put("market",edtMarket.getText().toString());
                return parametros;
            }

        };
        requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void buscarItem(String URL){
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i = 0 ; i < response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);
                        edtNombre.setText(jsonObject.getString("name"));
                        edtWear.setText(jsonObject.getString("wear"));
                        edtPrice.setText(jsonObject.getString("price"));
                        edtMarket.setText(jsonObject.getString("market"));
                    } catch (JSONException e) {
                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),"error "+edtID.getText(),Toast.LENGTH_SHORT).show();
            }
        }
        );
        requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);
    }

}