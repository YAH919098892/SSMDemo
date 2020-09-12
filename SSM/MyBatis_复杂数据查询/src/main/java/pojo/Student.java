package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String no;
    private String name;
    private String gender;
    private String birthdate;
    private String hometown;
    private String classid;
    private String idcard;
    private TbClass tbClass;
}
