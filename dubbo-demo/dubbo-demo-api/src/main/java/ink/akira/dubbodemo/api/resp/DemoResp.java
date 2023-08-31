package ink.akira.dubbodemo.api.resp;

import lombok.Data;

import java.io.Serializable;

@Data
public class DemoResp implements Serializable {
    private int id;
    private String name;
    private int age;
}
