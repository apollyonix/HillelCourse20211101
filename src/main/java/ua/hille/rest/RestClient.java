package ua.hille.rest;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RestClient {
  public void createUser(User user) throws IOException {
    Gson gson = new Gson();
    System.out.println(gson.toJson(user));

    RequestBody body = RequestBody.create(gson.toJson(user).getBytes(StandardCharsets.UTF_8));

    Request request = new Request.Builder()
        .post(body)
        .url("http://petstore.swagger.io/v2/user")
        .addHeader("Content-Type", "application/json")
        .build();

    OkHttpClient client = new OkHttpClient();

//    Response response = client.newCall(request).execute();

    //    System.out.println(response.body().string());
  }

  public void createMultStructure() {
    JSONObject parent = new JSONObject();
    JSONObject child = new JSONObject();
    child.put("childName", "name");

    JSONArray jsonArray = new JSONArray();
    jsonArray.put(child);

    parent.put("child", child);
  }
}
