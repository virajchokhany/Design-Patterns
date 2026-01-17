public class CheeseDecorator extends ToppingDecorator{

    public CheeseDecorator(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return super.cost()+50;
    }

    @Override
    public String description() {
        return super.description()+" Cheese";
    }
    
    
}
