import java.util.ArrayList;
import java.util.List;

public class Storage {

        public final ArrayList<Component> storage = new ArrayList<>();

        public void addToStorage(Component component) {
                storage.add(component);
        }

        public void print() {
                System.out.println(storage.toString());
        }

        public ArrayList<Component> getStorage() {
                return storage;
        }
}