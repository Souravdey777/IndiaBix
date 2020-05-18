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
public class ArithematicAptitude extends ListActivity {
    String[] arithematic_aptitude_menu={"Problems on Trains","Height and Distance","Simple Interest","Profit and Loss",
            "Percentage","Calender","Average","Volume and Surface Area","Numbers","Problems of H.C.F. and L.C.M.","Simplification",
            "Surds and Indices","Chain Rule","Boats and Streams","Logarithm","Stocks and Shares","True Discount","Odd Man Out and Series",
            "Time and Distance","Time and Work","Compound Interest","Partnership","Problems on Ages","Clock","Area","Permutation and Combination",
            "Problems on Numbers","Decimal Fraction","Square Root and Cube Root","Ratio and Proportion","Pipes and Cistern"
            ,"Allegation or Mixture","Races and Games","Probability","Banker's Discount"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,arithematic_aptitude_menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(ArithematicAptitude.this,WEBVIEW.class);
        i.putExtra("option",position);
        startActivity(i);

    }
}
