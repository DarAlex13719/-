public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder().setName("Anna").setSurname("Volf").setAge(31).setAddress("Sydney").build();
        Person son = mom.newChildBuilder().setName("Antoshka").build();
        System.out.println("Y " + mom + "est " + son);

        Person person = new PersonBuilder().setName("Antoshka").setSurname("Lopatov").setAge(48).build();
        System.out.println(person);

        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}