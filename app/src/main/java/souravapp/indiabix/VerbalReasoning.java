package souravapp.indiabix;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by SOURAV on 2/11/2017.
 */
public class VerbalReasoning extends ListActivity {
    String[] verbal_reasoning_menu={"Logical Sequence of Words","Syllogism","Cause and Effect","Venn Diagram",
            "Analogy","Character Puzzles","Classification","Arithmetic Reasoning","Blood Relation Test",
            "Series Completion","Dice","Cube and Cuboid","Seating Arrangement","Direction Sense Test",
            "Data Sufficiency","Verification of Truth"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,verbal_reasoning_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(VerbalReasoning.this,WEBVIEW5.class);
        i.putExtra("option",position);
        startActivity(i);

    }
}

