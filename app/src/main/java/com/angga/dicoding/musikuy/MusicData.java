package com.angga.dicoding.musikuy;

import java.util.ArrayList;

class MusicData {
    private static String[] musicNames = {
            "Avenged Sevenfold",
            "Muse",
            "Thy Art Is Murder",
            "Megadeth",
            "Alesana",
            "Bring Me The Horizon",
            "Metallica",
            "Children of Bodom",
            "Lamb of God",
            "Slipknot"
    };

    private static String[] musicDetails = {
            "Avenged Sevenfold (sering juga ditulis A7X) adalah grup musik Heavy Metal Amerika Serikat yang dibentuk pada tahun 1999. Grup musik ini berasal dari Huntington Beach, California. Anggota Avenged Sevenfold pada saat ini terdiri dari M. Shadows, Synyster Gates, Zacky Vengeance, Johnny Christ, dan Brooks Wackerman.",
            "Muse adalah grup musik rock alternatif asal Inggris. Band ini dibentuk di Devon pada tahun 1994 dengan anggota terdiri dari Matthew Bellamy (vokal, gitar, piano, keytar), Christopher Wolstenholme (bass, backing vokal, keyboard, gitar), dan Dominic Howard (drum, perkusi).",
            "Thy Art Is Murder adalah band metal ekstrim Australia dari Sydney yang dibentuk pada tahun 2006. Band ini terdiri dari vokalis Chris \"CJ\" McMahon, gitaris Sean Delander dan Andy Marsh, drummer Jesse Beahler dan bassis Kevin Butler. Thy Art Is Murder telah merilis lima album studio sejak pembentukan.",
            "Megadeth adalah grup thrash metal dari Amerika yang dipimpin oleh Dave Mustaine. Grup ini bubar pada tahun 2002 karena Mustaine mengalami cedera otot Saturday Night Palsy, tapi kembali dibentuk pada tahun 2004. Namun tanpa David Ellefson, kemudian Dave Mustaine merilis album barunya yang bertajuk The System Has Failed. ",
            "Alesana adalah band post - hardcore Amerika dari Raleigh , North Carolina . Dibentuk pada tahun 2004 , kelompok ini saat ini masuk ke Revival Rekaman dan Rekaman Arteri dan telah merilis satu EP dan empat album studio full-length .",
            "Bring Me the Horizon, sering dikenal dengan nama BMTH, adalah band rock Inggris dari Sheffield, South Yorkshire. Dibentuk pada tahun 2004, grup ini sekarang terdiri dari vokalis Oliver Sykes, gitaris Lee Malia, bassist Matt Kean, drummer Matt Nicholls dan keyboardist Jordan Fish. Mereka menandatangani kontrak dengan RCA Records secara global dan Columbia Records secara eksklusif di Amerika Serikat. Gaya musik awal mereka, termasuk album debut mereka, Count Your Blessings, telah digambarkan terutama sebagai deathcore, tetapi mereka mulai mengadopsi gaya metalcore yang lebih eklektik pada album-album selanjutnya. Selain itu, album terbaru mereka That's the Spirit menandai pergeseran dalam suara mereka ke gaya musik rock yang kurang agresif. ",
            "Metallica didirikan pertama kali di Los Angeles - Amerika Serikat dengan nama The Young of Metal Attack. Beberapa bulan kemudian grup ini berganti nama dengan Metallica yang konon merupakan gabungan kata Metal dan Vodca. Nama Metallica sendiri sebenarnya adalah nama yang diusulkan untuk sebuah majalah musik yang dicuri oleh Lars Ulrich sebelum majalah tersebut mendapat nama tersebut. ",
            "Children of Bodom adalah kelompok musik metal dari Espoo, Finlandia. Didirikan oleh guitarist Alexi \"Wildchild\" Laiho dan drummer Jaska Raatikainen pada 1993 dengan nama IneartheD. Dan Band ini sudah mendapat banyak penghargaan musik baik dari billboard dan lain lain.",
            "Lamb of God adalah band Groove metal Amerika yang terbentuk pada tahun 1990 di daerah Richmond, Virginia yang awalnya dikenal dengan nama Burn the Priest. Mereka mengubah nama tersebut setelah merilis debut album yang bertitel sama dengan nama band, yakni Burn the Priest (album) pada tahun 1999. Lamb of God konsisten dengan vokalis Randy Blythe, gitaris Mark Morton dan Willie Adler, bassis John Campbell, dan drummer Chris Adler. Selain itu musik yang mereka mainkan juga dikenal sebagai New Wave of American Heavy Metal. ",
            "Slipknot adalah sebuah band beraliran Nu Metal dari Des Moines, Iowa yang dibentuk pada bulan September 1995.\n" + "\n" + "Band ini dibentuk oleh sang pemain perkusi Shawn Crahan dan sang pemain bass Paul Gray. Setelah beberapa kali mengganti anggotanya, band ini memiliki anggota tetap sejak 1999 yaitu: Sid Wilson, Joey Jordison, Paul Gray, Chris Fehn, Jim Root, Craig Jones, Shawn \"Clown\" Crahan, Mick Thomson, dan Corey Taylor."
    };

    private static int[] musicImages = new int[]{
            R.drawable.avenged,
            R.drawable.muse,
            R.drawable.thy,
            R.drawable.megadeth,
            R.drawable.alesana,
            R.drawable.bmth,
            R.drawable.metallica,
            R.drawable.cob,
            R.drawable.log,
            R.drawable.slipknot
    };

    static ArrayList<Music> getListData() {
        ArrayList<Music> list = new ArrayList<>();
        for (int position = 0; position < musicNames.length; position++) {
            Music music = new Music();
            music.setName(musicNames[position]);
            music.setDetail(musicDetails[position]);
            music.setPhoto(musicImages[position]);
            list.add(music);
        }
        return list;
    }
}