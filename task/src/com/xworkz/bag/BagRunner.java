package com.xworkz.bag;

import com.xworkz.bag.travellingbag.TravellingBag;

public class BagRunner {
        public static void main(String[] args) {
            Bag bag = new Bag();
            bag.type();
            bag.material();
            bag.capacity();

            TravellingBag travellingBag = new TravellingBag();
            travellingBag.type();
            travellingBag.material();
            travellingBag.capacity();
        }
}
