public abstract class ToppingDecorator extends BasePizza{
    BasePizza basePizza;

    public ToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int cost(){
        return this.basePizza.cost();
    }

    public String description() {
        return this.basePizza.description();
    }
}
