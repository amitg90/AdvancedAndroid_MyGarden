package com.example.android.mygarden.ui;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

import com.example.android.mygarden.R;

public class PlantWidgetProvider extends AppWidgetProvider {

        static void updateAppWidget(Context context, AppWidgetManager appWidgetManager, int appWidgetId) {

            // Create an Intent to launch MainActivity when clicked
            Intent intent = new Intent(context, MainActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
            // Construct the RemoteViews object
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.plant_widget);
            // Widgets allow click handlers to only launch pending intents
            views.setOnClickPendingIntent(R.id.widget_plant_image, pendingIntent);
            // Instruct the widget manager to update the widget
            appWidgetManager.updateAppWidget(appWidgetId, views);
        }

}

