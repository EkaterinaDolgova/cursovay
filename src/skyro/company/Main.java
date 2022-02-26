package skyro.company;

public class Main {
    //Метод для вывода всех данных по сотрудникам
    public static void printSotr(Employee[] arr) {
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i] + ",");
        }
        System.out.println("**************************************************");
    }

    //Метод подсчета суммы затрат для зарплаты в месяц
    public static void printSumSalary(Employee[] arr1) {
        int sumSalary = 0;
        int costAmount = 0;
        double averageSalary = 0;
        for (int i = 0; i < arr1.length; i++) {
            sumSalary = arr1[i].getSalary() + sumSalary;
        }
        costAmount = sumSalary * 30;
        averageSalary = sumSalary / arr1.length;
        System.out.println("Сумма затрат на зарплаты в месяц: " + costAmount + "р.");
        System.out.println("Среднее значение зарплат: " + averageSalary + "р.");
        System.out.println("**************************************************");
    }

    //Метод подсчета минимальной зарплаты сотрудника
    public static void minSalarySotr(Employee[] arr3) {
        int minValue = arr3[0].getSalary();
        String fioSotr = arr3[0].getFio();
        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i].getSalary() < minValue) {
                minValue = arr3[i].getSalary();
                fioSotr = arr3[i].getFio();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minValue + "р. " + fioSotr);
        System.out.println("**************************************************");
    }

    //Метод подсчета максимальной зарплаты сотрудника
    public static void maxSalarySotr(Employee[] arr3) {
        int maxValue = arr3[0].getSalary();
        String fioSotr = arr3[0].getFio();
        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i].getSalary() > maxValue) {
                maxValue = arr3[i].getSalary();
                fioSotr = arr3[i].getFio();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maxValue + "р. " + fioSotr);
        System.out.println("**************************************************");
    }

    //Метод для вывода ФИО всех сотрудников
    public static void printSotrFio(Employee[] arr) {
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i].getFio() + ",");
        }
    }

    public static void main(String[] args) {
        // write your code here
        Employee[] employeeArray = new Employee[10];
        Employee one = new Employee("Петров Петр Петрович", 1, 20000);
        employeeArray[0] = one;
        Employee two = new Employee("Иванов Иван Иванович", 2, 30000);
        employeeArray[1] = two;
        Employee three = new Employee("Сидоров Степан Геннадьевич", 1, 50000);
        employeeArray[2] = three;
        Employee four = new Employee("Степашкин Иван Федорович", 3, 10000);
        employeeArray[3] = four;
        Employee five = new Employee("Петров Илья Иванович", 4, 100000);
        employeeArray[4] = five;
        Employee six = new Employee("Арбузов Андрей Александрович", 5, 40000);
        employeeArray[5] = six;
        Employee seven = new Employee("Арбузов Артем Александрович", 5, 45000);
        employeeArray[6] = seven;
        Employee eight = new Employee("Цветков Максим Викторович", 3, 50000);
        employeeArray[7] = eight;
        Employee nine = new Employee("Цветков Алексей Петрович", 1, 70000);
        employeeArray[8] = nine;
        Employee ten = new Employee("Симбирцев Михаил Андреевич", 4, 60000);
        employeeArray[9] = ten;

        printSotr(employeeArray);
        printSumSalary(employeeArray);
        minSalarySotr(employeeArray);
        maxSalarySotr(employeeArray);
        printSotrFio(employeeArray);
    }
}

