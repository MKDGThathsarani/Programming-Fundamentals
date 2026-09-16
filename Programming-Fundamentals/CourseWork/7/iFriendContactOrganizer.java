import java.util.Scanner;

public class iFriendContactOrganizer {
    private static String[] contactIds = new String[100];
    private static String[] names = new String[100];
    private static String[] phoneNumbers = new String[100];
    private static String[] companies = new String[100];
    private static double[] salaries = new double[100];
    private static String[] birthdays = new String[100];
    private static int contactCount = 0;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            clearConsole();
            displayHomePage();
            int choice = getIntInput("Enter your choice: ");
            switch (choice) {
                case 1:
                    addContacts();
                    break;
                case 2:
                    updateContacts();
                    break;
                case 3:
                    deleteContacts();
                    break;
                case 4:
                    searchContacts();
                    break;
                case 5:
                    listContacts();
                    break;
                case 6:
                    System.out.println("Exiting application. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Press Enter to continue...");
                    scanner.nextLine();
            }
        }
    }

    private static void displayHomePage() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("\t\t\t/$$ /$$$$$$$$ /$$$$$$   /$$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$");
        System.out.println("\t\t\t|__/| $$_____/| $$__  $$|_   $$_/| $$_____/| $$$ | $$| $$__ $$");
        System.out.println("\t\t\t /$$| $$      | $$  \\$$  |  $$  | $$      | $$$$| $$| $$ \\$$");
        System.out.println("\t\t\t| $$| $$$$$   | $$$$$$$/  |  $$  | $$$$$   | $$ $$ $$| $$  |$$");
        System.out.println("\t\t\t| $$| $$__/   | $$__  $$  |  $$  | $$__/   | $$  $$$$| $$  |$$");
        System.out.println("\t\t\t| $$| $$      | $$  \\$$  |  $$  | $$      | $$\\ $$$| $$  |$$");
        System.out.println("\t\t\t| $$| $$      | $$  | $$ /$$$$$$$| $$$$$$$$| $$ \\ $$| $$$$$$/");
        System.out.println("\t\t\t|__/|__/      |__/  |__/|_______/|________/|___/ \\_/|______/");
        System.out.println("\n\n\n");
        System.out.println(" _____             _              _                ____                                                ");
        System.out.println("/ ____|           | |            | |             /  _  \\                        _                      ");
        System.out.println("| |    __   _  __ | |_  __ _  ___| |__  ___      | | |  |__ __ __ _   __ _ _ __ (_)_____ ____  _ __        ");
        System.out.println("| |   / _\\| '_ \\|  __/ _  |/ __| ___/ ___|     | | |  |  _'_/ _  | / _ '| '_\\| |__   /  _\\|  '__|       "); 
        System.out.println("| |__| (_) | | |  |  || |_| | |  | |__\\_ \\     | |_|  | |  | |_| |  |_| | | | | |  / /  ___/|  |           ");
        System.out.println("\\____\\__/|_| |  |\\__\\_,_|\\__| \\_| ___/     \\____/|_|   \\__,|\\__,_|_| |_|_| /__\\_____|__|          ");
        System.out.println("                                                                _/ |                                  ");
        System.out.println("                                                               |__/                                    ");
        System.out.println("\n\n\n");
        System.out.println("=".repeat(150));
        System.out.println("\n\n");
        System.out.println("\t [01] ADD Contacts");
        System.out.println("\t [02] UPDATE Contacts");
        System.out.println("\t [03] DELETE Contacts");
        System.out.println("\t [04] SEARCH Contacts");
        System.out.println("\t [05] LIST Contact");
        System.out.println("\t [06] Exit");
    }

    // ==================== ADD CONTACTS ====================
    private static void addContacts() {
        while (true) {
            clearConsole();
            System.out.println("+--------------------------------------------+");
            System.out.println("|           Add Contact to the list          |");
            System.out.println("+--------------------------------------------+");
            String newId = generateContactId();
            System.out.println("Generated Contact ID: " + newId);

            String name = getValidName();
            String phone = getValidPhone();
            System.out.print("Enter Company: ");
            String company = scanner.nextLine();
            double salary = getValidSalary();
            String birthday = getValidBirthday();

            contactIds[contactCount] = newId;
            names[contactCount] = name;
            phoneNumbers[contactCount] = phone;
            companies[contactCount] = company;
            salaries[contactCount] = salary;
            birthdays[contactCount] = birthday;
            contactCount++;

            System.out.println("\nContact added successfully!");
            System.out.print("Do you want to add another Contact (Y/N): ");
            String again = scanner.nextLine();
            if (!again.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }

    private static String getValidName() {
        String name;
        while (true) {
            System.out.print("Enter Name: ");
            name = scanner.nextLine();
            if (!name.trim().isEmpty()) {
                break;
            }
            System.out.println("Name cannot be empty! Please enter a valid name.");
        }
        return name;
    }

    private static String generateContactId() {
        if (contactCount == 0) {
            return "C0001";
        }
        String lastId = contactIds[contactCount - 1];
        int num = Integer.parseInt(lastId.substring(1));
        num++;
        return String.format("C%04d", num);
    }

    private static String getValidPhone() {
        String phone;
        while (true) {
            System.out.print("Enter Phone Number (10 digits, start with 0): ");
            phone = scanner.nextLine();
            if (phone.matches("0\\d{9}")) {
                break;
            }
            System.out.println("Invalid phone number! Must start with 0 and have 10 digits.");
        }
        return phone;
    }

    private static boolean isValidPhoneFormat(String phone) {
        return phone != null && phone.matches("0\\d{9}");
    }

    private static double getValidSalary() {
        double salary;
        while (true) {
            System.out.print("Enter Salary (positive value): ");
            if (scanner.hasNextDouble()) {
                salary = scanner.nextDouble();
                scanner.nextLine();
                if (salary > 0) {
                    break;
                }
            } else {
                scanner.nextLine();
            }
            System.out.println("Invalid salary! Must be a positive number.");
        }
        return salary;
    }

    private static String getValidBirthday() {
        String birthday;
        while (true) {
            System.out.print("Enter Birthday (YYYY-MM-DD): ");
            birthday = scanner.nextLine();
            if (isValidDate(birthday)) {
                break;
            }
            System.out.println("Invalid birthday! Use YYYY-MM-DD and not a future date.");
        }
        return birthday;
    }

    private static boolean isValidDate(String date) {
        if (!date.matches("\\d{4}-\\d{2}-\\d{2}")) return false;
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        if (month < 1 || month > 12) return false;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) daysInMonth[1] = 29;
        if (day < 1 || day > daysInMonth[month - 1]) return false;

        java.util.Calendar cal = java.util.Calendar.getInstance();
        int currentYear = cal.get(java.util.Calendar.YEAR);
        int currentMonth = cal.get(java.util.Calendar.MONTH) + 1;
        int currentDay = cal.get(java.util.Calendar.DAY_OF_MONTH);

        if (year > currentYear) return false;
        if (year == currentYear && month > currentMonth) return false;
        if (year == currentYear && month == currentMonth && day > currentDay) return false;
        return true;
    }

    // ==================== UPDATE CONTACTS ====================
    private static void updateContacts() {
        while (true) {
            clearConsole();
            System.out.println("+--------------------------------------------+");
            System.out.println("|              UPDATE Contact                |");
            System.out.println("+--------------------------------------------+");
            System.out.print("Search by Name or Phone: ");
            String keyword = scanner.nextLine();
            
            // Validate phone number format if input looks like a phone number
            if (keyword.matches("0\\d{9}") || !keyword.matches("\\d+")) {
                // Valid format or not a number
            } else if (keyword.matches("\\d+")) {
                System.out.println("Invalid phone number format! Phone must start with 0 and have 10 digits.");
                pressEnterToContinue();
                continue;
            }
            
            int index = findContactIndex(keyword);
            if (index == -1) {
                System.out.println("Contact not found!");
                pressEnterToContinue();
                continue;
            }

            displayContactDetails(index);
            System.out.println("\nWhat do you want to update?");
            System.out.println("1. Name");
            System.out.println("2. Phone Number");
            System.out.println("3. Company");
            System.out.println("4. Salary");
            System.out.print("Enter choice: ");
            int choice = getIntInput("");

            switch (choice) {
                case 1:
                    names[index] = getValidName();
                    break;
                case 2:
                    phoneNumbers[index] = getValidPhone();
                    break;
                case 3:
                    System.out.print("Enter new Company: ");
                    companies[index] = scanner.nextLine();
                    break;
                case 4:
                    salaries[index] = getValidSalary();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    pressEnterToContinue();
                    continue;
            }
            System.out.println("Update successful!");
            
            // Prompt whether to continue updating
            System.out.print("Do you want to update another contact? (Y/N): ");
            String again = scanner.nextLine();
            if (!again.equalsIgnoreCase("Y")) {
                break;
            }
        }
        pressEnterToContinue();
    }

    // ==================== DELETE CONTACTS ====================
    private static void deleteContacts() {
        clearConsole();
        System.out.println("+--------------------------------------------+");
        System.out.println("|           DELETE Contact                   |");
        System.out.println("+--------------------------------------------+");
        System.out.print("Enter Phone Number or Name: ");
        String keyword = scanner.nextLine();
        
        // Validate phone number format if input is a number
        if (keyword.matches("\\d+") && !isValidPhoneFormat(keyword)) {
            System.out.println("Invalid phone number format! Phone must start with 0 and have 10 digits.");
            pressEnterToContinue();
            return;
        }
        
        int index = findContactIndex(keyword);
        if (index == -1) {
            System.out.println("Contact not found!");
            pressEnterToContinue();
            return;
        }

        displayContactDetails(index);
        System.out.print("Are you sure you want to delete this contact? (Y/N): ");
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("Y")) {
            for (int i = index; i < contactCount - 1; i++) {
                contactIds[i] = contactIds[i + 1];
                names[i] = names[i + 1];
                phoneNumbers[i] = phoneNumbers[i + 1];
                companies[i] = companies[i + 1];
                salaries[i] = salaries[i + 1];
                birthdays[i] = birthdays[i + 1];
            }
            contactCount--;
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Deletion cancelled.");
        }
        pressEnterToContinue();
    }

    // ==================== SEARCH CONTACTS ====================
    private static void searchContacts() {
        clearConsole();
        System.out.println("+--------------------------------------------+");
        System.out.println("|           SEARCH Contact                   |");
        System.out.println("+--------------------------------------------+");
        System.out.print("Enter Phone Number or Name: ");
        String keyword = scanner.nextLine();
        
        // Validate phone number format if input is a number
        if (keyword.matches("\\d+") && !isValidPhoneFormat(keyword)) {
            System.out.println("Invalid phone number format! Phone must start with 0 and have 10 digits.");
            pressEnterToContinue();
            return;
        }
        
        int index = findContactIndex(keyword);
        if (index == -1) {
            System.out.println("Contact not found!");
        } else {
            displayContactDetails(index);
        }
        pressEnterToContinue();
    }

    // ==================== LIST CONTACTS ====================
    private static void listContacts() {
        while (true) {
            clearConsole();
            System.out.println("+--------------------------------------------+");
            System.out.println("|           LIST Contacts                    |");
            System.out.println("+--------------------------------------------+");
            System.out.println("1. Sort by Name");
            System.out.println("2. Sort by Salary");
            System.out.println("3. Sort by Birthday");
            System.out.print("Enter choice: ");
            int choice = getIntInput("");

            if (choice == 1) {
                sortByName();
                System.out.println("\n--- Contacts sorted by Name ---");
            } else if (choice == 2) {
                sortBySalary();
                System.out.println("\n--- Contacts sorted by Salary ---");
            } else if (choice == 3) {
                sortByBirthday();
                System.out.println("\n--- Contacts sorted by Birthday ---");
            } else {
                System.out.println("Invalid choice.");
                pressEnterToContinue();
                continue;
            }

            displayAllContacts();

            System.out.print("\nStay here? (Y to stay / N to main menu): ");
            String stay = scanner.nextLine();
            if (!stay.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }

    // Simple bubble sorts without Arrays class
    private static void sortByName() {
        for (int i = 0; i < contactCount - 1; i++) {
            for (int j = 0; j < contactCount - i - 1; j++) {
                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
                    swap(j, j + 1);
                }
            }
        }
    }

    private static void sortBySalary() {
        for (int i = 0; i < contactCount - 1; i++) {
            for (int j = 0; j < contactCount - i - 1; j++) {
                if (salaries[j] > salaries[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    private static void sortByBirthday() {
        for (int i = 0; i < contactCount - 1; i++) {
            for (int j = 0; j < contactCount - i - 1; j++) {
                if (birthdays[j].compareTo(birthdays[j + 1]) > 0) {
                    swap(j, j + 1);
                }
            }
        }
    }

    private static void swap(int i, int j) {
        String tempId = contactIds[i];
        contactIds[i] = contactIds[j];
        contactIds[j] = tempId;

        String tempName = names[i];
        names[i] = names[j];
        names[j] = tempName;

        String tempPhone = phoneNumbers[i];
        phoneNumbers[i] = phoneNumbers[j];
        phoneNumbers[j] = tempPhone;

        String tempCompany = companies[i];
        companies[i] = companies[j];
        companies[j] = tempCompany;

        double tempSalary = salaries[i];
        salaries[i] = salaries[j];
        salaries[j] = tempSalary;

        String tempBirthday = birthdays[i];
        birthdays[i] = birthdays[j];
        birthdays[j] = tempBirthday;
    }

    // ==================== HELPERS ====================
    private static int findContactIndex(String keyword) {
        for (int i = 0; i < contactCount; i++) {
            if (names[i].equalsIgnoreCase(keyword) || phoneNumbers[i].equals(keyword)) {
                return i;
            }
        }
        return -1;
    }

    private static void displayContactDetails(int index) {
        System.out.println("\nContact Details:");
        System.out.println("ID: " + contactIds[index]);
        System.out.println("Name: " + names[index]);
        System.out.println("Phone: " + phoneNumbers[index]);
        System.out.println("Company: " + companies[index]);
        System.out.println("Salary: " + salaries[index]);
        System.out.println("Birthday: " + birthdays[index]);
    }

    private static void displayAllContacts() {
        if (contactCount == 0) {
            System.out.println("\nNo contacts to display.");
            return;
        }
        System.out.println("\n--------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-15s %-20s %-15s %-12s%n", "ID", "Name", "Phone", "Company", "Salary", "Birthday");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < contactCount; i++) {
            System.out.printf("%-10s %-20s %-15s %-20s %-15.2f %-12s%n",
                    contactIds[i], names[i], phoneNumbers[i], companies[i], salaries[i], birthdays[i]);
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }

    private static int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } else {
                scanner.nextLine();
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    private static void pressEnterToContinue() {
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
    }

    private static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            for (int i = 0; i < 50; i++) System.out.println();
        }
    }
}
