public class Main {
    public static void main(String[] args) {
        String employeeName = "Peter Medison";
        double grossSalary = 20000.0;

        double stateTaxes = Math.round(grossSalary * 28.4 / 100);
        double personalTax;
        if (grossSalary - stateTaxes - 7000 > 0) {
            personalTax = Math.round((grossSalary - stateTaxes - 7000) * 10 / 100);
        } else {
            personalTax = 0;
        }
        double netSalary = Math.round(grossSalary - stateTaxes - personalTax);

        System.out.println("The employee: " + employeeName + " with Gross salary of: " + grossSalary + " MKD. will get NET salary: " + netSalary + " MKD.");
        System.out.println("State taxes are: " + stateTaxes + " MKD.");
        System.out.println("Personal tax is: " + personalTax + " MKD.");
    }
}
