import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // task 1
        int currentYear = LocalDate.now().getYear();
        checkYear(currentYear);

        // task 2
        int clientDeviceYear = 2015;
        int osType = 1;
        checkOS(osType, clientDeviceYear, currentYear);

        // task 3
        int deliveryDistance = 95;
        checkDistance(deliveryDistance);
    }



    public static void checkYear(int currentYear) {
        if (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0) {
            System.out.println(currentYear + " - високосный год.");
        } else {
            System.out.println(currentYear + " - не високосный год.");
        }
    }

    public static void checkOS(int osType, int clientDeviceYear, int currentYear) {
        if (osType == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите стандартную версию приложения для Android по ссылке");
        }
    }

    public static void checkDistance(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }

        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
    }

}