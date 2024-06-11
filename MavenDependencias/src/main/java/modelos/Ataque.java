package modelos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ataque {
    @JsonProperty("accuracy")
    private int accuracy;
    @JsonProperty("ename")
    private String ename;
    @JsonProperty("id")
    private int id;
    @JsonProperty("power")
    private int power;
    @JsonProperty("pp")
    private int pp;
    @JsonProperty("type")
    private String type;

    @Override
    public String toString() {
        final var multilinea = """
                   {
                   accuracy:%d
                   ename:%s
                   id:%d
                   power:%d
                   pp:%d
                   type:%s
                }
                """;
        return String.format(
                multilinea,
                accuracy,
                ename,
                id,
                power,
                pp,
                type
        );
    }

    public int getPower() {
        return power;
    }
}
