public class client {
    public static void main(String[] args) {
        BasePizza marg = new Marghareta();
        System.out.println(marg.cost()+" "+marg.description());

        BasePizza cheesePizza = new CheeseDecorator(marg);
        System.out.println(cheesePizza.cost()+" "+cheesePizza.description());

        BasePizza cheeseVeggiePizza = new VeggieDecorator(cheesePizza);
        System.out.println(cheeseVeggiePizza.cost()+" "+cheeseVeggiePizza.description());
    }
}
