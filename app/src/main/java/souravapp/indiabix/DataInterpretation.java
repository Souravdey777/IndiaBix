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
public class DataInterpretation extends ListActivity {
    String[] data_interpretation_menu = {"Table Charts", "Pie Charts", "Bar Charts", "Line Charts"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, data_interpretation_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(DataInterpretation.this, WEBVIEW2.class);
        i.putExtra("option", position);
        startActivity(i);


    }
}