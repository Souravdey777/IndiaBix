package souravapp.indiabix;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by SOURAV on 2/9/2017.
 */
public class LogicalReasoning extends ListActivity {
    String[] logical_reasoning_menu={"Number Series","Verbal Classification","Analogies","Matching Definitions",
            "Verbal Reasoning","Logical Games","Statement and Assumption","Statement and Conclusion","Cause and Effect",
            "Logical Deduction","Letter and Symbol Series","Essential Part","Artificial Language","Making Judgements",
            "Logical Problems","Analyzing Arguments","Course of Action","Theme Detection","Statement and Argument"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,logical_reasoning_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(LogicalReasoning.this,WEBVIEW4.class);
        i.putExtra("option",position);
        startActivity(i);

    }
}
