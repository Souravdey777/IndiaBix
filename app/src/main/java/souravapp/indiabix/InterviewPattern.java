package souravapp.indiabix;

import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by SOURAV on 2/22/2017.
 */
public class InterviewPattern extends ListActivity {
    String[] Interview_Pattern_menu ={"Placement Papers with Answers"
            ,"HR Interview Questions with Answers"
            ,"Technical Questions and Answers"
            ,"Group Discussion Topics with Answers"
            ,"Body Language (Gestures)"
            ,"Submit Your Placement Paper & Experience"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1, Interview_Pattern_menu));

    }

    @Override
    protected void onListItemClick(ListView l, View v, final int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(position==0){
            AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(v.getContext(), R.style.AlertDialogCustom));

            builder.setMessage("The largest collection of placement papers with answers and interview pattern of various companies such as TCS, Infosys, Wipro, Accenture, IBM, CTS etc. You may Submit your Placement Paper & Interview Experience here.");
            builder.setTitle("Placement Papers with Answers");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Intent i = new Intent(InterviewPattern.this, WEBVIEW19.class);
                    i.putExtra("option",position);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            alertDialog.show();
        }
        if(position==1){
            AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(v.getContext(), R.style.AlertDialogCustom));

            builder.setMessage("This section covers HR interview questions and answers for freshers and experienced. It helps job seekers who are about to attend HR interview round.");
            builder.setTitle("HR Interview Questions with Answers");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Intent i = new Intent(InterviewPattern.this, WEBVIEW19.class);
                    i.putExtra("option",position);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            alertDialog.show();
        }
        if(position==2){
            AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(v.getContext(), R.style.AlertDialogCustom));

            builder.setMessage("This is the technical interview questions and answers section for various interview, competitive examinations. This section covers Data Structure, C, Java, Database, Networking etc.");
            builder.setTitle("Technical Questions and Answers");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Intent i = new Intent(InterviewPattern.this,InterviewTechnical.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            alertDialog.show();
        }
        if(position==3){
            AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(v.getContext(), R.style.AlertDialogCustom));

            builder.setMessage("This section covers latest/current group discussion topics with answers on various aspects. These gd topics can help MBA, CAT as well as fresh job seekers.");
            builder.setTitle("Group Discussion Topics with Answers");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Intent i = new Intent(InterviewPattern.this,WEBVIEW19.class);
                    i.putExtra("option",position);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            alertDialog.show();
        }
        if(position==4){
            AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(v.getContext(), R.style.AlertDialogCustom));

            builder.setMessage("Introduction for transmitting messages without spoken words, messages can be communicated through facial expressions; gaze; and posture.");
            builder.setTitle("Body Language (Gestures)");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Intent i = new Intent(InterviewPattern.this,BodyLanguage.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            alertDialog.show();
        }
        if(position==5){
            AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(v.getContext(), R.style.AlertDialogCustom));

            builder.setMessage("Here you can submit your Placement Test Paper, share your interview experience. This will definitely help other job seekers are about to attend the interview.");
            builder.setTitle("Submit Your Placement Paper & Experience");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Intent i = new Intent(InterviewPattern.this,WEBVIEW19.class);
                    i.putExtra("option",position);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            alertDialog.show();
        }
    }
}
