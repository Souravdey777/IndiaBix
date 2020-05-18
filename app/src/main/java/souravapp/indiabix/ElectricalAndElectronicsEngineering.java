package souravapp.indiabix;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by SOURAV on 2/20/2017.
 */
public class ElectricalAndElectronicsEngineering  extends ListActivity {
    String[] EE_engineering_menu ={"Quantities and Units"
            ,"Ohm's Law"
            ,"Series Circuits"
            ,"Series-Parallel Circuits"
            ,"Branch, Loop and Node Analyses"
            ,"Alternating Current and Voltage"
            ,"Inductors"
            ,"RC Circuits"
            ,"RLC Circuits and Resonance"
            ,"Circuit Theorems in AC Analysis"
            ,"Three-Phase Systems in Power Applications"
            ,"Voltage, Current and Resistance"
            ,"Energy and Power"
            ,"Parallel Circuits"
            ,"Circuit Theorems and Conversions"
            ,"Magnetism and Electromagnetism"
            ,"Capacitors"
            ,"Transformers"
            ,"RL Circuits"
            ,"Passive Filters"
            ,"Time Response of Reactive Circuits"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1, EE_engineering_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(ElectricalAndElectronicsEngineering.this,WEBVIEW12.class);
        i.putExtra("option",position);
        startActivity(i);

    }
}