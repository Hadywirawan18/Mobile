package com.example.gofood;

import java.util.ArrayList;

public class DataMakanan {

    private static String[] namaMakanan = {
            "Ayam Bakar",
            "Bakso",
            "Capcai",
            "Gado Gado",
            "Ayam Geprek",
            "Kwetiau",
            "Lalapan",
            "Mie Ayam",
            "Mie Goreng",
            "Nasi Goreng"

    };

    private static int[] productImage = {
            R.drawable.ayam_bakar,
            R.drawable.bakso,
            R.drawable.capcai,
            R.drawable.gadogado,
            R.drawable.geprek,
            R.drawable.kwetiau,
            R.drawable.lalapan,
            R.drawable.mie_ayam,
            R.drawable.mie_goreng,
            R.drawable.nasigoreng
    };

    private static String[] detailMakanan = {
            "Ayam bakar adalah sebuah hidangan Asia Tenggara Maritim, terutama hidangan Indonesia atau Malaysia, dari ayam yang dipanggang di atas arang.",
            "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia. Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, akan tetapi ada juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau.",
            "Capcai adalah dialek Hokkian yang berarti harfiah \"aneka ragam sayur\". Capcai adalah nama hidangan khas Tionghoa yang populer yang khas karena dimasak dari banyak macam sayuran.",
            "Gado-gado adalah salah satu makanan khas yang berasal dari Indonesia yang berupa sayur-sayuran yang direbus dan dicampur jadi satu, dengan bumbu kacang atau saus dari kacang tanah dan yang dihaluskan",
            "Ayam geprek adalah makanan ayam goreng tepung khas Indonesia yang diulek atau dilumatkan bersama sambal bajak. Kini ayam geprek telah menjadi hidangan populer yang dapat ditemukan di hampir semua kota besar di Indonesia, tetapi asal mula ayam geprek berasal dari kota Yogyakarta.",
            "Kwetiau goreng adalah kwetiau yang digoreng yang merupakan masakan Tionghoa Indonesia, itu adalah hidangan mie yang digoreng yang beraroma dan pedas yang umum dijumpai di Indonesia.",
            "Lalap adalah sayur-sayuran yang biasa disajikan beserta masakan Indonesia. Lalap menyerupai salad, yang banyak dijumpai di makanan barat, walau begitu khas bagi lalap adalah bahwa sayur-sayur lalap tidak dimakan bersama saus atau bumbu-bumbu. Lalap biasa dimakan bersama nasi dan lauk-pauk lainnya.",
            "Mi ayam atau bakmi ayam adalah masakan Indonesia yang terbuat dari mi kuning direbus mendidih kemudian ditaburi saus kecap khusus beserta daging ayam dan sayuran. Mi Ayam terkadang ditambahi dengan bakso, pangsit dan jamur. Mi berasal dari Tiongkok tetapi mi ayam yang serupa di Indonesia tidak ditemukan di Tiongkok.",
            "Mi goreng  adalah makanan yang populer dan digemari di Indonesia, Malaysia, dan Singapura.",
            "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng atau margarin, biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya, seperti telur, ayam, dan kerupuk."

    };

    private static String[] hargaMakanan = {
            "20.000",
            "15.000",
            "12.000",
            "15.000",
            "20.000",
            "18.000",
            "20.000",
            "14.000",
            "12.000",
            "14.000"
    };

    static ArrayList<Makanan> getListData() {
        ArrayList<Makanan> list = new ArrayList<>();
        for (int position = 0; position < namaMakanan.length; position++) {
            Makanan makanan = new Makanan();
            makanan.setNamaMakanan(namaMakanan[position]);
            makanan.setDetailMakanan(detailMakanan[position]);
            makanan.setPhoto(productImage[position]);
            makanan.setHargaMakanan(hargaMakanan[position]);

            list.add(makanan);
        }
        return list;
    }
}
