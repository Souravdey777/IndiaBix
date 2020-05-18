package souravapp.indiabix;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;

/**
 * Created by SOURAV on 2/21/2017.
 */
public class InterviewTechnical extends ListActivity {
    String[] Interview_Technical_menu ={"C Programming",
            "Data Structures",
            ".NET",
            "Software Testing",
            "Networking",
            "Operating Systems",
            "Java Programming",
            "Database Management",
            "Microsoft SQL Server",
            "UNIX",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1, Interview_Technical_menu));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        PopupMenu popupMenu = new PopupMenu(InterviewTechnical.this,v);
        if(position==0){
            popupMenu.getMenuInflater().inflate(R.menu.c_programming,popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Intent i = new Intent(InterviewTechnical.this, WEBVIEW20.class);
                    switch (item.getItemId()) {
                        case R.id.one:
                            i.putExtra("option", 1);
                            startActivity(i);
                            break;
                        case R.id.two:
                            i.putExtra("option", 2);
                            startActivity(i);
                            break;
                        case R.id.three:
                            i.putExtra("option", 3);
                            startActivity(i);
                            break;
                        case R.id.four:
                            i.putExtra("option", 4);
                            startActivity(i);
                            break;
                        case R.id.five:
                            i.putExtra("option", 5);
                            startActivity(i);
                            break;
                        case R.id.six:
                            i.putExtra("option", 6);
                            startActivity(i);
                            break;
                        case R.id.seven:
                            i.putExtra("option", 7);
                            startActivity(i);
                            break;
                        case R.id.eight:
                            i.putExtra("option", 8);
                            startActivity(i);
                            break;
                        case R.id.nine:
                            i.putExtra("option", 9);
                            startActivity(i);
                            break;
                        case R.id.ten:
                            i.putExtra("option", 10);
                            startActivity(i);
                            break;
                    }
                    return true;
                }
            });
            popupMenu.show();
        }
        if(position==1){
            popupMenu.getMenuInflater().inflate(R.menu.data_structures,popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Intent i = new Intent(InterviewTechnical.this, WEBVIEW20.class);
                    switch (item.getItemId()){
                        case R.id.one:
                            i.putExtra("option",11);
                            startActivity(i);
                            break;
                    }
                    return true;
                }
            });
            popupMenu.show();
        }
        if(position==2){
            popupMenu.getMenuInflater().inflate(R.menu.dot_net,popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Intent i = new Intent(InterviewTechnical.this, WEBVIEW20.class);
                    switch (item.getItemId()) {
                        case R.id.one:
                            i.putExtra("option", 12);
                            startActivity(i);
                            break;
                        case R.id.two:
                            i.putExtra("option", 13);
                            startActivity(i);
                            break;
                        case R.id.three:
                            i.putExtra("option", 14);
                            startActivity(i);
                            break;
                        case R.id.four:
                            i.putExtra("option", 15);
                            startActivity(i);
                            break;
                        case R.id.five:
                            i.putExtra("option", 16);
                            startActivity(i);
                            break;
                        case R.id.six:
                            i.putExtra("option", 17);
                            startActivity(i);
                            break;
                        case R.id.seven:
                            i.putExtra("option", 18);
                            startActivity(i);
                            break;
                        case R.id.eight:
                            i.putExtra("option", 19);
                            startActivity(i);
                            break;
                        case R.id.nine:
                            i.putExtra("option", 20);
                            startActivity(i);
                            break;
                        case R.id.ten:
                            i.putExtra("option", 21);
                            startActivity(i);
                            break;
                        case R.id.eleven:
                            i.putExtra("option", 22);
                            startActivity(i);
                            break;
                        case R.id.twelve:
                            i.putExtra("option", 23);
                            startActivity(i);
                            break;
                        case R.id.thirteen:
                            i.putExtra("option", 24);
                            startActivity(i);
                            break;
                        case R.id.fourteen:
                            i.putExtra("option", 25);
                            startActivity(i);
                            break;
                        case R.id.fifteen:
                            i.putExtra("option", 26);
                            startActivity(i);
                            break;
                    }
                    return true;
                }
            });
            popupMenu.show();
        }
        if(position==3){
            popupMenu.getMenuInflater().inflate(R.menu.software_testing,popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Intent i = new Intent(InterviewTechnical.this, WEBVIEW20.class);
                    switch (item.getItemId()){
                        case R.id.one:
                            i.putExtra("option", 27);
                            startActivity(i);
                            break;
                        case R.id.two:
                            i.putExtra("option", 28);
                            startActivity(i);
                            break;
                        case R.id.three:
                            i.putExtra("option", 29);
                            startActivity(i);
                            break;
                        case R.id.four:
                            i.putExtra("option", 30);
                            startActivity(i);
                            break;
                        case R.id.five:
                            i.putExtra("option", 31);
                            startActivity(i);
                            break;
                        case R.id.six:
                            i.putExtra("option", 32);
                            startActivity(i);
                            break;
                        case R.id.seven:
                            i.putExtra("option", 33);
                            startActivity(i);
                            break;
                        case R.id.eight:
                            i.putExtra("option", 34);
                            startActivity(i);
                            break;
                    }
                    return true;
                }
            });
            popupMenu.show();
        }
        if(position==4){
            popupMenu.getMenuInflater().inflate(R.menu.networking,popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Intent i = new Intent(InterviewTechnical.this, WEBVIEW20.class);
                    switch (item.getItemId()){
                        case R.id.one:
                            i.putExtra("option",35);
                            startActivity(i);
                            break;
                        case R.id.two:
                            i.putExtra("option",36);
                            startActivity(i);
                            break;
                        case R.id.three:
                            i.putExtra("option",37);
                            startActivity(i);
                            break;
                        case R.id.four:
                            i.putExtra("option", 38);
                            startActivity(i);
                            break;
                        case R.id.five:
                            i.putExtra("option", 39);
                            startActivity(i);
                            break;
                        case R.id.six:
                            i.putExtra("option", 40);
                            startActivity(i);
                            break;
                        case R.id.seven:
                            i.putExtra("option", 41);
                            startActivity(i);
                            break;
                        case R.id.eight:
                            i.putExtra("option", 42);
                            startActivity(i);
                            break;
                        case R.id.nine:
                            i.putExtra("option", 43);
                            startActivity(i);
                            break;
                        case R.id.ten:
                            i.putExtra("option", 44);
                            startActivity(i);
                            break;
                        case R.id.eleven:
                            i.putExtra("option", 45);
                            startActivity(i);
                            break;
                        case R.id.twelve:
                            i.putExtra("option", 46);
                            startActivity(i);
                            break;
                        case R.id.thirteen:
                            i.putExtra("option", 47);
                            startActivity(i);
                            break;
                        case R.id.fourteen:
                            i.putExtra("option", 48);
                            startActivity(i);
                            break;
                        case R.id.fifteen:
                            i.putExtra("option", 49);
                            startActivity(i);
                            break;
                        case R.id.sixteen:
                            i.putExtra("option", 50);
                            startActivity(i);
                            break;

                    }
                    return true;
                }
            });
            popupMenu.show();
        }
        if(position==5){
            popupMenu.getMenuInflater().inflate(R.menu.operating_system,popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Intent i = new Intent(InterviewTechnical.this, WEBVIEW20.class);
                    switch (item.getItemId()){
                        case R.id.one:
                            i.putExtra("option",51);
                            startActivity(i);
                            break;
                    }
                    return true;
                }
            });
            popupMenu.show();
        }
        if(position==6){
            popupMenu.getMenuInflater().inflate(R.menu.java_programming,popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Intent i = new Intent(InterviewTechnical.this, WEBVIEW20.class);
                    switch (item.getItemId()){
                        case R.id.one:
                            i.putExtra("option",52);
                            startActivity(i);
                            break;
                        case R.id.two:
                            i.putExtra("option",53);
                            startActivity(i);
                            break;
                        case R.id.three:
                            i.putExtra("option",54);
                            startActivity(i);
                            break;
                    }
                    return true;
                }
            });
            popupMenu.show();
        }
        if(position==7){
            popupMenu.getMenuInflater().inflate(R.menu.database_management,popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Intent i = new Intent(InterviewTechnical.this, WEBVIEW20.class);
                    switch (item.getItemId()){
                        case R.id.one:
                            i.putExtra("option",55);
                            startActivity(i);
                            break;
                        case R.id.two:
                            i.putExtra("option",56);
                            startActivity(i);
                            break;
                    }
                    return true;
                }
            });
            popupMenu.show();
        }
        if(position==8){
            popupMenu.getMenuInflater().inflate(R.menu.ms_sql_server,popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Intent i = new Intent(InterviewTechnical.this, WEBVIEW20.class);
                    switch (item.getItemId()){
                        case R.id.one:
                            i.putExtra("option",57);
                            startActivity(i);
                            break;
                        case R.id.two:
                            i.putExtra("option",58);
                            startActivity(i);
                            break;
                        case R.id.three:
                            i.putExtra("option",59);
                            startActivity(i);
                            break;
                    }
                    return true;
                }
            });
            popupMenu.show();
        }
        if(position==9){
            popupMenu.getMenuInflater().inflate(R.menu.unix,popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Intent i = new Intent(InterviewTechnical.this, WEBVIEW20.class);
                    switch (item.getItemId()){
                        case R.id.one:
                            i.putExtra("option",60);
                            startActivity(i);
                            break;
                        case R.id.two:
                            i.putExtra("option",61);
                            startActivity(i);
                            break;
                        case R.id.three:
                            i.putExtra("option",62);
                            startActivity(i);
                            break;
                    }
                    return true;
                }
            });
            popupMenu.show();
        }
    }
}

