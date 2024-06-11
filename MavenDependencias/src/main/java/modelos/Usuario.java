package modelos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Usuario {
    @JsonProperty("balance")
    private String balance;
    @JsonProperty("picture")
    private String picture;
    @JsonProperty("age")
    private int age;
    @JsonProperty("name")
    private String name;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("company")
    private String company;
    @JsonProperty("email")
    private String email;

    @Override
    public String toString() {
        return "Usuario{" +
                "balance=" + balance +
                ", picture='" + picture + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getBalance() {
        return balance;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
