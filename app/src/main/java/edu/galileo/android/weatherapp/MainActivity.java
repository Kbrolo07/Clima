package edu.galileo.android.weatherapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements OnItemClickListener, View.OnClickListener, BlankFragment.OnFragmentInteractionListener {
    private final static String TAG = "MainActivity";
    @Bind(R.id.inputCity) EditText inputCity;
    ImageView imageView;

    TextView textview;
    TextView textview2;
    TextView textview3;
    TextView textview4;
    TextView textview5;
    TextView textview6;

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.sol);

        textview = (TextView) findViewById(R.id.textView);
        textview2 = (TextView) findViewById(R.id.textView2);
        textview3 = (TextView) findViewById(R.id.textView3);
        textview4 = (TextView) findViewById(R.id.textView4);
        textview5 = (TextView) findViewById(R.id.textView5);
        textview6 = (TextView) findViewById(R.id.textView6);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String[] dataset = new String[]{"Guatemala", "Peten", "Huehuetenango", "Quiche", "AltaVerapaz","Izabal" };
        MyAdapter adapter = new MyAdapter(dataset);
        adapter.setOnItemClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @OnClick(R.id.btnSubmit)
    public void handleClick(){
        String strInput = inputCity.getText().toString();
        Log.e(TAG, strInput);
        Toast.makeText(MainActivity.this, "Buscando Información", Toast.LENGTH_SHORT).show();
       // CODIGO QUE NO ESTABA VISIBLE LO PONGO VISIBLE
        textview.setVisibility(View.VISIBLE);
        textview2.setVisibility(View.VISIBLE);
        textview3.setVisibility(View.VISIBLE);
        textview4.setVisibility(View.VISIBLE);
        textview5.setVisibility(View.VISIBLE);
        textview6.setVisibility(View.VISIBLE);
        imageView.setVisibility(View.VISIBLE);
        // CODIGO QUE NO ESTABA VISIBLE LO PONGO VISIBLE

        // TEXTO E IMAGENES POR DEFECTO
        textview.setText("?°C");
        imageView.setImageResource(R.drawable.interrogante);
        textview2.setText("?");
        textview3.setText("Min: ?°C");
        textview4.setText("Max: ?°C");
        textview5.setText("Salida de sol: ? AM");
        textview6.setText("Puesta de sol: ? PM");
        // TEXTO E IMAGENES POR DEFECTO

        //Quitando espacios y mayusculas
        strInput = strInput.toLowerCase();
        strInput = strInput.replace(" ", "");
        //Quitando espacios y mayusculas

        if (strInput.equals("guatemala")) {
            textview.setText("20°C");
            imageView.setImageResource(R.drawable.sol);
            textview2.setText("Mayormente Soleado");
            textview3.setText("Min: 14°C");
            textview4.setText("Max: 26°C");
            textview5.setText("Salida de sol: 6:17 AM");
            textview6.setText("Puesta de sol: 18:11 PM");
        }

        if (strInput.equals("peten")) {
            textview.setText("28°C");
            imageView.setImageResource(R.drawable.nublado);
            textview2.setText("Mayormente Nublado");
            textview3.setText("Min: 20°C");
            textview4.setText("Max: 29°C");
            textview5.setText("Salida de sol: 6:17 AM");
            textview6.setText("Puesta de sol: 18:11 PM");
        }

        if (strInput.equals("huehuetenango")) {
            textview.setText("28°C");
            imageView.setImageResource(R.drawable.sol);
            textview2.setText("Mayormente Soleado");
            textview3.setText("Min: 11°C");
            textview4.setText("Max: 28°C");
            textview5.setText("Salida de sol: 6:17 AM");
            textview6.setText("Puesta de sol: 18:11 PM");
        }

        if (strInput.equals("quiche")) {
            textview.setText("23°C");
            imageView.setImageResource(R.drawable.tormenta);
            textview2.setText("Ligeras tormetas electricas y lluvias");
            textview3.setText("Min: 8°C");
            textview4.setText("Max: 24°C");
            textview5.setText("Salida de sol: 6:17 AM");
            textview6.setText("Puesta de sol: 18:11 PM");
        }

        if (strInput.equals("altaverapaz")) {
            textview.setText("21°C");
            imageView.setImageResource(R.drawable.nublado);
            textview2.setText("Mayormente Nublado");
            textview3.setText("Min: 9°C");
            textview4.setText("Max: 22°C");
            textview5.setText("Salida de sol: 6:17 AM");
            textview6.setText("Puesta de sol: 18:11 PM");
        }

        if (strInput.equals("izabal")) {
            textview.setText("28°C");
            imageView.setImageResource(R.drawable.sol);
            textview2.setText("Mayormente Soleado");
            textview3.setText("Min: 21°C");
            textview4.setText("Max: 28°C");
            textview5.setText("Salida de sol: 6:17 AM");
            textview6.setText("Puesta de sol: 18:11 PM");
        }

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemClick(String element) {
        Toast.makeText(getApplicationContext(), element, Toast.LENGTH_SHORT).show();
        Intent intent2  = new Intent(this, Reutilizo.class);
        startActivity(intent2);

        //FragmentManager fragmentManager = getFragmentManager();
        //FragmentTransaction transaction = fragmentManager.beginTransaction();
        //BlankFragment fragment= new BlankFragment();
        //transaction.add(R.id.fragment2, fragment);
        //transaction.commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
