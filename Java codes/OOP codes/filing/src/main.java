//import java.io.ObjectInputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//
//public class main {
//    public static void main(String[] args) throws IOException {
//
//        ObjectInputStream in = null;
//        ObjectOutputStream out = null;
//
//        try {
//            in = new ObjectInputStream("file1.txt");
//            out = new ObjectOutputStream();
//
//            Object ob = new Object();
//            out.writeObject(ob);
//
//
//            Object ob1 = in.readObject();
//            Object ob2 = in.readObject();
//
//        } finally {
//            if (in != null) {
//                in.close();
//            }
//            if (out != null) {
//                out.close();
//            }
//        }
//    }
//}