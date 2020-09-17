package adDoiTuongVaoDanhSach;

import com.sun.xml.internal.org.jvnet.fastinfoset.EncodingAlgorithmIndexes;

public class MylistDog {
    private Animal[] animals = new Dog[5];
    private int nextIndex;


     public void add(Animal animal) {
        if (nextIndex < this.animals.length) {
            animals[nextIndex] = animal;
            System.out.println("con vat dc them tai: " + nextIndex);
            nextIndex++;
        }
    }
}
