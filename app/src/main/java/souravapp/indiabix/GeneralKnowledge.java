package souravapp.indiabix;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by SOURAV on 2/14/2017.
 */
public class GeneralKnowledge extends ListActivity {
    String[] general_knowledge_menu = {"Basic General Knowledge", "General Science", "Indian Politics", "World Geography",
            "Chemistry", "Indian Geography", "Honours and Awards", "Technology", "Indian Culture", "World Organisations",
            "Indian History", "Famous Personalities", "Physics", "Indian Economy", "Inventions", "Biology",
            "Famous Places in India", "Books and Authors", "Sports", "Days and Years"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, general_knowledge_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(GeneralKnowledge.this, WEBVIEW7.class);
        i.putExtra("option", position);
        startActivity(i);

    }
}
