public class Client {
    public static void main(String[] args) {
        Employee CEO  = new CEO("Steve", "CEO", 100000);
        Employee salesManager = new SalesManager("John", "Sales Manager", 30000);
        Employee productionManager = new ProductionManager("Michael", "Production Manager", 25000);
        Employee marketingPerson1 = new MarketingPerson("Alice", "Marketing Person", 20000);
        Employee marketingPerson2 = new MarketingPerson("Bob", "Marketing Person", 20000);
        Employee productionEngineer1 = new ProductionEngineer("Charlie", "Production Engineer", 25000);
        Employee productionEngineer2 = new ProductionEngineer("David", "Production Engineer", 25000);
        Employee clerk1 = new Clerk("Eve", "Clerk", 15000);
        Employee clerk2 = new Clerk("Frank", "Clerk", 15000);
        CEO.add(salesManager);
        CEO.add(productionManager);
        salesManager.add(clerk1);
        salesManager.add(clerk2);
        salesManager.add(marketingPerson1);
        salesManager.add(marketingPerson2);
        productionManager.add(productionEngineer1);
        productionManager.add(productionEngineer2);
        CEO.showEmployeeDetails();
        System.out.println();
        salesManager.displayTeam();

    }
    
}
