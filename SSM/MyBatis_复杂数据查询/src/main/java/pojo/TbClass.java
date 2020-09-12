package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class TbClass {
    private String no;
    private String name;
    private String tid;
    private List<Student> student;
    //private TbClass tbClass;
}
