package org.pursuit.viewpagerexcercise.network;

import org.pursuit.viewpagerexcercise.models.PlanetsItem;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ViewPagerService {

    @GET("JDVila/storybook/master/planets.json")
    Call<PlanetsItem> get();
}
