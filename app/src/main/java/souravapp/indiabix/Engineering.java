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
public class Engineering extends ListActivity {
    String[] engineering_menu ={"Mechanical Engineering","Civil Engineering","Electronics and Communication Engineering",
            "Electrical and Electronics Engineering", "Computer Science Engineering", "Chemical Engineering"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1, engineering_menu));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(position==0){
            Intent i = new Intent(Engineering.this, MechanicalEngineering.class);
            startActivity(i);
        }
        if(position==1){
            Intent i = new Intent(Engineering.this, CivilEngineering.class);
            startActivity(i);
        }
        if(position==2){
            Intent i = new Intent(Engineering.this, ElectronicsAndCommunicationEngineering.class);
            startActivity(i);
        }
        if(position==3){
            Intent i = new Intent(Engineering.this, ElectricalAndElectronicsEngineering.class);
            startActivity(i);
        }
        if(position==4){
            Intent i = new Intent(Engineering.this, ComputerScienceEngineering.class);
            startActivity(i);
        }
        if(position==5){
            Intent i = new Intent(Engineering.this, ChemicalEngineering.class);
            startActivity(i);
        }
    }
}
