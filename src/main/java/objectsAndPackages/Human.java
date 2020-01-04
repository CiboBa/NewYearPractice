package objectsAndPackages;

//Utwórz klasę Human reprezentującą człowieka, musi posiadać atrybuty takie jak wiek, waga, wzrost, imię i płeć.
//Klasa powinna także zawierać metody getAge, getWeight, getHeight, getName, isMale.
class Human {

    private int age;
    private int weight;
    private int height;
    private String name;
    private String maleOrFemale;

    private void setAge(int age) {
        this.age = age;
    }

    private int getAge() {
        return age;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }

    private int getWeight() {
        return weight;
    }

    private void setHeight(int height) {
        this.height = height;
    }

    private int getHeight() {
        return height;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    private boolean isMale(String maleOrFemale) throws WrongSexException {
        if (maleOrFemale.equals("M")) {
            return true;
        } else if (maleOrFemale.equals("F")) {
            return false;
        }
        throw new WrongSexException(maleOrFemale);
    }
}