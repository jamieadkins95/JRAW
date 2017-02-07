package net.dean.jraw.firebase;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Jamie on 07/02/2017.
 */
public interface FirebaseService {

    @POST("requests.json")
    Call<Request> saveRequest(@Body Request request);
}
