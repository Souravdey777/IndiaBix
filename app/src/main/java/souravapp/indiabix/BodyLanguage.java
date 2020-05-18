package souravapp.indiabix;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by SOURAV on 2/25/2017.
 */
public class BodyLanguage extends ListActivity {
    String[] Body_Language_menu ={"Basic understanding",
            "Territories and zones",
            "Palm gestures",
            "Hand and arm gestures",
            "Hand to face gestures",
            "Arm barriers gestures",
            "Leg barriers gestures",
            "Popular gestures and actions",
            "Eye signal gestures",
            "Courtship signal gestures",
            "Cigars and glasses gestures",
            "Ownership gestures",
            "Mirror image gestures",
            "Body lowering gestures",
            "Pointing gestures"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1, Body_Language_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(BodyLanguage.this,WEBVIEW21.class);
        i.putExtra("option",position);
        startActivity(i);
    }
}