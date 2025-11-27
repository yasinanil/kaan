package topics;

public class C34_NormalizeName {
    //
    public static void main(String[] args) {

        System.out.println(normalizeName("  j***oHN     T11=)?213IM    Doe  "));
        System.out.println(normalizeName("  j***oHN     T11=)?213IM    Doe  ", false));
    }

    public static String normalizeName(String fullName) {
        fullName = fullName.trim().replaceAll("[^A-Za-z ]", "").replaceAll("\\s+", " ");
        String n1FL = fullName.substring(0, 1).toUpperCase();
        String n1Rest = fullName.substring(1, fullName.indexOf(" ")).toLowerCase();
        String lastname = fullName.substring(fullName.lastIndexOf(" ") + 1).toUpperCase();
        if (fullName.lastIndexOf(" ") != fullName.indexOf(" ")) {
            String n2FL = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" ")).substring(0, 1).toUpperCase();
            String n2Rest = fullName.substring(fullName.indexOf(" ") + 2, fullName.lastIndexOf(" ")).toLowerCase();
            return n1FL + n1Rest + " " + n2FL + n2Rest + " " + lastname;
        }
        return n1FL + n1Rest + " " + lastname;
    }

    public static String normalizeName(String fullName, boolean isLastNameLower) {
        fullName = fullName.trim().replaceAll("[^A-Za-z ]", "").replaceAll("\\s+", " ");
        String n1FL = fullName.substring(0, 1).toUpperCase();
        String n1Rest = fullName.substring(1, fullName.indexOf(" ")).toLowerCase();
        String lN1L = fullName.substring(fullName.lastIndexOf(" ") + 1).substring(0, 1).toUpperCase();
        String lNRest = fullName.substring(fullName.lastIndexOf(" ") + 2).toLowerCase();
        String lastname = lN1L + lNRest;
        if (fullName.lastIndexOf(" ") != fullName.indexOf(" ")) {
            String n2FL = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" ")).substring(0, 1).toUpperCase();
            String n2Rest = fullName.substring(fullName.indexOf(" ") + 2, fullName.lastIndexOf(" ")).toLowerCase();
            return n1FL + n1Rest + " " + n2FL + n2Rest + " " + lastname;
        }
        return n1FL + n1Rest + " " + lastname;
    }


}
