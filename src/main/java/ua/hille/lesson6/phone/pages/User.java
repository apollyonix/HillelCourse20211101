package ua.hille.lesson6.phone.pages;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class User {
  private String username;
  private String name;
  private String lastname;
  private String email;
  private int age;
  private String[] roles;

  public String[] getRoles() {
    return roles;
  }

  public void setRoles(String[] roles) {
    this.roles = roles;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    if (!email.contains("@")) {

    }
    this.email = email;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    User user = (User) o;
    return this.username.equals(((User) o).username);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(username, name, lastname, email, age);
    result = 31 * result + Arrays.hashCode(roles);
    return result;
  }

  @Override
  public String toString() {
    return "User{" + "username='" + username + '\'' + ", name='" + name + '\'' + ", lastname='"
        + lastname + '\'' + ", email='" + email + '\'' + ", age=" + age + '}';
  }



}
