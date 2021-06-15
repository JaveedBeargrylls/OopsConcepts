public class EncapProfile {

// encapsulation is nothing but binding of data with methods
        private int age;
        private String name;
        private int phonenumber;
/* variables should be private
we are binding the private variables to public methods
 */
        // using getters and setters

        // set is for update or modify

        // methods
        public void setAge(int a){  this.age = a;    }
        public void setName(String n){  this.name = n; }
        public void setPhonenumber(int p){  this.phonenumber = p;  }

        // get is for read
        // to fetch the result or to get the updated we use get
        // it wont acccept any value it only return value

        public int getAge(){    return age;     }
        public String getName(){    return name;    }
        public int getPhonenumber(){    return phonenumber;     }
}
