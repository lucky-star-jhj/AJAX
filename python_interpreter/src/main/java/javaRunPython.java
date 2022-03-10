import org.python.util.PythonInterpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class javaRunPython {
    private static Process proc;
    PythonInterpreter interpreter =new PythonInterpreter();
    public static void main(String[] args) throws IOException, InterruptedException {
//        javaRunPython javaRunPython = new javaRunPython();
//        javaRunPython.interpreter.execfile("E:\\python_workspace\\machineLearning\\linearRegression.py");
        Process proc;
        String[] args1 = new String[]{"E:\\pythonLearning\\anaconda\\python.exe","E:\\python_workspace\\machineLearning\\function_test.py",
                String.valueOf(5),String.valueOf(10),String.valueOf(15),String.valueOf(15),String.valueOf(20)};
        proc=Runtime.getRuntime().exec(args1);
        System.out.println("Hello my 2 commit ! ");
        System.out.println("Hello my 3 commit ! ");
        System.out.println("Hello my 5 commit ! ");


        //这里注意乱码
        BufferedReader in =new BufferedReader(new InputStreamReader(proc.getInputStream(),"GBK"));
        String line = null;
        while((line=in.readLine())!=null){
            System.out.println(line);
        }
        in.close();
        proc.waitFor();
    }

}
