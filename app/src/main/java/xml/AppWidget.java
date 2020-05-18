package xml;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

import souravapp.indiabix.Engineering;
import souravapp.indiabix.GeneralAptitutude;
import souravapp.indiabix.GeneralKnowledge;
import souravapp.indiabix.Programming;
import souravapp.indiabix.R;
import souravapp.indiabix.VerbalAndReasoning;

/**
 * Implementation of App Widget functionality.
 */
public class AppWidget extends AppWidgetProvider {

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {
        Intent intent1=new Intent(context, GeneralAptitutude.class);
        PendingIntent pendingIntent1=PendingIntent.getActivity(context,0,intent1,0);

        Intent intent2=new Intent(context, VerbalAndReasoning.class);
        PendingIntent pendingIntent2=PendingIntent.getActivity(context,0,intent2,0);

        Intent intent3=new Intent(context, GeneralKnowledge.class);
        PendingIntent pendingIntent3=PendingIntent.getActivity(context,0,intent3,0);

        Intent intent4=new Intent(context, Engineering.class);
        PendingIntent pendingIntent4=PendingIntent.getActivity(context,0,intent4,0);

        Intent intent5=new Intent(context, Programming.class);
        PendingIntent pendingIntent5=PendingIntent.getActivity(context,0,intent5,0);


        // Construct the RemoteViews object
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget);
        views.setOnClickPendingIntent(R.id.b1,pendingIntent1);
        views.setOnClickPendingIntent(R.id.b2,pendingIntent2);
        views.setOnClickPendingIntent(R.id.b3,pendingIntent3);
        views.setOnClickPendingIntent(R.id.b4,pendingIntent4);
        views.setOnClickPendingIntent(R.id.b5,pendingIntent5);

        // Instruct the widget manager to update the widget
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}