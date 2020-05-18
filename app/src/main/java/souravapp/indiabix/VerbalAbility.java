package souravapp.indiabix;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by SOURAV on 2/7/2017.
 */
public class VerbalAbility extends ListActivity {
    String[] verbal_ability_menu={"Spotting Errors","Antonyms","Spellings","Ordering of Words",
            "Sentence Improvement","Ordering of Sentences","Closet Test","One Word Substitutes","Change of Voice","Verbal Analogies",
            "Synonyms","Selecting Words","Sentence Formation","Sentence Correction","Completing Statements","Paragraph Formation",
            "Comprehension","Idioms and Phrases","Change of Speech"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,verbal_ability_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(VerbalAbility.this,WEBVIEW3.class);
        i.putExtra("option",position);
        startActivity(i);

    }
}
