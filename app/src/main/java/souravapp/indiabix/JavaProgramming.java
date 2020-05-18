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
public class JavaProgramming extends ListActivity {
    String[] java_programming_menu ={"Language Fundamentals",
            "Operators and Assignments",
            "Exceptions",
            "Inner Classes",
            "Garbage Collections",
            "Java.lang Class",
            "Declarations and Access Control",
            "Flow Control",
            "Objects and Collections",
            "Threads",
            "Assertions"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1, java_programming_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(JavaProgramming.this,WEBVIEW18.class);
        i.putExtra("option",position);
        startActivity(i);

    }
}

