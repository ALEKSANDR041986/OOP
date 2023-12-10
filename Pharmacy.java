import java.util.*;

//Лекарства
public class Pharmacy implements Iterable <PharmacyComponent> , Comparable <Pharmacy> {

    private List<PharmacyComponent> components = new ArrayList<>();
    private List<Pharmacy> pharmacies = new ArrayList<>();
    Set<Pharmacy> result = new HashSet<>();
    private int index = 0;
    private int sumPower = 0;
    private int size = 0;

    public Pharmacy addcomponent(PharmacyComponent component) {
        components.add(component);
        return this;
    }

    public List<PharmacyComponent> getComponents() {
        return components;
    }

    public void setComponents(List<PharmacyComponent> components) {
        this.components = components;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

//    @Override
//    public boolean hasNext() {
//        return index < components.size();
//    }
//
//    @Override
//    public PharmacyComponent next() {
//        return components.get(index++);
//    }

    @Override
    public String toString() {
        return "\nPharmacy{" +
                "components=" + components +
                ", index=" + index +
                '}';
    }

    @Override
    public Iterator<PharmacyComponent> iterator() {
        return new IteratorComponent(this);
    }


    //    сортируем по суммарной силе

//    @Override
//    public int compareTo(Pharmacy o) {
//        for (PharmacyComponent comp: o) {
//            sumPower = sumPower + comp.getPower();
//        }
//        if (this.sumPower>o.sumPower) {
//            return -1;
//        }
//        if (this.sumPower<o.sumPower) {
//            return 1;
//        }
//        else return 0;
//        }


    //    сортируем по количеству компонентов
    @Override
    public int compareTo(Pharmacy o) {
        for (PharmacyComponent comp : o) {
            size++;
        }
        if (this.size > o.size) {
            return -1;
        }
        if (this.size < o.size) {
            return 1;
        } else return 0;
    }


//    @Override
//    public int compareTo(Pharmacy o) {
//
//        return 0;
//    }

//    анонимный класс
//    @Override
////    public Iterator<PharmacyComponent> iterator() {
////        return new Iterator<PharmacyComponent>() {
////            @Override
////            public boolean hasNext() {
////                return index < components.size();
////            }
////
////            @Override
////            public PharmacyComponent next() {
////                return components.get(index++);
////            }
////        }
////    }

}
