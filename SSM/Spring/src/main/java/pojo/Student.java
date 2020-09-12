package pojo;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Properties;
import java.util.Set;
@Data
@NoArgsConstructor
public class Student {
    private String name;
    private List<String> hobbys;
    private Set<String> games;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.println("hhhh");
        return "Student{" +
                "name='" + name + '\'' +
                ", hobbys=" + hobbys +
                ", games=" + games +
                '}';
    }
}
