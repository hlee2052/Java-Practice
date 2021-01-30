package enums;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Enum Map takes enum as Key
 * - optimized for Enums, but hashmap would work also.
 */
public enum Medication {

    IBUPROFEN(3, DrugType.NSAID),
    DEXAMETHASONE(40, DrugType.STEROID),
    AMPICILLIN(1, DrugType.BETA_LACTAM),
    PENICILLIN(2, DrugType.BETA_LACTAM);


    private final DrugType type;
    private final double halfLife;

    Medication(double halfLife, DrugType type) {
        this.halfLife = halfLife;
        this.type = type;

    }

    public double getHalfLife () {
        return halfLife;
    }

    public DrugType getDrugType () {
        return type;
    }

    private enum DrugType {
        NSAID,
        STEROID,
        BETA_LACTAM
    }

    public static void main (String [] args) {
        Map<Medication.DrugType, Set<Medication>> drugsByType = new EnumMap<DrugType, Set<Medication>>(DrugType.class);


        for (Medication.DrugType type: Medication.DrugType.values()) {
            drugsByType.put(type, new HashSet<>());
        }
        Set<Medication> betaLactamDrugs = drugsByType.get(DrugType.BETA_LACTAM);
        betaLactamDrugs.add(Medication.AMPICILLIN);
        betaLactamDrugs.add(Medication.PENICILLIN);
        drugsByType.put(DrugType.BETA_LACTAM, betaLactamDrugs);
        System.out.println(drugsByType);
    }
}
