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
public class CProgramming extends ListActivity {
    String[] C_programming_menu ={"Declarations and Initializations",
            "Expressions",
            "Functions",
            "Pointers",
            "Strings",
            "Input / Output",
            "Bitwise Operators",
            "Const",
            "Variable Number of Arguments",
            "Library Functions",
            "Control Instructions",
            "Floating Point Issues",
            "C Preprocessor",
            "Arrays",
            "Structures, Unions, Enums",
            "Command Line Arguments",
            "Typedef",
            "Memory Allocation",
            "Complicated Declarations"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1, C_programming_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(CProgramming.this,WEBVIEW15.class);
        i.putExtra("option",position);
        startActivity(i);

    }
}
