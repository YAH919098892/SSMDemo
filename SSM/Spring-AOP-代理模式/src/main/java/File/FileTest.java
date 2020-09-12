package File;

import org.junit.jupiter.api.Test;

import java.io.*;

public class FileTest {
    @Test
    public void filee() throws IOException {

        File f2 = new File("C:\\Users\\Windows10\\Desktop\\an");
        File[] files = f2.listFiles();
    for (File file : files) {
      String filrpat=file.getAbsolutePath();
       String filename=file.getName();


        if (filename.endsWith(".txt")){
            int start=filrpat.indexOf(".");
            String nn = filrpat.substring(0,start+1);
            System.out.println(nn);
            String endName=nn+"doc";
            System.out.println(endName);
            File file1=new File(endName);
            System.out.println(file.renameTo(file1));

        }
}

    }

    @Test
    public void nn() throws IOException {
File file=new File("C:\\Users\\Windows10\\Desktop\\aa\\an.txt");
        FileOutputStream fileInputStream=new FileOutputStream(file);
java.lang.String text="我是杨安华wretr";
        byte[] bytes=text.getBytes();

if (!file.isFile()){
    file.mkdirs();
}
fileInputStream.write(bytes);
fileInputStream.close();
    }

    @Test
    public void ntn() throws IOException {
        File file=new File("C:\\Users\\Windows10\\Desktop\\aa\\an.txt");
       FileInputStream inputStream=new FileInputStream(file);
       byte[] bytes=new byte[100];
       inputStream.read(bytes);
        System.out.println(new String(bytes));

     inputStream.close();

    }
}




