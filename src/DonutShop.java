//public class DonutShop {
//    public static Tuple<Donut,Payment> buyDonut(CreditCard creditCard){
//        Donut donut=new Donut();
//        Payment payment=new Payment(creditCard,Donut.price);
//        return new Tuple<Donut, Payment>(donut,payment);
//
//    }
//
//    public static Tuple<List<Donut>,Payment> buyDonuts(final int quantity,final CreditCard cCard){
//        return new Tuple<Donut, Payment>(fill(quantity,()->new Donut()),new Payment(cCard,Donut.price*quantity));
//    }
//}
