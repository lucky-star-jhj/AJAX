import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class faceDetect {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process proc;
        //输入名字
//        System.out.println("请输入要截取的图片名称: ");
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.next();
        System.out.println("请稍后...");
        String[] agrs1 = new String[]{"E:\\pythonLearning\\anaconda\\python.exe","E:\\python_workspace\\mycodetest\\opencv\\10人脸识别.py"};
        proc = Runtime.getRuntime().exec(agrs1);
        BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream(),"GBK"));
        String line = null;
        while((line = in.readLine()) != null){
            System.out.println(line);
        }
        in.close();
        proc.waitFor();

    }
}
