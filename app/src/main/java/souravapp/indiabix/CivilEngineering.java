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
public class CivilEngineering extends ListActivity {
    String[] civil_engineering_menu ={"Building Materials","Surveying","Soil Mechanics and Foundation Engineering",
            "Applied Mechanics","Hydraulics","Waste Water Engineering","RCC Structures Design", "Irrigation",
            "Railways","Construction Management","Theory of Structures","Estimating and Costing",
            "Docks and Harbours","Elements of Remote Sensing","UPSC Civil Service Exam Questions",
            "Building Construction","Concrete Technology","Advanced Surveying","Strength of Materials",
            "Water Resources Engineering","Water Supply Engineering","Steel Structure Design","Highway Engineering",
            "Airport Engineering","SI Units","Structural Design Specifications","Tunnelling","Engineering Economy",
            "GATE Exam Questions"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1, civil_engineering_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(CivilEngineering.this,WEBVIEW9.class);
        i.putExtra("option",position);
        startActivity(i);

    }
}
