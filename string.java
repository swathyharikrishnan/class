public class Stringoperation {
   public static void main(String[] args) {
          String s="Hellow Java";
          String s1=new String("Wellcome");
          String s2="wellcome";
          System.out.println("Length:"+s1.length());
          System.out.println("Char at:"+s1.charAt(2));
          System.out.println("Uppercase :"+s1.toUppercase());
          System.out.println("Lowercase :"+s1.toLowercase());
          System.out.println("Equals :"+s1.equals(s2));
          System.out.println("Equals ignore :"+s1.equalsIgnoreCase(s2));
          System.out.println("contains :"+s1.compareTo(s2));
          System.out.println("contains :"+s2.compareTo(s1));
          System.out.println("indexof :"+s1.indexOf('e'));
          System.out.println("last indexof :"+s1.lastIndexOf('e'));
          System.out.println("concate :"+s.concat("Programming"));
          String s3=" ";
          System.out.println("is blank :"+s3.isBlank());
          System.out.println("is empty :"+s3.isEmpty());