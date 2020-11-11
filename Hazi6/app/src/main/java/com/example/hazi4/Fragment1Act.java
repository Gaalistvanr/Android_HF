package com.example.hazi4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class Fragment1Act extends Fragment {
    protected static final String FRAG2 = "2";
    String[] nameArray = {"EUR", "USD", "GPB", "AUD", "CAD", "CHF", "DKK", "HUF"};

    String[] infoArray = {"Euro", "Dollar american", "Lira sterliana", "Dollar australian", "Dollar canadian", "Franc elvetian", "Corona daneza", "Forint magyar"};

    String[] buyingArray = {"4,4100", "3,9750", "6,1250", "2,9600", "3,0950", "4,2300", "0,5850", "0,0136"};

    String[] sellingArray = {"4,5500", "3,9750", "6,3550", "3,0600", "3,2650", "4,3300", "0,6150", "0,0146"};

    Integer[] imageArray = {
            R.drawable.euro, R.drawable.usa, R.drawable.uk, R.drawable.australia, R.drawable.canada, R.drawable.switzerland, R.drawable.denmark, R.drawable.hungary
    };

    ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Context c = getActivity();
        View vw = inflater.inflate(R.layout.fragment1, container, false);
        CustomListAdapter customListAdapter = new CustomListAdapter(c, imageArray, nameArray, infoArray, buyingArray, sellingArray);
        listView = (ListView) vw.findViewById(R.id.listviewID);
        listView.setAdapter(customListAdapter);
        final FragmentManager fragmentManager = getFragmentManager();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                if(fragmentManager.findFragmentByTag(FRAG2)!=null){
                    TextView textc=(TextView) getActivity().findViewById(R.id.Cumpara);
                    TextView textv=(TextView) getActivity().findViewById(R.id.Vinde);
                    TextView texta=(TextView) getActivity().findViewById(R.id.A);
                    TextView textb=(TextView) getActivity().findViewById(R.id.B);

                    TextView textview3=(TextView) v.findViewById(R.id.textView3);
                    TextView textview4=(TextView) v.findViewById(R.id.textView4);
                    TextView textview5=(TextView) v.findViewById(R.id.textView5);
                    TextView textview6=(TextView) v.findViewById(R.id.textView6);

                    textc.setText(textview3.getText());
                    textv.setText(textview4.getText());
                    texta.setText(textview5.getText());
                    textb.setText(textview6.getText());

                    texta.setVisibility(View.VISIBLE);
                    textb.setVisibility(View.VISIBLE);
                    textc.setVisibility(View.VISIBLE);
                    textv.setVisibility(View.VISIBLE);

                } else {
                    Intent intent = new Intent(getActivity().getApplicationContext(),  ShowItemActivity.class);
                    TextView textview3=(TextView) v.findViewById(R.id.textView3);
                    TextView textview4=(TextView) v.findViewById(R.id.textView4);
                    TextView textview5=(TextView) v.findViewById(R.id.textView5);
                    TextView textview6=(TextView) v.findViewById(R.id.textView6);
                    Bundle bun = new Bundle();
                    String selectedItem1 = textview3.getText().toString().trim();
                    String selectedItem2 = textview4.getText().toString().trim();
                    String selectedItem3 = textview5.getText().toString().trim();
                    String selectedItem4 = textview6.getText().toString().trim();
                    bun.putString("item1",selectedItem1);
                    bun.putString("item2",selectedItem2);
                    bun.putString("item3",selectedItem3);
                    bun.putString("item4",selectedItem4);
                    intent.putExtras(bun);

                    startActivity(intent);
                }
            }
        });

        return  vw;
    }

}
