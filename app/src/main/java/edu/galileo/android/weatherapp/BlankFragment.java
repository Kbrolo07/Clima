package edu.galileo.android.weatherapp;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.OnClick;

import static android.widget.Toast.*;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BlankFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class BlankFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    public BlankFragment() {
        // Required empty public constructor
    }
    private final static String TAG = "BlankFragment";
    @Bind(R.id.inputCity)
    EditText inputCity;
    ImageView imageView;

    TextView textview;
    TextView textview2;
    TextView textview3;
    TextView textview4;
    TextView textview5;
    TextView textview6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        imageView = (ImageView) view.findViewById(R.id.imageView);
        textview = (TextView) view.findViewById(R.id.textView);
        textview2 = (TextView) view.findViewById(R.id.textView2);
        textview3 = (TextView) view.findViewById(R.id.textView3);
        textview4 = (TextView) view.findViewById(R.id.textView4);
        textview5 = (TextView) view.findViewById(R.id.textView5);
        textview6 = (TextView) view.findViewById(R.id.textView6);



        return view;

    }

    @OnClick(R.id.btnSubmit)
    public void handleClick() {
        String strInput = inputCity.getText().toString();
        Log.e(TAG, strInput);
        makeText(getActivity(), "Buscando Información en el Fragmento", LENGTH_SHORT).show();
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

        // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
