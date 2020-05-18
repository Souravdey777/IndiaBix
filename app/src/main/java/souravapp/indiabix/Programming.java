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
public class Programming extends ListActivity {
    String[] programming_menu ={"C Programming",
            "C++ Programming",
            "C# Programming",
            "Java Programming"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1, programming_menu));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(position==0){
            Intent i = new Intent(Programming.this, CProgramming.class);
            startActivity(i);
        }
        if(position==1){
            Intent i = new Intent(Programming.this, CppProgramming.class);
            startActivity(i);
        }
        if(position==2){
            Intent i = new Intent(Programming.this, ChashProgramming.class);
            startActivity(i);
        }
        if(position==3){
            Intent i = new Intent(Programming.this, JavaProgramming.class);
            startActivity(i);
        }
    }
}
