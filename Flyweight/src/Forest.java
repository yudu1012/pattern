import java.util.HashMap;
import java.util.Map;

public class Forest {
    private  static final Map<String,Tree> trees = new HashMap<>();


    public void plantTree(int x,int y,String name,String color,String texture){
        TreeType tree = TreeTypeFactory.getTreeType(name, color, texture);
        Tree tree1 = new Tree(x,y,tree);
        trees.put(x + " _ " + y,tree1);
    }

    public void draw(){
        for (Tree tree : trees.values()){
            tree.draw();
        }
    }
}