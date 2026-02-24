public class Atividade {
    public static void main(String[] args) {

        byte maximoBy = Byte.MAX_VALUE;
        byte minBy = Byte.MIN_VALUE;

        byte overleftByte = (byte) (maximoBy + 1);
        byte underleftByte = (byte) (minBy - 1);

        System.out.println("Max :" + overleftByte);
        //Resulta em "-128" por exceder o limite máximo do byte que é "127", aasim, tornando-o o seu maximo negativo.
        System.out.println("Min :" + underleftByte);
        //Resulta em "127" por exceder o limite máximo do byte que é "-128", aasim, tornando-o o seu maximo positivo.

        short maximosho = Short.MAX_VALUE;
        short minimosho = Short.MIN_VALUE;

        short overleftShort = (short) (maximosho + 1);
        short underleftShort = (short) (minimosho - 1);

        System.out.println("Max :"+ overleftShort);
        //Resulta em "-32768" por exceder o limite máximo do byte que é "32767", aasim, tornando-o o seu maximo negativo.
        System.out.println("Min : " + underleftShort);
        //Resulta em ""32767" por exceder o limite máximo do byte que é "-32768", aasim, tornando-o o seu maximo positivo.


        int maximoint = Integer.MAX_VALUE;
        int minimoint = Integer.MIN_VALUE;

        int overleftint = (int) (maximoint + 1 );
        int underleftint = (int) (minimoint - 1 );

        System.out.println("Max :" + overleftint);
        //Resulta em "-2147483648" por exceder o limite máximo do byte que é "2147483647", aasim, tornando-o o seu maximo negativo.

        System.out.println("Min :" + underleftint);
        //Resulta em "2147483647" por exceder o limite máximo do byte que é "-2147483648", aasim, tornando-o o seu maximo negativo.

        long numero = 300;
        byte convertido = (byte) (numero);
        System.out.println("Long:" + numero);
        System.out.println("Convertido:" + convertido);
        // O resultado foi 44, pois,300 em long só permite que o byte possa ocupar 44.


        

    }
}
