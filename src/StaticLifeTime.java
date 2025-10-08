public class StaticLifeTime {

        // Static Variable (Class scope and lifetime - shared)
        static int counter = 0;
        public void incrementCounter() {
            counter++;
            System.out.println("Counter value: " + counter);
        }
        public static void main(String[] args) {
            //System.out.println("Initial static counter: " + StaticLifeTime.counter);
// Instance 1 calls the method
            StaticLifeTime obj1 = new StaticLifeTime();
            obj1.incrementCounter(); // Should print 1
// Instance 2 calls the method
            StaticLifeTime obj2 = new StaticLifeTime();
            obj2.incrementCounter(); // Should print 2
// The static variable value persists and is shared between instances
        }
}

