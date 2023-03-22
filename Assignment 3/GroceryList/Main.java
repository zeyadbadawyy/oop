public class Main {
    public static void main(String[] args) {
        GroceryList list1=new GroceryList();
        GroceryItemOrder i1=new GroceryItemOrder("Bread",2);
        GroceryItemOrder i2=new GroceryItemOrder("Milk",25);
        GroceryItemOrder i3=new GroceryItemOrder("Meat",100);
        i1.setQuantity(10);
        i2.setQuantity(2);
        i3.setQuantity(1);
        list1.add(i1);
        list1.add(i2);
        list1.add(i3);
        System.out.println("Total Cost = " + list1.getTotalCost());
    }
}