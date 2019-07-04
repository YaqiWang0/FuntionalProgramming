public class Impl {
    Function<Integer,Integer> triple=new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer arg) {
            return arg*3;
        }

    };


    Function<Integer,Integer> square=new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer arg) {
            return arg*arg;
        }
    };

    Function<Integer,Integer> compose(Function<Integer,Integer> f1, Function<Integer,Integer> f2){
        Function<Integer,Integer> a= x->f1.apply(f2.apply(x));
        return a;

    }

    Function<Integer,Function<Integer,Integer>> add=x->y->x+y;

    Function<Function<Integer,Integer>,Function<Function<Integer,Integer>,Function<Integer,Integer>>> composeTripleAndSquare=x->y->z->x.apply(y.apply(z));

}

