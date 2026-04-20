class Doctor {
    Doctor treat() {
        System.out.println("General treatment...");
        return this;
    }
}

//  Parent
class Surgeon extends Doctor {
    @Override
    Surgeon treat() {               // ✅ Covariant — Surgeon is a Doctor
        System.out.println("Surgery treatment...");
        return this;
    }
}

//  Child
class NeuroSurgeon extends Surgeon {
    @Override
    NeuroSurgeon treat() {          // ✅ Covariant — NeuroSurgeon is a Surgeon
        System.out.println("Brain surgery treatment...");
        return this;
    }
}
public class CovariantDoctorExp {
    public static void main(String[] args){
        NeuroSurgeon n1 = new NeuroSurgeon();
        n1.treat();
        Surgeon s1 = new Surgeon();
        s1.treat();
        Doctor d1 = new Doctor();
        d1.treat();
    }
}