abstract class Coffee {
    abstract void grindCoffee();
    abstract void makeCoffee();
    abstract void pourIntoCup();
}

class CoffeeFactory {
    Coffee createCoffee(String coffeeType) {
        switch (coffeeType) {
            case "Espresso":
                return new Espresso();
            case "Cappuccino":
                return new Cappuccino();
            case "Americano":
                return new Americano();
            default:
                throw new IllegalArgumentException("Непознат вид кафе");
        }
    }
}

class Espresso extends Coffee {
    void grindCoffee() {
        System.out.println("Меля кафето на фини зърна");
    }

    void makeCoffee() {
        System.out.println("Приготвя се еспресо");
    }

    void pourIntoCup() {
        System.out.println("Сипва се еспресо в чаша");
    }
}

class Cappuccino extends Coffee {
    void grindCoffee() {
        System.out.println("Меля кафето на средно груби зърна");
    }

    void makeCoffee() {
        System.out.println("Приготвя се капучино");
    }

    void pourIntoCup() {
        System.out.println("Сипва се капучино в чаша");
    }
}

class Americano extends Coffee {
    void grindCoffee() {
        System.out.println("Меля кафето на груби зърна");
    }

    void makeCoffee() {
        System.out.println("Приготвя се американо");
    }

    void pourIntoCup() {
        System.out.println("Сипва се американо в чаша");
    }
}


public class CoffeeApp {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        Coffee espresso = coffeeFactory.createCoffee("Espresso");
        espresso.grindCoffee();
        espresso.makeCoffee();
        espresso.pourIntoCup();

        Coffee cappuccino = coffeeFactory.createCoffee("Cappuccino");
        cappuccino.grindCoffee();
        cappuccino.makeCoffee();
        cappuccino.pourIntoCup();

        Coffee americano = coffeeFactory.createCoffee("Americano");
        americano.grindCoffee();
        americano.makeCoffee();
        americano.pourIntoCup();
    }
}
