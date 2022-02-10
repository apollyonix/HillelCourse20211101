package ua.hillel.test.rest;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;
import ua.hille.rest.Order;
import ua.hille.rest.RestClient;
import ua.hille.rest.User;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RestTest {
  @Test
  public void restTest() throws IOException {

//    Request request = new Request.Builder()
//        .url("http://petstore.swagger.io/v2/user/1010")
//        .get()
//        .build();

//    String json = "{\n" + "  \"id\": 101010,\n" + "  \"username\": \"testUser\",\n"
//        + "  \"firstName\": \"testUser\",\n" + "  \"lastName\": \"testUser\",\n"
//        + "  \"email\": \"user@server.com\",\n" + "  \"password\": \"pass\",\n"
//        + "  \"phone\": \"string\",\n" + "  \"userStatus\": 0\n" + "}";



    User user = new User();
    user.setUsername("username");
    user.setFirstName("name");
    user.setLastName("lastname");
    user.getGroups()[0] = "g1";
    user.getGroups()[1] = "g2";
    user.getGroups()[2] = "g3";


    new RestClient().createUser(user);

    Order order = new Order();
    order.getNewField();










  }
}
