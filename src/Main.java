public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] monthlyExpenses = {1000, 1500, 1200, 1100, 1300};
        int totalAmount = 0;

        for (int expense : monthlyExpenses) {
            totalAmount += expense;
        }
        System.out.println("Сумма трат за месяц составила " + totalAmount + " рублей.");

        System.out.println("Задача 2");
        int[] weeklyExpenses = {200, 450, 100, 300, 250};
        int minExpense = weeklyExpenses[0];
        int maxExpense = weeklyExpenses[0];

        for (int expense : weeklyExpenses) {
            if (expense < minExpense) {
                minExpense = expense;
            }
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей. Максимальная сумма трат за неделю составила " + maxExpense + " рублей.");

        System.out.println("Задача 3");
        int[] averageExpenses = {600, 700, 800, 500, 400};
        double averageAmount = 0;

        for (int expense : averageExpenses) {
            averageAmount += expense;
        }
        averageAmount /= averageExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей.");

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int left = 0;
        int right = reverseFullName.length - 1;

        while (left < right) {
            char temp = reverseFullName[left];
            reverseFullName[left] = reverseFullName[right];
            reverseFullName[right] = temp;
            left++;
            right--;
        }

        System.out.print("Исправленное имя: ");
        for (char c : reverseFullName) {
            System.out.print(c);
        }
    }
}