package cosinus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.cos;
import java.util.StringTokenizer;
import java.util.Vector;
public class Cosinus {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

//        System.out.println("Masukkan kalimat 1 : ");
//        String kalimat1 = in.readLine();
        String a = "";
//        int z = 0;
//        int zz = 0;
        Vector<String> yeye = new Vector();
        Vector<String> yeye2 = new Vector();
        Vector<String> yeye3 = new Vector();
        Vector<String> yuyu = new Vector();
        Vector<Integer> jumlah = new Vector();
        Vector<Integer> jumlah2 = new Vector();
        Vector<Integer> jumlah3 = new Vector();
        Vector<Integer> ww = new Vector();
        Vector<Integer> www = new Vector();
        Vector<String> document = new Vector();
        Vector<String> document1 = new Vector();
        Vector<Integer> jumseluruh1 = new Vector();
        Vector<Integer> jumseluruh2 = new Vector();

        for (int w = 0; w < 2; w++) {
            if (w == 0) {
                a = "saya membuat program dengan bahasa java";
            } else {
                a = "belajar bahasa inggris lebih susah daripada belajar bahasa java";
            }

            StringTokenizer b = new StringTokenizer(a, " ");

            while (b.hasMoreTokens()) {
                yeye.add(b.nextToken());
            }
//            for (int i = 0; i < yeye.size(); i++) {
//                System.out.println(yeye.get(i));
//            }
            for (int i = 0; i < yeye.size(); i++) {
                yuyu.add(yeye.get(i));
            }

            for (int i = 0; i < yeye.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (i != j && yeye.get(i).equals(yeye.get(j))) {
                        yuyu.remove(yeye.get(i));
                        break;
                    }
                }
            }

//            for (int i = 0; i < yuyu.size(); i++) {
//                System.out.println(yuyu.get(i));
//            }
            //menghitung jumlah kata
//            for (Object key : yuyu) {
//                int jum = 0;
//                for (String t : yeye) {
//                    if (key.equals(t)) {
//                        jum++;
//                    }
//                }
//                jumlah.add(jum);
//            }
            
            for (int i = 0; i < yuyu.size(); i++) {
                document.add(yuyu.get(i));
//                ww.add(jumlah.get(i));
//                System.out.println(jumlah.get(i));
            }
//            for (int i = 0; i < ww.size(); i++) {
//                System.out.println(ww.get(i));
//            }
            for (int i = 0; i < yeye.size(); i++) {
                if (w == 0) {
                    yeye2.add(yeye.get(i));
//                    jumlah2.add(jumlah.get(i));
                } else {
                    yeye3.add(yeye.get(i));
//                    jumlah3.add(jumlah.get(i));
                }
            }

            yeye.clear();
            yuyu.clear();
            jumlah.clear();
            System.out.println("==============");
        }

//        for (int i = 0; i < yeye2.size(); i++) {
//            System.out.println(yeye2.get(i));
//        }
//        System.out.println("======");
//        for (int i = 0; i < yeye3.size(); i++) {
//            System.out.println(yeye3.get(i));
//        }
//        for (int i = 0; i < yeye2.size(); i++) {
//            System.out.println(yeye2.get(i));
//        }System.out.println("====");
        
        for (int i = 0; i < document.size(); i++) {
            document1.add(document.get(i));
        }
//        for (int i = 0; i < document.size(); i++) {
//            System.out.println(document.get(i));
//        }

        for (int i = 0; i < document.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (i != j && document.get(i).equals(document.get(j))) {
                    document1.remove(document.get(i));
                    break;
                }
            }
        }
        
        for (int i = 0; i < document1.size(); i++) {
            System.out.println(document1.get(i));
        }System.out.println("=====");
        for (Object key : document1) {
            int jum = 0;
            for (String t : yeye2) {
                if (key.equals(t)) {
                    jum++;
                }
            }
            jumlah.add(jum);
        }
        for (Object key : document1) {
            int jum = 0;
            for (String t : yeye3) {
                if (key.equals(t)) {
                    jum++;
                }
            }
            jumlah2.add(jum);
        }
        for (int i = 0; i < jumlah.size(); i++) {
            System.out.println(jumlah.get(i));
        }
        System.out.println("======");
        for (int i = 0; i < jumlah2.size(); i++) {
            System.out.println(jumlah2.get(i));
        }
//        for (int i = 0; i < document.size(); i++) {
//            for (int j = 0; j < yeye2.size(); j++) {
//                if (document.get(i) == yeye2.get(j)) {
//                    jumseluruh1.add(jumlah2.get(j));
//                } else {
//                    int z = 0;
//                    jumseluruh1.add(z);
//                }
//            }
//            for (int j = 0; j < yeye3.size(); j++) {
//                if (document.get(i) == yeye3.get(j)) {
//                    jumseluruh2.add(jumlah3.get(j));
//                } else {
//                    int z = 0;
//                    jumseluruh2.add(z);
//                }
//            }
//        }
//        System.out.println("========");
//        for (int i = 0; i < jumseluruh1.size(); i++) {
//            System.out.println(jumseluruh1.get(i));
//        }
//        System.out.println("========");
//        for (int i = 0; i < jumseluruh2.size(); i++) {
//            System.out.println(jumseluruh2.get(i));
//        }

        Vector t = new Vector();
        int z = 0;
        int zz = 0;
        for (int i = 0; i < jumlah.size(); i++) {
            z = jumlah.get(i) * jumlah2.get(i);
            zz = zz + z;
        }
        
        System.out.println("===============");
        System.out.println("Pembilang = " + zz);
        
        int r =0;
        int rr =0;
        for (int i = 0; i < jumlah.size(); i++) {
            r = jumlah.get(i)*jumlah.get(i);
            rr = rr + r;
        }
        System.out.println("");
        System.out.println(rr);
        double rrr = Math.sqrt(rr);
        System.out.println("Penyebut K1 = "+rrr);
        
        int y =0;
        int yy =0;
        for (int i = 0; i < jumlah2.size(); i++) {
            y = jumlah2.get(i)*jumlah2.get(i);
            yy = yy + y;
        }
        System.out.println(yy);
        double yyy = Math.sqrt(yy);
        System.out.println("Penyebut K2 = "+yyy);
        System.out.println("");
        
        double ry = rrr*yyy;
        System.out.println("Penyebut = "+ry);
        
        double cosine = zz/ry;
        System.out.println("Cosine = "+cosine);
    }

    }
    

