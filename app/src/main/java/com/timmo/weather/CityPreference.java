package com.timmo.weather;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

class CityPreference {

    private final SharedPreferences prefs;

    public CityPreference(Activity activity) {
        prefs = PreferenceManager.getDefaultSharedPreferences(activity);
    }

    // If the user has not chosen a city yet, return
    // Sydney as the default city
    String getCity() {
        return prefs.getString("city", "London");
    }

    void setCity(String city) {
        prefs.edit().putString("city", city).commit();
    }

}