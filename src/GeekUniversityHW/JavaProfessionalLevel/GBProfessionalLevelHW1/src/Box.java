import java.util.ArrayList;
import java.util.Collections;

public class Box <T extends Fruit> {
    ArrayList<T> fruitList = new ArrayList<>();
    T obj;

    public Box(T ... fruit){
        Collections.addAll(fruitList,fruit);
        this.obj = fruit[0];
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public void add(T box){
        fruitList.add(box);
    }

    public float getWeight(){
        int fruitquantity = fruitList.size();
        float fruitweight = obj.getFruitweight();

        float boxweight = fruitweight * (float) fruitquantity;
        return boxweight;
    }

    public boolean compare(Box box){
        if (this.getWeight() == box.getWeight()){
            return true;
        } else {
            return false;
        }
    }

    public void pepper (Box<T> box){
        ArrayList<T> boxFruitList = box.getFruitList();
        for (T obj : boxFruitList) {
            fruitList.add(obj);
        }
        boxFruitList.clear();
    }
}
