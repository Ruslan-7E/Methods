import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // task 1
        int currentYear = LocalDate.now().getYear();
        checkYear(currentYear);

        // task 2
        int clientDeviceYear = 2015;
        int osType = generateRandomNum();
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
        } else if (osType == 2 && clientDeviceYear < currentYear){
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (osType == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else if (osType == 2 && clientDeviceYear == currentYear) {
            System.out.println("Установите обычную версию приложения для IOS по ссылке");
        }
    }

    public static int checkDistance(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }

        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        return deliveryDays;
        // так и не допер я с эти ретурном, почему в мэйне не выводятся данные
    }

    // не знаю, правильно ли создал метод генерации, проверить через дебаг не смог
    public static int generateRandomNum() {
        java.util.Random random = new java.util.Random();
        int osType = random.nextInt(1) + 1;
        return osType;
    }


}