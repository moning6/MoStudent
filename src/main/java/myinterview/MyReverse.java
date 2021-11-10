package myinterview;
//目的 使用reverse 函数 将字符串反转
public class MyReverse {
    public static void main(String[] args) {
        String str = "abcfruh";
        StringBuilder stringBuilder = new StringBuilder(str);
        String ret = stringBuilder.reverse().toString();
        System.out.println(ret);
        String sts = ret.toUpperCase();
        System.out.println(sts);
        String stp = sts.toLowerCase();
        System.out.println(stp);
        System.out.println(stp.toUpperCase());
        System.out.println(stp.length());
        System.out.println(stp.charAt(1));
        System.out.println(stp.indexOf("a"));
        System.out.println(stp.substring(3));
        System.out.println(stp.substring(2,7));
        System.out.println(stp.charAt(2));
        if (stp.equals("ABCFRUH")){
            System.out.println("一样的");
        } else System.out.println("不一样");



    }
}
