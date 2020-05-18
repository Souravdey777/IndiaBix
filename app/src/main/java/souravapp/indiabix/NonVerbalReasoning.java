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
public class NonVerbalReasoning extends ListActivity {
    String[] non_verbal_reasoning_menu={"Series","Classification","Mirror Image","Embedded Image",
            "Figure Matrix","Paper Cutting","Grouping of Images","Shape Construction","Cubes and Dice",
            "Analogy","Analytical Reasoning","Water Images","PatternCompletion","Paper Folding",
            "Rule Detection","Dot Situation","Image Analysis"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,non_verbal_reasoning_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(NonVerbalReasoning.this,WEBVIEW6.class);
        i.putExtra("option",position);
        startActivity(i);

    }
}
