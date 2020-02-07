package AbstractFactory;

public class CallAbstractFactory {

    public static void main(String[] args){

        //figura normal
        AbstractFactory abstractFactory = FactoryProducer.getFactory(false);
        Shape rectangle = abstractFactory.getShape("RECTANGLE");
        rectangle.draw();

        //figura redondeada
        AbstractFactory abstractFactory1 = FactoryProducer.getFactory(true);
        Shape rectangleRounded = abstractFactory1.getShape("RECTANGLE");
        rectangleRounded.draw();


    }

}
