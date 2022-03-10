public class Strange {
    public static void main(String[] args) {
        System.out.println('*' + '\t');
        System.out.println('*');
        System.out.println("\t" + 6 );
        System.out.println('a');
        System.out.println('a' + 6);
        System.out.println();
        //如果你得到是一个Object对象，可以用if（obj instanceof String）来判断是否是String对象，
        // int是基本类型不可以这么判断，只能用它的包装类Integer，同样用instanceof

        //包装类的使用
        Character a = 'a';
        String str="hhhh";
        Integer b = 100;
        Double d = 1.23;
        if(str instanceof  String){
            System.out.println("String");
        }
        if(b instanceof Integer){
            System.out.println("Integer");
        }
        if(a instanceof Character){
            System.out.println("Character");
        }
        if(d instanceof Double){
            System.out.println("Double");
        }
    }
}

// *  Ascii = 42
// \t(Tab)  Ascii = 9

/*
对于单引号, 单独使用时打印字符 , 做运算时 看成 ASCII 码
    '*' 单独使用 是 Tab
    "*" 单独使用 是 Tab
    '*' + '\t' = 42 + 9 = 51
    '\t' + 6 = 9 + 6 = 15
 */
