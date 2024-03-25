public class oop {
        // Атрибути класу
        private String brand;
        private String model;
        private int year;

        // Конструктор класу
        public oop(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        // Метод для отримання року випуску автомобіля
        public int getYear() {
            return year;
        }

        // Метод для виведення інформації про автомобіль
        public void displayInfo() {
            System.out.println("Марка: " + brand);
            System.out.println("Модель: " + model);
            System.out.println("Рік випуску: " + year);
        }
}
