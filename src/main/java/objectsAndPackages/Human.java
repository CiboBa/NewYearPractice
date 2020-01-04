package objectsAndPackages;

//Utwórz klasę Human reprezentującą człowieka, musi posiadać atrybuty takie jak wiek, waga, wzrost, imię i płeć.
//Klasa powinna także zawierać metody getAge, getWeight, getHeight, getName, isMale.
class Human {

    private int age;
    private int weight;
    private int height;
    private String name;
    private String maleOrFemale;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static boolean isMale(String maleOrFemale) throws WrongSexException {
        if (maleOrFemale.equals("M")) {
            return true;
        } else if (maleOrFemale.equals("F")) {
            return false;
        }
        throw new WrongSexException(maleOrFemale);
    }
}