package pojo;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private int no;
    private String name;
    private String password;

}
