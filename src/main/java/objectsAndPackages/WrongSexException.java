package objectsAndPackages;

class WrongSexException extends Exception {

    String maleOrFemale;

    public WrongSexException(String maleOrFemale) {
        this.maleOrFemale = maleOrFemale;
        System.out.println("Cannot understand whether Male or Female!!!");
    }

    @Override
    public String toString() {
        return "ERROR: Please choose M or F.";
    }
}