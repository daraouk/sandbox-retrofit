package com.daraouk.sandboxretrofit.network;

import com.daraouk.sandboxretrofit.model.EmployeeList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetEmployeeDataService {
    @GET("db")
    Call<EmployeeList> getEmployeeData();
}
