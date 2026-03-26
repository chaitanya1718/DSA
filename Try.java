public interface Try {

       static String converter(int num){
        StringBuilder bin=new StringBuilder();
        while(num!=0){
            bin.append(num%2);
            num=num/2;
        }
        bin=bin.reverse();
        return bin.toString();
    }

     static int converter_int(int num){
        int bin=0;
        while(num!=0){
            bin+=num%2;
            num=num/2;
            bin*=10;
        }
        return bin;
    }


    public static void main(String[] args) {
        int bin=Integer.parseInt(converter(11));
        System.out.println(bin);
    }
}
