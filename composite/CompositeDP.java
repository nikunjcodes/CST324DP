public class CompositeDP{
    // the hierachy is CEO , Sales Manager , Production Manager , Clerk , Production Engineer , Marketing Person
    public static void main(String[] args){
        Employee CEO = new Employee("John","CEO",30000);
        Employee salesManager = new Employee("Robert","Sales Manager",20000);
        Employee productionManager = new Employee("Michel","Production Manager",20000);
        Employee clerk1 = new Employee("Laura","Clerk",10000);
        Employee clerk2 = new Employee("Bob","Clerk",10000);
        Employee productionEngineer = new Employee("Richard","Production Engineer",15000);
        Employee marketingPerson = new Employee("Rob","Marketing Person",15000);
        Employee marketingPerson2 = new Employee("Bot","Marketing Person",15000);
        Employee productionEngineer2 = new Employee("Ric","Production Engineer",15000);
        CEO.add(salesManager);
        CEO.add(productionManager);

        salesManager.add(clerk1);
        salesManager.add(clerk2);
        salesManager.add(marketingPerson2);
        productionManager.add(productionEngineer);
        productionManager.add(marketingPerson);
        productionManager.add(productionEngineer2);
        //System.out.println(CEO);
        // Employee node = CEO;
        CEO.displaySubordinates();
    }
}