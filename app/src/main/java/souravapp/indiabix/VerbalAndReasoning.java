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
public class VerbalAndReasoning extends ListActivity {
    String[] general_aptitude_menu={"Verbal Ability","Logical Reasoning","Verbal Reasoning","Non Verbal Reasoning"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,general_aptitude_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(position==0){
            Intent i = new Intent(VerbalAndReasoning.this, VerbalAbility.class);
            startActivity(i);
        }
        if(position==1){
            Intent i = new Intent(VerbalAndReasoning.this, LogicalReasoning.class);
            startActivity(i);
        }
        if(position==2){
            Intent i = new Intent(VerbalAndReasoning.this, VerbalReasoning.class);
            startActivity(i);
        }
        if(position==3){
            Intent i = new Intent(VerbalAndReasoning.this,NonVerbalReasoning.class);
            startActivity(i);
        }
    }
}
