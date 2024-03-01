
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author luiz
 */
public class Herd implements Movable {

    private List<Movable> list;

    public Herd() {
        this.list = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : this.list) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String string = "";

        for (Movable movable : this.list) {
            string += movable + "\n";
        }

        return string;
    }
}
