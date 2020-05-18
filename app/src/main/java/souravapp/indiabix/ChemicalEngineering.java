package souravapp.indiabix;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by SOURAV on 2/21/2017.
 */
public class ChemicalEngineering extends ListActivity {
    String[] CS_engineering_menu ={"Chemical Engineering Basics"
            ,"Heat Transfer"
            ,"Mass Transfer"
            ,"Fertiliser Technology"
            ,"Stoichiometry"
            ,"Chemical Engineering Thermodynamics"
            ,"Fuels and Combustion"
            ,"Process Equipment and Plant Design"
            ,"Nuclear Power Engineering"
            ,"Refractory Technology"
            ,"Polymer Technology"
            ,"Fluid Mechanics"
            ,"Mechanical Operations"
            ,"Petroleum Refinery Engineering"
            ,"Chemical Process"
            ,"Process Control and Instrumentation"
            ,"Chemical Reaction Engineering"
            ,"Materials and Construction"
            ,"Chemical Engineering Plant Economics"
            ,"Furnace Technology"
            ,"Environmental Engineering"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1, CS_engineering_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(ChemicalEngineering.this,WEBVIEW14.class);
        i.putExtra("option",position);
        startActivity(i);

    }
}