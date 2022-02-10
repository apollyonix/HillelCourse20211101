package ua.hillel.test.rest;

import com.google.gson.Gson;
import org.testng.annotations.Test;
import ua.hille.rest.User;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RestGsonTest {
  @Test
  public void restGsonTest() {
    User user = new User();
    user.setUsername("username");
    user.setFirstName("name");
    user.setLastName("lastname");

    Gson gson = new Gson();
    System.out.println(gson.toJson(user));


    String responce = "{\"id\":0,\"username\":\"username\",\"firstName\":\"name\",\"lastName\":\"lastname\"}";

    User respUser = gson.fromJson(responce, User.class);
    System.out.println("done");
  }
}
