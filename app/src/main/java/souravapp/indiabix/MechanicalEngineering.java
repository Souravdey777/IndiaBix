package souravapp.indiabix;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by SOURAV on 2/19/2017.
 */
public class MechanicalEngineering extends ListActivity {
    String[] mechanical_engineering_menu ={"Engineering Mechanics","Hydraulics and Fluid Mechanics","Thermodynamics","Steam Nozzles and Turbines",
            "IC Engines and Nuclear Power Plants","Compressors, Gas Dynamics and Gas Turbines","Heat Transfer, Refrigeration and Air Conditioning",
            "Production Engineering","Industrial Engineering and Production Management","Strength of Materials","Hydraulic Machines",
            "Steam Boilers and Engines","Machine Design","Engineering Materials","Theory of machines","Workshop Technology","Automobile Engineering"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1, mechanical_engineering_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(MechanicalEngineering.this,WEBVIEW8.class);
        i.putExtra("option",position);
        startActivity(i);

    }
}

