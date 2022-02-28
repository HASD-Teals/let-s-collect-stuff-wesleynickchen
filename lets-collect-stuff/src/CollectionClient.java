import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionClient {
    public static void main(String[] args) throws Exception {
        // Add your collection ArrayList here..
        // e.g. List<Collectable> collection = new ArrayList<Collectable>();
        List<Collectable> collection = createList();
        collection.add(new Collectable(12, 122, "bad among us tablet", false, 1, "red"));
        collection.add(new Collectable(21, 200, "Ukraine Phone", true, 2, "ground"));
        collection.add(new Collectable(30, 0, "mom's phone", false, 1, "divorce Blue"));
        // Add collection methods here to manage and manipulate the collection
        Collectable collectable = new Collectable();
        collection.add(collectable);
        printAll(collection);
        searchList("mom's phone", collection);
        System.out.println("parts: " + sumationColect(false, collection));
        System.out.println("value: " + sumationColect(true, collection));
        collection.sort();
    }

    public static List<Collectable> createList() {
        return new ArrayList<Collectable>();
    }

    public static void printAll(List<Collectable> O) {
        for (int i = 0; i < O.size(); i++) {
            System.out.println(O.get(i).toString());
        }
    }
    public static int searchForName(String Tilie, List<Collectable> Olist) {
        for (int i = 0; i < Olist.size(); i++) {
            if (Olist.get(i).getName().equals(Tilie)) {
                return i;
            }
        }
        return -1;
    }
    public static void searchList(String Tilie, List<Collectable> Olist) {
        int p = searchForName(Tilie, Olist);
        if(p >= 0){
            System.out.println(Tilie +" element found at: " + p);
        }else{
            System.out.println("element not found");
        }
    }

    public static float sumationColect(boolean byValue, List<Collectable> Olst) {
        float j = 0;
        for (int i = 0; i < Olst.size(); i++) {
            if (byValue) {
                j += Olst.get(i).getValue();
            }else{
                j += Olst.get(i).getParts();
            }
        }
        return j;
    }
}
