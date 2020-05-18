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
public class CppProgramming extends ListActivity {
    String[] Cpp_programming_menu ={"OOPS Concepts",
            "References",
            "Constructors and Destructors",
            "Function Overloading",
            "Friend Functions",
            "File Handling",
            "Templates",
            "Functions",
            "Objects and Classes",
            "Memory Management",
            "Operator Overloading",
            "Inheritance",
            "Exception Handling"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1, Cpp_programming_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(CppProgramming.this,WEBVIEW16.class);
        i.putExtra("option",position);
        startActivity(i);

    }
}
