public class EncapsulationDemo {
    public static void main(String[] args){
        EncapProfile s1 = new EncapProfile();
        // set to update
        s1.setName("JAVEED");
        s1.setAge(24);
        s1.setPhonenumber(910018862);
        // get to read
        System.out.println("\n"+s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getPhonenumber());
    }
}
