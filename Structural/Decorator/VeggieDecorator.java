public class VeggieDecorator extends ToppingDecorator{

    public VeggieDecorator(BasePizza basePizza) {
        super(basePizza);
        //TODO Auto-generated constructor stub
    }

    @Override
    public int cost() {
        return super.cost()+80;
    }

    @Override
    public String description() {
        return super.description()+" Veggie";
    }
    
}
