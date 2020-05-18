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
public class ComputerScienceEngineering extends ListActivity {
    String[] CS_engineering_menu ={"Computer Fundamentals",
            "Computer Hardware",
            "Operating Systems Concepts",
            "Disk Operating System (DOS)",
            "Unix",
            "Linux",
            "Networking",
            "Windows NT",
            "Windows 2000 Server",
            "Artificial Intelligence",
            "Database Systems",
            "Management Information Systems",
            "System Analysis and Design",
            "Automation System",
            "Digital Computer Electronics",
            "Electronic Principles",
            "Language Processors",
            "Object Oriented Programming Using C++"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1, CS_engineering_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(ComputerScienceEngineering.this,WEBVIEW13.class);
        i.putExtra("option",position);
        startActivity(i);

    }
}
