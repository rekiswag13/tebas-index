import javax.swing.*;
public class JastipRandom{
public static void main(String [] args){
//deklasrasi varibel
    String namabarang="";
    int harga=0;
    int total;

//input
    String nama=(JOptionPane.showInputDialog("Nama Pembeli : "));
    String kode=(JOptionPane.showInputDialog("Kode Jastip  : "));
    String barang=(JOptionPane.showInputDialog("Nama Brand : "));
    int jumlah=Integer.valueOf(JOptionPane.showInputDialog("Jumlah Pembelian : "));



//proses
    if(kode.equals("A01"))
    {
    namabarang="Brand Zara";
    harga=600000;
    }
    else if(kode.equals("B02"))
    {
    namabarang="Brand Uniqlo";
    harga=1100000;
    }
    else if(kode.equals("C03"))
    {
    namabarang="Brand H&M";
    harga=1300000;
    }
    else if(kode.equals("D04"))
    {
    namabarang="Brand Bershka";
    harga=8000000;
    }

    total=jumlah*harga;

//output
    System.out.println("Nama Pembeli    : "+nama);
    System.out.println("Kode Jastip     : "+kode);
    System.out.println("Nama Brand      : "+namabarang);
    System.out.println("harga           : "+harga);
    System.out.println("Total Bayar     : "+total);

}
}
