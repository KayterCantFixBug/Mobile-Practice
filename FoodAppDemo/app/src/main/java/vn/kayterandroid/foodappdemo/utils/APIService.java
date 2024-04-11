package vn.kayterandroid.foodappdemo.utils;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import vn.kayterandroid.foodappdemo.model.User;

public interface APIService {
    @POST("users/login")
    Call<ResponseBody> login(@Body User user);

    @GET("users/{id}")
    Call<ResponseBody> getUser(@Path("id") String userId);

    @POST("users/")
    Call<ResponseBody> register(@Body User user);

    @Multipart
    @PUT("users/{id}")
    Call<ResponseBody> updateUser(@Path("id") String userId, @Part MultipartBody.Part image);

    @GET("foods/")
    Call<ResponseBody> getFoods();
}
