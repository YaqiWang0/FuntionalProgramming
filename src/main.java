public class main {
    public static void main(String[] args) {
        Impl impl=new Impl();
        Function<Integer,Integer> f=impl.composeTripleAndSquare.apply(impl.square).apply(impl.triple);
        System.out.println(f.apply(2));
    }
}
