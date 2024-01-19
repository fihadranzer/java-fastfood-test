package src;

class OrderItem {
    private MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public double getItemTotal() {
        return quantity * menuItem.getPrice();
    }

    @Override
    public String toString(){
        return menuItem.getName() + " X "+ quantity + " $" + menuItem.getPrice() + " each = $" + getItemTotal();
    }



}
