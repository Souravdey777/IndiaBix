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
public class ElectronicsAndCommunicationEngineering extends ListActivity {
    String[] EC_engineering_menu ={"Materials and Components"
    ,"Networks Analysis and Synthesis"
    ,"Measurements and Instrumentation"
    ,"Analog Electronics"
    ,"Automatic Control Systems"
    ,"Radio Receivers"
    ,"Satellite Communication"
    ,"Signals and Systems"
    ,"Exam Questions Papers"
    ,"Electronic Devices and Circuits"
    ,"Electromagnetic Field Theory"
    ,"Power Electronics"
    ,"Digital Electronics"
    ,"Communication Systems"
    ,"Microwave Communication"
    ,"Microprocessors"
    ,"Matching Questions"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1, EC_engineering_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(ElectronicsAndCommunicationEngineering.this,WEBVIEW11.class);
        i.putExtra("option",position);
        startActivity(i);

    }
}
