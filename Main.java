import java.util.*;

public class Main {
    public static void main(String[] args) {
        PharmacyComponent azitromit = new Azitromit("Azitromit", "10mg", 30);
        PharmacyComponent azitromit2 = new Azitromit("Azitromit", "10mg", 30);
        PharmacyComponent azitromit1 = new Azitromit("Azitromit", "10mg", 30);
        PharmacyComponent water = new Water("Water", "5mg", 5);
        PharmacyComponent penitsilin = new Penitsilin("Penitsilin", "13mg", 200);
        PharmacyComponent water2 = new Water("Water2", "5mg", 3000);

        List <PharmacyComponent> pharmacyComponents = new ArrayList<>();
        pharmacyComponents.add(azitromit);
        pharmacyComponents.add(water);
        pharmacyComponents.add(penitsilin);
        pharmacyComponents.add(water2);

        System.out.println("ДО СОРТИРОВКИ: " + pharmacyComponents);
        //сортируем pharmacyComponents через интерфейс comparable
        Collections.sort(pharmacyComponents);
        System.out.println("ПОСЛЕ СОРТИРОВКИ: "+ pharmacyComponents);

        Pharmacy pharmacy1 = new Pharmacy().addcomponent(azitromit).addcomponent(water).addcomponent(penitsilin).
                addcomponent(water2);
        Pharmacy pharmacy2 = new Pharmacy().addcomponent(penitsilin).addcomponent(water);
        Pharmacy pharmacy3 = new Pharmacy().addcomponent(penitsilin);
        Pharmacy pharmacy4 = new Pharmacy().addcomponent(penitsilin); // создали идентичный экземпляр Pharmacy
        Pharmacy pharmacy5 = new Pharmacy().addcomponent(penitsilin).addcomponent(water);// создали идентичный экземпляр Pharmacy

        Set<Pharmacy> result = new HashSet<>(); //(множество из нескольких лекарств)
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);
        result.add(pharmacy5);
        System.out.println(result);
        System.out.println(pharmacy4.equals(pharmacy5));
        System.out.println("ДЛИНА МНОЖЕСТВА: " + result.size()); //

    for (PharmacyComponent comp:pharmacy1){
        System.out.println("--" + comp.getName());
    }

        List <Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);
        pharmacies.add(pharmacy3);
        System.out.println(pharmacies.size());
        System.out.println(pharmacies.get(0));
        System.out.println(pharmacies.get(1));
        System.out.println(pharmacies.get(2));
        System.out.println("ДО СОРТИРОВКИ: "+ pharmacies);
        //сортируем Pharmacy через интерфейс comparable
        Collections.sort(pharmacies);
        System.out.println("ПОСЛЕ СОРТИРОВКИ: "+ pharmacies);



        Set<PharmacyComponent> setComp = new HashSet<>();
        setComp.add(azitromit);
        setComp.add(azitromit1);
        setComp.add(azitromit2);
        System.out.println();
        System.out.println("+++++"+ setComp);
        System.out.println(azitromit.getName().equals(azitromit2.getName()));
        /*
        https://javarush.com/groups/posts/2179-metodih-equals--hashcode-praktika-ispoljhzovanija
         */

//        Iterator <PharmacyComponent> iterator = pharmacy1;
////        while (((Iterator<PharmacyComponent>) pharmacy1).hasNext())
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        Iterator<PharmacyComponent> iterator2 = pharmacy2;
//        while ((iterator2.hasNext())){
//            System.out.println("2 лекарство - " + iterator2.next());
//        }
    }
}
