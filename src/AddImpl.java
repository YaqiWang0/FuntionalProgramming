public class AddImpl {
    Add<Integer,Integer> add=new Add<Integer, Integer>() {
        @Override
        public Integer add(Integer args,Integer args1) {
            return args+args1;
        }
    };
}
