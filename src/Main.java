import com.clinicare.service.DoctorService;


public class Main {
    private static DoctorService doctorService = new DoctorService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. List doctors\n2. Add doctor\n3. Remove doctor\nE. Exit");
            System.out.print("Select an option: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    listDoctors();
                    break;
                case "2":
                    addDoctor(scanner);
                    break;
                case "3":
                    removeDoctor(scanner);
                    break;
                case "E":
                case "e":
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }

    private static void listDoctors() {
        doctorService.getAllDoctors().forEach(System.out::println);
    }

    private static void addDoctor(Scanner scanner) {
        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Specialty: ");
        String specialty = scanner.nextLine();

        doctorService.addDoctor(id, name, specialty);
        System.out.println("Doctor added successfully.");
    }

    private static void removeDoctor(Scanner scanner) {
        System.out.print("ID of the doctor to remove: ");
        String id = scanner.nextLine();

        doctorService.removeDoctor(id);
        System.out.println("Doctor removed successfully.");
    }
}
