package me.mehadih.retrofitlivedatamvvmrecyclerview.api;

import java.util.List;

import me.mehadih.retrofitlivedatamvvmrecyclerview.model.User;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRequestData {
    @GET("users")
    Call<List<User>> getUsers();

}
