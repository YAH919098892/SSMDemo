package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int no;
    private String name;
    private String password;

}
