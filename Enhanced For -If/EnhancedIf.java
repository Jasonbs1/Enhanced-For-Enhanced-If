public class EnhancedIf {
    public static void main(String[] args) {
        int x = 3;
        String result = (x > 5) ? "x is greater than 5" : "x is less than or equal to 5";
        System.out.println(result);
    }
}


// Kita mendeklarasikan sebuah variabel integer x dan menginisialisasikannya dengan nilai 10.
// Operator ternary (x > 5) ? "x lebih besar dari 5" : "x kurang dari atau sama dengan 5" mengevaluasi kondisi x > 5.
// Jika kondisinya benar, itu mengembalikan ekspresi pertama "x lebih besar dari 5", jika tidak, itu mengembalikan ekspresi kedua "x kurang dari atau sama dengan 5".
// Hasil dari operator ternary tersebut ditugaskan ke variabel hasil, yang kemudian dicetak ke konsol.