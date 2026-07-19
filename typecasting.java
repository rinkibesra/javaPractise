public class typecasting {
    public static void main(String[] args) {
        int num=(int)2.3f;
        System.out.println(num);
        //implicit- from small to large done automatically by computer
        long big=45;
        float dec=3;
        double d=3.4f;
        System.out.println(big+" "+" "+dec+" "+d);
        //explicit -form largeto small done by programmer
        float eDec=(float) 3.4;
        long eBig=(long) 3.4;
        int eInt=(int)3.4;
        System.out.println(eDec+" "+" "+eBig+" "+eInt);
    }
    
}
