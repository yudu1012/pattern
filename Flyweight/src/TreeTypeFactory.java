import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {
    private static final Map<String,TreeType> treeTypes = new HashMap<>();


    public static TreeType getTreeType(String name,String color,String texture){
        String ket = name + " _ " + color + " _ " + texture;
        if (!texture.contains(ket)){
            treeTypes.put(ket,new TreeType(name, color, texture));
        }
        return treeTypes.get(ket);
    }
}