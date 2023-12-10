import java.util.List;

public class PharmacyEquals {
    private PharmacyComponent pharComp;

    public boolean equals(PharmacyComponent obj) {
//        for (PharmacyComponent pharComp:
//             obj) {
            if (pharComp.getName() == (obj.getName())) return false;
            else if (pharComp.getPower() == (obj.getPower())) return false;
            else if (pharComp.getWeight()== obj.getWeight()) return false;
                else return true;
    }
}
