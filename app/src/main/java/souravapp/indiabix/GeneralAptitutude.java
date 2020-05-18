package souravapp.indiabix;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by SOURAV on 2/7/2017.
 */
public class GeneralAptitutude extends ListActivity{
    String[] general_aptitude_menu={"Arithmetic Aptitude","Data Interpretation"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,general_aptitude_menu));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(position==0){
            Intent i = new Intent(GeneralAptitutude.this, ArithematicAptitude.class);
            startActivity(i);
        }
        if(position==1){
            Intent i = new Intent(GeneralAptitutude.this, DataInterpretation.class);
            startActivity(i);
        }
    }
}
