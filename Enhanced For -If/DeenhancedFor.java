public class DeenhancedFor {
    public static void main(String[] args) {
        String[] names = {"John", "Doe", "Alice", "Bob"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Index: " + i + ", Name: " + names[i]);
        }
    }
}


// Kita mendeklarasikan sebuah array string bernama names yang berisi nama-nama {"John", "Doe", "Alice", "Bob"}.
// Dalam loop for tradisional, kita menggunakan sebuah variabel integer i sebagai indeks untuk mengulangi array.
// Hal ini memungkinkan kita untuk mengakses setiap elemen array menggunakan names[i], yang memberikan baik indeks maupun nama yang sesuai dalam setiap iterasi.
// Dimana jika kita menggunakan Enhanced For kita tidak dapat mengakses semua indeks dalam array tersebut.
// Loop mencetak baik indeks i maupun nama yang sesuai names[i] ke konsol, memungkinkan kita untuk melihat hubungan antara indeks dan elemen.   