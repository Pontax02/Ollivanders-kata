package edu.estatuas.olivanders;


import java.util.ArrayList;
import java.util.List;

public class GildedRose {

        List<Updateable> items = new ArrayList<Updateable>();
        public GildedRose(List<Updateable> items) {
            this.items = items;
        }
        public void updateQuality() {

        }
        public void add(Updateable item) {
            items.add(item);
        }

}
