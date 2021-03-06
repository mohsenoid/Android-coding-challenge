package com.mirhoseini.autolabs.weather;

import com.mirhoseini.autolabs.base.BasePresenter;

import java.util.ArrayList;

/**
 * Created by Mohsen on 03/01/2017.
 */

public interface WeatherPresenter extends BasePresenter<WeatherView> {

    void loadWeather(ArrayList<String> cities);

}
