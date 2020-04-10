package dds.entrega0;

import java.util.*;
import java.util.Iterator;
import java.util.List;

public class ListaCompras {
    public static ArrayList<Item> items;

    public ListaCompras(){
        this.items = new ArrayList<Item>();
    }
    public void agregarItem(Item item){
        this.items.add(item);
    }
    public double costoTotal(){
        double sum = items.stream().filter(o -> o.getPrecio() > 0).mapToDouble(o -> o.getPrecio()).sum();
        return sum;
    }
}
