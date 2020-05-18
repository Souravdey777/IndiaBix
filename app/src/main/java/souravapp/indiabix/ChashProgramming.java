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
public class ChashProgramming extends ListActivity {
    String[] Chash_programming_menu ={".NET Framework",
            "Control Instructions",
            "Functions and Subroutines",
            "Constructors",
            "Arrays",
            "Structures",
            "Properties",
            "Exception Handling",
            "Interfaces",
            "Delegates",
            "Generics",
            "Datatypes",
            "Operators",
            "Classes and Objects",
            "Inheritance",
            "Strings",
            "Enumerations",
            "Namespaces",
            "Polymorphism",
            "Collection Classes",
            "Attributes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1, Chash_programming_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(ChashProgramming.this,WEBVIEW17.class);
        i.putExtra("option",position);
        startActivity(i);

    }
}

