package util;

import java.util.UUID;

@SuppressWarnings("all")
public class DataUtil {
    public static String getId(){
        return UUID.randomUUID().toString().replace("-","");
    }

}
